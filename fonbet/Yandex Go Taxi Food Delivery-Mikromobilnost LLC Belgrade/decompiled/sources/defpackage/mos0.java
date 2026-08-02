package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.function.Supplier;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;

/* loaded from: classes10.dex */
public final class mos0 extends CoordinatorLayout.a {
    public final int a;
    public final int b;
    public final int c;
    public final int w;
    public final Supplier x;

    public mos0(int i, int i2, int i3, int i4, Supplier supplier) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.w = i4;
        this.x = supplier;
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
        Supplier supplier = this.x;
        if (supplier != null) {
            top += ((Number) supplier.get()).intValue();
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        boolean z = layoutParams2 instanceof ViewGroup.MarginLayoutParams;
        int i = this.w;
        int i2 = this.c;
        int i3 = this.a;
        if (z) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams.leftMargin = -((int) (i3 * scaleX));
            marginLayoutParams.rightMargin = -((int) (i2 * scaleX));
            marginLayoutParams.topMargin = top;
            marginLayoutParams.bottomMargin = -((int) (i * scaleX));
        }
        view.layout(view2.getLeft() - ((int) (i3 * scaleX)), top, view2.getRight() + ((int) (i2 * scaleX)), view2.getBottom() + ((int) (i * scaleX)));
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
        Supplier supplier = this.x;
        if (supplier != null) {
            i4 += ((Number) supplier.get()).intValue();
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(Math.round(scaleX * (this.a + this.c)) + findViewById.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(findViewById.getMeasuredHeight() + i4, 1073741824));
        return true;
    }
}
