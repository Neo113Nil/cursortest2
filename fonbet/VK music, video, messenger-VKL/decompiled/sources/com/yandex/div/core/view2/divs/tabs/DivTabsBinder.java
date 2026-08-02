package com.yandex.div.core.view2.divs.tabs;

import android.content.Context;
import android.graphics.drawable.PictureDrawable;
import android.util.DisplayMetrics;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.yandex.div.DivDataTag;
import com.yandex.div.R$id;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.DivIdLoggingImageDownloadCallback;
import com.yandex.div.core.downloader.DivPatchCache;
import com.yandex.div.core.expression.local.DivRuntimeVisitor;
import com.yandex.div.core.images.CachedBitmap;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.TabsStateCache;
import com.yandex.div.core.util.ReleasablesKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.divs.DivBaseBinder;
import com.yandex.div.core.view2.divs.tabs.DivTabsBinder;
import com.yandex.div.core.view2.divs.widgets.DivTabsLayout;
import com.yandex.div.core.view2.divs.widgets.ParentScrollRestrictor;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.util.UiThreadHandler;
import com.yandex.div.internal.viewpool.ViewFactory;
import com.yandex.div.internal.viewpool.ViewPool;
import com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi;
import com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout;
import com.yandex.div.internal.widget.tabs.HeightCalculatorFactory;
import com.yandex.div.internal.widget.tabs.TabItemLayout;
import com.yandex.div.internal.widget.tabs.TabTextStyleProvider;
import com.yandex.div.internal.widget.tabs.TabTitlesLayoutView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivTabs;
import com.yandex.div2.a;
import com.yandex.div2.q4;
import com.yandex.div2.y2;
import com.yandex.div2.y3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import xsna.c5g;
import xsna.e05;
import xsna.e9e0;
import xsna.epx;
import xsna.gzs;
import xsna.izs;
import xsna.j5g;
import xsna.k9x;
import xsna.mj1;
import xsna.mq;
import xsna.s3q0;
import xsna.ur;
import xsna.vpn;
import xsna.vr;
import xsna.xjo;
import xsna.zcl;

/* compiled from: DivTabsBinder.kt */
/* loaded from: classes7.dex */
public final class DivTabsBinder extends DivViewBinder<a.o, DivTabs, DivTabsLayout> {
    private static final Companion Companion = new Companion(null);
    private static final DivTabs.TabTitleStyle DEFAULT_TAB_TITLE_STYLE = new DivTabs.TabTitleStyle(0);
    private final DivActionBinder actionBinder;
    private final DivBaseBinder baseBinder;
    private final Context context;
    private final Div2Logger div2Logger;
    private final e9e0<DivBinder> divBinder;
    private final DivPatchCache divPatchCache;
    private final DivImageLoader imageLoader;
    private Long oldDivSelectedTab;
    private final DivRuntimeVisitor runtimeVisitor;
    private final TabsStateCache tabsStateCache;
    private final TabTextStyleProvider textStyleProvider;
    private final DivViewCreator viewCreator;
    private final ViewPool viewPool;
    private final DivVisibilityActionTracker visibilityActionTracker;

