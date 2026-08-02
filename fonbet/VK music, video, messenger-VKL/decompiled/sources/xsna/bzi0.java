package xsna;

/* compiled from: EditCommand.kt */
/* loaded from: classes11.dex */
public final class bzi0 implements pzo {
    public final int a;
    public final int b;

    public bzi0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // xsna.pzo
    public final void a(c2p c2pVar) {
        int g = swe0.g(this.a, 0, c2pVar.a.a());
        int g2 = swe0.g(this.b, 0, c2pVar.a.a());
        if (g < g2) {
            c2pVar.h(g, g2);
        } else {
            c2pVar.h(g2, g);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzi0)) {
            return false;
        }
        bzi0 bzi0Var = (bzi0) obj;
        return this.a == bzi0Var.a && this.b == bzi0Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetSelectionCommand(start=");
        sb.append(this.a);
        sb.append(", end=");
        return vu5.b(sb, this.b, ')');
    }
}
