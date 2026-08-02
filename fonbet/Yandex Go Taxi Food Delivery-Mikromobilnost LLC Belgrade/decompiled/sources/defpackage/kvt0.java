package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class kvt0 {
    public final boolean a;
    public final ivt0 b;
    public final jvt0 c;
    public final String d;
    public final String e;
    public final String f;

    public kvt0(boolean z, ivt0 ivt0Var, jvt0 jvt0Var, String str, String str2, String str3) {
        this.a = z;
        this.b = ivt0Var;
        this.c = jvt0Var;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f;
    }

    public final ivt0 c() {
        return this.b;
    }

    public final String d() {
        return this.e;
    }

    public final jvt0 e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kvt0)) {
            return false;
        }
        kvt0 kvt0Var = (kvt0) obj;
        return this.a == kvt0Var.a && this.b.equals(kvt0Var.b) && jl40.l(this.c, kvt0Var.c) && jl40.l(this.d, kvt0Var.d) && jl40.l(this.e, kvt0Var.e) && jl40.l(this.f, kvt0Var.f);
    }

    public final boolean f() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31;
        jvt0 jvt0Var = this.c;
        int hashCode2 = (hashCode + (jvt0Var == null ? 0 : jvt0Var.a.hashCode())) * 31;
        String str = this.d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SplitInfo(isUserUpgraded=");
        sb.append(this.a);
        sb.append(", limit=");
        sb.append(this.b);
        sb.append(", overdue=");
        sb.append(this.c);
        sb.append(", accountUrl=");
        sb.append(this.d);
        sb.append(", onboardingUrl=");
        return g8e.r(sb, this.e, ", futurePaymentsUrl=", this.f, Extension.C_BRAKE);
    }
}
