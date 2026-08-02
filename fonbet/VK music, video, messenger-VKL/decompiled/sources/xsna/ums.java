package xsna;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: FriendsCleanupDividerItemDecoration.kt */
/* loaded from: classes15.dex */
public final class ums extends RecyclerView.n implements too0 {
    public final wpg b;
    public final int c;
    public final int d;
    public Drawable e = dhr0.t.a(R.drawable.friends_list_divider);

    public ums(wpg wpgVar, int i, int i2) {
        this.b = wpgVar;
        this.c = i;
        this.d = i2;
    }

    @Override // xsna.too0
    public final void Ng() {
        this.e = dhr0.t.a(R.drawable.friends_list_divider);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == 0) {
            return;
        }
        if (((Boolean) this.b.invoke(Integer.valueOf(childAdapterPosition - 1))).booleanValue()) {
            rect.top += this.d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        super.onDrawOver(canvas, recyclerView, a0Var);
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        int childCount = layoutManager.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = layoutManager.getChildAt(i);
            if (childAt != null) {
                if (((Boolean) this.b.invoke(Integer.valueOf(layoutManager.getPosition(childAt)))).booleanValue()) {
                    Drawable drawable = this.e;
                    if (drawable != null) {
                        int left = childAt.getLeft();
                        int i2 = this.c;
                        drawable.setBounds(left + i2, childAt.getBottom(), childAt.getRight() - i2, childAt.getBottom() + this.d);
                    }
                    Drawable drawable2 = this.e;
                    if (drawable2 != null) {
                        drawable2.draw(canvas);
                    }
                }
            }
        }
    }
}
