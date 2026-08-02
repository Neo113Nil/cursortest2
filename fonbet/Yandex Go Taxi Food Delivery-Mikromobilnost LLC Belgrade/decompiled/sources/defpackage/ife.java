package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class ife {
    public final l1o a;
    public final g0c b;

    public ife(l1o l1oVar, g0c g0cVar) {
        this.a = l1oVar;
        this.b = g0cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ife)) {
            return false;
        }
        ife ifeVar = (ife) obj;
        return jl40.l(this.a, ifeVar.a) && this.b.equals(ifeVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CacheKey(context=" + this.a + ", contentType=" + this.b + Extension.C_BRAKE;
    }
}
