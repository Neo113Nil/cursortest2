package xsna;

/* compiled from: EditCommand.kt */
/* loaded from: classes11.dex */
public final class jc30 implements pzo {
    @Override // xsna.pzo
    public final void a(c2p c2pVar) {
        if (c2pVar.d() == -1) {
            int i = c2pVar.b;
            c2pVar.h(i, i);
        }
        int i2 = c2pVar.b;
        c2pVar.a.toString();
        c2pVar.h(i2, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jc30)) {
            return false;
        }
        ((jc30) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "MoveCursorCommand(amount=0)";
    }
}
