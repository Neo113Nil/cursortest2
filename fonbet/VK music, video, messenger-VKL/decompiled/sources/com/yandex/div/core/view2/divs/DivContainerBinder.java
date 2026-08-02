package com.yandex.div.core.view2.divs;

import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import com.yandex.div.core.downloader.DivPatchManager;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.ExpressionsRuntime;
import com.yandex.div.core.state.DivPathUtils;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.util.DivDataExtensionsKt;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.ExpressionSubscribersKt;
import com.yandex.div.core.util.ReleasablesKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.animations.DivComparator;
import com.yandex.div.core.view2.divs.widgets.DivCollectionHolder;
import com.yandex.div.core.view2.divs.widgets.DivFrameLayout;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import com.yandex.div.core.view2.divs.widgets.DivLinearLayout;
import com.yandex.div.core.view2.divs.widgets.DivViewVisitorKt;
import com.yandex.div.core.view2.divs.widgets.DivWrapLayout;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.core.view2.reuse.util.RebindUtilsKt;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivContentAlignmentHorizontal;
import com.yandex.div2.DivContentAlignmentVertical;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.a;
import com.yandex.div2.j1;
import com.yandex.div2.o2;
import com.yandex.div2.v9;
import com.yandex.div2.y3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import xsna.air;
import xsna.c5g;
import xsna.e43;
import xsna.e9e0;
import xsna.epx;
import xsna.g5g;
import xsna.ikn;
import xsna.izs;
import xsna.j5g;
import xsna.kxt0;
import xsna.s3q0;
import xsna.ttp0;
import xsna.ukn;
import xsna.y57;

/* compiled from: DivContainerBinder.kt */
/* loaded from: classes7.dex */
public final class DivContainerBinder extends DivViewBinder<a.C2110a, DivContainer, ViewGroup> {
    private final DivBaseBinder baseBinder;
    private final e9e0<DivBinder> divBinder;
    private final DivPatchManager divPatchManager;
    private final e9e0<DivViewCreator> divViewCreator;
    private final ErrorCollectors errorCollectors;
    private final Rect tempRect;

