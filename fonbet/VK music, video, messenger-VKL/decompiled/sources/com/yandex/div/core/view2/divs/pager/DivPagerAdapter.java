package com.yandex.div.core.view2.divs.pager;

import android.util.SparseArray;
import android.view.ViewGroup;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.divs.DivCollectionAdapter;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div2.DivPager;
import java.util.List;
import xsna.ff;
import xsna.gzs;
import xsna.zcl;

/* compiled from: DivPagerAdapter.kt */
/* loaded from: classes7.dex */
public final class DivPagerAdapter extends DivCollectionAdapter<DivPagerViewHolder> {
    public static final Companion Companion = new Companion(null);
    private final BindingContext bindingContext;
    private DivPager.ItemAlignment crossAxisAlignment;
    private final DivBinder divBinder;
    private boolean infiniteScrollEnabled;
    private final ff<DivItemBuilderResult> itemsToShow;
    private int orientation;
    private final SparseArray<Float> pageTranslations;
    private final DivPagerView pagerView;
    private int removedItems;
    private final DivViewCreator viewCreator;

    /* compiled from: DivPagerAdapter.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public DivPagerAdapter(List<DivItemBuilderResult> list, BindingContext bindingContext, DivBinder divBinder, SparseArray<Float> sparseArray, DivViewCreator divViewCreator, DivStatePath divStatePath, DivPagerView divPagerView) {
        super(bindingContext, divStatePath, list);
        this.bindingContext = bindingContext;
        this.divBinder = divBinder;
        this.pageTranslations = sparseArray;
        this.viewCreator = divViewCreator;
        this.pagerView = divPagerView;
        this.itemsToShow = new ff<DivItemBuilderResult>() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerAdapter$itemsToShow$1
            public /* bridge */ boolean contains(DivItemBuilderResult divItemBuilderResult) {
                return super.contains((Object) divItemBuilderResult);
            }

            @Override // xsna.ff, xsna.qd
            public int getSize() {
                return DivPagerAdapter.this.getVisibleItems().size() + (DivPagerAdapter.this.getInfiniteScrollEnabled() ? 4 : 0);
            }

            public /* bridge */ int indexOf(DivItemBuilderResult divItemBuilderResult) {
                return super.indexOf((Object) divItemBuilderResult);
            }

            public /* bridge */ int lastIndexOf(DivItemBuilderResult divItemBuilderResult) {
                return super.lastIndexOf((Object) divItemBuilderResult);
            }

            @Override // xsna.qd, java.util.Collection, java.util.List
            public final /* bridge */ boolean contains(Object obj) {
                if (obj instanceof DivItemBuilderResult) {
                    return contains((DivItemBuilderResult) obj);
                }
                return false;
            }

            @Override // xsna.ff, java.util.List
            public DivItemBuilderResult get(int i) {
                return !DivPagerAdapter.this.getInfiniteScrollEnabled() ? DivPagerAdapter.this.getVisibleItems().get(i) : DivPagerAdapter.this.getVisibleItems().get(DivPagerAdapter.this.realItemPosition(i));
            }

            @Override // xsna.ff, java.util.List
            public final /* bridge */ int indexOf(Object obj) {
                if (obj instanceof DivItemBuilderResult) {
                    return indexOf((DivItemBuilderResult) obj);
                }
                return -1;
            }

