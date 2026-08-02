package xsna;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class u4e0 extends androidx.recyclerview.widget.o0 {
    public final int a;
    public final s4e0 b;
    public androidx.recyclerview.widget.d0 c;

    public u4e0(int i, s4e0 s4e0Var) {
        this.a = i;
        this.b = s4e0Var;
    }

    @Override // androidx.recyclerview.widget.o0
    @NonNull
    public final int[] calculateDistanceToFinalSnap(@NonNull RecyclerView.o oVar, @NonNull View view) {
        int[] iArr = new int[2];
        if (oVar.canScrollHorizontally()) {
            iArr[0] = d(oVar, view, e(oVar));
        }
        return iArr;
    }

    public final int d(RecyclerView.o oVar, View view, androidx.recyclerview.widget.f0 f0Var) {
        int c = ((f0Var.c(view) / 2) + f0Var.e(view)) - ((f0Var.l() / 2) + f0Var.k());
        int position = oVar.getPosition(view);
        int i = this.a;
        return position == 0 ? c - (i / 2) : oVar.getItemCount() + (-1) == oVar.getPosition(view) ? (i / 2) + c : c;
    }

    public final androidx.recyclerview.widget.f0 e(RecyclerView.o oVar) {
        androidx.recyclerview.widget.d0 d0Var = this.c;
        if (d0Var == null || d0Var.a != oVar) {
            this.c = new androidx.recyclerview.widget.d0(oVar);
        }
        return this.c;
    }

    @Override // androidx.recyclerview.widget.o0
    @Nullable
    public final View findSnapView(@NonNull RecyclerView.o oVar) {
        int childCount = oVar.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        s4e0 s4e0Var = this.b;
        if (s4e0Var.d) {
            return oVar.getChildAt(0);
        }
        if (s4e0Var.e) {
            return oVar.getChildAt(childCount - 1);
        }
        androidx.recyclerview.widget.f0 e = e(oVar);
        int l = (e.l() / 2) + ((androidx.recyclerview.widget.d0) e).a.getPaddingLeft() + 1;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = oVar.getChildAt(i2);
            int abs = Math.abs(((e.c(childAt) / 2) + e.e(childAt)) - l);
            if (abs < i) {
                view = childAt;
                i = abs;
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.o0
    public final int findTargetSnapPosition(@NonNull RecyclerView.o oVar, int i, int i2) {
        int itemCount = oVar.getItemCount();
        if (itemCount != 0) {
            androidx.recyclerview.widget.f0 e = e(oVar);
            int childCount = oVar.getChildCount();
            boolean z = false;
            View view = null;
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MIN_VALUE;
            View view2 = null;
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = oVar.getChildAt(i5);
                if (childAt != null) {
                    int d = d(oVar, childAt, e);
                    if (d <= 0 && d > i4) {
                        view2 = childAt;
                        i4 = d;
                    }
                    if (d >= 0 && d < i3) {
                        view = childAt;
                        i3 = d;
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
            if (view != null) {
                int position = oVar.getPosition(view) + (z ? 1 : -1);
                if (position >= 0 && position < itemCount) {
                    return position;
                }
            }
        }
        return -1;
    }
}
