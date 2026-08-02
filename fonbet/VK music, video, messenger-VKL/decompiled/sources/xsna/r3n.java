package xsna;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.LazyThreadSafetyMode;

/* compiled from: DiscoverMediaItemDecorations.kt */
/* loaded from: classes4.dex */
public final class r3n implements z0r {
    public final RecyclerView a;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;

    public r3n(RecyclerView recyclerView, int i) {
        this.a = recyclerView;
        this.b = i;
        r5i r5iVar = new r5i(this, 7);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = msy.a(lazyThreadSafetyMode, r5iVar);
        this.d = msy.a(lazyThreadSafetyMode, new cj4(15));
        this.e = msy.a(lazyThreadSafetyMode, new x5i(this, 9));
        this.f = msy.a(lazyThreadSafetyMode, new xqf(this, 15));
        this.g = msy.a(lazyThreadSafetyMode, new sje(this, 20));
        this.h = msy.a(lazyThreadSafetyMode, new cwg(this, 11));
        this.i = msy.a(lazyThreadSafetyMode, new sv0(14));
        this.j = msy.a(lazyThreadSafetyMode, new uv0(11));
        this.k = msy.a(lazyThreadSafetyMode, new vv0(16));
        this.l = msy.a(lazyThreadSafetyMode, new zqf(this, 17));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.z0r
    public final g7o a() {
        return (g7o) this.e.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.z0r
    public final czm b() {
        return (czm) this.d.getValue();
    }

    @Override // xsna.z0r
    public final b2r c() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.z0r
    public final RecyclerView.n d() {
        return (RecyclerView.n) this.l.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.z0r
    public final vxq e() {
        return (vxq) this.k.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.z0r
    public final l2c0 f() {
        return (l2c0) this.i.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.z0r
    public final j2c0 g() {
        return (j2c0) this.j.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.z0r
    public final ren h() {
        return (ren) this.g.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.z0r
    public final oog0 i() {
        return (oog0) this.f.getValue();
    }
}
