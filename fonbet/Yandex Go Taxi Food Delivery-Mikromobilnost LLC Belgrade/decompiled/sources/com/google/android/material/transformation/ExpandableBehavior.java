package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.yoo;
import java.util.List;

@Deprecated
/* loaded from: classes11.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.a {
    public int a = 0;

    public ExpandableBehavior() {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public abstract boolean b(View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        yoo yooVar = (yoo) view2;
        boolean isExpanded = yooVar.isExpanded();
        int i = this.a;
        if (isExpanded) {
            if (i != 0 && i != 2) {
                return false;
            }
        } else if (i != 1) {
            return false;
        }
        this.a = yooVar.isExpanded() ? 1 : 2;
        u((View) yooVar, view, yooVar.isExpanded(), true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean i(CoordinatorLayout coordinatorLayout, final View view, int i) {
        final yoo yooVar;
        if (!view.isLaidOut()) {
            List<View> dependencies = coordinatorLayout.getDependencies(view);
            int size = dependencies.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    yooVar = null;
                    break;
                }
                View view2 = dependencies.get(i2);
                if (b(view, view2)) {
                    yooVar = (yoo) view2;
                    break;
                }
                i2++;
            }
            if (yooVar != null) {
                boolean isExpanded = yooVar.isExpanded();
                int i3 = this.a;
                if (!isExpanded ? i3 == 1 : !(i3 != 0 && i3 != 2)) {
                    final int i4 = yooVar.isExpanded() ? 1 : 2;
                    this.a = i4;
                    view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.google.android.material.transformation.ExpandableBehavior.1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // android.view.ViewTreeObserver.OnPreDrawListener
                        public boolean onPreDraw() {
                            view.getViewTreeObserver().removeOnPreDrawListener(this);
                            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                            if (expandableBehavior.a == i4) {
                                yoo yooVar2 = yooVar;
                                expandableBehavior.u((View) yooVar2, view, yooVar2.isExpanded(), false);
                            }
                            return false;
                        }
                    });
                }
            }
        }
        return false;
    }

    public abstract void u(View view, View view2, boolean z, boolean z2);

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
