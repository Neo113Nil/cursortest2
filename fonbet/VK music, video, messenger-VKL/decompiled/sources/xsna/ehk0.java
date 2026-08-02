package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SpacesItemDecoration.java */
/* loaded from: classes3.dex */
public class ehk0 extends RecyclerView.n {
    public final boolean b;
    public final int c;

    public ehk0(int i, boolean z) {
        this.c = i;
        this.b = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        boolean z = true;
        if ((!recyclerView.isLayoutDirectionResolved() || recyclerView.getLayoutDirection() != 1) && recyclerView.getContext().getResources().getConfiguration().getLayoutDirection() != 1) {
            z = false;
        }
        int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
        boolean z2 = this.b;
        int i = this.c;
        if (!z2) {
            if (childLayoutPosition > 0) {
                rect.top = i;
                return;
            } else {
                rect.top = 0;
                return;
            }
        }
        if (childLayoutPosition > 0) {
            if (z) {
                rect.right = i;
                return;
            } else {
                rect.left = i;
                return;
            }
        }
        if (z) {
            rect.right = 0;
        } else {
            rect.left = 0;
        }
    }

    public ehk0(int i) {
        this.c = i;
        this.b = true;
    }
}