    /* compiled from: DivContainerBinder.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivContainer.Orientation.values().length];
            try {
                iArr[DivContainer.Orientation.HORIZONTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DivContainerBinder(DivBaseBinder divBaseBinder, e9e0<DivViewCreator> e9e0Var, DivPatchManager divPatchManager, e9e0<DivBinder> e9e0Var2, ErrorCollectors errorCollectors) {
        super(divBaseBinder);
        this.baseBinder = divBaseBinder;
        this.divViewCreator = e9e0Var;
        this.divPatchManager = divPatchManager;
        this.divBinder = e9e0Var2;
        this.errorCollectors = errorCollectors;
        this.tempRect = new Rect();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyChildAlignment(View view, DivContainer divContainer, ikn iknVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        Expression<DivAlignmentHorizontal> j = iknVar.j();
        DivAlignmentVertical divAlignmentVertical = null;
        DivAlignmentHorizontal evaluate = j != null ? j.evaluate(expressionResolver2) : DivUtilKt.isWrapContainer(divContainer, expressionResolver) ? null : DivUtilKt.toAlignmentHorizontal(divContainer.o.evaluate(expressionResolver));
        Expression<DivAlignmentVertical> v = iknVar.v();
        if (v != null) {
            divAlignmentVertical = v.evaluate(expressionResolver2);
        } else if (!DivUtilKt.isWrapContainer(divContainer, expressionResolver)) {
            divAlignmentVertical = DivUtilKt.toAlignmentVertical(divContainer.p.evaluate(expressionResolver));
        }
        BaseDivViewExtensionsKt.applyAlignment(view, evaluate, divAlignmentVertical);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyItems(ViewGroup viewGroup, BindingContext bindingContext, DivContainer divContainer, DivContainer divContainer2, List<DivItemBuilderResult> list, List<DivItemBuilderResult> list2, DivStatePath divStatePath, ErrorCollector errorCollector) {
        RebindUtilsKt.tryRebindPlainContainerChildren(viewGroup, bindingContext.getDivView(), list, this.divViewCreator);
        validateChildren(viewGroup, divContainer, list, bindingContext.getExpressionResolver(), errorCollector);
        dispatchItems(viewGroup, bindingContext, divContainer, divContainer2, list, list2, divStatePath);
    }

    private final List<com.yandex.div2.a> applyPatchToChild(ViewGroup viewGroup, BindingContext bindingContext, com.yandex.div2.a aVar, int i) {
        String id = aVar.b().getId();
        if (id == null) {
            return Collections.singletonList(aVar);
        }
        Map<com.yandex.div2.a, View> createViewsForId = this.divPatchManager.createViewsForId(bindingContext, id);
        if (createViewsForId == null) {
            return Collections.singletonList(aVar);
        }
        viewGroup.removeViewAt(i);
        Iterator<Map.Entry<com.yandex.div2.a, View>> it = createViewsForId.entrySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            viewGroup.addView(it.next().getValue(), i2 + i);
            i2++;
        }
        return j5g.O0(createViewsForId.keySet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void bindChild(View view, BindingContext bindingContext, com.yandex.div2.a aVar, ExpressionResolver expressionResolver, DivContainer divContainer, DivContainer divContainer2, DivStatePath divStatePath) {
        ExpressionResolverImpl expressionResolver2;
        DivHolderView divHolderView = view instanceof DivHolderView ? (DivHolderView) view : null;
        com.yandex.div2.a div = divHolderView != null ? divHolderView.getDiv() : null;
        Div2View divView = bindingContext.getDivView();
        ExpressionsRuntime resolveRuntimeWith = divView.getRuntimeStore$div_release().resolveRuntimeWith(divView, divStatePath, aVar, expressionResolver, bindingContext.getExpressionResolver());
        this.divBinder.get().bind(bindingContext.getFor(expressionResolver), view, aVar, divStatePath);
        bindChildAlignment(view, divContainer, divContainer2, aVar.b(), div != null ? div.b() : null, bindingContext.getExpressionResolver(), (resolveRuntimeWith == null || (expressionResolver2 = resolveRuntimeWith.getExpressionResolver()) == null) ? expressionResolver : expressionResolver2, ReleasablesKt.getExpressionSubscriber(view), divView);
        if (DivUtilKt.getHasSightActions(aVar.b())) {
            divView.bindViewToDiv$div_release(view, aVar);
        } else {
            divView.unbindViewFromDiv$div_release(view);
        }
    }

    private final void bindChildAlignment(final View view, final DivContainer divContainer, DivContainer divContainer2, final ikn iknVar, ikn iknVar2, final ExpressionResolver expressionResolver, final ExpressionResolver expressionResolver2, ExpressionSubscriber expressionSubscriber, Div2View div2View) {
        if (!div2View.getComplexRebindInProgress$div_release() && iknVar2 != null) {
            if (ExpressionsKt.equalsToConstant(divContainer.o, divContainer2 != null ? divContainer2.o : null)) {
                if (ExpressionsKt.equalsToConstant(divContainer.p, divContainer2 != null ? divContainer2.p : null) && ExpressionsKt.equalsToConstant(iknVar.j(), iknVar2.j()) && ExpressionsKt.equalsToConstant(iknVar.v(), iknVar2.v())) {
                    return;
                }
            }
        }
        applyChildAlignment(view, divContainer, iknVar, expressionResolver, expressionResolver2);
        Expression<DivContentAlignmentHorizontal> expression = divContainer.o;
        Expression<DivContentAlignmentVertical> expression2 = divContainer.p;
        if (ExpressionsKt.isConstant(expression) && ExpressionsKt.isConstant(expression2) && ExpressionsKt.isConstantOrNull(iknVar.j()) && ExpressionsKt.isConstantOrNull(iknVar.v())) {
            return;
        }
        izs<? super DivAlignmentHorizontal, s3q0> izsVar = new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindChildAlignment$callback$1
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
                DivContainerBinder.this.applyChildAlignment(view, divContainer, iknVar, expressionResolver, expressionResolver2);
            }
        };
        expressionSubscriber.addSubscription(divContainer.o.observe(expressionResolver, izsVar));
        expressionSubscriber.addSubscription(expression2.observe(expressionResolver, izsVar));
        Expression<DivAlignmentHorizontal> j = iknVar.j();
        expressionSubscriber.addSubscription(j != null ? j.observe(expressionResolver2, izsVar) : null);
        Expression<DivAlignmentVertical> v = iknVar.v();
        expressionSubscriber.addSubscription(v != null ? v.observe(expressionResolver2, izsVar) : null);
    }

    private final void bindItemBuilder(final ViewGroup viewGroup, final BindingContext bindingContext, final DivContainer divContainer, final DivStatePath divStatePath, final ErrorCollector errorCollector) {
        final o2 o2Var = divContainer.z;
        if (o2Var == null) {
            return;
        }
        BaseDivViewExtensionsKt.bindItemBuilder(o2Var, bindingContext.getExpressionResolver(), new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindItemBuilder$1
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
                List<DivItemBuilderResult> build = DivCollectionExtensionsKt.build(o2.this, bindingContext.getExpressionResolver());
                List<DivItemBuilderResult> items = ((DivCollectionHolder) viewGroup).getItems();
                if (items == null) {
                    items = EmptyList.b;
                }
                List<DivItemBuilderResult> list = items;
                this.replaceWithReuse(viewGroup, bindingContext.getDivView(), list, build);
                DivContainerBinder divContainerBinder = this;
                ViewGroup viewGroup2 = viewGroup;
                BindingContext bindingContext2 = bindingContext;
                DivContainer divContainer2 = divContainer;
                divContainerBinder.applyItems(viewGroup2, bindingContext2, divContainer2, divContainer2, build, list, divStatePath, errorCollector);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
    
        if (com.yandex.div.core.view2.animations.DivComparator.areChildrenReplaceable$default(r0, r2, r9, null, 4, null) == false) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void bindItems(ViewGroup viewGroup, BindingContext bindingContext, DivContainer divContainer, DivContainer divContainer2, ExpressionResolver expressionResolver, DivStatePath divStatePath, boolean z) {
        List<DivItemBuilderResult> list;
        List<DivItemBuilderResult> list2;
        List<DivItemBuilderResult> list3;
        Div2View divView = bindingContext.getDivView();
        List<DivItemBuilderResult> buildItems = DivCollectionExtensionsKt.buildItems(divContainer, bindingContext.getExpressionResolver());
        List<DivItemBuilderResult> items = ((DivCollectionHolder) viewGroup).getItems();
        if (items == null) {
            for (DivItemBuilderResult divItemBuilderResult : buildItems) {
                viewGroup.addView(this.divViewCreator.get().create(divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver()));
            }
        } else if (divContainer != divContainer2) {
            if (divView.getComplexRebindInProgress$div_release()) {
                list = buildItems;
            } else {
                if (divContainer2 != null) {
                    DivComparator divComparator = DivComparator.INSTANCE;
                    if (DivComparator.areValuesReplaceable$default(divComparator, divContainer2, divContainer, expressionResolver, bindingContext.getExpressionResolver(), null, 16, null)) {
                        list2 = items;
                        list = buildItems;
                    }
                }
                list = buildItems;
                list2 = items;
                replaceWithReuse(viewGroup, divView, list2, list);
            }
            list3 = null;
            ErrorCollector orCreate = this.errorCollectors.getOrCreate(divView.getDataTag(), divView.getDivData());
            if (z) {
                bindItemBuilder(viewGroup, bindingContext, divContainer, divStatePath, orCreate);
            }
            applyItems(viewGroup, bindingContext, divContainer, divContainer2, list, list3, divStatePath, orCreate);
        }
        list = buildItems;
        list2 = items;
        list3 = list2;
        ErrorCollector orCreate2 = this.errorCollectors.getOrCreate(divView.getDataTag(), divView.getDivData());
        if (z) {
        }
        applyItems(viewGroup, bindingContext, divContainer, divContainer2, list, list3, divStatePath, orCreate2);
    }

    public static /* synthetic */ void bindItems$default(DivContainerBinder divContainerBinder, ViewGroup viewGroup, BindingContext bindingContext, DivContainer divContainer, DivContainer divContainer2, ExpressionResolver expressionResolver, DivStatePath divStatePath, boolean z, int i, Object obj) {
        divContainerBinder.bindItems(viewGroup, bindingContext, divContainer, divContainer2, expressionResolver, divStatePath, (i & 32) != 0 ? true : z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x006c, code lost:
    
        if (com.yandex.div.json.expressions.ExpressionsKt.isConstantOrNull(r1 != null ? r1.b : null) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        if (com.yandex.div.json.expressions.ExpressionsKt.equalsToConstant(r1 != null ? r1.b : null, r0 != null ? r0.b : null) != false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void bindLineSeparator(final DivWrapLayout divWrapLayout, DivContainer divContainer, DivContainer divContainer2, final ExpressionResolver expressionResolver) {
        Expression<Boolean> expression;
        Expression<Boolean> expression2;
        Expression<Boolean> expression3;
        final DivContainer.a aVar = divContainer.E;
        final DivContainer.a aVar2 = divContainer.E;
        DivContainer.a aVar3 = divContainer2 != null ? divContainer2.E : null;
        if (ExpressionsKt.equalsToConstant(aVar != null ? aVar.c : null, aVar3 != null ? aVar3.c : null)) {
            if (ExpressionsKt.equalsToConstant(aVar != null ? aVar.d : null, aVar3 != null ? aVar3.d : null)) {
            }
        }
        divWrapLayout.setShowLineSeparators(toSeparatorMode(aVar, expressionResolver));
        if (ExpressionsKt.isConstantOrNull(aVar != null ? aVar.c : null)) {
            if (ExpressionsKt.isConstantOrNull(aVar != null ? aVar.d : null)) {
            }
        }
        izs<? super Boolean, s3q0> izsVar = new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindLineSeparator$$inlined$bindSeparatorShowMode$1
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
                divWrapLayout.setShowLineSeparators(this.toSeparatorMode(DivContainer.a.this, expressionResolver));
            }
        };
        divWrapLayout.addSubscription((aVar == null || (expression3 = aVar.c) == null) ? null : expression3.observe(expressionResolver, izsVar));
        divWrapLayout.addSubscription((aVar == null || (expression2 = aVar.d) == null) ? null : expression2.observe(expressionResolver, izsVar));
        divWrapLayout.addSubscription((aVar == null || (expression = aVar.b) == null) ? null : expression.observe(expressionResolver, izsVar));
        DivContainer.a aVar4 = divContainer2 != null ? divContainer2.E : null;
        if (!DivDataExtensionsKt.equalsToConstant(aVar2 != null ? aVar2.e : null, aVar4 != null ? aVar4.e : null)) {
            ukn uknVar = aVar2 != null ? aVar2.e : null;
            divWrapLayout.setLineSeparatorDrawable(uknVar != null ? DivUtilKt.toDrawable(uknVar, divWrapLayout.getResources().getDisplayMetrics(), expressionResolver) : null);
            if (!DivDataExtensionsKt.isConstant(aVar2 != null ? aVar2.e : null)) {
                ExpressionSubscribersKt.observeDrawable(divWrapLayout, aVar2 != null ? aVar2.e : null, expressionResolver, new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindLineSeparator$$inlined$bindSeparatorStyle$1
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
                        DivContainer.a aVar5 = DivContainer.a.this;
                        ukn uknVar2 = aVar5 != null ? aVar5.e : null;
                        DivWrapLayout divWrapLayout2 = divWrapLayout;
                        divWrapLayout2.setLineSeparatorDrawable(uknVar2 != null ? DivUtilKt.toDrawable(uknVar2, divWrapLayout2.getResources().getDisplayMetrics(), expressionResolver) : null);
                    }
                });
            }
        }
        DivContainer.a aVar5 = divContainer2 != null ? divContainer2.E : null;
        if (DivDataExtensionsKt.equalsToConstant(aVar2 != null ? aVar2.a : null, aVar5 != null ? aVar5.a : null)) {
            return;
        }
        Rect rect = toRect(aVar2 != null ? aVar2.a : null, divWrapLayout.getResources(), expressionResolver);
        divWrapLayout.setLineSeparatorMargins(rect.left, rect.top, rect.right, rect.bottom);
        final y3 y3Var = aVar2 != null ? aVar2.a : null;
        if (y3Var == null || DivDataExtensionsKt.isConstant(y3Var)) {
            return;
        }
        izs<? super Long, s3q0> izsVar2 = new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindLineSeparator$$inlined$bindSeparatorMargins$1
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
                Rect rect2 = this.toRect(y3.this, divWrapLayout.getResources(), expressionResolver);
                divWrapLayout.setLineSeparatorMargins(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        };
        Expression<Long> expression4 = y3Var.f;
        Expression<Long> expression5 = y3Var.b;
        divWrapLayout.addSubscription(expression4.observe(expressionResolver, izsVar2));
        divWrapLayout.addSubscription(y3Var.a.observe(expressionResolver, izsVar2));
        Expression<Long> expression6 = y3Var.e;
        if (expression6 == null && expression5 == null) {
            divWrapLayout.addSubscription(y3Var.c.observe(expressionResolver, izsVar2));
            divWrapLayout.addSubscription(y3Var.d.observe(expressionResolver, izsVar2));
        } else {
            divWrapLayout.addSubscription(expression6 != null ? expression6.observe(expressionResolver, izsVar2) : null);
            divWrapLayout.addSubscription(expression5 != null ? expression5.observe(expressionResolver, izsVar2) : null);
        }
    }

