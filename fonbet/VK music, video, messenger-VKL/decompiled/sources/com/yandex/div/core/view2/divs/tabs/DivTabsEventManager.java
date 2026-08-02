package com.yandex.div.core.view2.divs.tabs;

import androidx.viewpager.widget.ViewPager;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.divs.widgets.DivTabsLayout;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi;
import com.yandex.div.logging.Severity;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivTabs;
import xsna.zcl;

/* compiled from: DivTabsEventManager.kt */
/* loaded from: classes7.dex */
public final class DivTabsEventManager implements ViewPager.j, BaseDivTabbedCardUi.ActiveTabClickListener<DivAction> {
    private static final Companion Companion = new Companion(null);
    private final DivActionBinder actionBinder;
    private final BindingContext context;
    private int currentPagePosition = -1;
    private DivTabs div;
    private final Div2Logger div2Logger;
    private final DivTabsLayout tabLayout;
    private final DivVisibilityActionTracker visibilityActionTracker;

    /* compiled from: DivTabsEventManager.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public DivTabsEventManager(BindingContext bindingContext, DivActionBinder divActionBinder, Div2Logger div2Logger, DivVisibilityActionTracker divVisibilityActionTracker, DivTabsLayout divTabsLayout, DivTabs divTabs) {
        this.context = bindingContext;
        this.actionBinder = divActionBinder;
        this.div2Logger = div2Logger;
        this.visibilityActionTracker = divVisibilityActionTracker;
        this.tabLayout = divTabsLayout;
        this.div = divTabs;
    }

    public final void onPageDisplayed(int i) {
        int i2 = this.currentPagePosition;
        if (i == i2) {
            return;
        }
        if (i2 != -1) {
            this.visibilityActionTracker.cancelTrackingViewsHierarchy(this.context, this.tabLayout, this.div.q.get(i2).a);
            this.context.getDivView().unbindViewFromDiv$div_release(this.tabLayout);
        }
        DivTabs.a aVar = this.div.q.get(i);
        this.visibilityActionTracker.startTrackingViewsHierarchy(this.context, this.tabLayout, aVar.a);
        this.context.getDivView().bindViewToDiv$div_release(this.tabLayout, aVar.a);
        this.currentPagePosition = i;
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void onPageSelected(int i) {
        this.div2Logger.logTabPageChanged(this.context.getDivView(), i);
        onPageDisplayed(i);
    }

    public final void setDiv(DivTabs divTabs) {
        this.div = divTabs;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.ActiveTabClickListener
    public void onActiveTabClicked(DivAction divAction, int i) {
        if (divAction.e != null) {
            KLog kLog = KLog.INSTANCE;
            if (kLog.isAtLeast(Severity.WARNING)) {
                kLog.print(5, "DivTabsEventManager", "non-null menuItems ignored in title click action");
            }
        }
        this.div2Logger.logActiveTabTitleClick(this.context.getDivView(), this.context.getExpressionResolver(), i, divAction);
        DivActionBinder.handleAction$div_release$default(this.actionBinder, this.context.getDivView(), this.context.getExpressionResolver(), divAction, "click", null, null, 48, null);
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void onPageScrolled(int i, float f, int i2) {
    }
}
