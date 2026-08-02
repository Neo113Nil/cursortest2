package defpackage;

import coil3.request.CachePolicy;
import coil3.size.Precision;
import coil3.size.Scale;
import kotlin.coroutines.EmptyCoroutineContext;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class cev {
    public static final cev o = new cev(0);
    public final r1r a;
    public final fse b;
    public final fse c;
    public final fse d;
    public final CachePolicy e;
    public final CachePolicy f;
    public final CachePolicy g;
    public final tls h;
    public final tls i;
    public final tls j;
    public final qjs0 k;
    public final Scale l;
    public final Precision m;
    public final j5p n;

    public cev(r1r r1rVar, fse fseVar, fse fseVar2, fse fseVar3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, tls tlsVar, tls tlsVar2, tls tlsVar3, qjs0 qjs0Var, Scale scale, Precision precision, j5p j5pVar) {
        this.a = r1rVar;
        this.b = fseVar;
        this.c = fseVar2;
        this.d = fseVar3;
        this.e = cachePolicy;
        this.f = cachePolicy2;
        this.g = cachePolicy3;
        this.h = tlsVar;
        this.i = tlsVar2;
        this.j = tlsVar3;
        this.k = qjs0Var;
        this.l = scale;
        this.m = precision;
        this.n = j5pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cev)) {
            return false;
        }
        cev cevVar = (cev) obj;
        return jl40.l(this.a, cevVar.a) && jl40.l(this.b, cevVar.b) && jl40.l(this.c, cevVar.c) && jl40.l(this.d, cevVar.d) && this.e == cevVar.e && this.f == cevVar.f && this.g == cevVar.g && jl40.l(this.h, cevVar.h) && jl40.l(this.i, cevVar.i) && jl40.l(this.j, cevVar.j) && jl40.l(this.k, cevVar.k) && this.l == cevVar.l && this.m == cevVar.m && jl40.l(this.n, cevVar.n);
    }

    public final int hashCode() {
        return this.n.a.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ly3.a(ly3.a(ly3.a((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.h), 31, this.i), 31, this.j)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Defaults(fileSystem=" + this.a + ", interceptorCoroutineContext=" + this.b + ", fetcherCoroutineContext=" + this.c + ", decoderCoroutineContext=" + this.d + ", memoryCachePolicy=" + this.e + ", diskCachePolicy=" + this.f + ", networkCachePolicy=" + this.g + ", placeholderFactory=" + this.h + ", errorFactory=" + this.i + ", fallbackFactory=" + this.j + ", sizeResolver=" + this.k + ", scale=" + this.l + ", precision=" + this.m + ", extras=" + this.n + Extension.C_BRAKE;
    }

    public cev() {
        this(0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cev(int i) {
        this(r1, EmptyCoroutineContext.a, r3, r3, r5, r5, r5, r8, r8, r8, qjs0.a, Scale.FIT, Precision.EXACT, j5p.b);
        n35 n35Var = n35.w;
        hfx hfxVar = r1r.a;
        sjh sjhVar = uyj.a;
        mdh mdhVar = mdh.b;
        CachePolicy cachePolicy = CachePolicy.ENABLED;
    }
}
