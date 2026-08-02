package defpackage;

import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* loaded from: classes10.dex */
public abstract class dv31 {
    public final View a;
    public final boolean b;
    public final float c;
    public Object d;
    public Object e;
    public boolean f;
    public boolean g;
    public long h;
    public Interpolator i;
    public long j;

    public dv31(View view, Object obj) {
        this.a = view;
        boolean n = xw31.n(view.getContext());
        this.b = n;
        this.c = n ? -1.0f : 1.0f;
        this.d = obj;
        this.h = 300L;
        this.i = new LinearInterpolator();
    }

    public abstract void a(Object obj, Object obj2);

    public final void b() {
        if (this.f) {
            this.a.postInvalidateOnAnimation();
            return;
        }
        Object obj = this.e;
        if (obj != null) {
            g(obj, true, false);
        }
    }

    public final void c() {
        if (this.f) {
            long min = Math.min(AnimationUtils.currentAnimationTimeMillis() - this.j, this.h);
            f(this.i.getInterpolation(Math.min(min / Math.max(this.h, 1L), 1.0f)));
            this.f = min < this.h;
        }
    }

    public abstract void d(Object obj, Object obj2);

    public final void e() {
        g(this.d, false, true);
    }

    public abstract void f(float f);

    public final void g(Object obj, boolean z, boolean z2) {
        this.e = null;
        if (!jl40.l(this.d, obj) || z2) {
            if (z && this.f && !this.g) {
                this.e = obj;
                return;
            }
            this.f = z;
            d(this.d, obj);
            a(this.d, obj);
            this.d = obj;
            if (this.f) {
                this.j = AnimationUtils.currentAnimationTimeMillis();
            } else {
                f(1.0f);
            }
        }
    }
}
