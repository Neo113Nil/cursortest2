package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class jqp0 extends crp0 {
    public final Throwable c;
    public final String d;
    public final Object e;
    public final String f;

    public jqp0(Throwable th, String str, Object obj, String str2) {
        super("Exception", str);
        this.c = th;
        this.d = str;
        this.e = obj;
        this.f = str2;
    }

    @Override // defpackage.crp0
    public final Throwable b() {
        return this.c;
    }

    @Override // defpackage.crp0
    public final Object c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jqp0)) {
            return false;
        }
        jqp0 jqp0Var = (jqp0) obj;
        return jl40.l(this.c, jqp0Var.c) && jl40.l(this.d, jqp0Var.d) && jl40.l(this.e, jqp0Var.e) && jl40.l(this.f, jqp0Var.f);
    }

    public final int hashCode() {
        int b = unr0.b(this.c.hashCode() * 31, 31, this.d);
        Object obj = this.e;
        int hashCode = (b + (obj == null ? 0 : obj.hashCode())) * 31;
        String str = this.f;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "Exception(exception=" + this.c + ", message=" + this.d + ", payload=" + this.e + ", tags=" + this.f + Extension.C_BRAKE;
    }
}
