package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class jxm0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public jxm0(String str, String str2, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public static jxm0 a(jxm0 jxm0Var, boolean z) {
        String str = jxm0Var.a;
        String str2 = jxm0Var.b;
        boolean z2 = jxm0Var.c;
        boolean z3 = jxm0Var.e;
        jxm0Var.getClass();
        return new jxm0(str, str2, z2, z, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxm0)) {
            return false;
        }
        jxm0 jxm0Var = (jxm0) obj;
        return this.a.equals(jxm0Var.a) && this.b.equals(jxm0Var.b) && this.c == jxm0Var.c && this.d == jxm0Var.d && this.e == jxm0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + unr0.e(unr0.e(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("ScootersAgreementSwitchItemModel(title=", this.a, ", subtitle=", this.b, ", required=");
        nnm.v(", checked=", ", lastAndNoRootAcceptItemModel=", v, this.c, this.d);
        return x4e.i(v, this.e, Extension.C_BRAKE);
    }
}
