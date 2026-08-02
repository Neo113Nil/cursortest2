package xsna;

import android.widget.ImageView;
import com.vk.writebar.WriteBar;
import com.vk.writebar.fullscreen.WriteBarButtonsBubbleView;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: WriteBarFullscreenHolder.kt */
/* loaded from: classes7.dex */
public final class c1y0 {
    public static final int n = iah0.a(10);
    public final WriteBar a;
    public final WriteBar b;
    public float c;
    public boolean d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;

    public c1y0(WriteBar writeBar, WriteBar writeBar2) {
        this.a = writeBar;
        this.b = writeBar2;
        yqd0 yqd0Var = new yqd0(this, 28);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.e = msy.a(lazyThreadSafetyMode, yqd0Var);
        this.f = msy.a(lazyThreadSafetyMode, new fem0(this, 21));
        this.g = msy.a(lazyThreadSafetyMode, new m0t0(this, 9));
        this.h = msy.a(lazyThreadSafetyMode, new x9x0(this, 2));
        this.i = msy.a(lazyThreadSafetyMode, new pvh0(this, 27));
        this.j = msy.a(lazyThreadSafetyMode, new rme0(this, 26));
        this.k = msy.a(lazyThreadSafetyMode, new sxq0(this, 7));
        this.l = msy.a(lazyThreadSafetyMode, new ajd0(this, 26));
        this.m = msy.a(lazyThreadSafetyMode, new vpn0(this, 22));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ImageView a() {
        return (ImageView) this.h.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final WriteBarButtonsBubbleView b() {
        return (WriteBarButtonsBubbleView) this.e.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void c() {
        if (this.e.isInitialized()) {
            return;
        }
        b().setBackground(dhr0.t.a(R.drawable.background_contrast_themed_16dp));
    }
}
