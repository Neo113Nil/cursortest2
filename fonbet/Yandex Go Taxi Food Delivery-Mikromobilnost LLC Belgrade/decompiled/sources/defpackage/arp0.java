package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class arp0 extends crp0 {
    public final String c;
    public final Integer d;
    public final String e;
    public final String f;
    public final Object g;
    public final String h;

    public arp0(String str, Integer num, String str2, String str3, Object obj, String str4) {
        super("WebView3DSError", str4);
        this.c = str;
        this.d = num;
        this.e = str2;
        this.f = str3;
        this.g = obj;
        this.h = str4;
    }

    @Override // defpackage.crp0
    public final Throwable b() {
        return null;
    }

    @Override // defpackage.crp0
    public final Object c() {
        return this.g;
    }

    @Override // defpackage.crp0
    public final String d() {
        return this.c;
    }

    public final Integer e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof arp0)) {
            return false;
        }
        arp0 arp0Var = (arp0) obj;
        return jl40.l(this.c, arp0Var.c) && jl40.l(this.d, arp0Var.d) && this.e.equals(arp0Var.e) && jl40.l(this.f, arp0Var.f) && jl40.l(this.g, arp0Var.g) && this.h.equals(arp0Var.h);
    }

    public final String f() {
        return this.e;
    }

    public final String g() {
        return this.f;
    }

    public final int hashCode() {
        String str = this.c;
        int hashCode = (str == null ? 0 : str.hashCode()) * 961;
        Integer num = this.d;
        int b = unr0.b((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.e);
        String str2 = this.f;
        int hashCode2 = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        Object obj = this.g;
        return this.h.hashCode() + ((hashCode2 + (obj != null ? obj.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder q = n.q("Web3DS(url=", this.d, this.c, ", exception=null, code=", ", message=");
        g8e.D(q, this.e, ", traceId=", this.f, ", payload=");
        q.append(this.g);
        q.append(", titleDescription=");
        q.append(this.h);
        q.append(Extension.C_BRAKE);
        return q.toString();
    }
}
