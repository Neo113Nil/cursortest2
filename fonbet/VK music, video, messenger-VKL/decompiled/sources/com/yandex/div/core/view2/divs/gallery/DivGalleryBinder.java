package com.yandex.div.core.view2.divs.gallery;

import android.annotation.SuppressLint;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.DivLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.downloader.DivPatchCache;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.DivViewState;
import com.yandex.div.core.state.GalleryState;
import com.yandex.div.core.state.UpdateStateScrollListener;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.DivBaseBinder;
import com.yandex.div.core.view2.divs.ReleasingViewPool;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import com.yandex.div.core.view2.divs.widgets.ParentScrollRestrictor;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.widget.PaddingItemDecoration;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivGallery;
import com.yandex.div2.a;
import com.yandex.div2.o2;
import xsna.e9e0;
import xsna.izs;
import xsna.mq;
import xsna.s3q0;

/* compiled from: DivGalleryBinder.kt */
/* loaded from: classes7.dex */
public final class DivGalleryBinder extends DivViewBinder<a.c, DivGallery, DivRecyclerView> {
    private final DivBaseBinder baseBinder;
    private final e9e0<DivBinder> divBinder;
    private final DivPatchCache divPatchCache;
    private final float recyclerScrollInterceptionAngle;
    private final DivViewCreator viewCreator;

