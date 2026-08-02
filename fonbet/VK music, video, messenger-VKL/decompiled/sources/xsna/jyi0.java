package xsna;

/* compiled from: EditCommand.kt */
/* loaded from: classes11.dex */
public final class jyi0 implements pzo {
    public final int a;
    public final int b;

    public jyi0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // xsna.pzo
    public final void a(c2p c2pVar) {
        boolean e = c2pVar.e();
        mk90 mk90Var = c2pVar.a;
        if (e) {
            c2pVar.d = -1;
            c2pVar.e = -1;
        }
        int g = swe0.g(this.a, 0, mk90Var.a());
        int g2 = swe0.g(this.b, 0, mk90Var.a());
        if (g != g2) {
            if (g < g2) {
                c2pVar.g(g, g2);
            } else {
                c2pVar.g(g2, g);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jyi0)) {
            return false;
        }
        jyi0 jyi0Var = (jyi0) obj;
        return this.a == jyi0Var.a && this.b == jyi0Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.a);
        sb.append(", end=");
        return vu5.b(sb, this.b, ')');
    }
}
