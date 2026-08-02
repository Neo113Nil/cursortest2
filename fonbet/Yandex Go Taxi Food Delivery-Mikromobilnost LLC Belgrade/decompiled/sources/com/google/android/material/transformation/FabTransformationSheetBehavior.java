package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.ab30;
import defpackage.nmg0;
import defpackage.u1n;
import defpackage.vuz;
import java.util.HashMap;

@Deprecated
/* loaded from: classes11.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {
    public HashMap B;

    public FabTransformationSheetBehavior() {
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    public final u1n B(Context context, boolean z) {
        int i = z ? nmg0.mtrl_fab_transformation_sheet_expand_spec : nmg0.mtrl_fab_transformation_sheet_collapse_spec;
        u1n u1nVar = new u1n(15);
        u1nVar.b = ab30.b(i, context);
        u1nVar.c = new vuz();
        return u1nVar;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    public final void u(View view, View view2, boolean z, boolean z2) {
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                this.B = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                boolean z3 = (childAt.getLayoutParams() instanceof CoordinatorLayout.LayoutParams) && (((CoordinatorLayout.LayoutParams) childAt.getLayoutParams()).getBehavior() instanceof FabTransformationScrimBehavior);
                if (childAt != view2 && !z3) {
                    HashMap hashMap = this.B;
                    if (z) {
                        hashMap.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        childAt.setImportantForAccessibility(4);
                    } else if (hashMap != null && hashMap.containsKey(childAt)) {
                        childAt.setImportantForAccessibility(((Integer) this.B.get(childAt)).intValue());
                    }
                }
            }
            if (!z) {
                this.B = null;
            }
        }
        super.u(view, view2, z, z2);
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
