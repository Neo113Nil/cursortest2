package androidx.customview.widget;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.b;
import defpackage.kq31;
import defpackage.mbs;
import defpackage.ny61;
import defpackage.w511;
import java.util.Arrays;
import java.util.WeakHashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class a {
    public static final Interpolator y = new Interpolator() { // from class: androidx.customview.widget.ViewDragHelper$1
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    public int a;
    public int b;
    public float[] d;
    public float[] e;
    public float[] f;
    public float[] g;
    public int[] h;
    public int[] i;
    public int[] j;
    public int k;
    public VelocityTracker l;
    public final float m;
    public float n;
    public int o;
    public final int p;
    public int q;
    public final OverScroller r;
    public final kq31 s;
    public View t;
    public boolean u;
    public final ViewGroup v;
    public Interpolator w;
    public int c = -1;
    public final mbs x = new mbs(10, this);

    public a(Context context, ViewGroup viewGroup, kq31 kq31Var) {
        if (kq31Var == null) {
            ny61.t("Callback may not be null");
            throw null;
        }
        this.v = viewGroup;
        this.s = kq31Var;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.p = i;
        this.o = i;
        this.b = viewConfiguration.getScaledTouchSlop();
        this.m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.w = y;
        this.r = new OverScroller(context, new Interpolator() { // from class: androidx.customview.widget.ViewDragHelper$3
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                return a.this.w.getInterpolation(f);
            }
        });
    }

    public static boolean k(int i, int i2, View view) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    public final void a() {
        b();
        if (this.a == 2) {
            OverScroller overScroller = this.r;
            overScroller.getCurrX();
            overScroller.getCurrY();
            overScroller.abortAnimation();
            this.s.i(this.t, overScroller.getCurrX(), overScroller.getCurrY());
        }
        this.w = y;
        q(0);
    }

    public final void b() {
        this.c = -1;
        float[] fArr = this.d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.e, 0.0f);
            Arrays.fill(this.f, 0.0f);
            Arrays.fill(this.g, 0.0f);
            Arrays.fill(this.h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.j, 0);
            this.k = 0;
        }
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.l = null;
        }
    }

    public final void c(int i, View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.v;
        if (parent != viewGroup) {
            w511.t("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (", viewGroup, Extension.C_BRAKE);
            return;
        }
        this.t = view;
        this.c = i;
        this.s.g(i, view);
        q(1);
    }

    public final boolean d(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.h[i] & i2) != i2 || (this.q & i2) == 0 || (this.j[i] & i2) == i2 || (this.i[i] & i2) == i2) {
            return false;
        }
        float f3 = this.b;
        if (abs <= f3 && abs2 <= f3) {
            return false;
        }
        if (abs < abs2 * 0.5f) {
            this.s.getClass();
        }
        return (this.i[i] & i2) == 0 && abs > ((float) this.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(float f, float f2, View view) {
        if (view != null) {
            kq31 kq31Var = this.s;
            boolean z = kq31Var.c(view) > 0;
            boolean z2 = kq31Var.d() > 0;
            if (z && z2) {
                float f3 = (f2 * f2) + (f * f);
                int i = this.b;
                if (f3 > i * i) {
                }
            } else if (!z ? !(!z2 || Math.abs(f2) <= this.b) : Math.abs(f) > this.b) {
                return true;
            }
        }
        return false;
    }

    public final void f(int i) {
        float[] fArr = this.d;
        if (fArr != null) {
            int i2 = this.k;
            int i3 = 1 << i;
            if ((i2 & i3) != 0) {
                fArr[i] = 0.0f;
                this.e[i] = 0.0f;
                this.f[i] = 0.0f;
                this.g[i] = 0.0f;
                this.h[i] = 0;
                this.i[i] = 0;
                this.j[i] = 0;
                this.k = (~i3) & i2;
            }
        }
    }

    public final int g(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        float width = this.v.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / r3) - 0.5f) * 0.47123894f)) * width) + width;
        int abs = Math.abs(i2);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    public final boolean h() {
        if (this.a == 2) {
            OverScroller overScroller = this.r;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.t.getLeft();
            int top = currY - this.t.getTop();
            if (left != 0) {
                View view = this.t;
                WeakHashMap weakHashMap = b.a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.t;
                WeakHashMap weakHashMap2 = b.a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.s.i(this.t, currX, currY);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.v.post(this.x);
            }
        }
        return this.a == 2;
    }

    public final View i(int i, int i2) {
        ViewGroup viewGroup = this.v;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.s.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean j(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.t.getLeft();
        int top = this.t.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        OverScroller overScroller = this.r;
        if (i5 == 0 && i6 == 0) {
            overScroller.abortAnimation();
            q(0);
            return false;
        }
        View view = this.t;
        int i7 = (int) this.n;
        int i8 = (int) this.m;
        int abs = Math.abs(i3);
        if (abs < i7) {
            i3 = 0;
        } else if (abs > i8) {
            i3 = i3 > 0 ? i8 : -i8;
        }
        int i9 = (int) this.n;
        int abs2 = Math.abs(i4);
        if (abs2 < i9) {
            i4 = 0;
        } else if (abs2 > i8) {
            i4 = i4 > 0 ? i8 : -i8;
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
        kq31 kq31Var = this.s;
        this.w = y;
        overScroller.startScroll(left, top, i5, i6, (int) ((g(i6, i4, kq31Var.d()) * f6) + (g(i5, i3, kq31Var.c(view)) * f5)));
        q(2);
        return true;
    }

    public final void l(MotionEvent motionEvent) {
        int findPointerIndex;
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            b();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        kq31 kq31Var = this.s;
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y2 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View i3 = i((int) x, (int) y2);
            o(x, y2, pointerId);
            u(pointerId, i3);
            if ((this.q & this.h[pointerId]) != 0) {
                kq31Var.f(pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.a == 1) {
                m();
            }
            b();
            return;
        }
        if (actionMasked == 2) {
            if (this.a == 1) {
                int i4 = this.c;
                if ((this.k & (1 << i4)) == 0 || (findPointerIndex = motionEvent.findPointerIndex(i4)) == -1) {
                    return;
                }
                float x2 = motionEvent.getX(findPointerIndex);
                float y3 = motionEvent.getY(findPointerIndex);
                float[] fArr = this.f;
                int i5 = this.c;
                int i6 = (int) (x2 - fArr[i5]);
                int i7 = (int) (y3 - this.g[i5]);
                int left = this.t.getLeft() + i6;
                int top = this.t.getTop() + i7;
                int left2 = this.t.getLeft();
                int top2 = this.t.getTop();
                if (i6 != 0) {
                    left = kq31Var.a(this.t, left);
                    WeakHashMap weakHashMap = b.a;
                    this.t.offsetLeftAndRight(left - left2);
                }
                if (i7 != 0) {
                    top = kq31Var.b(this.t, top, i7);
                    WeakHashMap weakHashMap2 = b.a;
                    this.t.offsetTopAndBottom(top - top2);
                }
                if (i6 != 0 || i7 != 0) {
                    kq31Var.i(this.t, left, top);
                }
            } else {
                int pointerCount = motionEvent.getPointerCount();
                while (i2 < pointerCount) {
                    int pointerId2 = motionEvent.getPointerId(i2);
                    if ((this.k & (1 << pointerId2)) != 0) {
                        float x3 = motionEvent.getX(i2);
                        float y4 = motionEvent.getY(i2);
                        float f = x3 - this.d[pointerId2];
                        float f2 = y4 - this.e[pointerId2];
                        n(f, f2, pointerId2);
                        if (this.a != 1) {
                            View i8 = i((int) x3, (int) y4);
                            if (e(f, f2, i8) && u(pointerId2, i8)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i2++;
                }
            }
            p(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.a == 1) {
                this.u = true;
                kq31Var.j(this.t, 0.0f, 0.0f);
                this.u = false;
                if (this.a == 1) {
                    q(0);
                }
            }
            b();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x4 = motionEvent.getX(actionIndex);
            float y5 = motionEvent.getY(actionIndex);
            o(x4, y5, pointerId3);
            if (this.a != 0) {
                if (k((int) x4, (int) y5, this.t)) {
                    u(pointerId3, this.t);
                    return;
                }
                return;
            } else {
                u(pointerId3, i((int) x4, (int) y5));
                if ((this.q & this.h[pointerId3]) != 0) {
                    kq31Var.f(pointerId3);
                    return;
                }
                return;
            }
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.a == 1 && pointerId4 == this.c) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i2 >= pointerCount2) {
                    i = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i2);
                if (pointerId5 != this.c) {
                    View i9 = i((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                    View view = this.t;
                    if (i9 == view && u(pointerId5, view)) {
                        i = this.c;
                        break;
                    }
                }
                i2++;
            }
            if (i == -1) {
                m();
            }
        }
        f(pointerId4);
    }

    public final void m() {
        VelocityTracker velocityTracker = this.l;
        float f = this.m;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.l.getXVelocity(this.c);
        float f2 = this.n;
        float abs = Math.abs(xVelocity);
        if (abs < f2) {
            xVelocity = 0.0f;
        } else if (abs > f) {
            xVelocity = xVelocity > 0.0f ? f : -f;
        }
        float yVelocity = this.l.getYVelocity(this.c);
        float f3 = this.n;
        float abs2 = Math.abs(yVelocity);
        if (abs2 < f3) {
            f = 0.0f;
        } else if (abs2 <= f) {
            f = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f = -f;
        }
        this.u = true;
        this.s.j(this.t, xVelocity, f);
        this.u = false;
        if (this.a == 1) {
            q(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v1, types: [kq31] */
    public final void n(float f, float f2, int i) {
        boolean d = d(f, f2, i, 1);
        boolean z = d;
        if (d(f2, f, i, 4)) {
            z = (d ? 1 : 0) | 4;
        }
        boolean z2 = z;
        if (d(f, f2, i, 2)) {
            z2 = (z ? 1 : 0) | 2;
        }
        ?? r0 = z2;
        if (d(f2, f, i, 8)) {
            r0 = (z2 ? 1 : 0) | 8;
        }
        if (r0 != 0) {
            int[] iArr = this.i;
            iArr[i] = iArr[i] | r0;
            this.s.e(r0, i);
        }
    }

    public final void o(float f, float f2, int i) {
        float[] fArr = this.d;
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
                float[] fArr6 = this.e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.d = fArr2;
            this.e = fArr3;
            this.f = fArr4;
            this.g = fArr5;
            this.h = iArr;
            this.i = iArr2;
            this.j = iArr3;
        }
        float[] fArr9 = this.d;
        this.f[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.e;
        this.g[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.h;
        int i3 = (int) f;
        int i4 = (int) f2;
        ViewGroup viewGroup = this.v;
        int i5 = i3 < viewGroup.getLeft() + this.o ? 1 : 0;
        if (i4 < viewGroup.getTop() + this.o) {
            i5 |= 4;
        }
        if (i3 > viewGroup.getRight() - this.o) {
            i5 |= 2;
        }
        if (i4 > viewGroup.getBottom() - this.o) {
            i5 |= 8;
        }
        iArr7[i] = i5;
        this.k |= 1 << i;
    }

    public final void p(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if ((this.k & (1 << pointerId)) != 0) {
                float x = motionEvent.getX(i);
                float y2 = motionEvent.getY(i);
                this.f[pointerId] = x;
                this.g[pointerId] = y2;
            }
        }
    }

    public final void q(int i) {
        this.v.removeCallbacks(this.x);
        if (this.a != i) {
            this.a = i;
            this.s.h(i);
            if (this.a == 0) {
                this.t = null;
            }
        }
    }

    public final boolean r(int i, int i2) {
        if (this.u) {
            return j(i, i2, (int) this.l.getXVelocity(this.c), (int) this.l.getYVelocity(this.c));
        }
        ny61.r("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cd, code lost:
    
        if (r13 != r12) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s(MotionEvent motionEvent) {
        View i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            b();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        kq31 kq31Var = this.s;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            float x = motionEvent.getX(actionIndex);
                            float y2 = motionEvent.getY(actionIndex);
                            o(x, y2, pointerId);
                            int i2 = this.a;
                            if (i2 == 0) {
                                if ((this.h[pointerId] & this.q) != 0) {
                                    kq31Var.f(pointerId);
                                }
                            } else if (i2 == 2 && (i = i((int) x, (int) y2)) == this.t) {
                                u(pointerId, i);
                            }
                        } else if (actionMasked == 6) {
                            f(motionEvent.getPointerId(actionIndex));
                        }
                    }
                } else if (this.d != null && this.e != null) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i3 = 0; i3 < pointerCount; i3++) {
                        int pointerId2 = motionEvent.getPointerId(i3);
                        if ((this.k & (1 << pointerId2)) != 0) {
                            float x2 = motionEvent.getX(i3);
                            float y3 = motionEvent.getY(i3);
                            float f = x2 - this.d[pointerId2];
                            float f2 = y3 - this.e[pointerId2];
                            View i4 = i((int) x2, (int) y3);
                            boolean e = e(f, f2, i4);
                            if (e) {
                                int left = i4.getLeft();
                                int a = kq31Var.a(i4, ((int) f) + left);
                                int top = i4.getTop();
                                int i5 = (int) f2;
                                int b = kq31Var.b(i4, top + i5, i5);
                                int c = kq31Var.c(i4);
                                int d = kq31Var.d();
                                if (c != 0) {
                                    if (c > 0) {
                                    }
                                }
                                if (d == 0) {
                                    break;
                                }
                                if (d > 0 && b == top) {
                                    break;
                                }
                            }
                            n(f, f2, pointerId2);
                            if (this.a == 1) {
                                break;
                            }
                            if (e && u(pointerId2, i4)) {
                                break;
                            }
                        }
                    }
                    p(motionEvent);
                }
            }
            b();
        } else {
            float x3 = motionEvent.getX();
            float y4 = motionEvent.getY();
            int pointerId3 = motionEvent.getPointerId(0);
            o(x3, y4, pointerId3);
            View i6 = i((int) x3, (int) y4);
            if (i6 == this.t && this.a == 2) {
                u(pointerId3, i6);
            }
            if ((this.h[pointerId3] & this.q) != 0) {
                kq31Var.f(pointerId3);
            }
        }
        return this.a == 1;
    }

    public final boolean t(int i, int i2, View view) {
        this.t = view;
        this.c = -1;
        boolean j = j(i, i2, 0, 0);
        if (!j && this.a == 0 && this.t != null) {
            this.t = null;
        }
        return j;
    }

    public final boolean u(int i, View view) {
        if (view == this.t && this.c == i) {
            return true;
        }
        if (view == null || !this.s.k(i, view)) {
            return false;
        }
        this.c = i;
        c(i, view);
        return true;
    }
}