    /* compiled from: DivTabsBinder.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: DivTabsBinder.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivTabs.TabTitleStyle.AnimationType.values().length];
            try {
                iArr[DivTabs.TabTitleStyle.AnimationType.SLIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivTabs.TabTitleStyle.AnimationType.FADE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivTabs.TabTitleStyle.AnimationType.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DivTabsBinder(DivBaseBinder divBaseBinder, DivViewCreator divViewCreator, e9e0<DivBinder> e9e0Var, ViewPool viewPool, TabTextStyleProvider tabTextStyleProvider, DivActionBinder divActionBinder, Div2Logger div2Logger, DivImageLoader divImageLoader, DivVisibilityActionTracker divVisibilityActionTracker, DivPatchCache divPatchCache, Context context, DivRuntimeVisitor divRuntimeVisitor, TabsStateCache tabsStateCache) {
        super(divBaseBinder);
        this.baseBinder = divBaseBinder;
        this.viewCreator = divViewCreator;
        this.divBinder = e9e0Var;
        this.viewPool = viewPool;
        this.textStyleProvider = tabTextStyleProvider;
        this.actionBinder = divActionBinder;
        this.div2Logger = div2Logger;
        this.imageLoader = divImageLoader;
        this.visibilityActionTracker = divVisibilityActionTracker;
        this.divPatchCache = divPatchCache;
        this.context = context;
        this.runtimeVisitor = divRuntimeVisitor;
        this.tabsStateCache = tabsStateCache;
        viewPool.register("DIV2.TAB_HEADER_VIEW", new TabTitlesLayoutView.TabViewFactory(context), 12);
        viewPool.register("DIV2.TAB_ITEM_VIEW", new ViewFactory() { // from class: xsna.wpn
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                TabItemLayout _init_$lambda$0;
                _init_$lambda$0 = DivTabsBinder._init_$lambda$0(DivTabsBinder.this);
                return _init_$lambda$0;
            }
        }, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TabItemLayout _init_$lambda$0(DivTabsBinder divTabsBinder) {
        return new TabItemLayout(divTabsBinder.context, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyDelimiterStyle(final TabTitlesLayoutView<?> tabTitlesLayoutView, ExpressionResolver expressionResolver, DivTabs.b bVar, BindingContext bindingContext) {
        DisplayMetrics displayMetrics = tabTitlesLayoutView.getResources().getDisplayMetrics();
        q4 q4Var = bVar.c;
        final int px = BaseDivViewExtensionsKt.toPx(q4Var.b.evaluate(expressionResolver).longValue(), q4Var.a.evaluate(expressionResolver), displayMetrics);
        q4 q4Var2 = bVar.a;
        final int px2 = BaseDivViewExtensionsKt.toPx(q4Var2.b.evaluate(expressionResolver).longValue(), q4Var2.a.evaluate(expressionResolver), displayMetrics);
        DivImageLoader divImageLoader = this.imageLoader;
        String uri = bVar.b.evaluate(expressionResolver).toString();
        final Div2View divView = bindingContext.getDivView();
        bindingContext.getDivView().addLoadReference(divImageLoader.loadImage(uri, new DivIdLoggingImageDownloadCallback(divView) { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$applyDelimiterStyle$reference$1
            @Override // com.yandex.div.core.images.DivImageDownloadCallback
            public void onError() {
                super.onError();
                tabTitlesLayoutView.setTabDelimiter(null, 0, 0);
            }

            @Override // com.yandex.div.core.images.DivImageDownloadCallback
            public void onSuccess(CachedBitmap cachedBitmap) {
                super.onSuccess(cachedBitmap);
                tabTitlesLayoutView.setTabDelimiter(cachedBitmap.getBitmap(), px, px2);
            }

            @Override // com.yandex.div.core.images.DivImageDownloadCallback
            public void onSuccess(PictureDrawable pictureDrawable) {
                super.onSuccess(pictureDrawable);
                tabTitlesLayoutView.setTabDelimiter(xjo.b(pictureDrawable, 0, 0, 7), px, px2);
            }
        }), tabTitlesLayoutView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyStyle(TabTitlesLayoutView<?> tabTitlesLayoutView, ExpressionResolver expressionResolver, DivTabs.TabTitleStyle tabTitleStyle) {
        BaseIndicatorTabLayout.AnimationType animationType;
        int intValue = tabTitleStyle.d.evaluate(expressionResolver).intValue();
        int intValue2 = tabTitleStyle.a.evaluate(expressionResolver).intValue();
        int intValue3 = tabTitleStyle.p.evaluate(expressionResolver).intValue();
        Expression<Integer> expression = tabTitleStyle.m;
        tabTitlesLayoutView.setTabColors(intValue, intValue2, intValue3, expression != null ? expression.evaluate(expressionResolver).intValue() : 0);
        DisplayMetrics displayMetrics = tabTitlesLayoutView.getResources().getDisplayMetrics();
        tabTitlesLayoutView.setTabIndicatorCornersRadii(getCornerRadii(tabTitleStyle, displayMetrics, expressionResolver));
        tabTitlesLayoutView.setTabItemSpacing(BaseDivViewExtensionsKt.dpToPx(tabTitleStyle.q.evaluate(expressionResolver), displayMetrics));
        int i = WhenMappings.$EnumSwitchMapping$0[tabTitleStyle.f.evaluate(expressionResolver).ordinal()];
        if (i == 1) {
            animationType = BaseIndicatorTabLayout.AnimationType.SLIDE;
        } else if (i == 2) {
            animationType = BaseIndicatorTabLayout.AnimationType.FADE;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            animationType = BaseIndicatorTabLayout.AnimationType.NONE;
        }
        tabTitlesLayoutView.setAnimationType(animationType);
        tabTitlesLayoutView.setAnimationDuration(tabTitleStyle.e.evaluate(expressionResolver).longValue());
        tabTitlesLayoutView.setTabTitleStyle(tabTitleStyle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$2(DivTabsBinder divTabsBinder, BindingContext bindingContext) {
        divTabsBinder.div2Logger.logTabTitlesScroll(bindingContext.getDivView());
    }

    private final void bindAdapter(final DivStatePath divStatePath, final BindingContext bindingContext, DivTabsLayout divTabsLayout, DivTabs divTabs, final DivTabs divTabs2, final DivBinder divBinder, ExpressionSubscriber expressionSubscriber) {
        DivTabsAdapter tryReuse;
        int i;
        final DivTabsBinder divTabsBinder;
        final DivTabsLayout divTabsLayout2;
        Long l;
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        List<DivTabs.a> list = divTabs2.q;
        Expression<Long> expression = divTabs2.y;
        List<DivTabs.a> list2 = list;
        final ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new DivSimpleTab((DivTabs.a) it.next(), divTabsLayout.getResources().getDisplayMetrics(), expressionResolver));
        }
        tryReuse = DivTabsBinderKt.tryReuse(divTabsLayout.getDivTabsAdapter(), divTabs2, expressionResolver);
        if (tryReuse != null) {
            tryReuse.setBindingContext(bindingContext);
            tryReuse.setStatePath(divStatePath);
            tryReuse.getDivTabsEventManager().setDiv(divTabs2);
            tryReuse.getActiveStateTracker().setDiv(divTabs2);
            if (divTabs == divTabs2) {
                tryReuse.notifyStateChanged();
            } else {
                tryReuse.setData(new mj1(arrayList, 17), expressionResolver, expressionSubscriber);
            }
            divTabsBinder = this;
            divTabsLayout2 = divTabsLayout;
        } else {
            long longValue = expression.evaluate(expressionResolver).longValue();
            long j = longValue >> 31;
            if (j == 0 || j == -1) {
                i = (int) longValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    mq.a(longValue, "Unable convert '", "' to Int");
                }
                i = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            int i2 = i;
            divTabsBinder = this;
            bindAdapter$setupNewAdapter(divTabsBinder, bindingContext, divTabs2, divTabsLayout, divBinder, divStatePath, arrayList, i2);
            divTabsLayout2 = divTabsLayout;
        }
        DivTabsBinderKt.observeFixedHeightChange(divTabs2.q, expressionResolver, expressionSubscriber, new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$bindAdapter$2
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Object obj) {
                invoke2(obj);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                DivTabsAdapter divTabsAdapter = DivTabsLayout.this.getDivTabsAdapter();
                if (divTabsAdapter != null) {
                    divTabsAdapter.notifyStateChanged();
                }
            }
        });
        izs<Long, s3q0> izsVar = new izs<Long, s3q0>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$bindAdapter$selectTab$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Long l2) {
                invoke(l2.longValue());
                return s3q0.a;
            }

            public final void invoke(long j2) {
                PagerController pager;
                int i3;
                DivTabsBinder.this.oldDivSelectedTab = Long.valueOf(j2);
                DivTabsAdapter divTabsAdapter = divTabsLayout2.getDivTabsAdapter();
                if (divTabsAdapter == null || (pager = divTabsAdapter.getPager()) == null) {
                    return;
                }
                long j3 = j2 >> 31;
                if (j3 == 0 || j3 == -1) {
                    i3 = (int) j2;
                } else {
                    KAssert kAssert2 = KAssert.INSTANCE;
                    if (Assert.isEnabled()) {
                        mq.a(j2, "Unable convert '", "' to Int");
                    }
                    i3 = j2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                if (pager.getCurrentItemIndex() != i3) {
                    pager.smoothScrollTo(i3);
                }
            }
        };
        expressionSubscriber.addSubscription(divTabs2.j.observe(expressionResolver, new izs<Boolean, s3q0>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$bindAdapter$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return s3q0.a;
            }

            public final void invoke(boolean z) {
                int i3;
                PagerController pager;
                DivTabsAdapter divTabsAdapter = DivTabsLayout.this.getDivTabsAdapter();
                if (divTabsAdapter == null || divTabsAdapter.isDynamicHeight() != z) {
                    DivTabsBinder divTabsBinder2 = this;
                    BindingContext bindingContext2 = bindingContext;
                    DivTabs divTabs3 = divTabs2;
                    DivTabsLayout divTabsLayout3 = DivTabsLayout.this;
                    DivBinder divBinder2 = divBinder;
                    DivStatePath divStatePath2 = divStatePath;
                    List<DivSimpleTab> list3 = arrayList;
                    DivTabsAdapter divTabsAdapter2 = divTabsLayout3.getDivTabsAdapter();
                    if (divTabsAdapter2 == null || (pager = divTabsAdapter2.getPager()) == null) {
                        long longValue2 = divTabs2.y.evaluate(expressionResolver).longValue();
                        long j2 = longValue2 >> 31;
                        if (j2 == 0 || j2 == -1) {
                            i3 = (int) longValue2;
                        } else {
                            KAssert kAssert2 = KAssert.INSTANCE;
                            if (Assert.isEnabled()) {
                                mq.a(longValue2, "Unable convert '", "' to Int");
                            }
                            i3 = longValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                        }
                    } else {
                        i3 = pager.getCurrentItemIndex();
                    }
                    DivTabsBinder.bindAdapter$setupNewAdapter(divTabsBinder2, bindingContext2, divTabs3, divTabsLayout3, divBinder2, divStatePath2, list3, i3);
                }
            }
        }));
        expressionSubscriber.addSubscription(expression.observe(expressionResolver, izsVar));
        Div2View divView = bindingContext.getDivView();
        boolean z = epx.f(divView.getPrevDataTag(), DivDataTag.INVALID) || epx.f(divView.getDataTag(), divView.getPrevDataTag());
        long longValue2 = expression.evaluate(expressionResolver).longValue();
        if (!z || (l = this.oldDivSelectedTab) == null || l.longValue() != longValue2) {
            izsVar.invoke(Long.valueOf(longValue2));
        }
        expressionSubscriber.addSubscription(divTabs2.B.observeAndGet(expressionResolver, new izs<Boolean, s3q0>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$bindAdapter$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return s3q0.a;
            }

            public final void invoke(boolean z2) {
                Set<Integer> disabledScrollPages;
                DivTabsAdapter divTabsAdapter = DivTabsLayout.this.getDivTabsAdapter();
                if (divTabsAdapter != null) {
                    disabledScrollPages = this.getDisabledScrollPages(divTabs2.q.size() - 1, z2);
                    divTabsAdapter.setDisabledScrollPages(disabledScrollPages);
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindAdapter$setupNewAdapter(DivTabsBinder divTabsBinder, BindingContext bindingContext, DivTabs divTabs, DivTabsLayout divTabsLayout, DivBinder divBinder, DivStatePath divStatePath, List<DivSimpleTab> list, int i) {
        DivTabsAdapter createAdapter = divTabsBinder.createAdapter(bindingContext, divTabs, divTabsLayout, divBinder, divStatePath);
        createAdapter.setData(new e05(list, 20), i);
        divTabsLayout.setDivTabsAdapter(createAdapter);
    }

    private final DivTabsAdapter createAdapter(BindingContext bindingContext, DivTabs divTabs, DivTabsLayout divTabsLayout, DivBinder divBinder, DivStatePath divStatePath) {
        final DivTabsEventManager divTabsEventManager = new DivTabsEventManager(bindingContext, this.actionBinder, this.div2Logger, this.visibilityActionTracker, divTabsLayout, divTabs);
        boolean booleanValue = divTabs.j.evaluate(bindingContext.getExpressionResolver()).booleanValue();
        HeightCalculatorFactory urVar = booleanValue ? new ur(16) : new vr(13);
        int currentItem = divTabsLayout.getViewPager().getCurrentItem();
        final int currentItem2 = divTabsLayout.getViewPager().getCurrentItem();
        if (currentItem2 == currentItem) {
            UiThreadHandler.INSTANCE.postOnMainThread(new gzs<s3q0>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$createAdapter$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // xsna.gzs
                public /* bridge */ /* synthetic */ s3q0 invoke() {
                    invoke2();
                    return s3q0.a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    DivTabsEventManager.this.onPageDisplayed(currentItem2);
                }
            });
        }
        return new DivTabsAdapter(this.viewPool, divTabsLayout, getTabbedCardLayoutIds(), urVar, booleanValue, bindingContext, this.textStyleProvider, this.viewCreator, divBinder, divTabsEventManager, new DivTabsActiveStateTracker(bindingContext, divStatePath, this.div2Logger, this.tabsStateCache, this.runtimeVisitor, divTabs), divStatePath, this.divPatchCache);
    }

    private final float[] getCornerRadii(DivTabs.TabTitleStyle tabTitleStyle, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        Expression<Long> expression;
        Expression<Long> expression2;
        Expression<Long> expression3;
        Expression<Long> expression4;
        Expression<Long> expression5 = tabTitleStyle.g;
        y2 y2Var = tabTitleStyle.h;
        float cornerRadii$toCornerRadii = expression5 != null ? getCornerRadii$toCornerRadii(expression5, expressionResolver, displayMetrics) : y2Var == null ? -1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float cornerRadii$toCornerRadii2 = (y2Var == null || (expression4 = y2Var.c) == null) ? cornerRadii$toCornerRadii : getCornerRadii$toCornerRadii(expression4, expressionResolver, displayMetrics);
        float cornerRadii$toCornerRadii3 = (y2Var == null || (expression3 = y2Var.d) == null) ? cornerRadii$toCornerRadii : getCornerRadii$toCornerRadii(expression3, expressionResolver, displayMetrics);
        float cornerRadii$toCornerRadii4 = (y2Var == null || (expression2 = y2Var.a) == null) ? cornerRadii$toCornerRadii : getCornerRadii$toCornerRadii(expression2, expressionResolver, displayMetrics);
        if (y2Var != null && (expression = y2Var.b) != null) {
            cornerRadii$toCornerRadii = getCornerRadii$toCornerRadii(expression, expressionResolver, displayMetrics);
        }
        return new float[]{cornerRadii$toCornerRadii2, cornerRadii$toCornerRadii2, cornerRadii$toCornerRadii3, cornerRadii$toCornerRadii3, cornerRadii$toCornerRadii, cornerRadii$toCornerRadii, cornerRadii$toCornerRadii4, cornerRadii$toCornerRadii4};
    }

    private static final float getCornerRadii$toCornerRadii(Expression<Long> expression, ExpressionResolver expressionResolver, DisplayMetrics displayMetrics) {
        return BaseDivViewExtensionsKt.dpToPx(expression.evaluate(expressionResolver), displayMetrics);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set<Integer> getDisabledScrollPages(int i, boolean z) {
        return z ? new LinkedHashSet() : j5g.R0(new k9x(0, i, 1));
    }

    private final BaseDivTabbedCardUi.TabbedCardConfig getTabbedCardLayoutIds() {
        return new BaseDivTabbedCardUi.TabbedCardConfig(R$id.base_tabbed_title_container_scroller, R$id.div_tabs_pager_container, R$id.div_tabs_container_helper, true, false, "DIV2.TAB_HEADER_VIEW", "DIV2.TAB_ITEM_VIEW");
    }

    private final void observeDividerStyle(final DivTabsLayout divTabsLayout, final ExpressionResolver expressionResolver, final DivTabs.b bVar, final BindingContext bindingContext) {
        if (bVar == null) {
            return;
        }
        q4 q4Var = bVar.a;
        q4 q4Var2 = bVar.c;
        applyDelimiterStyle(divTabsLayout.getTitleLayout(), expressionResolver, bVar, bindingContext);
        izs<? super Long, s3q0> izsVar = new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$observeDividerStyle$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Object obj) {
                invoke2(obj);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                DivTabsBinder.this.applyDelimiterStyle(divTabsLayout.getTitleLayout(), expressionResolver, bVar, bindingContext);
            }
        };
        q4Var2.b.observe(expressionResolver, izsVar);
        q4Var2.a.observe(expressionResolver, izsVar);
        q4Var.b.observe(expressionResolver, izsVar);
        q4Var.a.observe(expressionResolver, izsVar);
        bVar.b.observe(expressionResolver, izsVar);
    }

    private final void observeHeight(final TabTitlesLayoutView<?> tabTitlesLayoutView, final DivTabs divTabs, final ExpressionResolver expressionResolver) {
        y3 y3Var;
        Expression<Long> expression;
        y3 y3Var2;
        Expression<Long> expression2;
        Expression<Long> expression3;
        Expression<Long> expression4;
        izs<? super Long, s3q0> izsVar = new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$observeHeight$applyHeight$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Object obj) {
                invoke2(obj);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                DivTabs.TabTitleStyle tabTitleStyle = DivTabs.this.D;
                if (tabTitleStyle == null) {
                    tabTitleStyle = DivTabsBinder.DEFAULT_TAB_TITLE_STYLE;
                }
                y3 y3Var3 = tabTitleStyle.t;
                y3 y3Var4 = DivTabs.this.E;
                Expression<Long> expression5 = tabTitleStyle.s;
                long longValue = y3Var4.a.evaluate(expressionResolver).longValue() + y3Var4.f.evaluate(expressionResolver).longValue() + y3Var3.a.evaluate(expressionResolver).longValue() + y3Var3.f.evaluate(expressionResolver).longValue() + (expression5 != null ? expression5.evaluate(expressionResolver).longValue() : (long) (tabTitleStyle.j.evaluate(expressionResolver).floatValue() * 1.3f));
                tabTitlesLayoutView.getLayoutParams().height = BaseDivViewExtensionsKt.spToPx(Long.valueOf(longValue), tabTitlesLayoutView.getResources().getDisplayMetrics());
            }
        };
        Disposable disposable = null;
        izsVar.invoke(null);
        ExpressionSubscriber expressionSubscriber = ReleasablesKt.getExpressionSubscriber(tabTitlesLayoutView);
        DivTabs.TabTitleStyle tabTitleStyle = divTabs.D;
        y3 y3Var3 = divTabs.E;
        DivTabs.TabTitleStyle tabTitleStyle2 = divTabs.D;
        expressionSubscriber.addSubscription((tabTitleStyle == null || (expression4 = tabTitleStyle.s) == null) ? null : expression4.observe(expressionResolver, izsVar));
        expressionSubscriber.addSubscription((tabTitleStyle2 == null || (expression3 = tabTitleStyle2.j) == null) ? null : expression3.observe(expressionResolver, izsVar));
        expressionSubscriber.addSubscription((tabTitleStyle2 == null || (y3Var2 = tabTitleStyle2.t) == null || (expression2 = y3Var2.f) == null) ? null : expression2.observe(expressionResolver, izsVar));
        if (tabTitleStyle2 != null && (y3Var = tabTitleStyle2.t) != null && (expression = y3Var.a) != null) {
            disposable = expression.observe(expressionResolver, izsVar);
        }
        expressionSubscriber.addSubscription(disposable);
        expressionSubscriber.addSubscription(y3Var3.f.observe(expressionResolver, izsVar));
        expressionSubscriber.addSubscription(y3Var3.a.observe(expressionResolver, izsVar));
    }

    private final void observeStyle(final DivTabsLayout divTabsLayout, final ExpressionResolver expressionResolver, final DivTabs.TabTitleStyle tabTitleStyle) {
        Expression<Long> expression;
        Expression<DivTabs.TabTitleStyle.AnimationType> expression2;
        Expression<Long> expression3;
        y2 y2Var;
        Expression<Long> expression4;
        y2 y2Var2;
        Expression<Long> expression5;
        y2 y2Var3;
        Expression<Long> expression6;
        y2 y2Var4;
        Expression<Long> expression7;
        Expression<Long> expression8;
        Expression<Integer> expression9;
        Expression<Integer> expression10;
        Expression<Integer> expression11;
        Expression<Integer> expression12;
        applyStyle(divTabsLayout.getTitleLayout(), expressionResolver, tabTitleStyle == null ? DEFAULT_TAB_TITLE_STYLE : tabTitleStyle);
        izs<? super Long, s3q0> izsVar = new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$observeStyle$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Object obj) {
                invoke2(obj);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                DivTabsBinder divTabsBinder = DivTabsBinder.this;
                TabTitlesLayoutView<?> titleLayout = divTabsLayout.getTitleLayout();
                ExpressionResolver expressionResolver2 = expressionResolver;
                DivTabs.TabTitleStyle tabTitleStyle2 = tabTitleStyle;
                if (tabTitleStyle2 == null) {
                    tabTitleStyle2 = DivTabsBinder.DEFAULT_TAB_TITLE_STYLE;
                }
                divTabsBinder.applyStyle(titleLayout, expressionResolver2, tabTitleStyle2);
            }
        };
        if (tabTitleStyle != null && (expression12 = tabTitleStyle.d) != null) {
            expression12.observe(expressionResolver, izsVar);
        }
        if (tabTitleStyle != null && (expression11 = tabTitleStyle.a) != null) {
            expression11.observe(expressionResolver, izsVar);
        }
        if (tabTitleStyle != null && (expression10 = tabTitleStyle.p) != null) {
            expression10.observe(expressionResolver, izsVar);
        }
        if (tabTitleStyle != null && (expression9 = tabTitleStyle.m) != null) {
            expression9.observe(expressionResolver, izsVar);
        }
        if (tabTitleStyle != null && (expression8 = tabTitleStyle.g) != null) {
            expression8.observe(expressionResolver, izsVar);
        }
        if (tabTitleStyle != null && (y2Var4 = tabTitleStyle.h) != null && (expression7 = y2Var4.c) != null) {
            expression7.observe(expressionResolver, izsVar);
        }
        if (tabTitleStyle != null && (y2Var3 = tabTitleStyle.h) != null && (expression6 = y2Var3.d) != null) {
            expression6.observe(expressionResolver, izsVar);
        }
        if (tabTitleStyle != null && (y2Var2 = tabTitleStyle.h) != null && (expression5 = y2Var2.b) != null) {
            expression5.observe(expressionResolver, izsVar);
        }
        if (tabTitleStyle != null && (y2Var = tabTitleStyle.h) != null && (expression4 = y2Var.a) != null) {
            expression4.observe(expressionResolver, izsVar);
        }
        if (tabTitleStyle != null && (expression3 = tabTitleStyle.q) != null) {
            expression3.observe(expressionResolver, izsVar);
        }
        if (tabTitleStyle != null && (expression2 = tabTitleStyle.f) != null) {
            expression2.observe(expressionResolver, izsVar);
        }
        if (tabTitleStyle == null || (expression = tabTitleStyle.e) == null) {
            return;
        }
        expression.observe(expressionResolver, izsVar);
    }

    public void bindView(BindingContext bindingContext, DivTabsLayout divTabsLayout, a.o oVar, DivStatePath divStatePath) {
        a.o applyPatch;
        a.o div = divTabsLayout.getDiv();
        if (div == oVar) {
            DivTabsAdapter divTabsAdapter = divTabsLayout.getDivTabsAdapter();
            if (divTabsAdapter != null && (applyPatch = divTabsAdapter.applyPatch(bindingContext.getExpressionResolver(), oVar)) != null) {
                divTabsLayout.setDiv(applyPatch);
                return;
            }
        } else {
            this.baseBinder.bindView(bindingContext, divTabsLayout, oVar, div);
            bind(divTabsLayout, bindingContext, oVar.c, div != null ? div.c : null);
        }
        bindAdapter(divStatePath, bindingContext, divTabsLayout, div != null ? div.c : null, oVar.c, this.divBinder.get(), divTabsLayout);
    }

    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(final DivTabsLayout divTabsLayout, BindingContext bindingContext, final DivTabs divTabs, DivTabs divTabs2) {
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        divTabsLayout.setClipToPadding(false);
        izs<? super Long, s3q0> izsVar = new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$bind$applyPaddings$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Object obj) {
                invoke2(obj);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                BaseDivViewExtensionsKt.applyPaddings(DivTabsLayout.this.getTitleLayout(), divTabs.E, expressionResolver);
            }
        };
        izsVar.invoke(null);
        divTabsLayout.addSubscription(divTabs.E.c.observe(expressionResolver, izsVar));
        y3 y3Var = divTabs.E;
        divTabsLayout.addSubscription(y3Var.d.observe(expressionResolver, izsVar));
        divTabsLayout.addSubscription(y3Var.f.observe(expressionResolver, izsVar));
        divTabsLayout.addSubscription(y3Var.a.observe(expressionResolver, izsVar));
        observeHeight(divTabsLayout.getTitleLayout(), divTabs, expressionResolver);
        observeStyle(divTabsLayout, expressionResolver, divTabs.D);
        observeDividerStyle(divTabsLayout, expressionResolver, divTabs.C, bindingContext);
        divTabsLayout.getPagerLayout().setClipToPadding(false);
        DivTabsBinderKt.observe(divTabs.A, expressionResolver, divTabsLayout, new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$bind$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Object obj) {
                invoke2(obj);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                BaseDivViewExtensionsKt.applyMargins(DivTabsLayout.this.getDivider(), divTabs.A, expressionResolver);
            }
        });
        divTabsLayout.addSubscription(divTabs.z.observeAndGet(expressionResolver, new izs<Integer, s3q0>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$bind$2
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Integer num) {
                invoke(num.intValue());
                return s3q0.a;
            }

            public final void invoke(int i) {
                DivTabsLayout.this.getDivider().setBackgroundColor(i);
            }
        }));
        divTabsLayout.addSubscription(divTabs.n.observeAndGet(expressionResolver, new izs<Boolean, s3q0>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$bind$3
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return s3q0.a;
            }

            public final void invoke(boolean z) {
                DivTabsLayout.this.getDivider().setVisibility(z ? 0 : 8);
            }
        }));
        divTabsLayout.getTitleLayout().setOnScrollChangedListener(new vpn(this, bindingContext));
        divTabsLayout.getTitleLayout().setFocusTracker(bindingContext.getDivView().getInputFocusTracker$div_release());
        divTabsLayout.addSubscription(divTabs.u.observeAndGet(expressionResolver, new izs<Boolean, s3q0>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$bind$5
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return s3q0.a;
            }

            public final void invoke(boolean z) {
                DivTabsLayout.this.getViewPager().setOnInterceptTouchEventListener(z ? ParentScrollRestrictor.INSTANCE : null);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List bindAdapter$lambda$5(List list) {
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List bindAdapter$setupNewAdapter$lambda$4(List list) {
        return list;
    }
}
