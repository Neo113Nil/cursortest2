package defpackage;

import coil3.request.CachePolicy;
import coil3.size.Precision;
import coil3.size.Scale;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class dev {
    public final CachePolicy a;
    public final CachePolicy b;
    public final CachePolicy c;
    public final tls d;
    public final tls e;
    public final tls f;
    public final qjs0 g;
    public final Scale h;
    public final Precision i;

    public dev(CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, tls tlsVar, tls tlsVar2, tls tlsVar3, qjs0 qjs0Var, Scale scale, Precision precision) {
        this.a = cachePolicy;
        this.b = cachePolicy2;
        this.c = cachePolicy3;
        this.d = tlsVar;
        this.e = tlsVar2;
        this.f = tlsVar3;
        this.g = qjs0Var;
        this.h = scale;
        this.i = precision;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dev)) {
            return false;
        }
        dev devVar = (dev) obj;
        return this.a == devVar.a && this.b == devVar.b && this.c == devVar.c && jl40.l(this.d, devVar.d) && jl40.l(this.e, devVar.e) && jl40.l(this.f, devVar.f) && jl40.l(this.g, devVar.g) && this.h == devVar.h && this.i == devVar.i;
    }

    public final int hashCode() {
        CachePolicy cachePolicy = this.a;
        int hashCode = (cachePolicy == null ? 0 : cachePolicy.hashCode()) * 31;
        CachePolicy cachePolicy2 = this.b;
        int hashCode2 = (hashCode + (cachePolicy2 == null ? 0 : cachePolicy2.hashCode())) * 31;
        CachePolicy cachePolicy3 = this.c;
        int hashCode3 = (hashCode2 + (cachePolicy3 == null ? 0 : cachePolicy3.hashCode())) * 31;
        tls tlsVar = this.d;
        int hashCode4 = (hashCode3 + (tlsVar == null ? 0 : tlsVar.hashCode())) * 31;
        tls tlsVar2 = this.e;
        int hashCode5 = (hashCode4 + (tlsVar2 == null ? 0 : tlsVar2.hashCode())) * 31;
        tls tlsVar3 = this.f;
        int hashCode6 = (hashCode5 + (tlsVar3 == null ? 0 : tlsVar3.hashCode())) * 31;
        qjs0 qjs0Var = this.g;
        int hashCode7 = (hashCode6 + (qjs0Var == null ? 0 : qjs0Var.hashCode())) * 31;
        Scale scale = this.h;
        int hashCode8 = (hashCode7 + (scale == null ? 0 : scale.hashCode())) * 31;
        Precision precision = this.i;
        return hashCode8 + (precision != null ? precision.hashCode() : 0);
    }

    public final String toString() {
        return "Defined(fileSystem=null, interceptorCoroutineContext=null, fetcherCoroutineContext=null, decoderCoroutineContext=null, memoryCachePolicy=" + this.a + ", diskCachePolicy=" + this.b + ", networkCachePolicy=" + this.c + ", placeholderFactory=" + this.d + ", errorFactory=" + this.e + ", fallbackFactory=" + this.f + ", sizeResolver=" + this.g + ", scale=" + this.h + ", precision=" + this.i + Extension.C_BRAKE;
    }
}
