package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class brp0 extends crp0 {
    public final String c;
    public final Throwable d;
    public final Integer e;
    public final String f;
    public final String g;
    public final Object h;
    public final String i;

    public brp0(String str, Throwable th, Integer num, String str2, String str3, Object obj, String str4) {
        super("WebViewError", str4);
        this.c = str;
        this.d = th;
        this.e = num;
        this.f = str2;
        this.g = str3;
        this.h = obj;
        this.i = str4;
    }

    @Override // defpackage.crp0
    public final Throwable b() {
        return this.d;
    }

    @Override // defpackage.crp0
    public final Object c() {
        return this.h;
    }

    @Override // defpackage.crp0
    public final String d() {
        return this.c;
    }

    public final Integer e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof brp0)) {
            return false;
        }
        brp0 brp0Var = (brp0) obj;
        return jl40.l(this.c, brp0Var.c) && jl40.l(this.d, brp0Var.d) && jl40.l(this.e, brp0Var.e) && this.f.equals(brp0Var.f) && jl40.l(this.g, brp0Var.g) && jl40.l(this.h, brp0Var.h) && this.i.equals(brp0Var.i);
    }

    public final String f() {
        return this.f;
    }

    public final String g() {
        return this.g;
    }

    public final int hashCode() {
        String str = this.c;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Throwable th = this.d;
        int hashCode2 = (hashCode + (th == null ? 0 : th.hashCode())) * 31;
        Integer num = this.e;
        int b = unr0.b((hashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.f);
        String str2 = this.g;
        int hashCode3 = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        Object obj = this.h;
        return this.i.hashCode() + ((hashCode3 + (obj != null ? obj.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Web(url=");
        sb.append(this.c);
        sb.append(", exception=");
        sb.append(this.d);
        sb.append(", code=");
        tse0.w(this.e, ", message=", this.f, ", traceId=", sb);
        sb.append(this.g);
        sb.append(", payload=");
        sb.append(this.h);
        sb.append(", titleDescription=");
        return oyr.t(sb, this.i, Extension.C_BRAKE);
    }
}
