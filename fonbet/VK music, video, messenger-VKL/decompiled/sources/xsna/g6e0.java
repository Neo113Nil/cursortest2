package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PromosLinearSnapHelper.kt */
/* loaded from: classes6.dex */
public final class g6e0 extends androidx.recyclerview.widget.w {
    public androidx.recyclerview.widget.d0 c;

    @Override // androidx.recyclerview.widget.w, androidx.recyclerview.widget.o0
    public final int[] calculateDistanceToFinalSnap(RecyclerView.o oVar, View view) {
        int[] iArr = new int[2];
        if (oVar.canScrollHorizontally()) {
            if (this.c == null) {
                this.c = new androidx.recyclerview.widget.d0(oVar);
            }
            androidx.recyclerview.widget.d0 d0Var = this.c;
            iArr[0] = d0Var.e(view) - d0Var.a.getPaddingLeft();
        }
        return iArr;
    }
}
