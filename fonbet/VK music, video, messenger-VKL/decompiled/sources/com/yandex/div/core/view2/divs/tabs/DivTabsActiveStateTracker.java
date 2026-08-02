package com.yandex.div.core.view2.divs.tabs;

import androidx.viewpager.widget.ViewPager;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.expression.local.DivRuntimeVisitor;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.TabsStateCache;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivTabs;

/* compiled from: DivTabsActiveStateTracker.kt */
/* loaded from: classes7.dex */
public final class DivTabsActiveStateTracker implements ViewPager.j, BaseDivTabbedCardUi.ActiveTabClickListener<DivAction> {
    private final BindingContext context;
    private DivTabs div;
    private final Div2Logger div2Logger;
    private final DivStatePath path;
    private final DivRuntimeVisitor runtimeVisitor;
    private final TabsStateCache tabsStateCache;

    public DivTabsActiveStateTracker(BindingContext bindingContext, DivStatePath divStatePath, Div2Logger div2Logger, TabsStateCache tabsStateCache, DivRuntimeVisitor divRuntimeVisitor, DivTabs divTabs) {
        this.context = bindingContext;
        this.path = divStatePath;
        this.div2Logger = div2Logger;
        this.tabsStateCache = tabsStateCache;
        this.runtimeVisitor = divRuntimeVisitor;
        this.div = divTabs;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.ActiveTabClickListener
    public void onActiveTabClicked(DivAction divAction, int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void onPageSelected(int i) {
        this.div2Logger.logTabPageChanged(this.context.getDivView(), i);
        this.tabsStateCache.putSelectedTab(this.context.getDivView().getDataTag().getId(), this.path.getFullPath$div_release(), i);
        this.runtimeVisitor.createAndAttachRuntimesToTabs(this.context.getDivView(), this.div, this.path, this.context.getExpressionResolver());
    }

    public final void setDiv(DivTabs divTabs) {
        this.div = divTabs;
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void onPageScrolled(int i, float f, int i2) {
    }
}
