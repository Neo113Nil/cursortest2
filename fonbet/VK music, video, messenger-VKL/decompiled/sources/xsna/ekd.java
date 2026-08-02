package xsna;

import android.app.Activity;
import kotlin.LazyThreadSafetyMode;

/* compiled from: ClipsBottomSheetActionsProvider.kt */
/* loaded from: classes17.dex */
public final class ekd implements w8i {
    public final Activity b;
    public final ikd c;
    public final f5z d;
    public final zp50 e;
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
    public final bpn0 q;
    public final bpn0 r;
    public final mkd s;

    public ekd(Activity activity, ikd ikdVar, f5z f5zVar, zp50 zp50Var) {
        this.b = activity;
        this.c = ikdVar;
        this.d = f5zVar;
        this.e = zp50Var;
        s5 s5Var = new s5(this, 26);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f = msy.a(lazyThreadSafetyMode, s5Var);
        this.g = msy.a(lazyThreadSafetyMode, new hd(this, 18));
        this.h = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.ui.f(this, 18));
        this.i = msy.a(lazyThreadSafetyMode, new l1(this, 25));
        this.j = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.ui.g(this, 26));
        this.k = msy.a(lazyThreadSafetyMode, new m1(this, 19));
        this.l = msy.a(lazyThreadSafetyMode, new jd(this, 22));
        this.m = msy.a(lazyThreadSafetyMode, new t5(this, 22));
        this.n = msy.a(lazyThreadSafetyMode, new com.vk.newsfeed.posting.mediapicker.photovk.base.a(this, 23));
        this.o = msy.a(lazyThreadSafetyMode, new f1(this, 16));
        this.p = msy.a(lazyThreadSafetyMode, new ng1(this, 18));
        this.q = new bpn0(new yc(this, 21));
        this.r = new bpn0(new j1(this, 24));
        this.s = new mkd();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final xne a() {
        return (xne) this.h.getValue();
    }
}
