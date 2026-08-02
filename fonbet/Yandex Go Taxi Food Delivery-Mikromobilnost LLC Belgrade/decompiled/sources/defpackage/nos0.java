package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ybsdk.core.design.coordinator.AnchorBottomSheetBehavior;
import com.ybsdk.core.design.widget.SlideableModalView;

/* loaded from: classes2.dex */
public final class nos0 extends CoordinatorLayout.a {
    public final int a;
    public final int b;
    public final int c;
    public final uhw0 w;

    public nos0(int i, int i2, int i3, uhw0 uhw0Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.w = uhw0Var;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final void d(CoordinatorLayout.LayoutParams layoutParams) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        CoordinatorLayout.a behavior = layoutParams instanceof CoordinatorLayout.LayoutParams ? ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() : null;
        if (!(behavior instanceof BottomSheetBehavior) && !(behavior instanceof AnchorBottomSheetBehavior)) {
            return false;
        }
        float scaleX = view2.getScaleX();
        int top = view2.getTop() - ((int) (this.b * scaleX));
        uhw0 uhw0Var = this.w;
        if (uhw0Var != null) {
            top += Integer.valueOf(((SlideableModalView) ((ykn0) uhw0Var).b).getTopOffset()).intValue();
        }
        boolean z = view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams;
        int i = this.c;
        int i2 = this.a;
        if (z) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.leftMargin = -((int) (i2 * scaleX));
            marginLayoutParams.rightMargin = -((int) (i * scaleX));
            marginLayoutParams.topMargin = top;
            marginLayoutParams.bottomMargin = -((int) (0.0f * scaleX));
        }
        view.layout(view2.getLeft() - ((int) (i2 * scaleX)), top, view2.getRight() + ((int) (i * scaleX)), view2.getBottom() + ((int) (0.0f * scaleX)));
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        View findViewById = !(layoutParams instanceof CoordinatorLayout.LayoutParams) ? null : coordinatorLayout.findViewById(((CoordinatorLayout.LayoutParams) layoutParams).getAnchorId());
        if (findViewById == null) {
            return false;
        }
        float scaleX = findViewById.getScaleX();
        int i4 = (int) (this.b * scaleX);
        uhw0 uhw0Var = this.w;
        if (uhw0Var != null) {
            i4 += Integer.valueOf(((SlideableModalView) ((ykn0) uhw0Var).b).getTopOffset()).intValue();
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(Math.round(scaleX * (this.a + this.c)) + findViewById.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(findViewById.getMeasuredHeight() + i4, 1073741824));
        return true;
    }
}
