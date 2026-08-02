package xsna;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.LazyThreadSafetyMode;

/* compiled from: NewsfeedItemDecorations.kt */
/* loaded from: classes4.dex */
public final class rm60 implements z0r {
    public final RecyclerView a;
    public final fo60 b;
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
    public final Object m;

    public rm60(RecyclerView recyclerView, fo60 fo60Var) {
        this.a = recyclerView;
        this.b = fo60Var;
        cvs cvsVar = new cvs(this, 26);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = msy.a(lazyThreadSafetyMode, cvsVar);
        this.d = msy.a(lazyThreadSafetyMode, new d2(24));
        this.e = msy.a(lazyThreadSafetyMode, new dgm(this, 28));
        this.f = msy.a(lazyThreadSafetyMode, new nm60(this, 0));
        this.g = msy.a(lazyThreadSafetyMode, new ufk(this, 20));
        this.h = msy.a(lazyThreadSafetyMode, new hy2(22));
        this.i = msy.a(lazyThreadSafetyMode, new om60(0));
        this.j = msy.a(lazyThreadSafetyMode, new pm60(0));
        this.k = msy.a(lazyThreadSafetyMode, new l1i(this, 19));
        this.l = msy.a(lazyThreadSafetyMode, new v100(this, 9));
        this.m = msy.a(lazyThreadSafetyMode, new d14(18));
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

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.z0r
    public final b2r c() {
        return (b2r) this.l.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.z0r
    public final RecyclerView.n d() {
        return (RecyclerView.n) this.k.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.z0r
    public final vxq e() {
        return (vxq) this.j.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.z0r
    public final l2c0 f() {
        return (l2c0) this.h.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.z0r
    public final j2c0 g() {
        return (j2c0) this.i.getValue();
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
