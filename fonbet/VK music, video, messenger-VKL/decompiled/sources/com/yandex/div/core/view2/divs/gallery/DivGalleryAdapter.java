package com.yandex.div.core.view2.divs.gallery;

import android.view.ViewGroup;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.divs.DivCollectionAdapter;
import com.yandex.div.internal.core.DivItemBuilderResult;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: DivGalleryAdapter.kt */
/* loaded from: classes7.dex */
public final class DivGalleryAdapter extends DivCollectionAdapter<DivGalleryViewHolder> {
    private final BindingContext bindingContext;
    private final DivBinder divBinder;
    private final WeakHashMap<DivItemBuilderResult, Long> internalIds;
    private long lastItemId;
    private final DivViewCreator viewCreator;

    public DivGalleryAdapter(List<DivItemBuilderResult> list, BindingContext bindingContext, DivBinder divBinder, DivViewCreator divViewCreator, DivStatePath divStatePath) {
        super(bindingContext, divStatePath, list);
        this.bindingContext = bindingContext;
        this.divBinder = divBinder;
        this.viewCreator = divViewCreator;
        this.internalIds = new WeakHashMap<>();
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        DivItemBuilderResult divItemBuilderResult = getVisibleItems().get(i);
        Long l = this.internalIds.get(divItemBuilderResult);
        if (l != null) {
            return l.longValue();
        }
        long j = this.lastItemId;
        this.lastItemId = 1 + j;
        this.internalIds.put(divItemBuilderResult, Long.valueOf(j));
        return j;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public DivGalleryViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new DivGalleryViewHolder(this.bindingContext, new DivGalleryItemLayout(this.bindingContext.getDivView().getContext$div_release()), this.divBinder, this.viewCreator);
    }
}
