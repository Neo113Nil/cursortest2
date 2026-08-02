package xsna;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: TabLinearSnapHelper.kt */
/* loaded from: classes.dex */
public final class atn0 extends androidx.recyclerview.widget.w {
    public static final int g = iah0.a(555.0f);
    public RecyclerView c;
    public a d;
    public Scroller e;
    public boolean f;

    /* compiled from: TabLinearSnapHelper.kt */
    public static final class a extends androidx.recyclerview.widget.v {
        public final float a;

        public a(Context context) {
            super(context);
            this.a = calculateSpeedPerPixel(atn0.this.c.getContext().getResources().getDisplayMetrics());
        }

        @Override // androidx.recyclerview.widget.v
        public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.v, androidx.recyclerview.widget.RecyclerView.z
        public final void onTargetFound(View view, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
            RecyclerView.o layoutManager;
            atn0 atn0Var = atn0.this;
            RecyclerView recyclerView = atn0Var.c;
            if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
                return;
            }
            int i = atn0Var.calculateDistanceToFinalSnap(layoutManager, view)[0];
            int abs = atn0Var.f ? Math.abs(((int) (i * this.a)) * 10) : calculateTimeForDeceleration(Math.max(Math.abs(i), 0));
            atn0Var.f = false;
            OvershootInterpolator overshootInterpolator = new OvershootInterpolator(0.3f);
            if (abs < 350) {
                abs = 350;
            }
            aVar.b(i, 0, overshootInterpolator, abs);
        }
    }

    @Override // androidx.recyclerview.widget.o0
    public final void attachToRecyclerView(RecyclerView recyclerView) throws IllegalStateException {
        super.attachToRecyclerView(recyclerView);
        this.c = recyclerView;
        this.e = new Scroller(this.c.getContext(), new DecelerateInterpolator());
        this.d = new a(this.c.getContext());
    }

    @Override // androidx.recyclerview.widget.o0
    public final int[] calculateScrollDistance(int i, int i2) {
        Scroller scroller = this.e;
        int i3 = g;
        scroller.fling(0, 0, i, i2, -i3, i3, -i3, i3);
        return new int[]{this.e.getFinalX(), this.e.getFinalY()};
    }

    @Override // androidx.recyclerview.widget.o0
    public final RecyclerView.z createScroller(RecyclerView.o oVar) {
        return this.d;
    }

    public final void h(int i) {
        RecyclerView.o layoutManager;
        RecyclerView.o layoutManager2;
        this.f = true;
        RecyclerView recyclerView = this.c;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount != 0) {
            int width = this.c.getWidth() / 2;
            float f = Float.MAX_VALUE;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = layoutManager.getChildAt(i2);
                if (childAt != null) {
                    float abs = Math.abs(((childAt.getX() + (childAt.getWidth() / 2)) - (i / 35.0f)) - width);
                    if (abs < f) {
                        view = childAt;
                        f = abs;
                    }
                }
            }
        }
        int position = layoutManager.getPosition(view);
        RecyclerView recyclerView2 = this.c;
        if (recyclerView2 == null || (layoutManager2 = recyclerView2.getLayoutManager()) == null) {
            return;
        }
        a aVar = this.d;
        aVar.setTargetPosition(position);
        layoutManager2.startSmoothScroll(aVar);
    }
}
