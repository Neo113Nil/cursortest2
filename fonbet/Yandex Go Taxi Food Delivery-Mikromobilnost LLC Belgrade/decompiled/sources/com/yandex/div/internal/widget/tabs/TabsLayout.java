package com.yandex.div.internal.widget.tabs;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat$Api21Impl;
import defpackage.d6x0;
import defpackage.fng0;
import defpackage.ngh0;
import defpackage.vsg0;
import defpackage.zqg0;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0010\u0018\u0000 '2\u00020\u0001:\u0001(B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u001e\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00108\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0012R$\u0010!\u001a\u0004\u0018\u00010 8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/yandex/div/internal/widget/tabs/TabsLayout;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "getAccessibilityClassName", "()Ljava/lang/String;", "Lcom/yandex/div/internal/widget/tabs/TabTitlesLayoutView;", "titleLayout", "Lcom/yandex/div/internal/widget/tabs/TabTitlesLayoutView;", "getTitleLayout", "()Lcom/yandex/div/internal/widget/tabs/TabTitlesLayoutView;", "Landroid/view/View;", "divider", "Landroid/view/View;", "getDivider", "()Landroid/view/View;", "Lcom/yandex/div/internal/widget/tabs/ViewPagerFixedSizeLayout;", "pagerLayout", "Lcom/yandex/div/internal/widget/tabs/ViewPagerFixedSizeLayout;", "getPagerLayout", "()Lcom/yandex/div/internal/widget/tabs/ViewPagerFixedSizeLayout;", "Lcom/yandex/div/internal/widget/tabs/ScrollableViewPager;", "viewPager", "Lcom/yandex/div/internal/widget/tabs/ScrollableViewPager;", "getViewPager", "()Lcom/yandex/div/internal/widget/tabs/ScrollableViewPager;", "bottomView", "Lcom/yandex/div/core/view2/divs/tabs/a;", "divTabsAdapter", "Lcom/yandex/div/core/view2/divs/tabs/a;", "getDivTabsAdapter", "()Lcom/yandex/div/core/view2/divs/tabs/a;", "setDivTabsAdapter", "(Lcom/yandex/div/core/view2/divs/tabs/a;)V", "Companion", "d6x0", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class TabsLayout extends LinearLayout {
    private static final d6x0 Companion = new d6x0();
    private final View bottomView;
    private com.yandex.div.core.view2.divs.tabs.a divTabsAdapter;
    private final View divider;
    private final ViewPagerFixedSizeLayout pagerLayout;
    private final TabTitlesLayoutView<?> titleLayout;
    private final ScrollableViewPager viewPager;

    public TabsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d6x0 d6x0Var = Companion;
        d6x0Var.getClass();
        TabTitlesLayoutView<?> tabTitlesLayoutView = new TabTitlesLayoutView<>(context, null, fng0.divTabIndicatorLayoutStyle);
        tabTitlesLayoutView.setId(ngh0.base_tabbed_title_container_scroller);
        Companion.getClass();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, context.getResources().getDimensionPixelSize(vsg0.title_tab_title_height));
        layoutParams.gravity = 8388611;
        tabTitlesLayoutView.setLayoutParams(layoutParams);
        int dimensionPixelSize = tabTitlesLayoutView.getResources().getDimensionPixelSize(vsg0.title_tab_title_margin_vertical);
        int dimensionPixelSize2 = tabTitlesLayoutView.getResources().getDimensionPixelSize(vsg0.title_tab_title_margin_horizontal);
        tabTitlesLayoutView.setPadding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
        tabTitlesLayoutView.setClipToPadding(false);
        this.titleLayout = tabTitlesLayoutView;
        d6x0Var.getClass();
        View view = new View(context);
        view.setId(ngh0.div_tabs_divider);
        Companion.getClass();
        Resources resources = context.getResources();
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, resources.getDimensionPixelSize(vsg0.div_separator_delimiter_height));
        int dimensionPixelSize3 = resources.getDimensionPixelSize(vsg0.div_horizontal_padding);
        layoutParams2.leftMargin = dimensionPixelSize3;
        layoutParams2.rightMargin = dimensionPixelSize3;
        layoutParams2.topMargin = resources.getDimensionPixelSize(vsg0.title_tab_title_separator_margin_top);
        layoutParams2.bottomMargin = resources.getDimensionPixelSize(vsg0.title_tab_title_margin_vertical);
        view.setLayoutParams(layoutParams2);
        view.setBackgroundResource(zqg0.div_separator_color);
        this.divider = view;
        d6x0Var.getClass();
        ViewPagerFixedSizeLayout viewPagerFixedSizeLayout = new ViewPagerFixedSizeLayout(context, null, 0, 6, null);
        viewPagerFixedSizeLayout.setId(ngh0.div_tabs_container_helper);
        viewPagerFixedSizeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        viewPagerFixedSizeLayout.setCollapsiblePaddingBottom(0);
        this.pagerLayout = viewPagerFixedSizeLayout;
        d6x0Var.getClass();
        ScrollableViewPager scrollableViewPager = new ScrollableViewPager(context);
        scrollableViewPager.setId(ngh0.div_tabs_pager_container);
        scrollableViewPager.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        scrollableViewPager.setOverScrollMode(2);
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ViewCompat$Api21Impl.n(scrollableViewPager, true);
        this.viewPager = scrollableViewPager;
        d6x0Var.getClass();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        frameLayout.setVisibility(8);
        this.bottomView = frameLayout;
        setId(ngh0.div_tabs_block);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        setOrientation(1);
        ViewPagerFixedSizeLayout pagerLayout = getPagerLayout();
        pagerLayout.addView(getViewPager());
        pagerLayout.addView(frameLayout);
        addView(getTitleLayout());
        addView(getDivider());
        addView(getPagerLayout());
    }

    public com.yandex.div.core.view2.divs.tabs.a getDivTabsAdapter() {
        return this.divTabsAdapter;
    }

    public View getDivider() {
        return this.divider;
    }

    public ViewPagerFixedSizeLayout getPagerLayout() {
        return this.pagerLayout;
    }

    public TabTitlesLayoutView<?> getTitleLayout() {
        return this.titleLayout;
    }

    public ScrollableViewPager getViewPager() {
        return this.viewPager;
    }

    public void setDivTabsAdapter(com.yandex.div.core.view2.divs.tabs.a aVar) {
        this.divTabsAdapter = aVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public String getAccessibilityClassName() {
        return "android.widget.TabWidget";
    }

    public /* synthetic */ TabsLayout(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TabsLayout(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }
}
