package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class hfe {
    public final l1o a;
    public final g0c b;

    public hfe(l1o l1oVar, g0c g0cVar) {
        this.a = l1oVar;
        this.b = g0cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hfe)) {
            return false;
        }
        hfe hfeVar = (hfe) obj;
        return jl40.l(this.a, hfeVar.a) && this.b.equals(hfeVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CacheKey(context=" + this.a + ", contentType=" + this.b + Extension.C_BRAKE;
    }
}
