package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class bv31 {
    public final gq31 a;
    public final gq31 b;

    public bv31(gq31 gq31Var, gq31 gq31Var2) {
        this.a = gq31Var;
        this.b = gq31Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bv31)) {
            return false;
        }
        bv31 bv31Var = (bv31) obj;
        return jl40.l(this.a, bv31Var.a) && jl40.l(this.b, bv31Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ViewState(paddings=" + this.a + ", margins=" + this.b + Extension.C_BRAKE;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public bv31() {
        this(r0, r0);
        gq31 gq31Var = gq31.e;
    }
}
