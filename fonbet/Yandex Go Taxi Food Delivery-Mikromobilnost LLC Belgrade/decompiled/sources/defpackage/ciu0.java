package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ciu0 {
    public final miu0 a;
    public final miu0 b;
    public final boolean c;
    public final boolean d;

    public ciu0(miu0 miu0Var, miu0 miu0Var2, boolean z, boolean z2) {
        this.a = miu0Var;
        this.b = miu0Var2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ciu0)) {
            return false;
        }
        ciu0 ciu0Var = (ciu0) obj;
        return jl40.l(this.a, ciu0Var.a) && jl40.l(this.b, ciu0Var.b) && this.c == ciu0Var.c && this.d == ciu0Var.d;
    }

    public final int hashCode() {
        miu0 miu0Var = this.a;
        int hashCode = (miu0Var == null ? 0 : miu0Var.hashCode()) * 31;
        miu0 miu0Var2 = this.b;
        return Boolean.hashCode(this.d) + unr0.e((hashCode + (miu0Var2 != null ? miu0Var2.hashCode() : 0)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Stops(startingItem=");
        sb.append(this.a);
        sb.append(", destinationItem=");
        sb.append(this.b);
        sb.append(", enabled=");
        return smw0.k(", startingStopIsSelectable=", Extension.C_BRAKE, sb, this.c, this.d);
    }
}
