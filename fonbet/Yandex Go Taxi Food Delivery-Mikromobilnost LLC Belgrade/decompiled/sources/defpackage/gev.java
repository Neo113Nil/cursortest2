package defpackage;

import android.content.Context;
import coil3.request.CachePolicy;
import coil3.size.Precision;
import coil3.size.Scale;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class gev {
    public final Context a;
    public final Object b;
    public final umf c;
    public final eev d;
    public final Map e;
    public final r1r f;
    public final fyg g;
    public final fse h;
    public final fse i;
    public final fse j;
    public final CachePolicy k;
    public final CachePolicy l;
    public final CachePolicy m;
    public final tls n;
    public final tls o;
    public final tls p;
    public final qjs0 q;
    public final Scale r;
    public final Precision s;
    public final j5p t;
    public final dev u;
    public final cev v;

    public gev(Context context, Object obj, umf umfVar, eev eevVar, Map map, r1r r1rVar, fyg fygVar, fse fseVar, fse fseVar2, fse fseVar3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, tls tlsVar, tls tlsVar2, tls tlsVar3, qjs0 qjs0Var, Scale scale, Precision precision, j5p j5pVar, dev devVar, cev cevVar) {
        this.a = context;
        this.b = obj;
        this.c = umfVar;
        this.d = eevVar;
        this.e = map;
        this.f = r1rVar;
        this.g = fygVar;
        this.h = fseVar;
        this.i = fseVar2;
        this.j = fseVar3;
        this.k = cachePolicy;
        this.l = cachePolicy2;
        this.m = cachePolicy3;
        this.n = tlsVar;
        this.o = tlsVar2;
        this.p = tlsVar3;
        this.q = qjs0Var;
        this.r = scale;
        this.s = precision;
        this.t = j5pVar;
        this.u = devVar;
        this.v = cevVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gev)) {
            return false;
        }
        gev gevVar = (gev) obj;
        return jl40.l(this.a, gevVar.a) && this.b.equals(gevVar.b) && jl40.l(this.c, gevVar.c) && jl40.l(this.d, gevVar.d) && this.e.equals(gevVar.e) && jl40.l(this.f, gevVar.f) && jl40.l(this.g, gevVar.g) && jl40.l(this.h, gevVar.h) && jl40.l(this.i, gevVar.i) && jl40.l(this.j, gevVar.j) && this.k == gevVar.k && this.l == gevVar.l && this.m == gevVar.m && jl40.l(this.n, gevVar.n) && jl40.l(this.o, gevVar.o) && jl40.l(this.p, gevVar.p) && jl40.l(this.q, gevVar.q) && this.r == gevVar.r && this.s == gevVar.s && this.t.equals(gevVar.t) && this.u.equals(gevVar.u) && jl40.l(this.v, gevVar.v);
    }

    public final int hashCode() {
        int c = smw0.c(this.a.hashCode() * 31, 31, this.b);
        umf umfVar = this.c;
        int hashCode = (c + (umfVar == null ? 0 : umfVar.hashCode())) * 31;
        eev eevVar = this.d;
        int hashCode2 = (this.f.hashCode() + unr0.d((hashCode + (eevVar == null ? 0 : eevVar.hashCode())) * 961, 961, this.e)) * 961;
        fyg fygVar = this.g;
        return this.v.hashCode() + ((this.u.hashCode() + unr0.d((this.s.hashCode() + ((this.r.hashCode() + ((this.q.hashCode() + ly3.a(ly3.a(ly3.a((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((hashCode2 + (fygVar != null ? fygVar.hashCode() : 0)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 961, 31, this.n), 31, this.o), 31, this.p)) * 31)) * 31)) * 31, 31, this.t.a)) * 31);
    }

    public final String toString() {
        return "ImageRequest(context=" + this.a + ", data=" + this.b + ", target=" + this.c + ", listener=" + this.d + ", memoryCacheKey=null, memoryCacheKeyExtras=" + this.e + ", diskCacheKey=null, fileSystem=" + this.f + ", fetcherFactory=null, decoderFactory=" + this.g + ", interceptorCoroutineContext=" + this.h + ", fetcherCoroutineContext=" + this.i + ", decoderCoroutineContext=" + this.j + ", memoryCachePolicy=" + this.k + ", diskCachePolicy=" + this.l + ", networkCachePolicy=" + this.m + ", placeholderMemoryCacheKey=null, placeholderFactory=" + this.n + ", errorFactory=" + this.o + ", fallbackFactory=" + this.p + ", sizeResolver=" + this.q + ", scale=" + this.r + ", precision=" + this.s + ", extras=" + this.t + ", defined=" + this.u + ", defaults=" + this.v + Extension.C_BRAKE;
    }
}
