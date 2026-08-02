package androidx.recyclerview.widget;

import android.util.Log;
import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import defpackage.ny61;

/* loaded from: classes.dex */
public final class t0 {
    public int a;
    public int b;
    public int c;
    public int d;
    public Interpolator e;
    public boolean f;
    public int g;

    public final void a(RecyclerView recyclerView) {
        int i = this.d;
        if (i >= 0) {
            this.d = -1;
            recyclerView.jumpToPositionForSmoothScroller(i);
            this.f = false;
            return;
        }
        if (!this.f) {
            this.g = 0;
            return;
        }
        Interpolator interpolator = this.e;
        if (interpolator != null && this.c < 1) {
            ny61.r("If you provide an interpolator, you must set a positive duration");
            return;
        }
        int i2 = this.c;
        if (i2 < 1) {
            ny61.r("Scroll duration must be a positive number");
            return;
        }
        recyclerView.mViewFlinger.c(this.a, this.b, interpolator, i2);
        int i3 = this.g + 1;
        this.g = i3;
        if (i3 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f = false;
    }

    public final void b(int i, int i2, int i3, BaseInterpolator baseInterpolator) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.e = baseInterpolator;
        this.f = true;
    }
}
