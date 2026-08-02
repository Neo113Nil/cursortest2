package xsna;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.widget.NestedScrollView;

/* compiled from: VkRedesignSubscriptionSheetDialog.kt */
/* loaded from: classes6.dex */
public final class dfv0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ ffv0 b;

    public dfv0(ffv0 ffv0Var) {
        this.b = ffv0Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ffv0 ffv0Var = this.b;
        View view = ffv0Var.k1;
        if (view == null) {
            view = null;
        }
        NestedScrollView nestedScrollView = ffv0Var.i1;
        NestedScrollView nestedScrollView2 = nestedScrollView == null ? null : nestedScrollView;
        if (nestedScrollView == null) {
            nestedScrollView = null;
        }
        int measuredHeight = nestedScrollView2.getChildAt(nestedScrollView.getChildCount() - 1).getMeasuredHeight() - iah0.a(16);
        NestedScrollView nestedScrollView3 = ffv0Var.i1;
        if (nestedScrollView3 == null) {
            nestedScrollView3 = null;
        }
        view.setVisibility(measuredHeight > nestedScrollView3.getMeasuredHeight() ? 0 : 8);
        NestedScrollView nestedScrollView4 = ffv0Var.i1;
        (nestedScrollView4 != null ? nestedScrollView4 : null).getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
