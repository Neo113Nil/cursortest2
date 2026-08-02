package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes.dex */
public final class v {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public List k;
    public boolean l;

    public final void a(View view) {
        int viewLayoutPosition;
        int size = this.k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((x0) this.k.get(i2)).a;
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view3.getLayoutParams();
            if (view3 != view && !layoutParams.isItemRemoved() && (viewLayoutPosition = (layoutParams.getViewLayoutPosition() - this.d) * this.e) >= 0 && viewLayoutPosition < i) {
                view2 = view3;
                if (viewLayoutPosition == 0) {
                    break;
                } else {
                    i = viewLayoutPosition;
                }
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((RecyclerView.LayoutParams) view2.getLayoutParams()).getViewLayoutPosition();
        }
    }

    public final View b(r0 r0Var) {
        List list = this.k;
        if (list == null) {
            View e = r0Var.e(this.d);
            this.d += this.e;
            return e;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = ((x0) this.k.get(i)).a;
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            if (!layoutParams.isItemRemoved() && this.d == layoutParams.getViewLayoutPosition()) {
                a(view);
                return view;
            }
        }
        return null;
    }
}
