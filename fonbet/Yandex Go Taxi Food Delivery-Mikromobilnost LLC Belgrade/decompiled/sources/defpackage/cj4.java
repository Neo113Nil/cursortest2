package defpackage;

import java.text.BreakIterator;

/* loaded from: classes10.dex */
public final class cj4 implements zkn {
    @Override // defpackage.zkn
    public final void a(zi6 zi6Var) {
        if (zi6Var.k()) {
            zi6Var.d(zi6Var.w, zi6Var.x);
            return;
        }
        if (zi6Var.j() == -1) {
            int i = zi6Var.b;
            int i2 = zi6Var.c;
            zi6Var.p(i, i);
            zi6Var.d(i, i2);
            return;
        }
        if (zi6Var.j() == 0) {
            return;
        }
        String yi6Var = ((yi6) zi6Var.y).toString();
        int j = zi6Var.j();
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(yi6Var);
        zi6Var.d(characterInstance.preceding(j), zi6Var.j());
    }

    public final boolean equals(Object obj) {
        return obj instanceof cj4;
    }

    public final int hashCode() {
        return qoi0.a(cj4.class).hashCode();
    }

    public final String toString() {
        return "BackspaceCommand()";
    }
}
