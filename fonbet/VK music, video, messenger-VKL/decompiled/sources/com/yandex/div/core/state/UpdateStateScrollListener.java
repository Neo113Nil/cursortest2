package com.yandex.div.core.state;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper;

/* compiled from: UpdateStateScrollListener.kt */
/* loaded from: classes7.dex */
public final class UpdateStateScrollListener extends RecyclerView.t {
    private final String blockId;
    private final DivViewState divViewState;
    private final DivGalleryItemHelper layoutManager;

    public UpdateStateScrollListener(String str, DivViewState divViewState, DivGalleryItemHelper divGalleryItemHelper) {
        this.blockId = str;
        this.divViewState = divViewState;
        this.layoutManager = divGalleryItemHelper;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        View view;
        super.onScrolled(recyclerView, i, i2);
        int firstVisibleItemPosition = this.layoutManager.firstVisibleItemPosition();
        RecyclerView.e0 findViewHolderForLayoutPosition = recyclerView.findViewHolderForLayoutPosition(firstVisibleItemPosition);
        this.divViewState.putBlockState(this.blockId, new GalleryState(firstVisibleItemPosition, (findViewHolderForLayoutPosition == null || (view = findViewHolderForLayoutPosition.itemView) == null) ? 0 : this.layoutManager.calcScrollOffset(view)));
    }
}
