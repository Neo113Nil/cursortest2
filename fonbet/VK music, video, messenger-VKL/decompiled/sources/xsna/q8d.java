package xsna;

import android.view.View;
import android.view.ViewStub;
import com.vk.dto.common.VideoFile;
import kotlin.LazyThreadSafetyMode;

/* compiled from: ClipOverlayDelegate.kt */
/* loaded from: classes4.dex */
public abstract class q8d implements a1p0 {
    public static final float p = iah0.a(4);
    public final ViewStub b;
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
    public final Object n;
    public final Object o;

    public q8d(ViewStub viewStub) {
        this.b = viewStub;
        zy zyVar = new zy(this, 22);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = msy.a(lazyThreadSafetyMode, zyVar);
        this.d = msy.a(lazyThreadSafetyMode, new s4(this, 22));
        this.e = msy.a(lazyThreadSafetyMode, new ry0(this, 17));
        this.f = msy.a(lazyThreadSafetyMode, new ji0(this, 16));
        this.g = msy.a(lazyThreadSafetyMode, new in0(this, 20));
        this.h = msy.a(lazyThreadSafetyMode, new z4(this, 23));
        this.i = msy.a(lazyThreadSafetyMode, new mh(this, 22));
        this.j = msy.a(lazyThreadSafetyMode, new yg(this, 20));
        this.k = msy.a(lazyThreadSafetyMode, new zg(this, 25));
        this.l = msy.a(lazyThreadSafetyMode, new ah(this, 20));
        this.m = msy.a(lazyThreadSafetyMode, new m4(this, 18));
        this.n = msy.a(lazyThreadSafetyMode, new pu(this, 23));
        this.o = msy.a(lazyThreadSafetyMode, new hh1(this, 13));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.a1p0
    public final void G(boolean z) {
        if (z) {
            b().setVisibility(0);
        } else if (this.c.isInitialized()) {
            f4m.j(b());
        }
    }

    public abstract void a(VideoFile videoFile);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final View b() {
        return (View) this.c.getValue();
    }
}