            @Override // xsna.ff, java.util.List
            public final /* bridge */ int lastIndexOf(Object obj) {
                if (obj instanceof DivItemBuilderResult) {
                    return lastIndexOf((DivItemBuilderResult) obj);
                }
                return -1;
            }
        };
        this.crossAxisAlignment = DivPager.ItemAlignment.START;
    }

    private final int getOffsetToRealItem() {
        return this.infiniteScrollEnabled ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isHorizontal() {
        return this.orientation == 0;
    }

    private final void notifyVirtualItemsChanged(int i) {
        if (i >= 0 && i < 2) {
            notifyItemRangeChanged(getVisibleItems().size() + i, 2 - i);
            return;
        }
        int size = getVisibleItems().size() - 2;
        if (i >= getVisibleItems().size() || size > i) {
            return;
        }
        notifyItemRangeChanged((i - getVisibleItems().size()) + 2, 2);
    }

    public final DivPager.ItemAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    public final int getCurrentItem() {
        return this.pagerView.getCurrentItem$div_release();
    }

    public final boolean getInfiniteScrollEnabled() {
        return this.infiniteScrollEnabled;
    }

    @Override // com.yandex.div.core.view2.divs.VisibilityAwareAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.itemsToShow.size();
    }

    public final ff<DivItemBuilderResult> getItemsToShow() {
        return this.itemsToShow;
    }

    public final int getOrientation() {
        return this.orientation;
    }

    public final int getPosition(int i) {
        return i + getOffsetToRealItem();
    }

    public final int getRealPosition(int i) {
        return i - getOffsetToRealItem();
    }

    @Override // com.yandex.div.core.view2.divs.VisibilityAwareAdapter
    public void notifyRawItemChanged(int i) {
        if (!this.infiniteScrollEnabled) {
            notifyItemChanged(i);
        } else {
            notifyItemChanged(i + 2);
            notifyVirtualItemsChanged(i);
        }
    }

    @Override // com.yandex.div.core.view2.divs.VisibilityAwareAdapter
    public void notifyRawItemInserted(int i) {
        if (!this.infiniteScrollEnabled) {
            notifyItemInserted(i);
        } else {
            notifyItemInserted(i + 2);
            notifyVirtualItemsChanged(i);
        }
    }

    @Override // com.yandex.div.core.view2.divs.VisibilityAwareAdapter
    public void notifyRawItemRemoved(int i) {
        this.removedItems++;
        if (!this.infiniteScrollEnabled) {
            notifyItemRemoved(i);
        } else {
            notifyItemRemoved(i + 2);
            notifyVirtualItemsChanged(i);
        }
    }

    public final int realItemPosition(int i) {
        Integer valueOf = Integer.valueOf(getVisibleItems().size());
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        if (valueOf == null) {
            return 0;
        }
        int intValue = valueOf.intValue();
        return (getRealPosition(i) + intValue) % intValue;
    }

    public final void setCrossAxisAlignment(DivPager.ItemAlignment itemAlignment) {
        this.crossAxisAlignment = itemAlignment;
    }

    public final void setInfiniteScrollEnabled(boolean z) {
        if (this.infiniteScrollEnabled == z) {
            return;
        }
        this.infiniteScrollEnabled = z;
        notifyItemRangeChanged(0, getItemCount());
        DivPagerView divPagerView = this.pagerView;
        divPagerView.setCurrentItem$div_release(divPagerView.getCurrentItem$div_release() + (z ? 2 : -2));
    }

    @Override // com.yandex.div.core.view2.divs.DivCollectionAdapter
    public void setItems(List<DivItemBuilderResult> list) {
        int size = getItems().size();
        this.removedItems = 0;
        int currentItem = getCurrentItem();
        super.setItems(list);
        if (this.removedItems == size) {
            this.pagerView.setCurrentItem$div_release(currentItem);
        }
    }

    public final void setOrientation(int i) {
        this.orientation = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public DivPagerViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new DivPagerViewHolder(this.bindingContext, new DivPagerPageLayout(this.bindingContext.getDivView().getContext$div_release(), new gzs<Boolean>() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerAdapter$onCreateViewHolder$view$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // xsna.gzs
            public final Boolean invoke() {
                boolean isHorizontal;
                isHorizontal = DivPagerAdapter.this.isHorizontal();
                return Boolean.valueOf(isHorizontal);
            }
        }), this.divBinder, this.viewCreator, new gzs<Boolean>() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerAdapter$onCreateViewHolder$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // xsna.gzs
            public final Boolean invoke() {
                boolean isHorizontal;
                isHorizontal = DivPagerAdapter.this.isHorizontal();
                return Boolean.valueOf(isHorizontal);
            }
        }, new gzs<DivPager.ItemAlignment>() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerAdapter$onCreateViewHolder$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // xsna.gzs
            public final DivPager.ItemAlignment invoke() {
                return DivPagerAdapter.this.getCrossAxisAlignment();
            }
        });
    }

    @Override // com.yandex.div.core.view2.divs.DivCollectionAdapter
    public void onBindViewHolder(DivPagerViewHolder divPagerViewHolder, int i) {
        super.onBindViewHolder((DivPagerAdapter) divPagerViewHolder, realItemPosition(i));
        Float f = this.pageTranslations.get(i);
        if (f != null) {
            float floatValue = f.floatValue();
            if (isHorizontal()) {
                divPagerViewHolder.itemView.setTranslationX(floatValue);
            } else {
                divPagerViewHolder.itemView.setTranslationY(floatValue);
            }
        }
    }
}
