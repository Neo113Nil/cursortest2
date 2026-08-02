package com.yandex.div.core.view2.divs.gallery;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import com.yandex.div2.DivGallery;
import com.yandex.div2.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import xsna.e43;
import xsna.epx;
import xsna.kxt0;

/* compiled from: DivGalleryScrollListener.kt */
/* loaded from: classes7.dex */
public final class DivGalleryScrollListener extends RecyclerView.t {
    private boolean alreadyLogged;
    private final BindingContext bindingContext;
    private String direction;
    private final Div2View divView;
    private final DivGallery galleryDiv;
    private final DivGalleryItemHelper galleryItemHelper;
    private final int minimumSignificantDx;
    private final DivRecyclerView recycler;
    private int totalDelta;

    public DivGalleryScrollListener(BindingContext bindingContext, DivRecyclerView divRecyclerView, DivGalleryItemHelper divGalleryItemHelper, DivGallery divGallery) {
        this.bindingContext = bindingContext;
        this.recycler = divRecyclerView;
        this.galleryItemHelper = divGalleryItemHelper;
        this.galleryDiv = divGallery;
        Div2View divView = bindingContext.getDivView();
        this.divView = divView;
        this.minimumSignificantDx = divView.getConfig().getLogCardScrollSignificantThreshold();
        this.direction = "next";
    }

    private final void trackViews() {
        List<? extends View> list;
        DivVisibilityActionTracker visibilityActionTracker = this.divView.getDiv2Component$div_release().getVisibilityActionTracker();
        DivRecyclerView divRecyclerView = this.recycler;
        if (divRecyclerView.getChildCount() > 0) {
            int i = 0 + 1;
            View childAt = divRecyclerView.getChildAt(0);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            if (i < divRecyclerView.getChildCount()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(childAt);
                while (true) {
                    if (!(i < divRecyclerView.getChildCount())) {
                        list = arrayList;
                        break;
                    }
                    int i2 = i + 1;
                    View childAt2 = divRecyclerView.getChildAt(i);
                    if (childAt2 == null) {
                        throw new IndexOutOfBoundsException();
                    }
                    arrayList.add(childAt2);
                    i = i2;
                }
            } else {
                list = Collections.singletonList(childAt);
            }
        } else {
            list = EmptyList.b;
        }
        visibilityActionTracker.updateVisibleViews(list);
        DivRecyclerView divRecyclerView2 = this.recycler;
        int i3 = 0;
        while (true) {
            if (!(i3 < divRecyclerView2.getChildCount())) {
                Map<View, a> divWithWaitingDisappearActions = visibilityActionTracker.getDivWithWaitingDisappearActions();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<View, a> entry : divWithWaitingDisappearActions.entrySet()) {
                    DivRecyclerView divRecyclerView3 = this.recycler;
                    View key = entry.getKey();
                    kxt0 kxt0Var = new kxt0(divRecyclerView3);
                    int i4 = 0;
                    while (true) {
                        if (!kxt0Var.hasNext()) {
                            i4 = -1;
                            break;
                        }
                        View next = kxt0Var.next();
                        if (i4 < 0) {
                            e43.t();
                            throw null;
                        }
                        if (epx.f(key, next)) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (i4 < 0) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    visibilityActionTracker.trackDetachedView(this.bindingContext, (View) entry2.getKey(), (a) entry2.getValue());
                }
                return;
            }
            int i5 = i3 + 1;
            View childAt3 = divRecyclerView2.getChildAt(i3);
            if (childAt3 == null) {
                throw new IndexOutOfBoundsException();
            }
            int childAdapterPosition = this.recycler.getChildAdapterPosition(childAt3);
            if (childAdapterPosition != -1) {
                visibilityActionTracker.startTrackingViewsHierarchy(this.bindingContext, childAt3, ((DivGalleryAdapter) this.recycler.getAdapter()).getVisibleItems().get(childAdapterPosition).getDiv());
            }
            i3 = i5;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        super.onScrollStateChanged(recyclerView, i);
        if (i == 1) {
            this.alreadyLogged = false;
        }
        if (i == 0) {
            this.divView.getDiv2Component$div_release().getDiv2Logger().logGalleryCompleteScroll(this.divView, this.bindingContext.getExpressionResolver(), this.galleryDiv, this.galleryItemHelper.firstVisibleItemPosition(), this.galleryItemHelper.lastVisibleItemPosition(), this.direction);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        super.onScrolled(recyclerView, i, i2);
        int i3 = this.minimumSignificantDx;
        if (i3 <= 0) {
            i3 = this.galleryItemHelper.width() / 20;
        }
        int abs = Math.abs(i2) + Math.abs(i) + this.totalDelta;
        this.totalDelta = abs;
        if (abs > i3) {
            this.totalDelta = 0;
            if (!this.alreadyLogged) {
                this.alreadyLogged = true;
                this.divView.getDiv2Component$div_release().getDiv2Logger().logGalleryScroll(this.divView);
                this.direction = (i > 0 || i2 > 0) ? "next" : "back";
            }
            trackViews();
        }
    }
}
