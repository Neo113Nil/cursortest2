package xsna;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ScaleOnTapVH.kt */
/* loaded from: classes6.dex */
public final class x4h0 implements RecyclerView.s {
    public final /* synthetic */ y4h0 b;

    public x4h0(y4h0 y4h0Var) {
        this.b = y4h0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final boolean j(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (recyclerView.getScrollState() == 1) {
            y4h0 y4h0Var = this.b;
            View view = y4h0Var.itemView;
            view.setAlpha(0.75f);
            view.setScaleX(0.75f);
            view.setScaleY(0.75f);
            ValueAnimator duration = ValueAnimator.ofFloat(0.75f, 1.0f).setDuration(100L);
            duration.addUpdateListener(new o8h(view, 4));
            duration.start();
            y4h0Var.l.c(false);
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void h(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void f(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
