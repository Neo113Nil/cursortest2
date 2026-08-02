package com.yandex.div.legacy.view.tab;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.yandex.alicekit.core.views.ScrollableViewPager;
import com.yandex.alicekit.core.views.ViewPagerFixedSizeLayout;
import defpackage.arg0;
import defpackage.atg0;
import defpackage.gng0;
import defpackage.ogh0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0017\u001a\u00020\u0018H\u0012J\b\u0010\u0019\u001a\u00020\u0018H\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/yandex/div/legacy/view/tab/TabsLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "divider", "Landroid/view/View;", "getDivider", "()Landroid/view/View;", "pagerLayout", "Lcom/yandex/alicekit/core/views/ViewPagerFixedSizeLayout;", "getPagerLayout", "()Lcom/yandex/alicekit/core/views/ViewPagerFixedSizeLayout;", "titleLayout", "Lcom/yandex/div/legacy/view/tab/TabTitlesLayoutView;", "getTitleLayout", "()Lcom/yandex/div/legacy/view/tab/TabTitlesLayoutView;", "viewPager", "Lcom/yandex/alicekit/core/views/ScrollableViewPager;", "getViewPager", "()Lcom/yandex/alicekit/core/views/ScrollableViewPager;", "createDividerLayoutParams", "Landroid/widget/LinearLayout$LayoutParams;", "createTitleLayoutParams", "div-legacy_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public class TabsLayout extends LinearLayout {
    private final View divider;
    private final ViewPagerFixedSizeLayout pagerLayout;
    private final TabTitlesLayoutView<?> titleLayout;
    private final ScrollableViewPager viewPager;

    public TabsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setId(ogh0.div_tabs_block);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        setOrientation(1);
        TabTitlesLayoutView<?> tabTitlesLayoutView = new TabTitlesLayoutView<>(context, null, gng0.legacyTabIndicatorLayoutStyle);
        tabTitlesLayoutView.setId(ogh0.base_tabbed_title_container_scroller);
        tabTitlesLayoutView.setLayoutParams(createTitleLayoutParams());
        int dimensionPixelSize = tabTitlesLayoutView.getResources().getDimensionPixelSize(atg0.title_tab_title_margin_vertical);
        int dimensionPixelSize2 = tabTitlesLayoutView.getResources().getDimensionPixelSize(atg0.title_tab_title_margin_horizontal);
        tabTitlesLayoutView.setPadding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
        tabTitlesLayoutView.setClipToPadding(false);
        this.titleLayout = tabTitlesLayoutView;
        View view = new View(context);
        view.setId(ogh0.div_tabs_divider);
        view.setLayoutParams(createDividerLayoutParams());
        view.setBackgroundResource(arg0.div_separator_color);
        this.divider = view;
        ScrollableViewPager scrollableViewPager = new ScrollableViewPager(context);
        scrollableViewPager.setId(ogh0.div_tabs_pager_container);
        scrollableViewPager.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        scrollableViewPager.setOverScrollMode(2);
        scrollableViewPager.setNestedScrollingEnabled(true);
        this.viewPager = scrollableViewPager;
        ViewPagerFixedSizeLayout viewPagerFixedSizeLayout = new ViewPagerFixedSizeLayout(context);
        viewPagerFixedSizeLayout.setId(ogh0.div_tabs_container_helper);
        viewPagerFixedSizeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        viewPagerFixedSizeLayout.setCollapsiblePaddingBottom(0);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        frameLayout.setVisibility(8);
        viewPagerFixedSizeLayout.addView(scrollableViewPager);
        viewPagerFixedSizeLayout.addView(frameLayout);
        this.pagerLayout = viewPagerFixedSizeLayout;
        addView(tabTitlesLayoutView);
        addView(view);
        addView(viewPagerFixedSizeLayout);
    }

    private LinearLayout.LayoutParams createDividerLayoutParams() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, getResources().getDimensionPixelSize(atg0.div_separator_delimiter_height));
        int dimensionPixelSize = getResources().getDimensionPixelSize(atg0.div_horizontal_padding);
        layoutParams.leftMargin = dimensionPixelSize;
        layoutParams.rightMargin = dimensionPixelSize;
        layoutParams.topMargin = getResources().getDimensionPixelSize(atg0.title_tab_title_separator_margin_top);
        layoutParams.bottomMargin = getResources().getDimensionPixelSize(atg0.title_tab_title_margin_vertical);
        return layoutParams;
    }

    private LinearLayout.LayoutParams createTitleLayoutParams() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, getResources().getDimensionPixelSize(atg0.title_tab_title_height));
        layoutParams.gravity = 8388611;
        return layoutParams;
    }

    public final View getDivider() {
        return this.divider;
    }

    public final ViewPagerFixedSizeLayout getPagerLayout() {
        return this.pagerLayout;
    }

    public final TabTitlesLayoutView<?> getTitleLayout() {
        return this.titleLayout;
    }

    public final ScrollableViewPager getViewPager() {
        return this.viewPager;
    }

    public /* synthetic */ TabsLayout(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TabsLayout(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }
}
