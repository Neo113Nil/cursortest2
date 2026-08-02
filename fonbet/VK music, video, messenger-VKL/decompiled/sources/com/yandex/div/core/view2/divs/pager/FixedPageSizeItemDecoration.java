package com.yandex.div.core.view2.divs.pager;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import xsna.an10;

/* compiled from: FixedPageSizeItemDecoration.kt */
/* loaded from: classes7.dex */
public final class FixedPageSizeItemDecoration extends RecyclerView.n {
    private final int offsetBottom;
    private final int offsetLeft;
    private final int offsetRight;
    private final int offsetTop;
    private final FixedPageSizeProvider sizeProvider;

    public FixedPageSizeItemDecoration(DivPagerPaddingsHolder divPagerPaddingsHolder, FixedPageSizeProvider fixedPageSizeProvider) {
        this.sizeProvider = fixedPageSizeProvider;
        this.offsetLeft = toOffset(divPagerPaddingsHolder.getAlignedLeft());
        this.offsetTop = toOffset(divPagerPaddingsHolder.getAlignedTop());
        this.offsetRight = toOffset(divPagerPaddingsHolder.getAlignedRight());
        this.offsetBottom = toOffset(divPagerPaddingsHolder.getAlignedBottom());
    }

    private final int toOffset(Integer num) {
        return num != null ? num.intValue() : an10.b(this.sizeProvider.getNeighbourSize());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        rect.set(this.offsetLeft, this.offsetTop, this.offsetRight, this.offsetBottom);
    }
}
