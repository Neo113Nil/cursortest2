package defpackage;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public abstract class e9u extends ss31 {
    public VelocityTracker B;
    public lz c;
    public OverScroller w;
    public boolean x;
    public int z;
    public int y = -1;
    public int A = -1;

    public void A(CoordinatorLayout coordinatorLayout, View view) {
    }

    public int B(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        int k;
        int u = u();
        if (i2 == 0 || u < i2 || u > i3 || u == (k = sb2.k(i, i2, i3))) {
            return 0;
        }
        ts31 ts31Var = this.a;
        if (ts31Var != null) {
            ts31Var.b(k);
        } else {
            this.b = k;
        }
        return u - k;
    }

    public final void C(CoordinatorLayout coordinatorLayout, View view, int i) {
        B(coordinatorLayout, view, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.A < 0) {
            this.A = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.x) {
            int i = this.y;
            if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                int y = (int) motionEvent.getY(findPointerIndex);
                if (Math.abs(y - this.z) > this.A) {
                    this.z = y;
                    return true;
                }
            }
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            this.y = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            boolean z = x(view) && coordinatorLayout.isPointInChildBounds(view, x, y2);
            this.x = z;
            if (z) {
                this.z = y2;
                this.y = motionEvent.getPointerId(0);
                if (this.B == null) {
                    this.B = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.w;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.w.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.B;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d2  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean t(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        e9u e9uVar = this;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(e9uVar.y);
                if (findPointerIndex != -1) {
                    int y = (int) motionEvent.getY(findPointerIndex);
                    int i = e9uVar.z - y;
                    e9uVar.z = y;
                    e9uVar.B(coordinatorLayout, view, e9uVar.v() - i, e9uVar.y(view), 0);
                }
            }
            if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i2 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    e9uVar.y = motionEvent.getPointerId(i2);
                    e9uVar.z = (int) (motionEvent.getY(i2) + 0.5f);
                }
            }
            z = false;
            velocityTracker2 = e9uVar.B;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return !e9uVar.x || z;
        }
        VelocityTracker velocityTracker3 = e9uVar.B;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
            e9uVar.B.computeCurrentVelocity(1000);
            float yVelocity = e9uVar.B.getYVelocity(e9uVar.y);
            int i3 = -e9uVar.z(view);
            Runnable runnable = e9uVar.c;
            if (runnable != null) {
                view.removeCallbacks(runnable);
                e9uVar.c = null;
            }
            if (e9uVar.w == null) {
                e9uVar.w = new OverScroller(view.getContext());
            }
            e9uVar.w.fling(0, e9uVar.u(), 0, Math.round(yVelocity), 0, 0, i3, 0);
            if (e9uVar.w.computeScrollOffset()) {
                lz lzVar = new lz((Object) this, (Object) coordinatorLayout, (Object) view, false, 17);
                e9uVar = this;
                e9uVar.c = lzVar;
                view.postOnAnimation(lzVar);
            } else {
                A(coordinatorLayout, view);
            }
            z = true;
            e9uVar.x = false;
            e9uVar.y = -1;
            velocityTracker = e9uVar.B;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                e9uVar.B = null;
            }
            velocityTracker2 = e9uVar.B;
            if (velocityTracker2 != null) {
            }
            if (e9uVar.x) {
            }
        }
        z = false;
        e9uVar.x = false;
        e9uVar.y = -1;
        velocityTracker = e9uVar.B;
        if (velocityTracker != null) {
        }
        velocityTracker2 = e9uVar.B;
        if (velocityTracker2 != null) {
        }
        if (e9uVar.x) {
        }
    }

    public boolean x(View view) {
        return false;
    }

    public int y(View view) {
        return -view.getHeight();
    }

    public int z(View view) {
        return view.getHeight();
    }
}
