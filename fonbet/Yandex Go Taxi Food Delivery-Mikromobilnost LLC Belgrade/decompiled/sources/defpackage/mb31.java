package defpackage;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class mb31 extends RecyclerView.d {
    public static final lb31 w = new lb31();
    public int a;
    public float b;
    public nb31 c = w;

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void d(Canvas canvas, RecyclerView recyclerView, RecyclerView.k kVar) {
        int i = this.a + 1;
        int childCount = recyclerView.getChildCount();
        View view = null;
        View view2 = null;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
            qb31 qb31Var = (qb31) recyclerView.getChildViewHolder(childAt);
            int i3 = qb31Var.S;
            int i4 = qb31Var.R;
            RobotoTextView robotoTextView = qb31Var.O;
            if (childAdapterPosition == this.a) {
                float f = 1.0f - this.b;
                if (qb31Var.Q != f) {
                    qb31Var.Q = f;
                    robotoTextView.setTextColor(((Integer) qb31.U.evaluate(f, Integer.valueOf(i4), Integer.valueOf(i3))).intValue());
                }
                view = childAt;
            } else if (childAdapterPosition == i) {
                float f2 = this.b;
                if (qb31Var.Q != f2) {
                    qb31Var.Q = f2;
                    robotoTextView.setTextColor(((Integer) qb31.U.evaluate(f2, Integer.valueOf(i4), Integer.valueOf(i3))).intValue());
                }
                view2 = childAt;
            } else if (qb31Var.Q != 0.0f) {
                qb31Var.Q = 0.0f;
                robotoTextView.setTextColor(((Integer) qb31.U.evaluate(0.0f, Integer.valueOf(i4), Integer.valueOf(i3))).intValue());
            }
        }
        if (view != null) {
            if (view2 == null) {
                View view3 = view;
                this.c.a(canvas, view3.getLeft(), view3.getTop(), view3.getRight(), view3.getBottom());
                return;
            }
            int left = view.getLeft();
            int right = view.getRight();
            int left2 = view2.getLeft();
            int right2 = view2.getRight();
            int i5 = right - left;
            int i6 = right2 - left2;
            boolean n = xw31.n(recyclerView.getContext());
            float f3 = this.b;
            if (i6 >= i5) {
                int abs = Math.abs(left2 - left);
                int i7 = i6 - i5;
                float f4 = (abs + i7) * f3;
                if (i7 != 0) {
                    i6 = (int) uh6.H(i5, i6, Math.min(f4 / i7, 1.0f));
                }
                nb31 nb31Var = this.c;
                if (n) {
                    int H = (int) uh6.H(right2, right, 1.0f - (Math.max(f4 - i7, 0.0f) / abs));
                    nb31Var.a(canvas, H - i6, view.getTop(), H, view.getBottom());
                    return;
                } else {
                    int H2 = (int) uh6.H(left, left2, Math.max(f4 - i7, 0.0f) / abs);
                    nb31Var.a(canvas, H2, view.getTop(), H2 + i6, view.getBottom());
                    return;
                }
            }
            int abs2 = Math.abs(right2 - right);
            int i8 = i5 - i6;
            float f5 = abs2 + i8;
            float f6 = f3 * f5;
            int H3 = (int) uh6.H(i6, i5, Math.min((f5 - f6) / i8, 1.0f));
            nb31 nb31Var2 = this.c;
            if (n) {
                float f7 = abs2;
                int H4 = (int) uh6.H(left2, left, 1.0f - (Math.min(f6, f7) / f7));
                View view4 = view;
                nb31Var2.a(canvas, H4, view4.getTop(), H4 + H3, view4.getBottom());
                return;
            }
            View view5 = view;
            float f8 = abs2;
            int H5 = (int) uh6.H(right, right2, Math.min(f6, f8) / f8);
            nb31Var2.a(canvas, H5 - H3, view5.getTop(), H5, view5.getBottom());
        }
    }
}
