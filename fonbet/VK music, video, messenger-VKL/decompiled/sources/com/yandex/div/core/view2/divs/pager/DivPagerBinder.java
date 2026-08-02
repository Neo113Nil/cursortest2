package com.yandex.div.core.view2.divs.pager;

import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.downloader.DivPatchCache;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.DivViewState;
import com.yandex.div.core.state.PagerState;
import com.yandex.div.core.state.UpdateStateChangePageCallback;
import com.yandex.div.core.util.AccessibilityStateProvider;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.divs.DivBaseBinder;
import com.yandex.div.core.view2.divs.ReleasingViewPool;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.core.view2.divs.widgets.ParentScrollRestrictor;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivPager;
import com.yandex.div2.a;
import com.yandex.div2.o2;
import com.yandex.div2.q4;
import com.yandex.div2.y3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.e9e0;
import xsna.ie40;
import xsna.izs;
import xsna.mq;
import xsna.s3q0;
import xsna.unn;

/* compiled from: DivPagerBinder.kt */
/* loaded from: classes7.dex */
public final class DivPagerBinder extends DivViewBinder<a.i, DivPager, DivPagerView> {
    private final AccessibilityStateProvider accessibilityStateProvider;
    private final DivBaseBinder baseBinder;
    private final DivActionBinder divActionBinder;
    private final e9e0<DivBinder> divBinder;
    private final DivPatchCache divPatchCache;
    private final PagerIndicatorConnector pagerIndicatorConnector;
    private final DivViewCreator viewCreator;

