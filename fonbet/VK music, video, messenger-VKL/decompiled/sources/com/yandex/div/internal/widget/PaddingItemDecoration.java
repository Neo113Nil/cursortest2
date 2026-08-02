package com.yandex.div.internal.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import xsna.zcl;

/* compiled from: PaddingItemDecoration.kt */
/* loaded from: classes7.dex */
public final class PaddingItemDecoration extends RecyclerView.n {
    private final int crossItemPadding;
    private final int midItemPadding;
    private final int orientation;
    private final int paddingBottom;
    private final int paddingLeft;
    private final int paddingRight;
    private final int paddingTop;

    public /* synthetic */ PaddingItemDecoration(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, zcl zclVar) {
        this((i8 & 1) != 0 ? 0 : i, (i8 & 2) != 0 ? 0 : i2, (i8 & 4) != 0 ? 0 : i3, (i8 & 8) != 0 ? 0 : i4, (i8 & 16) != 0 ? 0 : i5, (i8 & 32) != 0 ? 0 : i6, (i8 & 64) != 0 ? 0 : i7);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int i;
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            i = ((StaggeredGridLayoutManager) layoutManager).getSpanCount();
        } else {
            if (!(layoutManager instanceof LinearLayoutManager)) {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unsupported layoutManger: " + layoutManager);
                }
            }
            i = 1;
        }
        if (i != 1) {
            int i2 = this.midItemPadding / 2;
            int i3 = this.crossItemPadding / 2;
            int i4 = this.orientation;
            if (i4 == 0) {
                rect.set(i2, i3, i2, i3);
                return;
            }
            if (i4 == 1) {
                rect.set(i3, i2, i3, i2);
                return;
            }
            KAssert kAssert2 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unsupported orientation: " + this.orientation);
                return;
            }
            return;
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition == -1) {
                return;
            }
            boolean z = childAdapterPosition == 0;
            int i5 = itemCount - 1;
            boolean z2 = childAdapterPosition == i5;
            int i6 = this.orientation;
            if (i6 == 0) {
                if (ViewsKt.isLayoutRtl(recyclerView)) {
                    z = childAdapterPosition == i5;
                    z2 = childAdapterPosition == 0;
                }
                rect.set(z ? this.paddingLeft : 0, this.paddingTop, z2 ? this.paddingRight : this.midItemPadding, this.paddingBottom);
                return;
            }
            if (i6 == 1) {
                rect.set(this.paddingLeft, z ? this.paddingTop : 0, this.paddingRight, z2 ? this.paddingBottom : this.midItemPadding);
                return;
            }
            KAssert kAssert3 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unsupported orientation: " + this.orientation);
            }
        }
    }

    public PaddingItemDecoration(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.paddingLeft = i;
        this.midItemPadding = i2;
        this.crossItemPadding = i3;
        this.paddingRight = i4;
        this.paddingTop = i5;
        this.paddingBottom = i6;
        this.orientation = i7;
    }
}
