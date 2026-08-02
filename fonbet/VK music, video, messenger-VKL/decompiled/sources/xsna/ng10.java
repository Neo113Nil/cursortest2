package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: MaskDiscoverItemDecoration.kt */
/* loaded from: classes16.dex */
public final class ng10 extends RecyclerView.n {
    public final Drawable b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public ng10(Context context) {
        e3m.a aVar = e3m.a;
        Drawable a = m33.a(R.drawable.mask_catalog_divider, context);
        if (a == null) {
            throw new Resources.NotFoundException("mask_catalog_divider not found");
        }
        this.b = a;
        this.c = e3m.a(R.dimen.camera_masks_item_size, context);
        this.d = cn70.b(10);
        this.e = cn70.b(32);
        this.f = cn70.b(2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        if (recyclerView.getChildViewHolder(view) instanceof lr80) {
            rect.left = this.d;
        } else {
            rect.left = 0;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        int childCount = layoutManager.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = layoutManager.getChildAt(i);
            if (childAt != null && (recyclerView.getChildViewHolder(childAt) instanceof lr80)) {
                int i2 = this.c;
                int i3 = this.e;
                int left = childAt.getLeft() - this.d;
                int i4 = this.f + left;
                int bottom = childAt.getBottom() - ((i2 - i3) / 2);
                int i5 = bottom - i3;
                Drawable drawable = this.b;
                drawable.setBounds(left, i5, i4, bottom);
                drawable.draw(canvas);
            }
        }
    }
}
