package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.ny61;

/* loaded from: classes.dex */
public class w extends RecyclerView.j {
    public PointF j;
    public final DisplayMetrics k;
    public float m;
    public final LinearInterpolator h = new LinearInterpolator();
    public final DecelerateInterpolator i = new DecelerateInterpolator();
    public boolean l = false;
    public int n = 0;
    public int o = 0;

    public w(Context context) {
        this.k = context.getResources().getDisplayMetrics();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final void e(int i, int i2, t0 t0Var) {
        if (c() == 0) {
            i();
            return;
        }
        int i3 = this.n;
        int i4 = i3 - i;
        if (i3 * i4 <= 0) {
            i4 = 0;
        }
        this.n = i4;
        int i5 = this.o;
        int i6 = i5 - i2;
        int i7 = i5 * i6 > 0 ? i6 : 0;
        this.o = i7;
        if (i4 == 0 && i7 == 0) {
            PointF a = a(this.a);
            if (a != null) {
                if (a.x != 0.0f || a.y != 0.0f) {
                    float f = a.y;
                    float sqrt = (float) Math.sqrt((f * f) + (r4 * r4));
                    float f2 = a.x / sqrt;
                    a.x = f2;
                    float f3 = a.y / sqrt;
                    a.y = f3;
                    this.j = a;
                    this.n = (int) (f2 * 10000.0f);
                    this.o = (int) (f3 * 10000.0f);
                    t0Var.b((int) (this.n * 1.2f), (int) (this.o * 1.2f), (int) (o(10000) * 1.2f), this.h);
                    return;
                }
            }
            t0Var.d = this.a;
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public void f() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public void g() {
        this.o = 0;
        this.n = 0;
        this.j = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public void h(View view, RecyclerView.k kVar, t0 t0Var) {
        int k = k(p(), view);
        int l = l(q(), view);
        int n = n((int) Math.sqrt((l * l) + (k * k)));
        if (n > 0) {
            t0Var.b(-k, -l, n, this.i);
        }
    }

    public int j(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            ny61.g("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            return 0;
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    public int k(int i, View view) {
        RecyclerView.e eVar = this.c;
        if (eVar == null || !eVar.I()) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return j(eVar.j0(view) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, eVar.m0(view) + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, eVar.getPaddingLeft(), eVar.H - eVar.getPaddingRight(), i);
    }

    public int l(int i, View view) {
        RecyclerView.e eVar = this.c;
        if (eVar == null || !eVar.J()) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return j(eVar.n0(view) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, eVar.h0(view) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, eVar.getPaddingTop(), eVar.I - eVar.getPaddingBottom(), i);
    }

    public float m(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int n(int i) {
        return (int) Math.ceil(o(i) / 0.3356d);
    }

    public int o(int i) {
        float abs = Math.abs(i);
        if (!this.l) {
            this.m = m(this.k);
            this.l = true;
        }
        return (int) Math.ceil(abs * this.m);
    }

    public int p() {
        PointF pointF = this.j;
        if (pointF == null) {
            return 0;
        }
        float f = pointF.x;
        if (f == 0.0f) {
            return 0;
        }
        return f > 0.0f ? 1 : -1;
    }

    public int q() {
        PointF pointF = this.j;
        if (pointF == null) {
            return 0;
        }
        float f = pointF.y;
        if (f == 0.0f) {
            return 0;
        }
        return f > 0.0f ? 1 : -1;
    }
}
