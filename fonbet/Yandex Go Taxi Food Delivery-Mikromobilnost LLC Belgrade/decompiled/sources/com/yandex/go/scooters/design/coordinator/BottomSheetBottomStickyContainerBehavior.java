package com.yandex.go.scooters.design.coordinator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import defpackage.ndh0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/scooters/design/coordinator/BottomSheetBottomStickyContainerBehavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$a;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public class BottomSheetBottomStickyContainerBehavior extends CoordinatorLayout.a {
    public ViewGroup a;

    public BottomSheetBottomStickyContainerBehavior(Context context, AttributeSet attributeSet) {
    }

    public static ViewGroup u(ViewGroup viewGroup) {
        ViewGroup u;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof NestedScrollView) {
                return (ViewGroup) childAt;
            }
            if ((childAt instanceof ViewGroup) && (u = u((ViewGroup) childAt)) != null) {
                return u;
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean b(View view, View view2) {
        return view2.getId() == ndh0.slideable_modal_view_bottom_sheet;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        View view3;
        View view4;
        View childAt;
        if (view.getVisibility() == 0) {
            ViewGroup viewGroup = view2 instanceof ViewGroup ? (ViewGroup) view2 : coordinatorLayout;
            ViewGroup viewGroup2 = this.a;
            if (viewGroup2 == null) {
                viewGroup2 = u(viewGroup);
                this.a = viewGroup2;
            }
            View view5 = viewGroup2 == null ? view2 : viewGroup2;
            ViewGroup viewGroup3 = view5 instanceof ViewGroup ? (ViewGroup) view5 : null;
            if (viewGroup3 == null || (childAt = viewGroup3.getChildAt(0)) == null) {
                view3 = view2;
                view4 = view3;
            } else {
                view3 = view2;
                view4 = childAt;
            }
            float max = Math.max(0, v(coordinatorLayout, view, view3, view5, view4));
            if (max != view.getTranslationY()) {
                view.setTranslationY(max);
                return true;
            }
        }
        return false;
    }

    public int v(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, View view4) {
        int height = coordinatorLayout.getHeight();
        int height2 = view4.getHeight();
        int top = view2.getTop();
        return (height2 < height || view3.getScrollX() != 0) ? top - (height - height2) : top;
    }
}