    private final void bindLineSpacing(final DivWrapLayout divWrapLayout, DivContainer divContainer, DivContainer divContainer2, ExpressionResolver expressionResolver) {
        Expression<Long> expression = divContainer.F;
        Expression<Long> expression2 = divContainer.F;
        if (ExpressionsKt.equalsToConstant(expression, divContainer2 != null ? divContainer2.F : null)) {
            return;
        }
        final DisplayMetrics displayMetrics = divWrapLayout.getResources().getDisplayMetrics();
        divWrapLayout.setLineSpacing(BaseDivViewExtensionsKt.dpToPx(expression2.evaluate(expressionResolver), displayMetrics));
        if (ExpressionsKt.isConstant(expression2)) {
            return;
        }
        divWrapLayout.addSubscription(expression2.observe(expressionResolver, new izs<Long, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindLineSpacing$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Long l) {
                invoke(l.longValue());
                return s3q0.a;
            }

            public final void invoke(long j) {
                DivWrapLayout.this.setLineSpacing(BaseDivViewExtensionsKt.dpToPx(Long.valueOf(j), displayMetrics));
            }
        }));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        if (com.yandex.div.json.expressions.ExpressionsKt.equalsToConstant(r3, r10 != null ? r10.p : null) != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void bindProperties(final DivLinearLayout divLinearLayout, final DivContainer divContainer, DivContainer divContainer2, final ExpressionResolver expressionResolver, ErrorCollector errorCollector) {
        Expression<DivContainer.Orientation> expression = divContainer.I;
        Expression<DivContainer.Orientation> expression2 = divContainer.I;
        Expression<Long> expression3 = divContainer.A;
        Expression<DivContentAlignmentVertical> expression4 = divContainer.p;
        Expression<DivContentAlignmentHorizontal> expression5 = divContainer.o;
        if (!ExpressionsKt.equalsToConstant(expression, divContainer2 != null ? divContainer2.I : null)) {
            divLinearLayout.setOrientation(toOrientationMode(expression2.evaluate(expressionResolver)));
            if (!ExpressionsKt.isConstant(expression2)) {
                divLinearLayout.addSubscription(expression2.observe(expressionResolver, new izs<DivContainer.Orientation, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindProperties$$inlined$bindOrientation$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // xsna.izs
                    public /* bridge */ /* synthetic */ s3q0 invoke(DivContainer.Orientation orientation) {
                        invoke2(orientation);
                        return s3q0.a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DivContainer.Orientation orientation) {
                        DivLinearLayout.this.setOrientation(this.toOrientationMode(orientation));
                    }
                }));
            }
        }
        if (ExpressionsKt.equalsToConstant(expression5, divContainer2 != null ? divContainer2.o : null)) {
        }
        divLinearLayout.setGravity(DivUtilKt.evaluateGravity(expression5.evaluate(expressionResolver), expression4.evaluate(expressionResolver)));
        if (!ExpressionsKt.isConstant(expression5) || !ExpressionsKt.isConstant(expression4)) {
            izs<? super DivContentAlignmentVertical, s3q0> izsVar = new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindProperties$$inlined$bindContentAlignment$1
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
                    divLinearLayout.setGravity(DivUtilKt.evaluateGravity(DivContainer.this.o.evaluate(expressionResolver), DivContainer.this.p.evaluate(expressionResolver)));
                }
            };
            divLinearLayout.addSubscription(expression5.observe(expressionResolver, izsVar));
            divLinearLayout.addSubscription(expression4.observe(expressionResolver, izsVar));
        }
        bindSeparator(divLinearLayout, divContainer, divContainer2, expressionResolver);
        if (!ExpressionsKt.equalsToConstant(expression3, divContainer2 != null ? divContainer2.A : null)) {
            divLinearLayout.setItemSpacing(BaseDivViewExtensionsKt.dpToPx(Long.valueOf(expression3.evaluate(expressionResolver).longValue()), divLinearLayout.getResources().getDisplayMetrics()));
            if (!ExpressionsKt.isConstant(expression3)) {
                divLinearLayout.addSubscription(expression3.observe(expressionResolver, new izs<Long, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindProperties$$inlined$bindItemSpacing$1
                    {
                        super(1);
                    }

                    @Override // xsna.izs
                    public /* bridge */ /* synthetic */ s3q0 invoke(Long l) {
                        invoke(l.longValue());
                        return s3q0.a;
                    }

                    public final void invoke(long j) {
                        DivLinearLayout.this.setItemSpacing(BaseDivViewExtensionsKt.dpToPx(Long.valueOf(j), DivLinearLayout.this.getResources().getDisplayMetrics()));
                    }
                }));
            }
        }
        checkItemSpacingIgnored(divContainer, expressionResolver, errorCollector);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x006c, code lost:
    
        if (com.yandex.div.json.expressions.ExpressionsKt.isConstantOrNull(r1 != null ? r1.b : null) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        if (com.yandex.div.json.expressions.ExpressionsKt.equalsToConstant(r1 != null ? r1.b : null, r0 != null ? r0.b : null) != false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void bindSeparator(final DivLinearLayout divLinearLayout, DivContainer divContainer, DivContainer divContainer2, final ExpressionResolver expressionResolver) {
        Expression<Boolean> expression;
        Expression<Boolean> expression2;
        Expression<Boolean> expression3;
        final DivContainer.a aVar = divContainer.P;
        final DivContainer.a aVar2 = divContainer.P;
        DivContainer.a aVar3 = divContainer2 != null ? divContainer2.P : null;
        if (ExpressionsKt.equalsToConstant(aVar != null ? aVar.c : null, aVar3 != null ? aVar3.c : null)) {
            if (ExpressionsKt.equalsToConstant(aVar != null ? aVar.d : null, aVar3 != null ? aVar3.d : null)) {
            }
        }
        divLinearLayout.setShowDividers(toSeparatorMode(aVar, expressionResolver));
        if (ExpressionsKt.isConstantOrNull(aVar != null ? aVar.c : null)) {
            if (ExpressionsKt.isConstantOrNull(aVar != null ? aVar.d : null)) {
            }
        }
        izs<? super Boolean, s3q0> izsVar = new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindSeparator$$inlined$bindSeparatorShowMode$1
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
                divLinearLayout.setShowDividers(this.toSeparatorMode(DivContainer.a.this, expressionResolver));
            }
        };
        divLinearLayout.addSubscription((aVar == null || (expression3 = aVar.c) == null) ? null : expression3.observe(expressionResolver, izsVar));
        divLinearLayout.addSubscription((aVar == null || (expression2 = aVar.d) == null) ? null : expression2.observe(expressionResolver, izsVar));
        divLinearLayout.addSubscription((aVar == null || (expression = aVar.b) == null) ? null : expression.observe(expressionResolver, izsVar));
        DivContainer.a aVar4 = divContainer2 != null ? divContainer2.P : null;
        if (!DivDataExtensionsKt.equalsToConstant(aVar2 != null ? aVar2.e : null, aVar4 != null ? aVar4.e : null)) {
            ukn uknVar = aVar2 != null ? aVar2.e : null;
            divLinearLayout.setDividerDrawable(uknVar != null ? DivUtilKt.toDrawable(uknVar, divLinearLayout.getResources().getDisplayMetrics(), expressionResolver) : null);
            if (!DivDataExtensionsKt.isConstant(aVar2 != null ? aVar2.e : null)) {
                ExpressionSubscribersKt.observeDrawable(divLinearLayout, aVar2 != null ? aVar2.e : null, expressionResolver, new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindSeparator$$inlined$bindSeparatorStyle$1
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
                        DivContainer.a aVar5 = DivContainer.a.this;
                        ukn uknVar2 = aVar5 != null ? aVar5.e : null;
                        DivLinearLayout divLinearLayout2 = divLinearLayout;
                        divLinearLayout2.setDividerDrawable(uknVar2 != null ? DivUtilKt.toDrawable(uknVar2, divLinearLayout2.getResources().getDisplayMetrics(), expressionResolver) : null);
                    }
                });
            }
        }
        DivContainer.a aVar5 = divContainer2 != null ? divContainer2.P : null;
        if (DivDataExtensionsKt.equalsToConstant(aVar2 != null ? aVar2.a : null, aVar5 != null ? aVar5.a : null)) {
            return;
        }
        Rect rect = toRect(aVar2 != null ? aVar2.a : null, divLinearLayout.getResources(), expressionResolver);
        divLinearLayout.setDividerMargins(rect.left, rect.top, rect.right, rect.bottom);
        final y3 y3Var = aVar2 != null ? aVar2.a : null;
        if (y3Var == null || DivDataExtensionsKt.isConstant(y3Var)) {
            return;
        }
        izs<? super Long, s3q0> izsVar2 = new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindSeparator$$inlined$bindSeparatorMargins$1
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
                Rect rect2 = this.toRect(y3.this, divLinearLayout.getResources(), expressionResolver);
                divLinearLayout.setDividerMargins(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        };
        Expression<Long> expression4 = y3Var.f;
        Expression<Long> expression5 = y3Var.b;
        divLinearLayout.addSubscription(expression4.observe(expressionResolver, izsVar2));
        divLinearLayout.addSubscription(y3Var.a.observe(expressionResolver, izsVar2));
        Expression<Long> expression6 = y3Var.e;
        if (expression6 == null && expression5 == null) {
            divLinearLayout.addSubscription(y3Var.c.observe(expressionResolver, izsVar2));
            divLinearLayout.addSubscription(y3Var.d.observe(expressionResolver, izsVar2));
        } else {
            divLinearLayout.addSubscription(expression6 != null ? expression6.observe(expressionResolver, izsVar2) : null);
            divLinearLayout.addSubscription(expression5 != null ? expression5.observe(expressionResolver, izsVar2) : null);
        }
    }

    private final void checkCrossAxisSize(DivContainer divContainer, ikn iknVar, ExpressionResolver expressionResolver, ErrorCollector errorCollector) {
        if (DivUtilKt.isHorizontal(divContainer, expressionResolver)) {
            checkCrossAxisSize(iknVar.getHeight(), iknVar, errorCollector);
        } else {
            checkCrossAxisSize(iknVar.getWidth(), iknVar, errorCollector);
        }
    }

    private final void checkItemSpacingIgnored(DivContainer divContainer, ExpressionResolver expressionResolver, ErrorCollector errorCollector) {
        long longValue = divContainer.A.evaluate(expressionResolver).longValue();
        if (!showSeparatorBetween(toSeparatorMode(divContainer.P, expressionResolver)) || longValue == 0) {
            return;
        }
        errorCollector.logWarning(new Throwable("item_spacing will be ignored due to the 'separator' property."));
    }

    private final void checkLineSpacingIgnored(DivContainer divContainer, ExpressionResolver expressionResolver, ErrorCollector errorCollector) {
        long longValue = divContainer.F.evaluate(expressionResolver).longValue();
        if (!showSeparatorBetween(toSeparatorMode(divContainer.E, expressionResolver)) || longValue == 0) {
            return;
        }
        errorCollector.logWarning(new Throwable("line_spacing will be ignored due to the 'line_separator' property."));
    }

    private final void checkMainAxisSize(DivContainer divContainer, ikn iknVar, ExpressionResolver expressionResolver, ErrorCollector errorCollector) {
        if (DivUtilKt.isHorizontal(divContainer, expressionResolver)) {
            if (divContainer.b0 instanceof v9.c) {
                checkMainAxisSize(iknVar.getWidth(), iknVar, errorCollector);
            }
        } else if (divContainer.v instanceof v9.c) {
            j1 j1Var = divContainer.i;
            if (j1Var == null || ((float) j1Var.a.evaluate(expressionResolver).doubleValue()) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                checkMainAxisSize(iknVar.getHeight(), iknVar, errorCollector);
            }
        }
    }

    private final void checkSize(v9 v9Var, ikn iknVar, ErrorCollector errorCollector, String str, String str2) {
        String str3;
        if (v9Var instanceof v9.b) {
            String id = iknVar.getId();
            if (id == null || (str3 = air.b('\'', " with id='", id)) == null) {
                str3 = "";
            }
            errorCollector.logWarning(new Throwable(String.format("Incorrect child size. Container with %s contains child%s with match_parent size along the %s axis.", Arrays.copyOf(new Object[]{str, str3, str2}, 3))));
        }
    }

    private final List<DivItemBuilderResult> dispatchBinding(ViewGroup viewGroup, BindingContext bindingContext, DivContainer divContainer, DivContainer divContainer2, List<DivItemBuilderResult> list, DivStatePath divStatePath) {
        List<DivItemBuilderResult> list2;
        DivContainer divContainer3 = divContainer;
        int i = 0;
        if (divContainer3.z == null || list == null) {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            int i3 = 0;
            for (Object obj : list) {
                int i4 = i2 + 1;
                if (i2 < 0) {
                    e43.t();
                    throw null;
                }
                DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) obj;
                List<com.yandex.div2.a> applyPatchToChild = applyPatchToChild(viewGroup, bindingContext, divItemBuilderResult.getDiv(), i2 + i3);
                ArrayList arrayList2 = new ArrayList(c5g.u(applyPatchToChild, 10));
                Iterator<T> it = applyPatchToChild.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new DivItemBuilderResult((com.yandex.div2.a) it.next(), divItemBuilderResult.getExpressionResolver()));
                }
                i3 += arrayList2.size() - 1;
                g5g.y(arrayList2, arrayList);
                i2 = i4;
            }
            list2 = arrayList;
        } else {
            list2 = list;
        }
        DivContainerBinder divContainerBinder = this;
        BindingContext bindingContext2 = bindingContext;
        List<String> itemIds = DivPathUtils.INSTANCE.getItemIds(list2);
        for (Object obj2 : list2) {
            int i5 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            DivItemBuilderResult divItemBuilderResult2 = (DivItemBuilderResult) obj2;
            divContainerBinder.bindChild(viewGroup.getChildAt(i), bindingContext2, divItemBuilderResult2.getDiv(), divItemBuilderResult2.getExpressionResolver(), divContainer3, divContainer2, divStatePath.appendDiv(itemIds.get(i)));
            divContainerBinder = this;
            bindingContext2 = bindingContext;
            divContainer3 = divContainer;
            i = i5;
        }
        return list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void dispatchItems(ViewGroup viewGroup, BindingContext bindingContext, DivContainer divContainer, DivContainer divContainer2, List<DivItemBuilderResult> list, List<DivItemBuilderResult> list2, DivStatePath divStatePath) {
        List<DivItemBuilderResult> dispatchBinding = dispatchBinding(viewGroup, bindingContext, divContainer, divContainer2, list, divStatePath);
        ((DivCollectionHolder) viewGroup).setItems(dispatchBinding);
        BaseDivViewExtensionsKt.trackVisibilityActions(viewGroup, bindingContext.getDivView(), dispatchBinding, list2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void replaceWithReuse(ViewGroup viewGroup, Div2View div2View, List<DivItemBuilderResult> list, List<DivItemBuilderResult> list2) {
        Iterable iterable;
        Object obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<DivItemBuilderResult> list3 = list;
        kxt0 kxt0Var = new kxt0(viewGroup);
        if (kxt0Var.hasNext()) {
            View next = kxt0Var.next();
            if (kxt0Var.hasNext()) {
                ArrayList b = y57.b(next);
                while (kxt0Var.hasNext()) {
                    b.add(kxt0Var.next());
                }
                iterable = b;
            } else {
                iterable = Collections.singletonList(next);
            }
        } else {
            iterable = EmptyList.b;
        }
        Iterable iterable2 = iterable;
        Iterator<T> it = list3.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(c5g.u(list3, 10), c5g.u(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            linkedHashMap.put(((DivItemBuilderResult) it.next()).getDiv(), (View) it2.next());
            arrayList.add(s3q0.a);
        }
        viewGroup.removeAllViews();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it3 = list2.iterator();
        int i = 0;
        while (true) {
            Object obj2 = null;
            if (!it3.hasNext()) {
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    int intValue = ((Number) it4.next()).intValue();
                    DivItemBuilderResult divItemBuilderResult = list2.get(intValue);
                    Iterator it5 = linkedHashMap.keySet().iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it5.next();
                            if (epx.f(DivUtilKt.getType((com.yandex.div2.a) obj), DivUtilKt.getType(divItemBuilderResult.getDiv()))) {
                                break;
                            }
                        }
                    }
                    View view = (View) ttp0.c(linkedHashMap).remove((com.yandex.div2.a) obj);
                    if (view == null) {
                        view = this.divViewCreator.get().create(divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver());
                    }
                    viewGroup.addView(view, intValue);
                }
                Iterator it6 = linkedHashMap.values().iterator();
                while (it6.hasNext()) {
                    DivViewVisitorKt.visitViewTree(div2View.getReleaseViewVisitor$div_release(), (View) it6.next());
                }
                return;
            }
            Object next2 = it3.next();
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            DivItemBuilderResult divItemBuilderResult2 = (DivItemBuilderResult) next2;
            Iterator it7 = linkedHashMap.keySet().iterator();
            while (true) {
                if (!it7.hasNext()) {
                    break;
                }
                Object next3 = it7.next();
                com.yandex.div2.a aVar = (com.yandex.div2.a) next3;
                if (DivUtilKt.isBranch(aVar) ? epx.f(DivUtilKt.getType(divItemBuilderResult2.getDiv()), DivUtilKt.getType(aVar)) : DivUtilKt.canBeReused(aVar, divItemBuilderResult2.getDiv(), divItemBuilderResult2.getExpressionResolver())) {
                    obj2 = next3;
                    break;
                }
            }
            View view2 = (View) ttp0.c(linkedHashMap).remove((com.yandex.div2.a) obj2);
            if (view2 != null) {
                viewGroup.addView(view2);
            } else {
                arrayList2.add(Integer.valueOf(i));
            }
            i = i2;
        }
    }

    private final boolean showSeparatorBetween(int i) {
        return (i & 2) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int toOrientationMode(DivContainer.Orientation orientation) {
        return WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()] == 1 ? 0 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect toRect(y3 y3Var, Resources resources, ExpressionResolver expressionResolver) {
        if (y3Var == null) {
            this.tempRect.set(0, 0, 0, 0);
            return this.tempRect;
        }
        Expression<Long> expression = y3Var.b;
        Expression<Long> expression2 = y3Var.e;
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        DivSizeUnit evaluate = y3Var.g.evaluate(expressionResolver);
        if (expression2 == null && expression == null) {
            this.tempRect.left = BaseDivViewExtensionsKt.unitToPx(y3Var.c.evaluate(expressionResolver), displayMetrics, evaluate);
            this.tempRect.right = BaseDivViewExtensionsKt.unitToPx(y3Var.d.evaluate(expressionResolver), displayMetrics, evaluate);
        } else {
            if (resources.getConfiguration().getLayoutDirection() == 0) {
                this.tempRect.left = BaseDivViewExtensionsKt.unitToPx(expression2 != null ? expression2.evaluate(expressionResolver) : null, displayMetrics, evaluate);
                this.tempRect.right = BaseDivViewExtensionsKt.unitToPx(expression != null ? expression.evaluate(expressionResolver) : null, displayMetrics, evaluate);
            } else {
                this.tempRect.left = BaseDivViewExtensionsKt.unitToPx(expression != null ? expression.evaluate(expressionResolver) : null, displayMetrics, evaluate);
                this.tempRect.right = BaseDivViewExtensionsKt.unitToPx(expression2 != null ? expression2.evaluate(expressionResolver) : null, displayMetrics, evaluate);
            }
        }
        this.tempRect.top = BaseDivViewExtensionsKt.unitToPx(y3Var.f.evaluate(expressionResolver), displayMetrics, evaluate);
        this.tempRect.bottom = BaseDivViewExtensionsKt.unitToPx(y3Var.a.evaluate(expressionResolver), displayMetrics, evaluate);
        return this.tempRect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final int toSeparatorMode(DivContainer.a aVar, ExpressionResolver expressionResolver) {
        if (aVar == null) {
            return 0;
        }
        boolean booleanValue = aVar.c.evaluate(expressionResolver).booleanValue();
        ?? r0 = booleanValue;
        if (aVar.d.evaluate(expressionResolver).booleanValue()) {
            r0 = (booleanValue ? 1 : 0) | 2;
        }
        return aVar.b.evaluate(expressionResolver).booleanValue() ? r0 | 4 : r0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int toWrapDirection(DivContainer.Orientation orientation) {
        return WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()] == 1 ? 0 : 1;
    }

    private final void validateChildren(ViewGroup viewGroup, DivContainer divContainer, List<DivItemBuilderResult> list, ExpressionResolver expressionResolver, ErrorCollector errorCollector) {
        if (viewGroup instanceof DivFrameLayout) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ikn b = ((DivItemBuilderResult) it.next()).getDiv().b();
            if (viewGroup instanceof DivWrapLayout) {
                checkCrossAxisSize(divContainer, b, expressionResolver, errorCollector);
            } else if (viewGroup instanceof DivLinearLayout) {
                checkMainAxisSize(divContainer, b, expressionResolver, errorCollector);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void bindView(BindingContext bindingContext, ViewGroup viewGroup, a.C2110a c2110a, DivStatePath divStatePath) {
        ExpressionResolver oldExpressionResolver$div_release;
        DivHolderView divHolderView = (DivHolderView) viewGroup;
        a.C2110a c2110a2 = (a.C2110a) divHolderView.getDiv();
        BindingContext bindingContext2 = divHolderView.getBindingContext();
        if (bindingContext2 == null || (oldExpressionResolver$div_release = bindingContext2.getExpressionResolver()) == null) {
            oldExpressionResolver$div_release = bindingContext.getDivView().getOldExpressionResolver$div_release();
        }
        ExpressionResolver expressionResolver = oldExpressionResolver$div_release;
        if (c2110a == c2110a2) {
            bindItems(viewGroup, bindingContext, c2110a.c, c2110a2.c, expressionResolver, divStatePath, false);
            return;
        }
        this.baseBinder.bindView(bindingContext, viewGroup, c2110a, c2110a2);
        bind(viewGroup, bindingContext, c2110a.c, c2110a2 != null ? c2110a2.c : null);
        kxt0 kxt0Var = new kxt0(viewGroup);
        while (kxt0Var.hasNext()) {
            bindingContext.getDivView().unbindViewFromDiv$div_release(kxt0Var.next());
        }
        bindItems$default(this, viewGroup, bindingContext, c2110a.c, c2110a2 != null ? c2110a2.c : null, expressionResolver, divStatePath, false, 32, null);
    }

    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(ViewGroup viewGroup, BindingContext bindingContext, DivContainer divContainer, DivContainer divContainer2) {
        BaseDivViewExtensionsKt.applyDivActions(viewGroup, bindingContext, divContainer.b, divContainer.d, divContainer.G, divContainer.r, divContainer.x, divContainer.w, divContainer.L, divContainer.K, divContainer.c, divContainer.l);
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        ErrorCollector orCreate = this.errorCollectors.getOrCreate(bindingContext.getDivView().getDataTag(), bindingContext.getDivView().getDivData());
        BaseDivViewExtensionsKt.bindAspectRatio(viewGroup, divContainer.i, divContainer2 != null ? divContainer2.i : null, expressionResolver);
        BaseDivViewExtensionsKt.bindClipChildren(viewGroup, divContainer.m, divContainer2 != null ? divContainer2.m : null, expressionResolver);
        if (viewGroup instanceof DivLinearLayout) {
            bindProperties((DivLinearLayout) viewGroup, divContainer, divContainer2, expressionResolver, orCreate);
        } else if (viewGroup instanceof DivWrapLayout) {
            bindProperties((DivWrapLayout) viewGroup, divContainer, divContainer2, expressionResolver, orCreate);
        }
    }

    private final void checkCrossAxisSize(v9 v9Var, ikn iknVar, ErrorCollector errorCollector) {
        checkSize(v9Var, iknVar, errorCollector, "wrap layout mode", "cross");
    }

    private final void checkMainAxisSize(v9 v9Var, ikn iknVar, ErrorCollector errorCollector) {
        checkSize(v9Var, iknVar, errorCollector, "wrap_content size", X3.i.Z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        if (com.yandex.div.json.expressions.ExpressionsKt.equalsToConstant(r3, r10 != null ? r10.p : null) != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void bindProperties(final DivWrapLayout divWrapLayout, final DivContainer divContainer, DivContainer divContainer2, final ExpressionResolver expressionResolver, ErrorCollector errorCollector) {
        Expression<DivContainer.Orientation> expression = divContainer.I;
        Expression<DivContainer.Orientation> expression2 = divContainer.I;
        Expression<Long> expression3 = divContainer.A;
        Expression<DivContentAlignmentVertical> expression4 = divContainer.p;
        Expression<DivContentAlignmentHorizontal> expression5 = divContainer.o;
        if (!ExpressionsKt.equalsToConstant(expression, divContainer2 != null ? divContainer2.I : null)) {
            divWrapLayout.setWrapDirection(toWrapDirection(expression2.evaluate(expressionResolver)));
            if (!ExpressionsKt.isConstant(expression2)) {
                divWrapLayout.addSubscription(expression2.observe(expressionResolver, new izs<DivContainer.Orientation, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindProperties$$inlined$bindOrientation$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // xsna.izs
                    public /* bridge */ /* synthetic */ s3q0 invoke(DivContainer.Orientation orientation) {
                        invoke2(orientation);
                        return s3q0.a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DivContainer.Orientation orientation) {
                        DivWrapLayout.this.setWrapDirection(this.toWrapDirection(orientation));
                    }
                }));
            }
        }
        if (ExpressionsKt.equalsToConstant(expression5, divContainer2 != null ? divContainer2.o : null)) {
        }
        divWrapLayout.setGravity(DivUtilKt.evaluateGravity(expression5.evaluate(expressionResolver), expression4.evaluate(expressionResolver)));
        if (!ExpressionsKt.isConstant(expression5) || !ExpressionsKt.isConstant(expression4)) {
            izs<? super DivContentAlignmentVertical, s3q0> izsVar = new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindProperties$$inlined$bindContentAlignment$2
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
                    divWrapLayout.setGravity(DivUtilKt.evaluateGravity(DivContainer.this.o.evaluate(expressionResolver), DivContainer.this.p.evaluate(expressionResolver)));
                }
            };
            divWrapLayout.addSubscription(expression5.observe(expressionResolver, izsVar));
            divWrapLayout.addSubscription(expression4.observe(expressionResolver, izsVar));
        }
        bindSeparator(divWrapLayout, divContainer, divContainer2, expressionResolver);
        bindLineSeparator(divWrapLayout, divContainer, divContainer2, expressionResolver);
        if (!ExpressionsKt.equalsToConstant(expression3, divContainer2 != null ? divContainer2.A : null)) {
            divWrapLayout.setItemSpacing(BaseDivViewExtensionsKt.dpToPx(Long.valueOf(expression3.evaluate(expressionResolver).longValue()), divWrapLayout.getResources().getDisplayMetrics()));
            if (!ExpressionsKt.isConstant(expression3)) {
                divWrapLayout.addSubscription(expression3.observe(expressionResolver, new izs<Long, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindProperties$$inlined$bindItemSpacing$2
                    {
                        super(1);
                    }

                    @Override // xsna.izs
                    public /* bridge */ /* synthetic */ s3q0 invoke(Long l) {
                        invoke(l.longValue());
                        return s3q0.a;
                    }

                    public final void invoke(long j) {
                        DivWrapLayout.this.setItemSpacing(BaseDivViewExtensionsKt.dpToPx(Long.valueOf(j), DivWrapLayout.this.getResources().getDisplayMetrics()));
                    }
                }));
            }
        }
        bindLineSpacing(divWrapLayout, divContainer, divContainer2, expressionResolver);
        checkItemSpacingIgnored(divContainer, expressionResolver, errorCollector);
        checkLineSpacingIgnored(divContainer, expressionResolver, errorCollector);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x006c, code lost:
    
        if (com.yandex.div.json.expressions.ExpressionsKt.isConstantOrNull(r1 != null ? r1.b : null) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        if (com.yandex.div.json.expressions.ExpressionsKt.equalsToConstant(r1 != null ? r1.b : null, r0 != null ? r0.b : null) != false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void bindSeparator(final DivWrapLayout divWrapLayout, DivContainer divContainer, DivContainer divContainer2, final ExpressionResolver expressionResolver) {
        Expression<Boolean> expression;
        Expression<Boolean> expression2;
        Expression<Boolean> expression3;
        final DivContainer.a aVar = divContainer.P;
        final DivContainer.a aVar2 = divContainer.P;
        DivContainer.a aVar3 = divContainer2 != null ? divContainer2.P : null;
        if (ExpressionsKt.equalsToConstant(aVar != null ? aVar.c : null, aVar3 != null ? aVar3.c : null)) {
            if (ExpressionsKt.equalsToConstant(aVar != null ? aVar.d : null, aVar3 != null ? aVar3.d : null)) {
            }
        }
        divWrapLayout.setShowSeparators(toSeparatorMode(aVar, expressionResolver));
        if (ExpressionsKt.isConstantOrNull(aVar != null ? aVar.c : null)) {
            if (ExpressionsKt.isConstantOrNull(aVar != null ? aVar.d : null)) {
            }
        }
        izs<? super Boolean, s3q0> izsVar = new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindSeparator$$inlined$bindSeparatorShowMode$2
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
                divWrapLayout.setShowSeparators(this.toSeparatorMode(DivContainer.a.this, expressionResolver));
            }
        };
        divWrapLayout.addSubscription((aVar == null || (expression3 = aVar.c) == null) ? null : expression3.observe(expressionResolver, izsVar));
        divWrapLayout.addSubscription((aVar == null || (expression2 = aVar.d) == null) ? null : expression2.observe(expressionResolver, izsVar));
        divWrapLayout.addSubscription((aVar == null || (expression = aVar.b) == null) ? null : expression.observe(expressionResolver, izsVar));
        DivContainer.a aVar4 = divContainer2 != null ? divContainer2.P : null;
        if (!DivDataExtensionsKt.equalsToConstant(aVar2 != null ? aVar2.e : null, aVar4 != null ? aVar4.e : null)) {
            ukn uknVar = aVar2 != null ? aVar2.e : null;
            divWrapLayout.setSeparatorDrawable(uknVar != null ? DivUtilKt.toDrawable(uknVar, divWrapLayout.getResources().getDisplayMetrics(), expressionResolver) : null);
            if (!DivDataExtensionsKt.isConstant(aVar2 != null ? aVar2.e : null)) {
                ExpressionSubscribersKt.observeDrawable(divWrapLayout, aVar2 != null ? aVar2.e : null, expressionResolver, new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindSeparator$$inlined$bindSeparatorStyle$2
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
                        DivContainer.a aVar5 = DivContainer.a.this;
                        ukn uknVar2 = aVar5 != null ? aVar5.e : null;
                        DivWrapLayout divWrapLayout2 = divWrapLayout;
                        divWrapLayout2.setSeparatorDrawable(uknVar2 != null ? DivUtilKt.toDrawable(uknVar2, divWrapLayout2.getResources().getDisplayMetrics(), expressionResolver) : null);
                    }
                });
            }
        }
        DivContainer.a aVar5 = divContainer2 != null ? divContainer2.P : null;
        if (DivDataExtensionsKt.equalsToConstant(aVar2 != null ? aVar2.a : null, aVar5 != null ? aVar5.a : null)) {
            return;
        }
        Rect rect = toRect(aVar2 != null ? aVar2.a : null, divWrapLayout.getResources(), expressionResolver);
        divWrapLayout.setSeparatorMargins(rect.left, rect.top, rect.right, rect.bottom);
        final y3 y3Var = aVar2 != null ? aVar2.a : null;
        if (y3Var == null || DivDataExtensionsKt.isConstant(y3Var)) {
            return;
        }
        izs<? super Long, s3q0> izsVar2 = new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindSeparator$$inlined$bindSeparatorMargins$2
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
                Rect rect2 = this.toRect(y3.this, divWrapLayout.getResources(), expressionResolver);
                divWrapLayout.setSeparatorMargins(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        };
        Expression<Long> expression4 = y3Var.f;
        Expression<Long> expression5 = y3Var.b;
        divWrapLayout.addSubscription(expression4.observe(expressionResolver, izsVar2));
        divWrapLayout.addSubscription(y3Var.a.observe(expressionResolver, izsVar2));
        Expression<Long> expression6 = y3Var.e;
        if (expression6 == null && expression5 == null) {
            divWrapLayout.addSubscription(y3Var.c.observe(expressionResolver, izsVar2));
            divWrapLayout.addSubscription(y3Var.d.observe(expressionResolver, izsVar2));
        } else {
            divWrapLayout.addSubscription(expression6 != null ? expression6.observe(expressionResolver, izsVar2) : null);
            divWrapLayout.addSubscription(expression5 != null ? expression5.observe(expressionResolver, izsVar2) : null);
        }
    }
}
