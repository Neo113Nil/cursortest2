package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class h930 {
    public final r930 a;
    public final g930 b;
    public final String c;
    public final boolean d;
    public final Integer e;
    public final boolean f;

    public h930(r930 r930Var, g930 g930Var, String str, boolean z, Integer num, boolean z2) {
        this.a = r930Var;
        this.b = g930Var;
        this.c = str;
        this.d = z;
        this.e = num;
        this.f = z2;
    }

    public static h930 a(h930 h930Var, r930 r930Var, String str, boolean z, Integer num, boolean z2, int i) {
        if ((i & 1) != 0) {
            r930Var = h930Var.a;
        }
        r930 r930Var2 = r930Var;
        g930 g930Var = h930Var.b;
        if ((i & 4) != 0) {
            str = h930Var.c;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            z = h930Var.d;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            num = h930Var.e;
        }
        Integer num2 = num;
        if ((i & 32) != 0) {
            z2 = h930Var.f;
        }
        h930Var.getClass();
        return new h930(r930Var2, g930Var, str2, z3, num2, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h930)) {
            return false;
        }
        h930 h930Var = (h930) obj;
        return jl40.l(this.a, h930Var.a) && jl40.l(this.b, h930Var.b) && jl40.l(this.c, h930Var.c) && this.d == h930Var.d && jl40.l(this.e, h930Var.e) && this.f == h930Var.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        g930 g930Var = this.b;
        int e = unr0.e(unr0.b((hashCode + (g930Var == null ? 0 : g930Var.hashCode())) * 31, 31, this.c), 31, this.d);
        Integer num = this.e;
        return Boolean.hashCode(this.f) + ((e + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MosmetroOtpInternalState(result=");
        sb.append(this.a);
        sb.append(", lastInit=");
        sb.append(this.b);
        sb.append(", otpInput=");
        tse0.y(this.c, ", isExchangeLoading=", ", attemptsLeft=", sb, this.d);
        sb.append(this.e);
        sb.append(", hasInvalidOtpError=");
        sb.append(this.f);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public /* synthetic */ h930(int i) {
        this(p930.a, null, "", false, null, false);
    }

    public h930() {
        this(0);
    }
}
