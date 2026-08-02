package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.Lifecycle;
import coil.memory.MemoryCache$Key;
import coil.request.CachePolicy;
import coil.view.Precision;
import coil.view.Scale;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes10.dex */
public final class hev {
    public final dd90 A;
    public final Integer B;
    public final Drawable C;
    public final Integer D;
    public final Drawable E;
    public final Integer F;
    public final aph G;
    public final tih H;
    public final Context a;
    public final Object b;
    public final jax0 c;
    public final fev d;
    public final MemoryCache$Key e;
    public final String f;
    public final Bitmap.Config g;
    public final Precision h;
    public final List i;
    public final qx01 j;
    public final meu k;
    public final u7x0 l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final CachePolicy q;
    public final CachePolicy r;
    public final CachePolicy s;
    public final jse t;
    public final jse u;
    public final jse v;
    public final jse w;
    public final Lifecycle x;
    public final rjs0 y;
    public final Scale z;

    public hev(Context context, Object obj, jax0 jax0Var, fev fevVar, MemoryCache$Key memoryCache$Key, String str, Bitmap.Config config, Precision precision, List list, qx01 qx01Var, meu meuVar, u7x0 u7x0Var, boolean z, boolean z2, boolean z3, boolean z4, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, jse jseVar, jse jseVar2, jse jseVar3, jse jseVar4, Lifecycle lifecycle, rjs0 rjs0Var, Scale scale, dd90 dd90Var, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, aph aphVar, tih tihVar) {
        this.a = context;
        this.b = obj;
        this.c = jax0Var;
        this.d = fevVar;
        this.e = memoryCache$Key;
        this.f = str;
        this.g = config;
        this.h = precision;
        this.i = list;
        this.j = qx01Var;
        this.k = meuVar;
        this.l = u7x0Var;
        this.m = z;
        this.n = z2;
        this.o = z3;
        this.p = z4;
        this.q = cachePolicy;
        this.r = cachePolicy2;
        this.s = cachePolicy3;
        this.t = jseVar;
        this.u = jseVar2;
        this.v = jseVar3;
        this.w = jseVar4;
        this.x = lifecycle;
        this.y = rjs0Var;
        this.z = scale;
        this.A = dd90Var;
        this.B = num;
        this.C = drawable;
        this.D = num2;
        this.E = drawable2;
        this.F = num3;
        this.G = aphVar;
        this.H = tihVar;
    }

    public static bev F(hev hevVar) {
        Context context = hevVar.a;
        hevVar.getClass();
        return new bev(hevVar, context);
    }

    public final u7x0 A() {
        return this.l;
    }

    public final jax0 B() {
        return this.c;
    }

    public final jse C() {
        return this.w;
    }

    public final List D() {
        return this.i;
    }

    public final qx01 E() {
        return this.j;
    }

    public final boolean a() {
        return this.m;
    }

    public final boolean b() {
        return this.n;
    }

    public final boolean c() {
        return this.o;
    }

    public final Bitmap.Config d() {
        return this.g;
    }

    public final Context e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hev)) {
            return false;
        }
        hev hevVar = (hev) obj;
        return jl40.l(this.a, hevVar.a) && this.b.equals(hevVar.b) && jl40.l(this.c, hevVar.c) && jl40.l(this.d, hevVar.d) && jl40.l(this.e, hevVar.e) && jl40.l(this.f, hevVar.f) && this.g == hevVar.g && this.h == hevVar.h && jl40.l(this.i, hevVar.i) && jl40.l(this.j, hevVar.j) && jl40.l(this.k, hevVar.k) && jl40.l(this.l, hevVar.l) && this.m == hevVar.m && this.n == hevVar.n && this.o == hevVar.o && this.p == hevVar.p && this.q == hevVar.q && this.r == hevVar.r && this.s == hevVar.s && jl40.l(this.t, hevVar.t) && jl40.l(this.u, hevVar.u) && jl40.l(this.v, hevVar.v) && jl40.l(this.w, hevVar.w) && jl40.l(this.B, hevVar.B) && jl40.l(this.C, hevVar.C) && jl40.l(this.D, hevVar.D) && jl40.l(this.E, hevVar.E) && jl40.l(this.F, hevVar.F) && jl40.l(this.x, hevVar.x) && this.y.equals(hevVar.y) && this.z == hevVar.z && jl40.l(this.A, hevVar.A) && this.G.equals(hevVar.G) && jl40.l(this.H, hevVar.H);
    }

    public final Object f() {
        return this.b;
    }

    public final jse g() {
        return this.v;
    }

    public final aph h() {
        return this.G;
    }

    public final int hashCode() {
        int c = smw0.c(this.a.hashCode() * 31, 31, this.b);
        jax0 jax0Var = this.c;
        int hashCode = (c + (jax0Var != null ? jax0Var.hashCode() : 0)) * 31;
        fev fevVar = this.d;
        int hashCode2 = (hashCode + (fevVar != null ? fevVar.hashCode() : 0)) * 31;
        MemoryCache$Key memoryCache$Key = this.e;
        int hashCode3 = (hashCode2 + (memoryCache$Key != null ? memoryCache$Key.hashCode() : 0)) * 31;
        String str = this.f;
        int d = unr0.d((this.z.hashCode() + ((this.y.hashCode() + ((this.x.hashCode() + ((this.w.hashCode() + ((this.v.hashCode() + ((this.u.hashCode() + ((this.t.hashCode() + ((this.s.hashCode() + ((this.r.hashCode() + ((this.q.hashCode() + unr0.e(unr0.e(unr0.e(unr0.e(unr0.d((((this.j.hashCode() + unr0.c((this.h.hashCode() + ((this.g.hashCode() + ((hashCode3 + (str != null ? str.hashCode() : 0)) * 31)) * 961)) * 29791, 31, this.i)) * 31) + Arrays.hashCode(this.k.a)) * 31, 31, this.l.a), 31, this.m), 31, this.n), 31, this.o), 31, this.p)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 961, this.A.a);
        Integer num = this.B;
        int hashCode4 = (d + (num != null ? num.hashCode() : 0)) * 31;
        Drawable drawable = this.C;
        int hashCode5 = (hashCode4 + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Integer num2 = this.D;
        int hashCode6 = (hashCode5 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Drawable drawable2 = this.E;
        int hashCode7 = (hashCode6 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Integer num3 = this.F;
        int hashCode8 = num3 != null ? num3.hashCode() : 0;
        return this.H.hashCode() + ((this.G.hashCode() + ((hashCode7 + hashCode8) * 961)) * 31);
    }

    public final String i() {
        return this.f;
    }

    public final CachePolicy j() {
        return this.r;
    }

    public final Drawable k() {
        return i.b(this, this.E, this.D, this.H.k);
    }

    public final Drawable l() {
        return i.b(this, null, this.F, this.H.l);
    }

    public final jse m() {
        return this.u;
    }

    public final meu n() {
        return this.k;
    }

    public final jse o() {
        return this.t;
    }

    public final Lifecycle p() {
        return this.x;
    }

    public final fev q() {
        return this.d;
    }

    public final MemoryCache$Key r() {
        return this.e;
    }

    public final CachePolicy s() {
        return this.q;
    }

    public final CachePolicy t() {
        return this.s;
    }

    public final dd90 u() {
        return this.A;
    }

    public final Drawable v() {
        return i.b(this, this.C, this.B, this.H.j);
    }

    public final Precision w() {
        return this.h;
    }

    public final boolean x() {
        return this.p;
    }

    public final Scale y() {
        return this.z;
    }

    public final rjs0 z() {
        return this.y;
    }
}
