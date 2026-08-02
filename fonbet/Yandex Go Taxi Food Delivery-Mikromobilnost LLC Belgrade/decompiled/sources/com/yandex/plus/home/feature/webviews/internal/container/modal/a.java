package com.yandex.plus.home.feature.webviews.internal.container.modal;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.h3s0;
import defpackage.jq31;
import defpackage.n030;
import defpackage.ny61;
import defpackage.w511;
import java.util.Arrays;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class a {
    public static final Interpolator w = new Interpolator() { // from class: com.yandex.plus.home.feature.webviews.internal.container.modal.ViewDragHelper$1
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    public int b;
    public final int c;
    public float[] e;
    public float[] f;
    public float[] g;
    public float[] h;
    public int[] i;
    public int[] j;
    public int[] k;
    public int l;
    public VelocityTracker m;
    public final float n;
    public final float o;
    public final int p;
    public final OverScroller q;
    public final jq31 r;
    public View s;
    public boolean t;
    public final CoordinatorLayout u;
    public int a = -1;
    public int d = -1;
    public final h3s0 v = new h3s0(7, this);

    public a(Context context, CoordinatorLayout coordinatorLayout, n030 n030Var) {
        if (n030Var == null) {
            ny61.g("Callback may not be null");
            throw null;
        }
        this.u = coordinatorLayout;
        this.r = n030Var;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.p = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.c = viewConfiguration.getScaledTouchSlop();
        this.n = viewConfiguration.getScaledMaximumFlingVelocity();
        this.o = viewConfiguration.getScaledMinimumFlingVelocity();
        this.q = new OverScroller(context, w);
    }

    public final void a() {
        this.d = -1;
        float[] fArr = this.e;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f, 0.0f);
            Arrays.fill(this.g, 0.0f);
            Arrays.fill(this.h, 0.0f);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.j, 0);
            Arrays.fill(this.k, 0);
            this.l = 0;
        }
        VelocityTracker velocityTracker = this.m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.m = null;
        }
    }

    public final void b(int i, View view) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.u;
        if (parent != coordinatorLayout) {
            w511.t("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (", coordinatorLayout, Extension.C_BRAKE);
            return;
        }
        this.s = view;
        this.d = i;
        this.r.getClass();
        k(1);
    }

    public final void c(int i) {
        float[] fArr = this.e;
        if (fArr != null) {
            int i2 = this.l;
            int i3 = 1 << i;
            if ((i2 & i3) != 0) {
                fArr[i] = 0.0f;
                this.f[i] = 0.0f;
                this.g[i] = 0.0f;
                this.h[i] = 0.0f;
                this.i[i] = 0;
                this.j[i] = 0;
                this.k[i] = 0;
                this.l = (~i3) & i2;
            }
        }
    }

    public final int d(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        float width = this.u.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / r3) - 0.5f) * 0.47123894f)) * width) + width;
        int abs = Math.abs(i2);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    public final View e(int i, int i2) {
        CoordinatorLayout coordinatorLayout = this.u;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.r.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean f(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.s.getLeft();
        int top = this.s.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        OverScroller overScroller = this.q;
        if (i5 == 0 && i6 == 0) {
            overScroller.abortAnimation();
            k(0);
            return false;
        }
        int i7 = this.a;
        if (i7 < 0) {
            int i8 = (int) this.o;
            int i9 = (int) this.n;
            int abs = Math.abs(i3);
            if (abs < i8) {
                i3 = 0;
            } else if (abs > i9) {
                i3 = i3 > 0 ? i9 : -i9;
            }
            int abs2 = Math.abs(i4);
            if (abs2 < i8) {
                i4 = 0;
            } else if (abs2 > i9) {
                i4 = i4 > 0 ? i9 : -i9;
            }
            int abs3 = Math.abs(i5);
            int abs4 = Math.abs(i6);
            int abs5 = Math.abs(i3);
            int abs6 = Math.abs(i4);
            int i10 = abs5 + abs6;
            int i11 = abs3 + abs4;
            if (i3 != 0) {
                f = abs5;
                f2 = i10;
            } else {
                f = abs3;
                f2 = i11;
            }
            float f5 = f / f2;
            if (i4 != 0) {
                f3 = abs6;
                f4 = i10;
            } else {
                f3 = abs4;
                f4 = i11;
            }
            float f6 = f3 / f4;
            this.r.getClass();
            i7 = (int) ((d(i6, i4, r6.c()) * f6) + (d(i5, i3, 0) * f5));
        }
        overScroller.startScroll(left, top, i5, i6, i7);
        k(2);
        return true;
    }

    public final boolean g(int i) {
        if ((this.l & (1 << i)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void h() {
        VelocityTracker velocityTracker = this.m;
        float f = this.n;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.m.getXVelocity(this.d);
        float abs = Math.abs(xVelocity);
        float f2 = this.o;
        if (abs < f2) {
            xVelocity = 0.0f;
        } else if (abs > f) {
            xVelocity = xVelocity > 0.0f ? f : -f;
        }
        float yVelocity = this.m.getYVelocity(this.d);
        float abs2 = Math.abs(yVelocity);
        if (abs2 < f2) {
            f = 0.0f;
        } else if (abs2 <= f) {
            f = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f = -f;
        }
        this.t = true;
        this.r.f(this.s, xVelocity, f);
        this.t = false;
        if (this.b == 1) {
            k(0);
        }
    }

    public final void i(float f, float f2, int i) {
        float[] fArr = this.e;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.g;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.h;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.i;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.j;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.k;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.e = fArr2;
            this.f = fArr3;
            this.g = fArr4;
            this.h = fArr5;
            this.i = iArr;
            this.j = iArr2;
            this.k = iArr3;
        }
        float[] fArr9 = this.e;
        this.g[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.f;
        this.h[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.i;
        int i3 = (int) f;
        int i4 = (int) f2;
        CoordinatorLayout coordinatorLayout = this.u;
        int left = coordinatorLayout.getLeft();
        int i5 = this.p;
        int i6 = i3 < left + i5 ? 1 : 0;
        if (i4 < coordinatorLayout.getTop() + i5) {
            i6 |= 4;
        }
        if (i3 > coordinatorLayout.getRight() - i5) {
            i6 |= 2;
        }
        if (i4 > coordinatorLayout.getBottom() - i5) {
            i6 |= 8;
        }
        iArr7[i] = i6;
        this.l |= 1 << i;
    }

    public final void j(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (g(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.g[pointerId] = x;
                this.h[pointerId] = y;
            }
        }
    }

    public final void k(int i) {
        this.u.removeCallbacks(this.v);
        if (this.b != i) {
            this.b = i;
            this.r.d(i);
            if (this.b == 0) {
                this.s = null;
            }
        }
    }

    public final boolean l(int i, View view) {
        if (view == this.s && this.d == i) {
            return true;
        }
        if (view == null || !this.r.g(i, view)) {
            return false;
        }
        this.d = i;
        b(i, view);
        return true;
    }
}
