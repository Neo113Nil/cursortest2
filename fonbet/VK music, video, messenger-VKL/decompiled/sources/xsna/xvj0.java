package xsna;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SingleScrollDirectionEnforcer.kt */
/* loaded from: classes6.dex */
public final class xvj0 extends RecyclerView.t implements RecyclerView.s {
    public int b;
    public int c = -1;
    public int d;
    public int e;
    public int f;
    public int g;

    /* compiled from: SingleScrollDirectionEnforcer.kt */
    public static final class a {
        public static void a(RecyclerView recyclerView) {
            xvj0 xvj0Var = new xvj0();
            recyclerView.addOnItemTouchListener(xvj0Var);
            recyclerView.addOnScrollListener(xvj0Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final boolean j(RecyclerView recyclerView, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.c = motionEvent.getPointerId(0);
            this.d = (int) (motionEvent.getX() + 0.5f);
            this.e = (int) (motionEvent.getY() + 0.5f);
            return false;
        }
        if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.c);
            if (findPointerIndex >= 0 && this.b != 1) {
                int x = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                int y = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                this.f = x - this.d;
                this.g = y - this.e;
            }
        } else if (actionMasked == 5) {
            int actionIndex = motionEvent.getActionIndex();
            this.c = motionEvent.getPointerId(actionIndex);
            this.d = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.e = (int) (motionEvent.getY(actionIndex) + 0.5f);
            return false;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        RecyclerView.o layoutManager;
        boolean canScrollHorizontally;
        boolean canScrollVertically;
        int i2 = this.b;
        this.b = i;
        if (i2 != 0 || i != 1 || (layoutManager = recyclerView.getLayoutManager()) == null || (canScrollHorizontally = layoutManager.canScrollHorizontally()) == (canScrollVertically = layoutManager.canScrollVertically())) {
            return;
        }
        if ((!canScrollHorizontally || Math.abs(this.g) <= Math.abs(this.f)) && (!canScrollVertically || Math.abs(this.f) <= Math.abs(this.g))) {
            return;
        }
        recyclerView.stopScroll();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void h(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void f(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
