package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SnippetVerticalSnapHelper.kt */
/* loaded from: classes3.dex */
public final class cdk0 extends androidx.recyclerview.widget.g0 {
    public androidx.recyclerview.widget.e0 a;

    @Override // androidx.recyclerview.widget.g0, androidx.recyclerview.widget.o0
    public final int[] calculateDistanceToFinalSnap(RecyclerView.o oVar, View view) {
        int[] iArr = new int[2];
        for (int i = 0; i < 2; i++) {
            iArr[i] = 0;
        }
        if (oVar.canScrollVertically()) {
            if (this.a == null) {
                this.a = new androidx.recyclerview.widget.e0(oVar);
            }
            androidx.recyclerview.widget.e0 e0Var = this.a;
            iArr[1] = e0Var.e(view) - e0Var.k();
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.g0, androidx.recyclerview.widget.o0
    public final View findSnapView(RecyclerView.o oVar) {
        View view = null;
        if (oVar.canScrollVertically()) {
            if (this.a == null) {
                this.a = new androidx.recyclerview.widget.e0(oVar);
            }
            androidx.recyclerview.widget.e0 e0Var = this.a;
            int childCount = oVar.getChildCount();
            if (childCount != 0) {
                int paddingTop = e0Var.a.getPaddingTop();
                int i = Integer.MAX_VALUE;
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = oVar.getChildAt(i2);
                    int abs = Math.abs(((e0Var.c(childAt) / 2) + e0Var.e(childAt)) - paddingTop);
                    if (abs < i) {
                        view = childAt;
                        i = abs;
                    }
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.g0, androidx.recyclerview.widget.o0
    public final int findTargetSnapPosition(RecyclerView.o oVar, int i, int i2) {
        int position;
        int itemCount = oVar.getItemCount();
        if (this.a == null) {
            this.a = new androidx.recyclerview.widget.e0(oVar);
        }
        androidx.recyclerview.widget.e0 e0Var = this.a;
        int childCount = oVar.getChildCount();
        boolean z = false;
        View view = null;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = oVar.getChildAt(i5);
            if (childAt != null) {
                int e = e0Var.e(childAt) - e0Var.k();
                if (e <= 0 && e > i4) {
                    view2 = childAt;
                    i4 = e;
                }
                if (e >= 0 && e < i3) {
                    view = childAt;
                    i3 = e;
                }
            }
        }
        if (!oVar.canScrollHorizontally() ? i2 > 0 : i > 0) {
            z = true;
        }
        if (z && view != null) {
            return oVar.getPosition(view);
        }
        if (!z && view2 != null) {
            return oVar.getPosition(view2);
        }
        if (z) {
            view = view2;
        }
        if (view != null && (position = oVar.getPosition(view) + 1) >= 0 && position < itemCount) {
            return position;
        }
        return -1;
    }
}
