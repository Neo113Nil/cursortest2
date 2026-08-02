package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class c111 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public c111(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c111)) {
            return false;
        }
        c111 c111Var = (c111) obj;
        return jl40.l(this.a, c111Var.a) && jl40.l(this.b, c111Var.b) && jl40.l(this.c, c111Var.c) && jl40.l(this.d, c111Var.d);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return g8e.r(b64.v("TransportCardPaymentActionDomain(text=", this.a, ", deeplink=", this.b, ", type="), this.c, ", bgColor=", this.d, Extension.C_BRAKE);
    }

    public c111() {
        this("", "", "", null);
    }
}