    /* compiled from: DivGalleryBinder.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivGallery.ScrollMode.values().length];
            try {
                iArr[DivGallery.ScrollMode.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivGallery.ScrollMode.PAGING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DivGalleryBinder(DivBaseBinder divBaseBinder, DivViewCreator divViewCreator, e9e0<DivBinder> e9e0Var, DivPatchCache divPatchCache, float f) {
        super(divBaseBinder);
        this.baseBinder = divBaseBinder;
        this.viewCreator = divViewCreator;
        this.divBinder = e9e0Var;
        this.divPatchCache = divPatchCache;
        this.recyclerScrollInterceptionAngle = f;
    }

    private final void bind(final DivRecyclerView divRecyclerView, final BindingContext bindingContext, final DivGallery divGallery, DivStatePath divStatePath) {
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        izs<? super DivGallery.Orientation, s3q0> izsVar = new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.gallery.DivGalleryBinder$bind$reusableObserver$1
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
                DivGalleryBinder.this.updateDecorations(divRecyclerView, bindingContext, divGallery);
            }
        };
        divRecyclerView.addSubscription(divGallery.x.observe(expressionResolver, izsVar));
        divRecyclerView.addSubscription(divGallery.D.observe(expressionResolver, izsVar));
        divRecyclerView.addSubscription(divGallery.C.observe(expressionResolver, izsVar));
        divRecyclerView.addSubscription(divGallery.t.observe(expressionResolver, izsVar));
        divRecyclerView.addSubscription(divGallery.z.observe(expressionResolver, izsVar));
        Expression<Long> expression = divGallery.h;
        if (expression != null) {
            divRecyclerView.addSubscription(expression.observe(expressionResolver, izsVar));
        }
        divRecyclerView.setRecycledViewPool(new ReleasingViewPool(bindingContext.getDivView().getReleaseViewVisitor$div_release()));
        divRecyclerView.setScrollingTouchSlop(1);
        divRecyclerView.setClipToPadding(false);
        divRecyclerView.setOverScrollMode(2);
        divRecyclerView.setAdapter(new DivGalleryAdapter(DivCollectionExtensionsKt.buildItems(divGallery, expressionResolver), bindingContext, this.divBinder.get(), this.viewCreator, divStatePath));
        bindItemBuilder(divRecyclerView, bindingContext, divGallery);
        resetAnimatorAndRestoreOnLayout(divRecyclerView);
        updateDecorations(divRecyclerView, bindingContext, divGallery);
    }

    private final void bindItemBuilder(final DivRecyclerView divRecyclerView, final BindingContext bindingContext, DivGallery divGallery) {
        final o2 o2Var = divGallery.s;
        if (o2Var == null) {
            return;
        }
        BaseDivViewExtensionsKt.bindItemBuilder(o2Var, bindingContext.getExpressionResolver(), new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.gallery.DivGalleryBinder$bindItemBuilder$1
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
                DivGalleryAdapter divGalleryAdapter = (DivGalleryAdapter) DivRecyclerView.this.getAdapter();
                if (divGalleryAdapter != null) {
                    divGalleryAdapter.setItems(DivCollectionExtensionsKt.build(o2Var, bindingContext.getExpressionResolver()));
                }
            }
        });
    }

    private final void removeItemDecorations(DivRecyclerView divRecyclerView) {
        int itemDecorationCount = divRecyclerView.getItemDecorationCount();
        while (true) {
            itemDecorationCount--;
            if (-1 >= itemDecorationCount) {
                return;
            } else {
                divRecyclerView.removeItemDecorationAt(itemDecorationCount);
            }
        }
    }

    private final void resetAnimatorAndRestoreOnLayout(final DivRecyclerView divRecyclerView) {
        final RecyclerView.l itemAnimator = divRecyclerView.getItemAnimator();
        divRecyclerView.setItemAnimator(null);
        if (!ViewsKt.isActuallyLaidOut(divRecyclerView) || divRecyclerView.isLayoutRequested()) {
            divRecyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.gallery.DivGalleryBinder$resetAnimatorAndRestoreOnLayout$$inlined$doOnActualLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    view.removeOnLayoutChangeListener(this);
                    if (DivRecyclerView.this.getItemAnimator() == null) {
                        DivRecyclerView.this.setItemAnimator(itemAnimator);
                    }
                }
            });
        } else if (divRecyclerView.getItemAnimator() == null) {
            divRecyclerView.setItemAnimator(itemAnimator);
        }
    }

    private final void scrollToPositionInternal(DivRecyclerView divRecyclerView, int i, int i2, ScrollPosition scrollPosition) {
        Object layoutManager = divRecyclerView.getLayoutManager();
        DivGalleryItemHelper divGalleryItemHelper = layoutManager instanceof DivGalleryItemHelper ? (DivGalleryItemHelper) layoutManager : null;
        if (divGalleryItemHelper == null) {
            return;
        }
        if (i2 == 0 && i == 0) {
            divGalleryItemHelper.instantScrollToPosition(i, scrollPosition);
        } else {
            divGalleryItemHelper.instantScrollToPositionWithOffset(i, i2, scrollPosition);
        }
    }

    private final void setItemDecoration(DivRecyclerView divRecyclerView, RecyclerView.n nVar) {
        removeItemDecorations(divRecyclerView);
        divRecyclerView.addItemDecoration(nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateDecorations(DivRecyclerView divRecyclerView, BindingContext bindingContext, DivGallery divGallery) {
        int i;
        PaddingItemDecoration paddingItemDecoration;
        int i2;
        DisplayMetrics displayMetrics = divRecyclerView.getResources().getDisplayMetrics();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        Expression<DivGallery.Orientation> expression = divGallery.x;
        Expression<Long> expression2 = divGallery.t;
        int i3 = expression.evaluate(expressionResolver) == DivGallery.Orientation.HORIZONTAL ? 0 : 1;
        boolean z = divGallery.D.evaluate(expressionResolver) == DivGallery.Scrollbar.AUTO;
        divRecyclerView.setVerticalScrollBarEnabled(z && i3 == 1);
        divRecyclerView.setHorizontalScrollBarEnabled(z && i3 == 0);
        divRecyclerView.setScrollbarFadingEnabled(false);
        Expression<Long> expression3 = divGallery.h;
        long longValue = expression3 != null ? expression3.evaluate(expressionResolver).longValue() : 1L;
        divRecyclerView.setClipChildren(false);
        if (longValue == 1) {
            i = i3;
            paddingItemDecoration = new PaddingItemDecoration(0, BaseDivViewExtensionsKt.dpToPx(expression2.evaluate(expressionResolver), displayMetrics), 0, 0, 0, 0, i, 61, null);
        } else {
            i = i3;
            int dpToPx = BaseDivViewExtensionsKt.dpToPx(expression2.evaluate(expressionResolver), displayMetrics);
            Expression<Long> expression4 = divGallery.k;
            if (expression4 == null) {
                expression4 = expression2;
            }
            paddingItemDecoration = new PaddingItemDecoration(0, dpToPx, BaseDivViewExtensionsKt.dpToPx(expression4.evaluate(expressionResolver), displayMetrics), 0, 0, 0, i, 57, null);
        }
        int i4 = i;
        setItemDecoration(divRecyclerView, paddingItemDecoration);
        DivGallery.ScrollMode evaluate = divGallery.C.evaluate(expressionResolver);
        divRecyclerView.setScrollMode(evaluate);
        int i5 = WhenMappings.$EnumSwitchMapping$0[evaluate.ordinal()];
        if (i5 == 1) {
            PagerSnapStartHelper pagerSnapStartHelper = divRecyclerView.getPagerSnapStartHelper();
            if (pagerSnapStartHelper != null) {
                pagerSnapStartHelper.attachToRecyclerView(null);
            }
        } else if (i5 == 2) {
            int dpToPx2 = BaseDivViewExtensionsKt.dpToPx(expression2.evaluate(expressionResolver), divRecyclerView.getResources().getDisplayMetrics());
            PagerSnapStartHelper pagerSnapStartHelper2 = divRecyclerView.getPagerSnapStartHelper();
            if (pagerSnapStartHelper2 != null) {
                pagerSnapStartHelper2.setItemSpacing(dpToPx2);
            } else {
                pagerSnapStartHelper2 = new PagerSnapStartHelper(dpToPx2);
                divRecyclerView.setPagerSnapStartHelper(pagerSnapStartHelper2);
            }
            pagerSnapStartHelper2.attachToRecyclerView(divRecyclerView);
        }
        DivGalleryItemHelper divLinearLayoutManager = longValue == 1 ? new DivLinearLayoutManager(bindingContext, divRecyclerView, divGallery, i4) : new DivGridLayoutManager(bindingContext, divRecyclerView, divGallery, i4);
        divRecyclerView.setLayoutManager(divLinearLayoutManager.toLayoutManager());
        divRecyclerView.setScrollInterceptionAngle(this.recyclerScrollInterceptionAngle);
        divRecyclerView.clearOnScrollListeners();
        DivViewState currentState = bindingContext.getDivView().getCurrentState();
        if (currentState != null) {
            String str = divGallery.r;
            if (str == null) {
                str = String.valueOf(divGallery.hashCode());
            }
            DivViewState.BlockState blockState = currentState.getBlockState(str);
            GalleryState galleryState = blockState instanceof GalleryState ? (GalleryState) blockState : null;
            if (galleryState != null) {
                i2 = galleryState.getVisibleItemIndex();
            } else {
                long longValue2 = divGallery.l.evaluate(expressionResolver).longValue();
                long j = longValue2 >> 31;
                if (j == 0 || j == -1) {
                    i2 = (int) longValue2;
                } else {
                    KAssert kAssert = KAssert.INSTANCE;
                    if (Assert.isEnabled()) {
                        mq.a(longValue2, "Unable convert '", "' to Int");
                    }
                    i2 = longValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
            }
            scrollToPositionInternal(divRecyclerView, i2, galleryState != null ? galleryState.getScrollOffset() : i2 != 0 ? 0 : i4 == 0 ? divRecyclerView.getPaddingStart() : divRecyclerView.getPaddingTop(), ScrollPositionKt.toScrollPosition(evaluate));
            divRecyclerView.addOnScrollListener(new UpdateStateScrollListener(str, currentState, divLinearLayoutManager));
        }
        divRecyclerView.addOnScrollListener(new DivGalleryScrollListener(bindingContext, divRecyclerView, divLinearLayoutManager, divGallery));
        divRecyclerView.setOnInterceptTouchEventListener(divGallery.z.evaluate(expressionResolver).booleanValue() ? ParentScrollRestrictor.INSTANCE : null);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void bindView(BindingContext bindingContext, DivRecyclerView divRecyclerView, a.c cVar, DivStatePath divStatePath) {
        DivRecyclerView divRecyclerView2 = divRecyclerView != null ? divRecyclerView : null;
        a.c div = divRecyclerView2 != null ? divRecyclerView2.getDiv() : null;
        if (cVar != div) {
            this.baseBinder.bindView(bindingContext, divRecyclerView, cVar, div);
            bind(divRecyclerView, bindingContext, cVar.c, divStatePath);
            return;
        }
        RecyclerView.Adapter adapter = divRecyclerView.getAdapter();
        DivGalleryAdapter divGalleryAdapter = adapter instanceof DivGalleryAdapter ? (DivGalleryAdapter) adapter : null;
        if (divGalleryAdapter == null) {
            return;
        }
        divGalleryAdapter.applyPatch(divRecyclerView, this.divPatchCache, bindingContext);
        BaseDivViewExtensionsKt.bindStates(divRecyclerView, bindingContext, this.divBinder.get());
    }
}
