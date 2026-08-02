package com.yandex.div.core.view2.divs.pager;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div2.DivPager;
import com.yandex.div2.a;
import java.util.List;
import xsna.e43;
import xsna.kxt0;

/* compiled from: DivPagerPageChangeCallback.kt */
/* loaded from: classes7.dex */
public final class DivPagerPageChangeCallback extends ViewPager2.g {
    private final BindingContext bindingContext;
    private final DivPager divPager;
    private final Div2View divView;
    private final List<DivItemBuilderResult> items;
    private final int minimumSignificantDx;
    private final DivPagerView pagerView;
    private int prevPosition = -1;
    private final RecyclerView recyclerView;
    private int totalDelta;

    public DivPagerPageChangeCallback(DivPager divPager, List<DivItemBuilderResult> list, BindingContext bindingContext, RecyclerView recyclerView, DivPagerView divPagerView) {
        this.divPager = divPager;
        this.items = list;
        this.bindingContext = bindingContext;
        this.recyclerView = recyclerView;
        this.pagerView = divPagerView;
        Div2View divView = bindingContext.getDivView();
        this.divView = divView;
        this.minimumSignificantDx = divView.getConfig().getLogCardScrollSignificantThreshold();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackVisibleChildren() {
        View next;
        int childAdapterPosition;
        kxt0 kxt0Var = new kxt0(this.recyclerView);
        while (kxt0Var.hasNext() && (childAdapterPosition = this.recyclerView.getChildAdapterPosition((next = kxt0Var.next()))) != -1) {
            DivItemBuilderResult divItemBuilderResult = this.items.get(childAdapterPosition);
            this.divView.getDiv2Component$div_release().getVisibilityActionTracker().startTrackingViewsHierarchy(this.bindingContext.getFor(divItemBuilderResult.getExpressionResolver()), next, divItemBuilderResult.getDiv());
        }
    }

    private final void trackVisibleViews() {
        kxt0 kxt0Var = new kxt0(this.recyclerView);
        int i = 0;
        while (kxt0Var.hasNext()) {
            kxt0Var.next();
            i++;
            if (i < 0) {
                e43.s();
                throw null;
            }
        }
        if (i > 0) {
            trackVisibleChildren();
            return;
        }
        RecyclerView recyclerView = this.recyclerView;
        if (!ViewsKt.isActuallyLaidOut(recyclerView) || recyclerView.isLayoutRequested()) {
            recyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerPageChangeCallback$trackVisibleViews$$inlined$doOnActualLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    view.removeOnLayoutChangeListener(this);
                    DivPagerPageChangeCallback.this.trackVisibleChildren();
                }
            });
        } else {
            trackVisibleChildren();
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    @SuppressLint({"SwitchIntDef"})
    public void onPageScrollStateChanged(int i) {
        super.onPageScrollStateChanged(i);
        if (i == 0) {
            trackVisibleViews();
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public void onPageScrolled(int i, float f, int i2) {
        super.onPageScrolled(i, f, i2);
        int i3 = this.minimumSignificantDx;
        if (i3 <= 0) {
            RecyclerView.o layoutManager = this.recyclerView.getLayoutManager();
            i3 = (layoutManager != null ? layoutManager.getWidth() : 0) / 20;
        }
        int i4 = this.totalDelta + i2;
        this.totalDelta = i4;
        if (i4 > i3) {
            this.totalDelta = 0;
            trackVisibleViews();
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public void onPageSelected(int i) {
        int i2;
        super.onPageSelected(i);
        trackVisibleViews();
        int i3 = this.prevPosition;
        if (i == i3) {
            return;
        }
        if (i3 != -1) {
            this.divView.unbindViewFromDiv$div_release(this.pagerView);
        }
        if (i == -1) {
            this.prevPosition = i;
            return;
        }
        int i4 = this.prevPosition;
        if (i4 != -1) {
            i2 = i;
            this.divView.getDiv2Component$div_release().getDiv2Logger().logPagerChangePage(this.divView, this.items.get(i).getExpressionResolver(), this.divPager, i2, i > i4 ? "next" : "back");
        } else {
            i2 = i;
        }
        a div = this.items.get(i2).getDiv();
        if (DivUtilKt.getHasSightActions(div.b())) {
            this.divView.bindViewToDiv$div_release(this.pagerView, div);
        }
        this.prevPosition = i2;
    }
}
