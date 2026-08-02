package com.yandex.div.core.view2.divs;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.e0;
import com.yandex.div.core.Disposable;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div2.DivVisibility;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.c5g;
import xsna.e43;
import xsna.izs;
import xsna.s3q0;

/* compiled from: VisibilityAwareAdapter.kt */
/* loaded from: classes7.dex */
public abstract class VisibilityAwareAdapter<VH extends RecyclerView.e0> extends RecyclerView.Adapter<VH> implements ExpressionSubscriber {
    private boolean isVisibleItemListValid;
    private final List<DivItemBuilderResult> itemList;
    private final List<Boolean> itemVisibilityList;
    private final List<Disposable> subscriptions;
    private final List<DivItemBuilderResult> visibleItemList = new ArrayList();

    public VisibilityAwareAdapter(List<DivItemBuilderResult> list) {
        boolean isVisible;
        this.itemList = new ArrayList(list);
        List<DivItemBuilderResult> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            isVisible = VisibilityAwareAdapterKt.isVisible((DivItemBuilderResult) it.next());
            arrayList.add(Boolean.valueOf(isVisible));
        }
        this.itemVisibilityList = new ArrayList(arrayList);
        this.subscriptions = new ArrayList();
        subscribeOnElements();
    }

    private final List<DivItemBuilderResult> buildVisibleItemList() {
        if (!this.isVisibleItemListValid) {
            this.visibleItemList.clear();
            List<DivItemBuilderResult> list = this.itemList;
            List<DivItemBuilderResult> list2 = this.visibleItemList;
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                DivItemBuilderResult divItemBuilderResult = this.itemVisibilityList.get(i).booleanValue() ? (DivItemBuilderResult) obj : null;
                if (divItemBuilderResult != null) {
                    list2.add(divItemBuilderResult);
                }
                i = i2;
            }
            this.isVisibleItemListValid = true;
        }
        return this.visibleItemList;
    }

    private final void notifyVisibleItemChanged(int i) {
        notifyRawItemChanged(visiblePositionOf(i));
    }

    private final void notifyVisibleItemInserted(int i) {
        notifyRawItemInserted(visiblePositionOf(i));
    }

    private final void notifyVisibleItemRemoved(int i) {
        notifyRawItemRemoved(visiblePositionOf(i));
    }

    public static /* synthetic */ void setItem$default(VisibilityAwareAdapter visibilityAwareAdapter, int i, DivItemBuilderResult divItemBuilderResult, DivVisibility divVisibility, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setItem");
        }
        if ((i2 & 4) != 0) {
            divVisibility = VisibilityAwareAdapterKt.getVisibility(divItemBuilderResult);
        }
        visibilityAwareAdapter.setItem(i, divItemBuilderResult, divVisibility);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateItemVisibility(int i, DivVisibility divVisibility) {
        boolean z = divVisibility == DivVisibility.VISIBLE;
        boolean booleanValue = this.itemVisibilityList.get(i).booleanValue();
        if (z == booleanValue) {
            return;
        }
        this.itemVisibilityList.set(i, Boolean.valueOf(z));
        this.isVisibleItemListValid = false;
        if (booleanValue) {
            notifyVisibleItemRemoved(i);
        } else {
            notifyVisibleItemInserted(i);
        }
    }

    private final int visiblePositionOf(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (this.itemVisibilityList.get(i3).booleanValue()) {
                i2++;
            }
        }
        return i2;
    }

    public final void addItems(int i, Collection<DivItemBuilderResult> collection) {
        DivVisibility visibility;
        boolean isVisible;
        this.itemList.addAll(i, collection);
        List<Boolean> list = this.itemVisibilityList;
        Collection<DivItemBuilderResult> collection2 = collection;
        ArrayList arrayList = new ArrayList(c5g.u(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            isVisible = VisibilityAwareAdapterKt.isVisible((DivItemBuilderResult) it.next());
            arrayList.add(Boolean.valueOf(isVisible));
        }
        list.addAll(i, arrayList);
        int i2 = 0;
        this.isVisibleItemListValid = false;
        for (Object obj : collection2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                e43.t();
                throw null;
            }
            visibility = VisibilityAwareAdapterKt.getVisibility((DivItemBuilderResult) obj);
            if (visibility == DivVisibility.VISIBLE) {
                notifyVisibleItemInserted(i2 + i);
            }
            i2 = i3;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return getVisibleItems().size();
    }

    public final List<DivItemBuilderResult> getItems() {
        return this.itemList;
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public List<Disposable> getSubscriptions() {
        return this.subscriptions;
    }

    public final List<DivItemBuilderResult> getVisibleItems() {
        return buildVisibleItemList();
    }

    public void notifyRawItemChanged(int i) {
        notifyItemChanged(i);
    }

    public void notifyRawItemInserted(int i) {
        notifyItemInserted(i);
    }

    public void notifyRawItemRemoved(int i) {
        notifyItemRemoved(i);
    }

    public final void removeItem(int i) {
        this.itemList.remove(i);
        boolean booleanValue = this.itemVisibilityList.remove(i).booleanValue();
        this.isVisibleItemListValid = false;
        if (booleanValue) {
            notifyVisibleItemRemoved(i);
        }
    }

    public final void setItem(int i, DivItemBuilderResult divItemBuilderResult, DivVisibility divVisibility) {
        boolean z = divVisibility == DivVisibility.VISIBLE;
        boolean booleanValue = this.itemVisibilityList.get(i).booleanValue();
        this.itemList.set(i, divItemBuilderResult);
        this.itemVisibilityList.set(i, Boolean.valueOf(z));
        if (z || booleanValue) {
            this.isVisibleItemListValid = false;
        }
        if (booleanValue && !z) {
            notifyVisibleItemRemoved(i);
            return;
        }
        if (!booleanValue && z) {
            notifyVisibleItemInserted(i);
        } else if (booleanValue && z) {
            notifyVisibleItemChanged(i);
        }
    }

    public final void subscribeOnElements() {
        closeAllSubscription();
        final int i = 0;
        for (Object obj : this.itemList) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) obj;
            addSubscription(divItemBuilderResult.getDiv().b().getVisibility().observe(divItemBuilderResult.getExpressionResolver(), new izs<DivVisibility, s3q0>(this) { // from class: com.yandex.div.core.view2.divs.VisibilityAwareAdapter$subscribeOnElements$1$subscription$1
                final /* synthetic */ VisibilityAwareAdapter<VH> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                    this.this$0 = this;
                }

                @Override // xsna.izs
                public /* bridge */ /* synthetic */ s3q0 invoke(DivVisibility divVisibility) {
                    invoke2(divVisibility);
                    return s3q0.a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(DivVisibility divVisibility) {
                    this.this$0.updateItemVisibility(i, divVisibility);
                }
            }));
            i = i2;
        }
    }
}
