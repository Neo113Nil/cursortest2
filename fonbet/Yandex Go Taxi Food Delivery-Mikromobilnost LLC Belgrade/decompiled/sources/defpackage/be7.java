package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class be7 {
    public final String a;
    public final String b;

    public be7(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof be7)) {
            return false;
        }
        be7 be7Var = (be7) obj;
        return jl40.l(this.a, be7Var.a) && jl40.l(this.b, be7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("CacheKey(deliveryId=", this.a, ", etag=", this.b, Extension.C_BRAKE);
    }
}
