package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes4.dex */
public final class ec41 {
    public static final dc41 Companion = new dc41();
    public final int a;
    public final cc41 b;

    public /* synthetic */ ec41(int i, int i2, cc41 cc41Var) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, zb41.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = cc41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec41)) {
            return false;
        }
        ec41 ec41Var = (ec41) obj;
        return this.a == ec41Var.a && jl40.l(this.b, ec41Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "SelfTimer(timeout=" + this.a + ", beforeStartDialog=" + this.b + Extension.C_BRAKE;
    }
}
