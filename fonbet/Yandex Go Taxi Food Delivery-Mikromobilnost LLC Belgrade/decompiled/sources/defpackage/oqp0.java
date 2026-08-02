package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class oqp0 extends crp0 {
    public final Throwable c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Object h;

    public oqp0(Throwable th, String str, String str2, String str3, String str4, String str5) {
        super("NetworkLayerException", str2);
        this.c = th;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
    }

    @Override // defpackage.crp0
    public final Throwable b() {
        return this.c;
    }

    @Override // defpackage.crp0
    public final Object c() {
        return this.h;
    }

    @Override // defpackage.crp0
    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oqp0)) {
            return false;
        }
        oqp0 oqp0Var = (oqp0) obj;
        return jl40.l(this.c, oqp0Var.c) && jl40.l(this.d, oqp0Var.d) && jl40.l(this.e, oqp0Var.e) && jl40.l(this.f, oqp0Var.f) && jl40.l(this.g, oqp0Var.g) && jl40.l(this.h, oqp0Var.h);
    }

    public final String f() {
        return this.f;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.c.hashCode() * 31, 31, this.d), 31, this.e);
        String str = this.f;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Object obj = this.h;
        return hashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkLayerException(exception=");
        sb.append(this.c);
        sb.append(", url=");
        sb.append(this.d);
        sb.append(", titleDescription=");
        g8e.D(sb, this.e, ", traceId=", this.f, ", retryPolicyId=");
        return tse0.l(sb, this.g, ", payload=", this.h, Extension.C_BRAKE);
    }

    public /* synthetic */ oqp0(String str, String str2, String str3, Throwable th) {
        this(th, str, "Retry timeout", str2, str3, null);
    }
}
