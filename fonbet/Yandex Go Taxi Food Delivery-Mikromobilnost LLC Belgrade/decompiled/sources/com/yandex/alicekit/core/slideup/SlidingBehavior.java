package com.yandex.alicekit.core.slideup;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.b;
import defpackage.b3i0;
import defpackage.lz;
import defpackage.ny61;
import defpackage.ssn;
import defpackage.unr0;
import defpackage.z83;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes11.dex */
public class SlidingBehavior extends CoordinatorLayout.a {
    public final int A;
    public OverScroller B;
    public int E;
    public float F;
    public float G;
    public View J;
    public int K;
    public VelocityTracker L;
    public lz M;
    public boolean O;
    public final int a;
    public final float b;
    public final float c;
    public boolean y;
    public int z;
    public int w = 2;
    public int x = 0;
    public final int C = 50;
    public final int D = 20;
    public final ArrayList H = new ArrayList();
    public final ssn I = new ssn();
    public final boolean N = true;

    public SlidingBehavior(Context context, AttributeSet attributeSet) {
        this.a = ViewConfiguration.get(context).getScaledTouchSlop();
        this.b = r1.getScaledMaximumFlingVelocity();
        this.c = context.getResources().getDisplayMetrics().density * 400.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b3i0.SlideUpBehavior_Layout);
        this.A = obtainStyledAttributes.getDimensionPixelSize(b3i0.SlideUpBehavior_Layout_behavior_slideAnchorPoint, 0);
        obtainStyledAttributes.recycle();
    }

    public final void A() {
        OverScroller overScroller = this.B;
        z83.h("Animation must be finished", overScroller == null || overScroller.isFinished());
        int i = this.z;
        if (i == 0) {
            w(2);
        } else if (i == this.A) {
            w(1);
        } else {
            w(0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.J != null && view.isShown() && view.isShown()) {
            if (motionEvent.getAction() == 3) {
                this.y = false;
                VelocityTracker velocityTracker = this.L;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.L = null;
                    return false;
                }
            } else {
                if (motionEvent.getAction() == 0) {
                    this.y = false;
                    VelocityTracker velocityTracker2 = this.L;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.L = null;
                    }
                }
                if (this.L == null) {
                    this.L = VelocityTracker.obtain();
                }
                this.L.addMovement(motionEvent);
                View u = u();
                int action = motionEvent.getAction();
                ssn ssnVar = this.I;
                if (action == 0) {
                    ssnVar.a = System.currentTimeMillis();
                    if (coordinatorLayout.isPointInChildBounds(u, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                        OverScroller overScroller = this.B;
                        if (overScroller != null) {
                            overScroller.forceFinished(true);
                        }
                        lz lzVar = this.M;
                        if (lzVar != null) {
                            view.removeCallbacks(lzVar);
                        }
                    } else {
                        this.y = true;
                        if (this.N) {
                            Iterator it = this.H.iterator();
                            if (it.hasNext()) {
                                throw unr0.i(it);
                            }
                        }
                    }
                    this.F = motionEvent.getY();
                    this.G = motionEvent.getX();
                    this.E = this.z;
                    if (this.F < coordinatorLayout.getHeight() + coordinatorLayout.getTop() && this.F > 0.0f) {
                        this.y = true;
                    }
                } else {
                    if (action == 1) {
                        OverScroller overScroller2 = this.B;
                        if (overScroller2 == null || overScroller2.isFinished()) {
                            y(ssnVar.b, u);
                        }
                        ssnVar.a = 0L;
                        ssnVar.b = 0.0f;
                        return false;
                    }
                    if (action == 2) {
                        float y = motionEvent.getY() - this.F;
                        if (!this.y && Math.abs(y) > this.a) {
                            float x = motionEvent.getX() - this.G;
                            if (this.w != 3 && Math.abs(y) > Math.abs(x)) {
                                w(3);
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.onLayoutChild(view, i);
        this.J = view;
        if (view.getVisibility() != 8) {
            View u = u();
            this.K = u == view ? coordinatorLayout.getPaddingTop() : 0;
            v(this.z);
            int height = u.getHeight();
            OverScroller overScroller = this.B;
            int i2 = this.A;
            if (overScroller == null || overScroller.isFinished()) {
                int i3 = this.w;
                if (i3 == 0) {
                    this.z = height;
                    v(height);
                    return true;
                }
                if (i3 == 1) {
                    this.z = i2;
                    v(i2);
                    return true;
                }
                int i4 = this.x;
                if (i4 != -1) {
                    if (i4 == 0) {
                        x(height, u);
                    } else if (i4 == 1) {
                        x(i2, u);
                    }
                    this.x = -1;
                }
            } else if (this.B.getFinalY() > i2) {
                x(height, u);
                return true;
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean k(float f, float f2, View view) {
        if (this.w != 3) {
            return false;
        }
        y(f2, u());
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final void l(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        int height = u().getHeight();
        if (this.w == 3 || this.z < height) {
            w(3);
            iArr[1] = i2;
            v(this.z + i2);
            long currentTimeMillis = System.currentTimeMillis();
            ssn ssnVar = this.I;
            if (ssnVar.a != 0) {
                ssnVar.b = (i2 * 1000.0f) / (currentTimeMillis - r3);
            }
            ssnVar.a = currentTimeMillis;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final void m(int i, int i2, View view) {
        if (i < 0) {
            this.O = true;
        }
        if (this.O || i2 >= 0) {
            return;
        }
        w(3);
        v(this.z + i2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean r(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        this.y = true;
        return i == 2 && i2 == 0 && view == view2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final void s(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        this.O = false;
        ssn ssnVar = this.I;
        ssnVar.a = 0L;
        if (this.w != 3) {
            return;
        }
        y(ssnVar.b, u());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean t(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        OverScroller overScroller;
        if (this.J != null) {
            int action = motionEvent.getAction();
            VelocityTracker velocityTracker = this.L;
            if (action != 3) {
                if (velocityTracker == null) {
                    this.L = VelocityTracker.obtain();
                }
                this.L.addMovement(motionEvent);
                View u = u();
                int action2 = motionEvent.getAction();
                if (action2 == 0) {
                    if (coordinatorLayout.isPointInChildBounds(u, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                        return true;
                    }
                    this.y = true;
                    return false;
                }
                if (action2 != 1) {
                    if (action2 == 2) {
                        if (!this.y && Math.abs(this.F - motionEvent.getY()) > this.a) {
                            w(3);
                        }
                        if (this.w == 3) {
                            v(this.E + ((int) (this.F - motionEvent.getY())));
                            return true;
                        }
                    }
                } else if (!this.y && ((overScroller = this.B) == null || overScroller.isFinished())) {
                    this.L.computeCurrentVelocity(1000, this.b);
                    y(-this.L.getYVelocity(), u());
                }
            } else if (velocityTracker != null) {
                velocityTracker.recycle();
                this.L = null;
                return false;
            }
        }
        return false;
    }

    public final View u() {
        z83.d(this.J, "setPosition can be used only after layout");
        return this.J;
    }

    public final void v(int i) {
        z83.d(this.J, "setPosition can be used only after layout");
        View u = u();
        int height = u.getHeight();
        int top = u.getTop();
        int min = Math.min(height, Math.max(0, i));
        this.z = min;
        int i2 = ((height + this.K) - min) - top;
        WeakHashMap weakHashMap = b.a;
        u.offsetTopAndBottom(i2);
        ArrayList arrayList = this.H;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        ny61.u();
    }

    public final void w(int i) {
        if (i != this.w) {
            this.w = i;
            Iterator it = this.H.iterator();
            if (it.hasNext()) {
                throw unr0.i(it);
            }
        }
    }

    public final void x(int i, View view) {
        SlidingBehavior slidingBehavior;
        z83.d(this.J, "settleAt can be used after layout");
        int i2 = i - this.z;
        if (i2 == 0) {
            OverScroller overScroller = this.B;
            if (overScroller == null || overScroller.isFinished()) {
                A();
                return;
            }
            return;
        }
        int min = Math.min((int) (((Math.abs(i2) / view.getHeight()) + 1.0f) * 150.0f), 320);
        if (this.B == null) {
            this.B = new OverScroller(view.getContext(), new AccelerateDecelerateInterpolator());
        }
        OverScroller overScroller2 = this.B;
        overScroller2.startScroll(0, this.z, 0, i2, min);
        if (!overScroller2.computeScrollOffset()) {
            A();
            return;
        }
        w(4);
        if (this.M == null) {
            slidingBehavior = this;
            slidingBehavior.M = new lz((Object) slidingBehavior, (Object) overScroller2, (Object) this.J, false, 25);
        } else {
            slidingBehavior = this;
        }
        lz lzVar = slidingBehavior.M;
        WeakHashMap weakHashMap = b.a;
        view.postOnAnimation(lzVar);
    }

    public final void y(float f, View view) {
        int height = view.getHeight();
        float f2 = this.F;
        int i = this.A;
        if (i != 0) {
            f2 = Math.abs(i - (height - f2));
        }
        boolean z = f2 / (i == 0 ? (float) height : (float) i) <= ((float) this.D) / 100.0f;
        float f3 = this.c;
        if (f > f3 && this.z > i) {
            x(height, view);
            return;
        }
        float f4 = -f3;
        if (f < f4 && this.z > i) {
            if (z) {
                x(i, view);
                return;
            } else {
                z(view);
                return;
            }
        }
        if (f > f3 && this.z < i) {
            x(i, view);
            return;
        }
        if (f >= f4 || this.z >= i) {
            z(view);
        } else if (z) {
            x(0, view);
        } else {
            z(view);
        }
    }

    public final void z(View view) {
        int height = view.getHeight();
        float f = this.C / 100.0f;
        float f2 = this.z;
        int i = this.A;
        float f3 = i;
        if (f2 > ((height - i) * f) + f3) {
            x(height, view);
        } else if (f2 > f3 * f) {
            x(i, view);
        } else {
            x(0, view);
        }
    }
}
