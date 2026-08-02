package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import kotlin.LazyThreadSafetyMode;

/* compiled from: DialogHeaderVc.kt */
/* loaded from: classes2.dex */
public final class gfm {
    public static final LinearInterpolator n = new LinearInterpolator();
    public final afm a;
    public final mem b;
    public final sdm c;
    public final uem d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;

    public gfm(afm afmVar, mem memVar, sdm sdmVar, uem uemVar, View view) {
        this.a = afmVar;
        this.b = memVar;
        this.c = sdmVar;
        this.d = uemVar;
        xqf xqfVar = new xqf(view, 13);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.e = msy.a(lazyThreadSafetyMode, xqfVar);
        this.f = msy.a(lazyThreadSafetyMode, new sje(this, 18));
        this.g = msy.a(lazyThreadSafetyMode, new cwg(this, 9));
        this.h = msy.a(lazyThreadSafetyMode, new zn2(view, 1));
        this.i = msy.a(lazyThreadSafetyMode, new z4f(this, 16));
        this.j = msy.a(lazyThreadSafetyMode, new yqf(this, 11));
        this.k = msy.a(lazyThreadSafetyMode, new zqf(this, 16));
        this.l = msy.a(lazyThreadSafetyMode, new b1j(this, 9));
        this.m = msy.a(lazyThreadSafetyMode, new bzj(this, 4));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ViewGroup a() {
        return (ViewGroup) this.e.getValue();
    }
}
