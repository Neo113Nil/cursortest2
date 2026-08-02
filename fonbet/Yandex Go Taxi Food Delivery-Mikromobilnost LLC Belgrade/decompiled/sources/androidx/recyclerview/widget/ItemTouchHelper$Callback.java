package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.d3x;
import defpackage.qwg0;
import defpackage.rcl0;
import defpackage.y9b1;

/* loaded from: classes.dex */
public abstract class ItemTouchHelper$Callback {
    public static final Interpolator b = new Interpolator() { // from class: androidx.recyclerview.widget.ItemTouchHelper$Callback.1
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return f * f * f * f * f;
        }
    };
    public static final Interpolator c = new Interpolator() { // from class: androidx.recyclerview.widget.ItemTouchHelper$Callback.2
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    public int a = -1;

    public static int d(int i, int i2) {
        int i3;
        int i4 = i & 789516;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 << 2;
        } else {
            int i6 = i4 << 1;
            i5 |= (-789517) & i6;
            i3 = (i6 & 789516) << 2;
        }
        return i5 | i3;
    }

    public static int k(int i, int i2) {
        int i3 = i2 | i;
        return (i << 16) | (i2 << 8) | i3;
    }

    public boolean a(x0 x0Var) {
        return true;
    }

    public void b(RecyclerView recyclerView, x0 x0Var) {
        y9b1.a(x0Var.a);
    }

    public int c(int i, int i2) {
        int i3;
        int i4 = i & 3158064;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 >> 2;
        } else {
            int i6 = i4 >> 1;
            i5 |= (-3158065) & i6;
            i3 = (3158064 & i6) >> 2;
        }
        return i3 | i5;
    }

    public abstract int e(x0 x0Var);

    public float f(float f) {
        return f;
    }

    public float g(float f) {
        return f;
    }

    public int h(RecyclerView recyclerView, int i, int i2, int i3, long j) {
        if (this.a == -1) {
            this.a = recyclerView.getResources().getDimensionPixelSize(qwg0.item_touch_helper_max_drag_scroll_per_frame);
        }
        int interpolation = (int) (b.getInterpolation(j <= 2000 ? j / 2000.0f : 1.0f) * ((int) (c.getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)) * ((int) Math.signum(i2)) * this.a)));
        return interpolation == 0 ? i2 > 0 ? 1 : -1 : interpolation;
    }

    public boolean i() {
        return !(this instanceof rcl0);
    }

    public boolean j() {
        return !(this instanceof rcl0);
    }

    public void l(Canvas canvas, RecyclerView recyclerView, x0 x0Var, float f, float f2, int i, boolean z) {
        y9b1.d(recyclerView, x0Var.a, f, f2, z);
    }

    public abstract boolean m(RecyclerView recyclerView, x0 x0Var, x0 x0Var2);

    /* JADX WARN: Multi-variable type inference failed */
    public void n(RecyclerView recyclerView, x0 x0Var, int i, x0 x0Var2, int i2) {
        View view = x0Var2.a;
        RecyclerView.e layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof d3x)) {
            if (layoutManager.I()) {
                if (layoutManager.j0(view) <= recyclerView.getPaddingLeft()) {
                    recyclerView.scrollToPosition(i2);
                }
                if (layoutManager.m0(view) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.scrollToPosition(i2);
                }
            }
            if (layoutManager.J()) {
                if (layoutManager.n0(view) <= recyclerView.getPaddingTop()) {
                    recyclerView.scrollToPosition(i2);
                }
                if (layoutManager.h0(view) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.scrollToPosition(i2);
                    return;
                }
                return;
            }
            return;
        }
        View view2 = x0Var.a;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ((d3x) layoutManager);
        linearLayoutManager.H("Cannot drop a view during a scroll or layout calculation");
        linearLayoutManager.F1();
        linearLayoutManager.Z1();
        int r0 = RecyclerView.e.r0(view2);
        int r02 = RecyclerView.e.r0(view);
        char c2 = r0 < r02 ? (char) 1 : (char) 65535;
        boolean z = linearLayoutManager.O;
        d0 d0Var = linearLayoutManager.L;
        if (z) {
            if (c2 == 1) {
                linearLayoutManager.r(r02, d0Var.g() - (linearLayoutManager.L.c(view2) + linearLayoutManager.L.e(view)));
                return;
            } else {
                linearLayoutManager.r(r02, d0Var.g() - linearLayoutManager.L.b(view));
                return;
            }
        }
        if (c2 == 65535) {
            linearLayoutManager.r(r02, d0Var.e(view));
        } else {
            linearLayoutManager.r(r02, d0Var.b(view) - linearLayoutManager.L.c(view2));
        }
    }

    public void o(x0 x0Var, int i) {
    }

    public abstract void p(x0 x0Var, int i);
}
