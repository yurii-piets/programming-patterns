package visitor.computerpart;

import visitor.visitors.ComputerPartVisitor;

public class ComputerCase implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
