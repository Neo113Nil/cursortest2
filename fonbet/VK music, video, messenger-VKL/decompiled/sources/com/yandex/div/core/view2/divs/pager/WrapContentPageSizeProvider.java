package com.yandex.div.core.view2.divs.pager;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div2.DivPager;

/* compiled from: WrapContentPageSizeProvider.kt */
/* loaded from: classes7.dex */
public final class WrapContentPageSizeProvider extends DivPagerPageSizeProvider {
    private final boolean isHorizontal;
    private final RecyclerView recyclerView;

    public WrapContentPageSizeProvider(RecyclerView recyclerView, boolean z, int i, DivPagerPaddingsHolder divPagerPaddingsHolder, DivPager.ItemAlignment itemAlignment) {
        super(i, divPagerPaddingsHolder, itemAlignment);
        this.recyclerView = recyclerView;
        this.isHorizontal = z;
    }

    @Override // com.yandex.div.core.view2.divs.pager.DivPagerPageSizeProvider
    public Float getItemSize(int i) {
        View findViewByPosition;
        RecyclerView.o layoutManager = this.recyclerView.getLayoutManager();
        if (layoutManager == null || (findViewByPosition = layoutManager.findViewByPosition(i)) == null) {
            return null;
        }
        return Float.valueOf(this.isHorizontal ? findViewByPosition.getWidth() : findViewByPosition.getHeight());
    }
}
