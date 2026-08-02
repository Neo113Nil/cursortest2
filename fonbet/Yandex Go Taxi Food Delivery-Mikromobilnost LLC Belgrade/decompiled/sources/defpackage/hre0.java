package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class hre0 implements rre0 {
    public final wpe0 a;
    public final qse0 b;
    public final String c;
    public final boolean d;
    public final jm0 e;

    public hre0(wpe0 wpe0Var, qse0 qse0Var, String str, boolean z, jm0 jm0Var) {
        this.a = wpe0Var;
        this.b = qse0Var;
        this.c = str;
        this.d = z;
        this.e = jm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hre0)) {
            return false;
        }
        hre0 hre0Var = (hre0) obj;
        return jl40.l(this.a, hre0Var.a) && jl40.l(this.b, hre0Var.b) && jl40.l(this.c, hre0Var.c) && this.d == hre0Var.d && jl40.l(this.e, hre0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.e(unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Default(preorder=");
        sb.append(this.a);
        sb.append(", preorderStep=");
        sb.append(this.b);
        sb.append(", analyticsReason=");
        tse0.y(this.c, ", dropLastPreorder=", ", additionalOrderConfig=", sb, this.d);
        sb.append(this.e);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public /* synthetic */ hre0(vpe0 vpe0Var, qse0 qse0Var, String str) {
        this(vpe0Var, qse0Var, str, true, xpb1.c);
    }
}
