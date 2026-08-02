package xsna;

import java.text.BreakIterator;

/* compiled from: EditCommand.kt */
/* loaded from: classes11.dex */
public final class ey5 implements pzo {
    @Override // xsna.pzo
    public final void a(c2p c2pVar) {
        if (c2pVar.e()) {
            c2pVar.a(c2pVar.d, c2pVar.e);
            return;
        }
        if (c2pVar.d() == -1) {
            int i = c2pVar.b;
            int i2 = c2pVar.c;
            c2pVar.h(i, i);
            c2pVar.a(i, i2);
            return;
        }
        if (c2pVar.d() == 0) {
            return;
        }
        String mk90Var = c2pVar.a.toString();
        int d = c2pVar.d();
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(mk90Var);
        c2pVar.a(characterInstance.preceding(d), c2pVar.d());
    }

    public final boolean equals(Object obj) {
        return obj instanceof ey5;
    }

    public final int hashCode() {
        return fpf0.a(ey5.class).hashCode();
    }

    public final String toString() {
        return "BackspaceCommand()";
    }
}