    public DivPagerBinder(DivBaseBinder divBaseBinder, DivViewCreator divViewCreator, e9e0<DivBinder> e9e0Var, DivPatchCache divPatchCache, DivActionBinder divActionBinder, PagerIndicatorConnector pagerIndicatorConnector, AccessibilityStateProvider accessibilityStateProvider) {
        super(divBaseBinder);
        this.baseBinder = divBaseBinder;
        this.viewCreator = divViewCreator;
        this.divBinder = e9e0Var;
        this.divPatchCache = divPatchCache;
        this.divActionBinder = divActionBinder;
        this.pagerIndicatorConnector = pagerIndicatorConnector;
        this.accessibilityStateProvider = accessibilityStateProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyDecorations(DivPagerView divPagerView, DivPager divPager, ExpressionResolver expressionResolver, SparseArray<Float> sparseArray, DivPagerAdapter divPagerAdapter) {
        DivPagerPaddingsHolder divPagerPaddingsHolder;
        int i;
        DivPagerPageSizeProvider wrapContentPageSizeProvider;
        boolean z;
        DivPager.ItemAlignment itemAlignment;
        DivPagerPageSizeProvider divPagerPageSizeProvider;
        int i2;
        RecyclerView.n wrapContentPageSizeItemDecoration;
        RecyclerView recyclerView = divPagerView.getRecyclerView();
        if (recyclerView == null) {
            return;
        }
        boolean isHorizontal = isHorizontal(divPager, expressionResolver);
        divPagerView.setOrientation(!isHorizontal ? 1 : 0);
        divPagerAdapter.setCrossAxisAlignment(divPager.i.evaluate(expressionResolver));
        if (ViewsKt.isActuallyLaidOut(divPagerView)) {
            DisplayMetrics displayMetrics = divPagerView.getResources().getDisplayMetrics();
            ViewPager2 viewPager = divPagerView.getViewPager();
            int width = isHorizontal ? viewPager.getWidth() : viewPager.getHeight();
            float pxF = BaseDivViewExtensionsKt.toPxF(divPager.s, displayMetrics, expressionResolver);
            boolean booleanValue = divPager.q.evaluate(expressionResolver).booleanValue();
            DivPager.ItemAlignment evaluate = divPager.D.evaluate(expressionResolver);
            DivPagerPaddingsHolder divPagerPaddingsHolder2 = new DivPagerPaddingsHolder(divPager.y, expressionResolver, divPagerView, displayMetrics, isHorizontal, evaluate);
            unn unnVar = divPager.u;
            if (unnVar instanceof unn.c) {
                PercentagePageSizeProvider percentagePageSizeProvider = new PercentagePageSizeProvider(((unn.c) unnVar).b, expressionResolver, width, divPagerPaddingsHolder2, evaluate);
                divPagerPaddingsHolder = divPagerPaddingsHolder2;
                itemAlignment = evaluate;
                z = isHorizontal ? 1 : 0;
                divPagerPageSizeProvider = percentagePageSizeProvider;
                i = width;
            } else {
                divPagerPaddingsHolder = divPagerPaddingsHolder2;
                i = width;
                if (unnVar instanceof unn.a) {
                    wrapContentPageSizeProvider = new NeighbourPageSizeProvider(((unn.a) unnVar).b, expressionResolver, displayMetrics, i, pxF, divPagerPaddingsHolder, evaluate);
                    itemAlignment = evaluate;
                    z = isHorizontal ? 1 : 0;
                } else {
                    if (!(unnVar instanceof unn.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    wrapContentPageSizeProvider = new WrapContentPageSizeProvider(recyclerView, isHorizontal, i, divPagerPaddingsHolder, evaluate);
                    z = isHorizontal ? 1 : 0;
                    itemAlignment = evaluate;
                    i = i;
                }
                divPagerPageSizeProvider = wrapContentPageSizeProvider;
            }
            if (divPagerPageSizeProvider instanceof FixedPageSizeProvider) {
                int i3 = i;
                FixedPageSizeProvider fixedPageSizeProvider = (FixedPageSizeProvider) divPagerPageSizeProvider;
                new FixedPageSizeOffScreenPagesController(divPagerView, i3, pxF, fixedPageSizeProvider, divPagerPaddingsHolder, booleanValue, divPagerAdapter);
                i2 = i3;
                wrapContentPageSizeItemDecoration = new FixedPageSizeItemDecoration(divPagerPaddingsHolder, fixedPageSizeProvider);
            } else {
                i2 = i;
                new WrapContentPageSizeOffScreenPagesController(divPagerView, pxF, divPagerPageSizeProvider, divPagerPaddingsHolder, divPagerAdapter);
                wrapContentPageSizeItemDecoration = new WrapContentPageSizeItemDecoration(i2, divPagerPaddingsHolder, itemAlignment);
            }
            setItemDecoration(divPagerView.getViewPager(), wrapContentPageSizeItemDecoration);
            DivPager.ItemAlignment itemAlignment2 = itemAlignment;
            int i4 = i2;
            divPagerView.setPageTransformer$div_release(new DivPagerPageTransformer(recyclerView, expressionResolver, sparseArray, i4, divPager.z, new DivPagerPageOffsetProvider(i4, pxF, divPagerPageSizeProvider, divPagerPaddingsHolder, booleanValue, divPagerAdapter, itemAlignment2), z));
        }
    }

    private final void bind(final DivPagerView divPagerView, BindingContext bindingContext, final DivPager divPager, DivStatePath divStatePath) {
        int i;
        int position;
        Expression<Long> expression;
        Expression<Long> expression2;
        Expression<Long> expression3;
        Expression<Long> expression4;
        RecyclerView recyclerView = divPagerView.getRecyclerView();
        if (recyclerView == null) {
            return;
        }
        Div2View divView = bindingContext.getDivView();
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        final SparseArray sparseArray = new SparseArray();
        boolean isAccessibilityEnabled = this.accessibilityStateProvider.isAccessibilityEnabled(divPagerView.getContext());
        divPagerView.setRecycledViewPool(new ReleasingViewPool(divView.getReleaseViewVisitor$div_release()));
        final DivPagerAdapter divPagerAdapter = new DivPagerAdapter(DivCollectionExtensionsKt.buildItems(divPager, expressionResolver), bindingContext, this.divBinder.get(), sparseArray, this.viewCreator, divStatePath, divPagerView);
        divPagerView.getViewPager().setAdapter(divPagerAdapter);
        bindInfiniteScroll(divPagerView, divPager, expressionResolver);
        DivPagerView.OnItemsUpdatedCallback pagerOnItemsCountChange$div_release = divPagerView.getPagerOnItemsCountChange$div_release();
        if (pagerOnItemsCountChange$div_release != null) {
            ((ie40) pagerOnItemsCountChange$div_release).b();
        }
        divPagerView.setClipToPage$div_release(divView.getDiv2Component$div_release().isPagerPageClipEnabled());
        divPagerView.setOrientation(!isHorizontal(divPager, expressionResolver) ? 1 : 0);
        Expression<DivPager.ItemAlignment> expression5 = divPager.i;
        q4 q4Var = divPager.s;
        y3 y3Var = divPager.y;
        divPagerAdapter.setCrossAxisAlignment(expression5.evaluate(expressionResolver));
        izs<? super Long, s3q0> izsVar = new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerBinder$bind$reusableObserver$1
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
                DivPagerBinder.this.applyDecorations(divPagerView, divPager, expressionResolver, sparseArray, divPagerAdapter);
            }
        };
        divPagerView.addSubscription((y3Var == null || (expression4 = y3Var.c) == null) ? null : expression4.observe(expressionResolver, izsVar));
        divPagerView.addSubscription((y3Var == null || (expression3 = y3Var.d) == null) ? null : expression3.observe(expressionResolver, izsVar));
        divPagerView.addSubscription((y3Var == null || (expression2 = y3Var.f) == null) ? null : expression2.observe(expressionResolver, izsVar));
        divPagerView.addSubscription((y3Var == null || (expression = y3Var.a) == null) ? null : expression.observe(expressionResolver, izsVar));
        divPagerView.addSubscription(q4Var.b.observe(expressionResolver, izsVar));
        divPagerView.addSubscription(q4Var.a.observe(expressionResolver, izsVar));
        divPagerView.addSubscription(divPager.D.observe(expressionResolver, izsVar));
        divPagerView.addSubscription(divPager.i.observe(expressionResolver, izsVar));
        divPagerView.addSubscription(divPager.x.observe(expressionResolver, izsVar));
        divPagerView.addSubscription(observeSizeChange(divPagerView.getViewPager(), divPager, izsVar));
        unn unnVar = divPager.u;
        if (unnVar instanceof unn.a) {
            unn.a aVar = (unn.a) unnVar;
            divPagerView.addSubscription(aVar.b.a.b.observe(expressionResolver, izsVar));
            divPagerView.addSubscription(aVar.b.a.a.observe(expressionResolver, izsVar));
        } else if (unnVar instanceof unn.c) {
            divPagerView.addSubscription(((unn.c) unnVar).b.a.a.observe(expressionResolver, izsVar));
        }
        divPagerView.setPagerSelectedActionsDispatcher$div_release(new PagerSelectedActionsDispatcher(divView, divPagerAdapter.getItemsToShow(), this.divActionBinder));
        divPagerView.setChangePageCallbackForLogger$div_release(new DivPagerPageChangeCallback(divPager, divPagerAdapter.getItemsToShow(), bindingContext, recyclerView, divPagerView));
        DivViewState currentState = divView.getCurrentState();
        if (currentState != null) {
            String str = divPager.p;
            if (str == null) {
                str = String.valueOf(divPager.hashCode());
            }
            DivViewState.BlockState blockState = currentState.getBlockState(str);
            PagerState pagerState = blockState instanceof PagerState ? (PagerState) blockState : null;
            divPagerView.setChangePageCallbackForState$div_release(new UpdateStateChangePageCallback(str, currentState));
            if (pagerState != null) {
                int currentPageIndex = pagerState.getCurrentPageIndex();
                Integer valueOf = currentPageIndex < divPagerAdapter.getRealPosition(divPagerAdapter.getItemsToShow().size()) ? Integer.valueOf(currentPageIndex) : null;
                if (valueOf != null) {
                    position = valueOf.intValue();
                    divPagerView.setCurrentItem$div_release(position);
                }
            }
            long longValue = divPager.j.evaluate(expressionResolver).longValue();
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
            position = divPagerAdapter.getPosition(i);
            divPagerView.setCurrentItem$div_release(position);
        }
        divPagerView.addSubscription(divPager.A.observeAndGet(expressionResolver, new izs<Boolean, s3q0>() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerBinder$bind$2
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return s3q0.a;
            }

            public final void invoke(boolean z) {
                DivPagerView.this.setOnInterceptTouchEventListener(z ? ParentScrollRestrictor.INSTANCE : null);
            }
        }));
        bindItemBuilder(divPagerView, bindingContext, divPager);
        if (isAccessibilityEnabled) {
            divPagerView.enableAccessibility();
        }
    }

    private final void bindInfiniteScroll(final DivPagerView divPagerView, DivPager divPager, ExpressionResolver expressionResolver) {
        final RecyclerView recyclerView = (RecyclerView) divPagerView.getViewPager().getChildAt(0);
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        divPager.q.observeAndGet(expressionResolver, new izs<Boolean, s3q0>() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerBinder$bindInfiniteScroll$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return s3q0.a;
            }

            /* JADX WARN: Type inference failed for: r3v9, types: [T, com.yandex.div.core.view2.divs.pager.DivPagerBinder$createInfiniteScrollListener$1] */
            public final void invoke(boolean z) {
                ?? createInfiniteScrollListener;
                RecyclerView.Adapter adapter = DivPagerView.this.getViewPager().getAdapter();
                DivPagerAdapter divPagerAdapter = adapter instanceof DivPagerAdapter ? (DivPagerAdapter) adapter : null;
                if (divPagerAdapter != null) {
                    divPagerAdapter.setInfiniteScrollEnabled(z);
                }
                if (!z) {
                    RecyclerView.t tVar = ref$ObjectRef.element;
                    if (tVar != null) {
                        recyclerView.removeOnScrollListener(tVar);
                        return;
                    }
                    return;
                }
                RecyclerView.t tVar2 = ref$ObjectRef.element;
                RecyclerView.t tVar3 = tVar2;
                if (tVar2 == null) {
                    createInfiniteScrollListener = this.createInfiniteScrollListener(DivPagerView.this);
                    ref$ObjectRef.element = createInfiniteScrollListener;
                    tVar3 = createInfiniteScrollListener;
                }
                recyclerView.addOnScrollListener(tVar3);
            }
        });
    }

    private final void bindItemBuilder(final DivPagerView divPagerView, final BindingContext bindingContext, DivPager divPager) {
        final o2 o2Var = divPager.r;
        if (o2Var == null) {
            return;
        }
        BaseDivViewExtensionsKt.bindItemBuilder(o2Var, bindingContext.getExpressionResolver(), new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerBinder$bindItemBuilder$1
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
                DivPagerAdapter divPagerAdapter = (DivPagerAdapter) DivPagerView.this.getViewPager().getAdapter();
                if (divPagerAdapter != null) {
                    o2 o2Var2 = o2Var;
                    BindingContext bindingContext2 = bindingContext;
                    final DivPagerView divPagerView2 = DivPagerView.this;
                    divPagerAdapter.setItems(DivCollectionExtensionsKt.build(o2Var2, bindingContext2.getExpressionResolver()));
                    DivPagerView.OnItemsUpdatedCallback pagerOnItemsCountChange$div_release = divPagerView2.getPagerOnItemsCountChange$div_release();
                    if (pagerOnItemsCountChange$div_release != null) {
                        ((ie40) pagerOnItemsCountChange$div_release).b();
                    }
                    RecyclerView recyclerView = divPagerView2.getRecyclerView();
                    if (recyclerView != null) {
                        recyclerView.scrollToPosition(divPagerAdapter.realItemPosition(divPagerView2.getCurrentItem$div_release()));
                    }
                    divPagerView2.getViewPager().addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerBinder$bindItemBuilder$1$invoke$lambda$1$$inlined$doOnNextLayout$1
                        @Override // android.view.View.OnLayoutChangeListener
                        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                            view.removeOnLayoutChangeListener(this);
                            DivPagerView.this.getViewPager().c();
                        }
                    });
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.yandex.div.core.view2.divs.pager.DivPagerBinder$createInfiniteScrollListener$1] */
    public final DivPagerBinder$createInfiniteScrollListener$1 createInfiniteScrollListener(final DivPagerView divPagerView) {
        return new RecyclerView.t() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerBinder$createInfiniteScrollListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                RecyclerView.Adapter adapter = DivPagerView.this.getViewPager().getAdapter();
                int itemCount = adapter != null ? adapter.getItemCount() : 0;
                int v = linearLayoutManager.v();
                int x = linearLayoutManager.x();
                if (v >= itemCount - 2 && i > 0) {
                    recyclerView.scrollToPosition(2);
                } else {
                    if (x > 1 || i >= 0) {
                        return;
                    }
                    recyclerView.scrollToPosition(itemCount - 3);
                }
            }
        };
    }

    private final boolean isHorizontal(DivPager divPager, ExpressionResolver expressionResolver) {
        return divPager.x.evaluate(expressionResolver) == DivPager.Orientation.HORIZONTAL;
    }

    private final Disposable observeSizeChange(ViewPager2 viewPager2, DivPager divPager, izs<Object, s3q0> izsVar) {
        return new DivPagerBinder$observeSizeChange$1(viewPager2, izsVar, divPager);
    }

    private final void removeItemDecorations(ViewPager2 viewPager2) {
        int itemDecorationCount = viewPager2.getItemDecorationCount();
        for (int i = 0; i < itemDecorationCount; i++) {
            viewPager2.k.removeItemDecorationAt(i);
        }
    }

    private final void setItemDecoration(ViewPager2 viewPager2, RecyclerView.n nVar) {
        removeItemDecorations(viewPager2);
        viewPager2.k.addItemDecoration(nVar);
    }

    public void bindView(BindingContext bindingContext, DivPagerView divPagerView, a.i iVar, DivStatePath divStatePath) {
        this.pagerIndicatorConnector.submitPager$div_release(divPagerView, iVar.c);
        a.i div = divPagerView.getDiv();
        if (iVar != div) {
            if (div != null) {
                divPagerView.setChangePageCallbackForOffScreenPages$div_release(null);
                removeItemDecorations(divPagerView.getViewPager());
                divPagerView.setPageTransformer$div_release(null);
            }
            this.baseBinder.bindView(bindingContext, divPagerView, iVar, div);
            bind(divPagerView, bindingContext, iVar.c, divStatePath);
            return;
        }
        final ViewPager2 viewPager = divPagerView.getViewPager();
        RecyclerView.Adapter adapter = viewPager.getAdapter();
        DivPagerAdapter divPagerAdapter = adapter instanceof DivPagerAdapter ? (DivPagerAdapter) adapter : null;
        if (divPagerAdapter == null) {
            return;
        }
        if (!divPagerAdapter.applyPatch(divPagerView.getRecyclerView(), this.divPatchCache, bindingContext)) {
            BaseDivViewExtensionsKt.bindStates(divPagerView, bindingContext, this.divBinder.get());
            viewPager.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerBinder$bindView$$inlined$doOnNextLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    view.removeOnLayoutChangeListener(this);
                    ViewPager2.this.c();
                }
            });
        } else {
            DivPagerView.OnItemsUpdatedCallback pagerOnItemsCountChange$div_release = divPagerView.getPagerOnItemsCountChange$div_release();
            if (pagerOnItemsCountChange$div_release != null) {
                ((ie40) pagerOnItemsCountChange$div_release).b();
            }
        }
    }
}
