package defpackage;

import android.content.Context;
import coil3.request.CachePolicy;
import coil3.size.Precision;
import coil3.size.Scale;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.b;

/* loaded from: classes.dex */
public final class aev {
    public final Context a;
    public cev b;
    public Object c;
    public umf d;
    public eev e;
    public boolean f;
    public Map g;
    public fyg h;
    public CachePolicy i;
    public CachePolicy j;
    public CachePolicy k;
    public final tls l;
    public tls m;
    public final tls n;
    public qjs0 o;
    public Scale p;
    public Precision q;
    public Object r;

    public aev(gev gevVar, Context context) {
        this.a = context;
        this.b = gevVar.v;
        this.c = gevVar.b;
        this.d = gevVar.c;
        this.e = gevVar.d;
        this.g = gevVar.e;
        dev devVar = gevVar.u;
        this.h = gevVar.g;
        this.i = devVar.a;
        this.j = devVar.b;
        this.k = devVar.c;
        this.l = devVar.d;
        this.m = devVar.e;
        this.n = devVar.f;
        this.o = devVar.g;
        this.p = devVar.h;
        this.q = devVar.i;
        this.r = gevVar.t;
    }

    public final gev a() {
        Map map;
        j5p j5pVar;
        Object obj = this.c;
        if (obj == null) {
            obj = mm60.a;
        }
        Object obj2 = obj;
        umf umfVar = this.d;
        eev eevVar = this.e;
        Map map2 = this.g;
        if (jl40.l(map2, Boolean.valueOf(this.f))) {
            map = vng.M(ym11.c(map2));
        } else {
            if (!(map2 instanceof Map)) {
                ny61.w();
                return null;
            }
            map = map2;
        }
        Map map3 = map;
        cev cevVar = this.b;
        r1r r1rVar = cevVar.a;
        fyg fygVar = this.h;
        CachePolicy cachePolicy = this.i;
        if (cachePolicy == null) {
            cachePolicy = cevVar.e;
        }
        CachePolicy cachePolicy2 = cachePolicy;
        CachePolicy cachePolicy3 = this.j;
        if (cachePolicy3 == null) {
            cachePolicy3 = cevVar.f;
        }
        CachePolicy cachePolicy4 = cachePolicy3;
        CachePolicy cachePolicy5 = this.k;
        if (cachePolicy5 == null) {
            cachePolicy5 = cevVar.g;
        }
        CachePolicy cachePolicy6 = cachePolicy5;
        fse fseVar = cevVar.b;
        fse fseVar2 = cevVar.c;
        fse fseVar3 = cevVar.d;
        tls tlsVar = this.l;
        if (tlsVar == null) {
            tlsVar = cevVar.h;
        }
        tls tlsVar2 = tlsVar;
        tls tlsVar3 = this.m;
        if (tlsVar3 == null) {
            tlsVar3 = cevVar.i;
        }
        tls tlsVar4 = tlsVar3;
        tls tlsVar5 = this.n;
        if (tlsVar5 == null) {
            tlsVar5 = cevVar.j;
        }
        tls tlsVar6 = tlsVar5;
        qjs0 qjs0Var = this.o;
        if (qjs0Var == null) {
            qjs0Var = cevVar.k;
        }
        qjs0 qjs0Var2 = qjs0Var;
        Scale scale = this.p;
        if (scale == null) {
            scale = cevVar.l;
        }
        Scale scale2 = scale;
        Precision precision = this.q;
        if (precision == null) {
            precision = cevVar.m;
        }
        Precision precision2 = precision;
        Object obj3 = this.r;
        if (obj3 instanceof g5p) {
            j5pVar = ((g5p) obj3).a();
        } else {
            if (!(obj3 instanceof j5p)) {
                ny61.w();
                return null;
            }
            j5pVar = (j5p) obj3;
        }
        j5p j5pVar2 = j5pVar;
        tls tlsVar7 = this.m;
        return new gev(this.a, obj2, umfVar, eevVar, map3, r1rVar, fygVar, fseVar, fseVar2, fseVar3, cachePolicy2, cachePolicy4, cachePolicy6, tlsVar2, tlsVar4, tlsVar6, qjs0Var2, scale2, precision2, j5pVar2, new dev(this.i, this.j, this.k, this.l, tlsVar7, this.n, this.o, this.p, this.q), this.b);
    }

    public final g5p b() {
        Object obj = this.r;
        if (obj instanceof g5p) {
            return (g5p) obj;
        }
        if (!(obj instanceof j5p)) {
            ny61.w();
            return null;
        }
        g5p g5pVar = new g5p((j5p) obj);
        this.r = g5pVar;
        return g5pVar;
    }

    public final Map c() {
        Map map = this.g;
        if (!jl40.l(map, Boolean.valueOf(this.f))) {
            if (!(map instanceof Map)) {
                ny61.w();
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            this.g = linkedHashMap;
            this.f = true;
            map = linkedHashMap;
        }
        return ym11.c(map);
    }

    public aev(Context context) {
        this.a = context;
        this.b = cev.o;
        this.c = null;
        this.d = null;
        this.e = null;
        this.g = b.f();
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        n35 n35Var = n35.w;
        this.l = n35Var;
        this.m = n35Var;
        this.n = n35Var;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = j5p.b;
    }
}
