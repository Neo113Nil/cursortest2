package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class paf0 {
    public final waf0 a;
    public final Throwable b;

    public paf0(waf0 waf0Var, Throwable th) {
        this.a = waf0Var;
        this.b = th;
    }

    public final Throwable a() {
        return this.b;
    }

    public final waf0 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof paf0)) {
            return false;
        }
        paf0 paf0Var = (paf0) obj;
        return jl40.l(this.a, paf0Var.a) && jl40.l(this.b, paf0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ProductsScreenError(sourceType=" + this.a + ", error=" + this.b + Extension.C_BRAKE;
    }
}
