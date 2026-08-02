package xsna;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;

/* compiled from: HeaderBehavior.java */
/* loaded from: classes13.dex */
public abstract class dwu<V extends View> extends azt0<V> {

    @Nullable
    public a d;
    public OverScroller e;
    public boolean f;
    public int g;
    public int h;
    public int i;

    @Nullable
    public VelocityTracker j;

    /* compiled from: HeaderBehavior.java */
    public class a implements Runnable {
        public final CoordinatorLayout b;
        public final V c;

        public a(CoordinatorLayout coordinatorLayout, V v) {
            this.b = coordinatorLayout;
            this.c = v;
        }

        @Override // java.lang.Runnable
        public final void run() {
            dwu dwuVar;
            OverScroller overScroller;
            V v = this.c;
            if (v == null || (overScroller = (dwuVar = dwu.this).e) == null) {
                return;
            }
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            CoordinatorLayout coordinatorLayout = this.b;
            if (!computeScrollOffset) {
                dwuVar.K(coordinatorLayout, v);
                return;
            }
            dwuVar.M(coordinatorLayout, v, dwuVar.e.getCurrY());
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            v.postOnAnimation(this);
        }
    }

    public dwu() {
        this.g = -1;
        this.i = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00da A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ca  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean C(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        boolean z;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.g);
                if (findPointerIndex != -1) {
                    int y = (int) motionEvent.getY(findPointerIndex);
                    int i = this.h - y;
                    this.h = y;
                    L(coordinatorLayout, v, E() - i, I(v), 0);
                }
            }
            if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i2 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.g = motionEvent.getPointerId(i2);
                    this.h = (int) (motionEvent.getY(i2) + 0.5f);
                }
            }
            z = false;
            velocityTracker2 = this.j;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return !this.f || z;
        }
        VelocityTracker velocityTracker3 = this.j;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
            this.j.computeCurrentVelocity(1000);
            float yVelocity = this.j.getYVelocity(this.g);
            int i3 = -J(v);
            Runnable runnable = this.d;
            if (runnable != null) {
                v.removeCallbacks(runnable);
                this.d = null;
            }
            if (this.e == null) {
                this.e = new OverScroller(v.getContext());
            }
            this.e.fling(0, D(), 0, Math.round(yVelocity), 0, 0, i3, 0);
            if (this.e.computeScrollOffset()) {
                a aVar = new a(coordinatorLayout, v);
                this.d = aVar;
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                v.postOnAnimation(aVar);
            } else {
                K(coordinatorLayout, v);
            }
            z = true;
            this.f = false;
            this.g = -1;
            velocityTracker = this.j;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.j = null;
            }
            velocityTracker2 = this.j;
            if (velocityTracker2 != null) {
            }
            if (this.f) {
            }
        }
        z = false;
        this.f = false;
        this.g = -1;
        velocityTracker = this.j;
        if (velocityTracker != null) {
        }
        velocityTracker2 = this.j;
        if (velocityTracker2 != null) {
        }
        if (this.f) {
        }
    }

    public boolean H(V v) {
        return false;
    }

    public int I(@NonNull V v) {
        return -v.getHeight();
    }

    public int J(@NonNull V v) {
        return v.getHeight();
    }

    public int L(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int b;
        int D = D();
        if (i2 == 0 || D < i2 || D > i3 || D == (b = xwk.b(i, i2, i3))) {
            return 0;
        }
        G(b);
        return D - b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void M(CoordinatorLayout coordinatorLayout, View view, int i) {
        L(coordinatorLayout, view, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean m(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.i < 0) {
            this.i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f) {
            int i = this.g;
            if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                int y = (int) motionEvent.getY(findPointerIndex);
                if (Math.abs(y - this.h) > this.i) {
                    this.h = y;
                    return true;
                }
            }
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            this.g = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            boolean z = H(v) && coordinatorLayout.O(x, y2, v);
            this.f = z;
            if (z) {
                this.h = y2;
                this.g = motionEvent.getPointerId(0);
                if (this.j == null) {
                    this.j = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public dwu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = -1;
        this.i = -1;
    }

    public void K(CoordinatorLayout coordinatorLayout, V v) {
    }
}
