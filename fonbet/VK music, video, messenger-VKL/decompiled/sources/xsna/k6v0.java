package xsna;

import android.content.Context;
import android.content.Intent;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vkontakte.android.MainActivity;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.oz50;
import xsna.sw50;

/* compiled from: VkNavigationBridge.kt */
/* loaded from: classes.dex */
public final class k6v0 implements sw50 {
    public final Object a;
    public final Object b;
    public final ProfileFragmentProviderComponent c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;
    public final Object p;
    public final Object q;
    public final Object r;
    public final Object s;
    public final Object t;
    public final Object u;
    public final Object v;
    public final Object w;

    public k6v0(ProfileFragmentProviderComponent profileFragmentProviderComponent, Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4) {
        this.a = lazy;
        this.b = lazy2;
        this.c = profileFragmentProviderComponent;
        this.d = lazy3;
        this.e = lazy4;
        jnf jnfVar = new jnf(16);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f = msy.a(lazyThreadSafetyMode, jnfVar);
        this.g = msy.a(lazyThreadSafetyMode, new t0f(17));
        this.h = msy.a(lazyThreadSafetyMode, new knf(20));
        this.i = msy.a(lazyThreadSafetyMode, new q12(this, 7));
        this.j = msy.a(lazyThreadSafetyMode, new wh(this, 5));
        this.k = msy.a(lazyThreadSafetyMode, new s12(17));
        this.l = msy.a(lazyThreadSafetyMode, new tog(15));
        this.m = msy.a(lazyThreadSafetyMode, new j55(20));
        this.n = msy.a(lazyThreadSafetyMode, new s0f(this, 11));
        this.o = msy.a(lazyThreadSafetyMode, new an(this, 9));
        this.p = msy.a(lazyThreadSafetyMode, new v94(21));
        this.q = msy.a(lazyThreadSafetyMode, new w94(25));
        this.r = msy.a(lazyThreadSafetyMode, new cd3(18));
        this.s = msy.a(lazyThreadSafetyMode, new z58(20));
        this.t = msy.a(lazyThreadSafetyMode, new a68(18));
        this.u = msy.a(lazyThreadSafetyMode, new ug9(18));
        this.v = msy.a(lazyThreadSafetyMode, new vg9(11));
        this.w = msy.a(lazyThreadSafetyMode, new qn6(13));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.sw50
    public final sw50.h V() {
        return (sw50.h) this.r.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.sw50
    public final sw50.i a() {
        return (sw50.i) this.k.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.sw50
    public final b13 b(SearchStatsLoggingInfo searchStatsLoggingInfo) {
        return new b13(searchStatsLoggingInfo, (gog) this.b.getValue(), this.c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.sw50
    public final sw50.n c() {
        return (sw50.n) this.n.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.sw50
    public final sw50.l d() {
        return (sw50.l) this.o.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.sw50
    public final sw50.g e() {
        return (sw50.g) this.s.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.sw50
    public final sw50.e f() {
        return (sw50.e) this.g.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.sw50
    public final sw50.f g() {
        return (sw50.f) this.p.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.sw50
    public final sw50.d h() {
        return (sw50.d) this.l.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.sw50
    public final sw50.q i() {
        return (sw50.q) this.v.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.sw50
    public final sw50.c j() {
        return (sw50.c) this.h.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.sw50
    public final sw50.k j0() {
        return (sw50.k) this.w.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.sw50
    public final sw50.b k() {
        return (sw50.b) this.j.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.sw50
    public final sw50.o l() {
        return (sw50.o) this.q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.sw50
    public final sw50.p m() {
        return (sw50.p) this.f.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.sw50
    public final sw50.r n() {
        return (sw50.r) this.i.getValue();
    }

    @Override // xsna.sw50
    public final void o(Context context) {
        rsr rsrVar = oz50.k;
        oz50.b.d();
        context.startActivity(new Intent(context, (Class<?>) MainActivity.class).addFlags(335577088));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.sw50
    public final sw50.a p() {
        return (sw50.a) this.m.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.sw50
    public final sw50.m q() {
        return (sw50.m) this.t.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.sw50
    public final sw50.j r() {
        return (sw50.j) this.u.getValue();
    }
}
