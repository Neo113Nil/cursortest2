package com.yandex.div.core.view2.divs;

import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import com.yandex.div.R$id;
import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.tooltip.DivTooltipController;
import com.yandex.div.core.util.DivDataExtensionsKt;
import com.yandex.div.core.util.ExpressionSubscribersKt;
import com.yandex.div.core.util.ReleasablesKt;
import com.yandex.div.core.view.OnPreDrawListeners;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivAccessibilityBinder;
import com.yandex.div.core.view2.DivTransitionBuilder;
import com.yandex.div.core.view2.DivViewIdProvider;
import com.yandex.div.core.view2.animations.DivTransitionHandler;
import com.yandex.div.core.view2.animations.DivTransitionsKt;
import com.yandex.div.core.view2.divs.DivBaseBinder;
import com.yandex.div.core.view2.divs.widgets.DivBorderSupports;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.core.VariableMutationHandler;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivInput;
import com.yandex.div2.DivTooltip;
import com.yandex.div2.DivTransitionTrigger;
import com.yandex.div2.DivVisibility;
import com.yandex.div2.db;
import com.yandex.div2.j3;
import com.yandex.div2.m1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import xsna.brm0;
import xsna.epx;
import xsna.gzs;
import xsna.ikn;
import xsna.izs;
import xsna.jln;
import xsna.s3q0;
import xsna.vlp0;
import xsna.vmn;
import xsna.zmp0;

/* compiled from: DivBaseBinder.kt */
/* loaded from: classes7.dex */
public final class DivBaseBinder {
    private final DivAccessibilityBinder divAccessibilityBinder;
    private final DivBackgroundBinder divBackgroundBinder;
    private final DivFocusBinder divFocusBinder;
    private final DivLayoutParamsBinder layoutParamsBinder;
    private final DivTooltipController tooltipController;

    /* compiled from: DivBaseBinder.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivVisibility.values().length];
            try {
                iArr[DivVisibility.VISIBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivVisibility.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivVisibility.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DivBaseBinder(DivBackgroundBinder divBackgroundBinder, DivTooltipController divTooltipController, DivFocusBinder divFocusBinder, DivAccessibilityBinder divAccessibilityBinder, DivLayoutParamsBinder divLayoutParamsBinder) {
        this.divBackgroundBinder = divBackgroundBinder;
        this.tooltipController = divTooltipController;
        this.divFocusBinder = divFocusBinder;
        this.divAccessibilityBinder = divAccessibilityBinder;
        this.layoutParamsBinder = divLayoutParamsBinder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void applyAlpha(View view, double d) {
        view.setAlpha((float) d);
        DivBorderSupports divBorderSupports = view instanceof DivBorderSupports ? (DivBorderSupports) view : null;
        if (divBorderSupports != null) {
            divBorderSupports.invalidateBorder();
        }
    }

    private final void applyFocusableState(View view, ikn iknVar) {
        if ((iknVar instanceof DivInput) || (iknVar instanceof db)) {
            return;
        }
        view.setFocusable(iknVar.w() != null);
    }

    private final void applyId(View view, String str, int i) {
        view.setTag(str);
        view.setId(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyVisibility(View view, Div2View div2View, ikn iknVar, ExpressionResolver expressionResolver, boolean z) {
        int i;
        DivTransitionHandler divTransitionHandler$div_release = div2View.getDivTransitionHandler$div_release();
        int i2 = WhenMappings.$EnumSwitchMapping$0[iknVar.getVisibility().evaluate(expressionResolver).ordinal()];
        if (i2 == 1) {
            i = 0;
        } else if (i2 == 2) {
            i = 4;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = 8;
        }
        if (i != 0) {
            view.clearAnimation();
        }
        int visibility = view.getVisibility();
        List<DivTransitionTrigger> l = iknVar.l();
        vlp0 vlp0Var = null;
        if (l == null || DivTransitionsKt.allowsTransitionsOnVisibilityChange(l)) {
            DivTransitionHandler.ChangeType.Visibility lastChange = divTransitionHandler$div_release.getLastChange(view);
            if (lastChange != null) {
                visibility = lastChange.getNew();
            }
            DivTransitionBuilder transitionBuilder = div2View.getViewComponent$div_release().getTransitionBuilder();
            if ((visibility == 4 || visibility == 8) && i == 0) {
                vlp0Var = transitionBuilder.createAndroidTransition(iknVar.q(), 1, expressionResolver);
            } else if ((i == 4 || i == 8) && visibility == 0 && !z) {
                vlp0Var = transitionBuilder.createAndroidTransition(iknVar.k(), 2, expressionResolver);
            } else if (lastChange != null) {
                zmp0.b(div2View);
            }
            if (vlp0Var != null) {
                vlp0Var.addTarget(view);
            }
        }
        if (vlp0Var != null) {
            divTransitionHandler$div_release.putTransition(vlp0Var, view, new DivTransitionHandler.ChangeType.Visibility(i));
        } else {
            view.setVisibility(i);
        }
        div2View.trackChildrenVisibility();
    }

    private final void bind(View view, BindingContext bindingContext, ikn iknVar, ikn iknVar2) {
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        Div2View divView = bindingContext.getDivView();
        ExpressionSubscriber expressionSubscriber = ReleasablesKt.getExpressionSubscriber(view);
        view.setDefaultFocusHighlightEnabled(false);
        bindId(view, divView, iknVar, iknVar2);
        bindLayoutParams(view, bindingContext, iknVar, iknVar2, expressionSubscriber);
        bindMargins(view, iknVar, iknVar2, expressionResolver, expressionSubscriber);
        bindAlignment(view, iknVar, iknVar2, expressionResolver, expressionSubscriber);
        bindLayoutProvider(view, bindingContext, iknVar, iknVar2);
        bindAccessibility(view, iknVar, iknVar2, expressionResolver, expressionSubscriber);
        bindAlpha(view, iknVar, iknVar2, expressionResolver, expressionSubscriber);
        bindBackground$default(this, view, bindingContext, iknVar, iknVar2, expressionSubscriber, null, 16, null);
        bindBorder(view, bindingContext, iknVar);
        bindPaddings(view, iknVar, iknVar2, expressionResolver, expressionSubscriber);
        bindNextFocus(view, divView, iknVar, iknVar2, expressionResolver, expressionSubscriber);
        jln w = iknVar.w();
        List<DivAction> list = w != null ? w.e : null;
        jln w2 = iknVar.w();
        bindFocusActions(view, bindingContext, list, w2 != null ? w2.d : null);
        bindVisibility(view, divView, iknVar, iknVar2, expressionResolver, expressionSubscriber);
        bindTransform(view, iknVar, iknVar2, expressionResolver, expressionSubscriber);
        List<DivTooltip> b = iknVar.b();
        if (b != null) {
            this.tooltipController.mapTooltip(view, b);
        }
        applyFocusableState(view, iknVar);
    }

    private final void bindAccessibility(View view, ikn iknVar, ikn iknVar2, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        this.divAccessibilityBinder.bind(view, iknVar, iknVar2, expressionResolver, expressionSubscriber);
    }

    private final void bindAlignment(final View view, final ikn iknVar, ikn iknVar2, final ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        if (ExpressionsKt.equalsToConstant(iknVar.j(), iknVar2 != null ? iknVar2.j() : null)) {
            if (ExpressionsKt.equalsToConstant(iknVar.v(), iknVar2 != null ? iknVar2.v() : null)) {
                return;
            }
        }
        Expression<DivAlignmentHorizontal> j = iknVar.j();
        DivAlignmentHorizontal evaluate = j != null ? j.evaluate(expressionResolver) : null;
        Expression<DivAlignmentVertical> v = iknVar.v();
        BaseDivViewExtensionsKt.applyAlignment(view, evaluate, v != null ? v.evaluate(expressionResolver) : null);
        if (ExpressionsKt.isConstantOrNull(iknVar.j()) && ExpressionsKt.isConstantOrNull(iknVar.v())) {
            return;
        }
        izs<? super DivAlignmentHorizontal, s3q0> izsVar = new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindAlignment$callback$1
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
                View view2 = view;
                Expression<DivAlignmentHorizontal> j2 = iknVar.j();
                DivAlignmentHorizontal evaluate2 = j2 != null ? j2.evaluate(expressionResolver) : null;
                Expression<DivAlignmentVertical> v2 = iknVar.v();
                BaseDivViewExtensionsKt.applyAlignment(view2, evaluate2, v2 != null ? v2.evaluate(expressionResolver) : null);
            }
        };
        Expression<DivAlignmentHorizontal> j2 = iknVar.j();
        expressionSubscriber.addSubscription(j2 != null ? j2.observe(expressionResolver, izsVar) : null);
        Expression<DivAlignmentVertical> v2 = iknVar.v();
        expressionSubscriber.addSubscription(v2 != null ? v2.observe(expressionResolver, izsVar) : null);
    }

    private final void bindAlpha(final View view, ikn iknVar, ikn iknVar2, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        if (ExpressionsKt.equalsToConstant(iknVar.a(), iknVar2 != null ? iknVar2.a() : null)) {
            return;
        }
        applyAlpha(view, iknVar.a().evaluate(expressionResolver).doubleValue());
        if (ExpressionsKt.isConstant(iknVar.a())) {
            return;
        }
        expressionSubscriber.addSubscription(iknVar.a().observe(expressionResolver, new izs<Double, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindAlpha$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Double d) {
                invoke(d.doubleValue());
                return s3q0.a;
            }

            public final void invoke(double d) {
                DivBaseBinder.this.applyAlpha(view, d);
            }
        }));
    }

    private final void bindBackground(View view, BindingContext bindingContext, ikn iknVar, ikn iknVar2, ExpressionSubscriber expressionSubscriber, Drawable drawable) {
        jln w;
        DivBackgroundBinder divBackgroundBinder = this.divBackgroundBinder;
        List<m1> background = iknVar.getBackground();
        List<m1> list = null;
        List<m1> background2 = iknVar2 != null ? iknVar2.getBackground() : null;
        jln w2 = iknVar.w();
        List<m1> list2 = w2 != null ? w2.a : null;
        if (iknVar2 != null && (w = iknVar2.w()) != null) {
            list = w.a;
        }
        divBackgroundBinder.bindBackground(bindingContext, view, background, background2, list2, list, expressionSubscriber, drawable);
    }

    public static /* synthetic */ void bindBackground$default(DivBaseBinder divBaseBinder, View view, BindingContext bindingContext, ikn iknVar, ikn iknVar2, ExpressionSubscriber expressionSubscriber, Drawable drawable, int i, Object obj) {
        if ((i & 16) != 0) {
            drawable = null;
        }
        divBaseBinder.bindBackground(view, bindingContext, iknVar, iknVar2, expressionSubscriber, drawable);
    }

    private final void bindBorder(View view, BindingContext bindingContext, ikn iknVar) {
        DivFocusBinder divFocusBinder = this.divFocusBinder;
        jln w = iknVar.w();
        divFocusBinder.bindDivBorder(view, bindingContext, w != null ? w.b : null, iknVar.d());
    }

    private final void bindFocusActions(View view, BindingContext bindingContext, List<DivAction> list, List<DivAction> list2) {
        this.divFocusBinder.bindDivFocusActions(view, bindingContext, list, list2);
    }

    private final void bindId(View view, Div2View div2View, ikn iknVar, ikn iknVar2) {
        if (epx.f(iknVar.getId(), iknVar2 != null ? iknVar2.getId() : null)) {
            return;
        }
        applyId(view, iknVar.getId(), div2View.getViewComponent$div_release().getViewIdProvider().getViewId(iknVar.getId()));
    }

    private final void bindLayoutParams(View view, BindingContext bindingContext, ikn iknVar, ikn iknVar2, ExpressionSubscriber expressionSubscriber) {
        this.layoutParamsBinder.bindLayoutParams(bindingContext, view, iknVar, iknVar2, expressionSubscriber);
    }

    private final void bindLayoutProvider(final View view, final BindingContext bindingContext, ikn iknVar, ikn iknVar2) {
        vmn o;
        vmn o2;
        vmn o3;
        final Div2View divView = bindingContext.getDivView();
        j3 divData = divView.getDivData();
        if (divData == null || (o = iknVar.o()) == null) {
            return;
        }
        if (brm0.w(o.b, (iknVar2 == null || (o3 = iknVar2.o()) == null) ? null : o3.b, false)) {
            if (brm0.w(o.a, (iknVar2 == null || (o2 = iknVar2.o()) == null) ? null : o2.a, false)) {
                return;
            }
        }
        if ((iknVar2 != null ? iknVar2.o() : null) != null) {
            clearLayoutProviderVariables(view);
        }
        final String str = o.b;
        final String str2 = o.a;
        if ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) {
            DivActionTypedUtilsKt.logError(divView, new Throwable("Neither width_variable_name nor height_variable_name found."));
            return;
        }
        DivLayoutProviderVariablesHolder divLayoutProviderVariablesHolder = divView.getVariablesHolders$div_release().get(divData);
        if (divLayoutProviderVariablesHolder == null) {
            divLayoutProviderVariablesHolder = new DivLayoutProviderVariablesHolder();
            divLayoutProviderVariablesHolder.observeDivData(divData, bindingContext);
            divView.getVariablesHolders$div_release().put(divData, divLayoutProviderVariablesHolder);
        }
        final DivLayoutProviderVariablesHolder divLayoutProviderVariablesHolder2 = divLayoutProviderVariablesHolder;
        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: xsna.jkn
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                DivBaseBinder.bindLayoutProvider$lambda$4(view, this, divView, str, divLayoutProviderVariablesHolder2, bindingContext, str2, view2, i, i2, i3, i4, i5, i6, i7, i8);
            }
        };
        if (view.getWidth() > 0 || view.getHeight() > 0) {
            onLayoutChangeListener.onLayoutChange(view, view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), 0, 0, 0, 0);
        }
        view.addOnLayoutChangeListener(onLayoutChangeListener);
        view.setTag(R$id.div_layout_provider_listener_id, onLayoutChangeListener);
        if (divView.getClearVariablesListener$div_release() != null) {
            return;
        }
        ViewTreeObserver.OnPreDrawListener onPreDrawListener$default = OnPreDrawListeners.onPreDrawListener$default(null, new gzs<Boolean>() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindLayoutProvider$clearVariablesListener$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // xsna.gzs
            public final Boolean invoke() {
                DivLayoutProviderVariablesHolder.this.clear();
                Map<ExpressionResolver, Map<String, Integer>> layoutSizes$div_release = divView.getLayoutSizes$div_release();
                Div2View div2View = divView;
                for (Map.Entry<ExpressionResolver, Map<String, Integer>> entry : layoutSizes$div_release.entrySet()) {
                    ExpressionResolver key = entry.getKey();
                    for (Map.Entry<String, Integer> entry2 : entry.getValue().entrySet()) {
                        VariableMutationHandler.Companion.setVariable(div2View, entry2.getKey(), String.valueOf(entry2.getValue().intValue()), key);
                    }
                }
                divView.getLayoutSizes$div_release().clear();
                return Boolean.TRUE;
            }
        }, 1, null);
        divView.setClearVariablesListener$div_release(onPreDrawListener$default);
        divView.getViewTreeObserver().addOnPreDrawListener(onPreDrawListener$default);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindLayoutProvider$lambda$4(View view, DivBaseBinder divBaseBinder, Div2View div2View, String str, DivLayoutProviderVariablesHolder divLayoutProviderVariablesHolder, BindingContext bindingContext, String str2, View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        divBaseBinder.updateSizeVariable(div2View, displayMetrics, str, divLayoutProviderVariablesHolder, i, i3, i5, i7, bindingContext.getExpressionResolver());
        divBaseBinder.updateSizeVariable(div2View, displayMetrics, str2, divLayoutProviderVariablesHolder, i2, i4, i6, i8, bindingContext.getExpressionResolver());
    }

    private final void bindMargins(final View view, final ikn iknVar, ikn iknVar2, final ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        if (DivDataExtensionsKt.equalsToConstant(iknVar.g(), iknVar2 != null ? iknVar2.g() : null)) {
            return;
        }
        BaseDivViewExtensionsKt.applyMargins(view, iknVar.g(), expressionResolver);
        if (DivDataExtensionsKt.isConstant(iknVar.g())) {
            return;
        }
        ExpressionSubscribersKt.observeEdgeInsets(expressionSubscriber, iknVar.g(), expressionResolver, new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindMargins$1
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
                BaseDivViewExtensionsKt.applyMargins(view, iknVar.g(), expressionResolver);
            }
        });
    }

    private final void bindNextFocus(final View view, Div2View div2View, ikn iknVar, ikn iknVar2, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        jln w;
        jln.a aVar;
        jln.a aVar2;
        jln w2;
        jln.a aVar3;
        jln.a aVar4;
        jln w3;
        jln.a aVar5;
        jln.a aVar6;
        jln w4;
        jln.a aVar7;
        jln.a aVar8;
        jln w5;
        jln.a aVar9;
        jln.a aVar10;
        final DivViewIdProvider viewIdProvider = div2View.getViewComponent$div_release().getViewIdProvider();
        jln w6 = iknVar.w();
        Expression<String> expression = (w6 == null || (aVar10 = w6.c) == null) ? null : aVar10.b;
        if (!ExpressionsKt.equalsToConstant(expression, (iknVar2 == null || (w5 = iknVar2.w()) == null || (aVar9 = w5.c) == null) ? null : aVar9.b)) {
            String evaluate = expression != null ? expression.evaluate(expressionResolver) : null;
            view.setNextFocusForwardId(viewIdProvider.getViewId(evaluate));
            view.setAccessibilityTraversalBefore(viewIdProvider.getViewId(evaluate));
            if (!ExpressionsKt.isConstantOrNull(expression)) {
                expressionSubscriber.addSubscription(expression != null ? expression.observe(expressionResolver, new izs<String, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindNextFocus$$inlined$bindNextFocusId$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // xsna.izs
                    public /* bridge */ /* synthetic */ s3q0 invoke(String str) {
                        invoke2(str);
                        return s3q0.a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(String str) {
                        view.setNextFocusForwardId(viewIdProvider.getViewId(str));
                        view.setAccessibilityTraversalBefore(viewIdProvider.getViewId(str));
                    }
                }) : null);
            }
        }
        jln w7 = iknVar.w();
        Expression<String> expression2 = (w7 == null || (aVar8 = w7.c) == null) ? null : aVar8.c;
        if (!ExpressionsKt.equalsToConstant(expression2, (iknVar2 == null || (w4 = iknVar2.w()) == null || (aVar7 = w4.c) == null) ? null : aVar7.c)) {
            view.setNextFocusLeftId(viewIdProvider.getViewId(expression2 != null ? expression2.evaluate(expressionResolver) : null));
            if (!ExpressionsKt.isConstantOrNull(expression2)) {
                expressionSubscriber.addSubscription(expression2 != null ? expression2.observe(expressionResolver, new izs<String, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindNextFocus$$inlined$bindNextFocusId$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // xsna.izs
                    public /* bridge */ /* synthetic */ s3q0 invoke(String str) {
                        invoke2(str);
                        return s3q0.a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(String str) {
                        view.setNextFocusLeftId(viewIdProvider.getViewId(str));
                    }
                }) : null);
            }
        }
        jln w8 = iknVar.w();
        Expression<String> expression3 = (w8 == null || (aVar6 = w8.c) == null) ? null : aVar6.d;
        if (!ExpressionsKt.equalsToConstant(expression3, (iknVar2 == null || (w3 = iknVar2.w()) == null || (aVar5 = w3.c) == null) ? null : aVar5.d)) {
            view.setNextFocusRightId(viewIdProvider.getViewId(expression3 != null ? expression3.evaluate(expressionResolver) : null));
            if (!ExpressionsKt.isConstantOrNull(expression3)) {
                expressionSubscriber.addSubscription(expression3 != null ? expression3.observe(expressionResolver, new izs<String, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindNextFocus$$inlined$bindNextFocusId$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // xsna.izs
                    public /* bridge */ /* synthetic */ s3q0 invoke(String str) {
                        invoke2(str);
                        return s3q0.a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(String str) {
                        view.setNextFocusRightId(viewIdProvider.getViewId(str));
                    }
                }) : null);
            }
        }
        jln w9 = iknVar.w();
        Expression<String> expression4 = (w9 == null || (aVar4 = w9.c) == null) ? null : aVar4.e;
        if (!ExpressionsKt.equalsToConstant(expression4, (iknVar2 == null || (w2 = iknVar2.w()) == null || (aVar3 = w2.c) == null) ? null : aVar3.e)) {
            view.setNextFocusUpId(viewIdProvider.getViewId(expression4 != null ? expression4.evaluate(expressionResolver) : null));
            if (!ExpressionsKt.isConstantOrNull(expression4)) {
                expressionSubscriber.addSubscription(expression4 != null ? expression4.observe(expressionResolver, new izs<String, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindNextFocus$$inlined$bindNextFocusId$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // xsna.izs
                    public /* bridge */ /* synthetic */ s3q0 invoke(String str) {
                        invoke2(str);
                        return s3q0.a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(String str) {
                        view.setNextFocusUpId(viewIdProvider.getViewId(str));
                    }
                }) : null);
            }
        }
        jln w10 = iknVar.w();
        Expression<String> expression5 = (w10 == null || (aVar2 = w10.c) == null) ? null : aVar2.a;
        if (ExpressionsKt.equalsToConstant(expression5, (iknVar2 == null || (w = iknVar2.w()) == null || (aVar = w.c) == null) ? null : aVar.a)) {
            return;
        }
        view.setNextFocusDownId(viewIdProvider.getViewId(expression5 != null ? expression5.evaluate(expressionResolver) : null));
        if (ExpressionsKt.isConstantOrNull(expression5)) {
            return;
        }
        expressionSubscriber.addSubscription(expression5 != null ? expression5.observe(expressionResolver, new izs<String, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindNextFocus$$inlined$bindNextFocusId$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(String str) {
                invoke2(str);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String str) {
                view.setNextFocusDownId(viewIdProvider.getViewId(str));
            }
        }) : null);
    }

    private final void bindPaddings(final View view, final ikn iknVar, ikn iknVar2, final ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        if (view instanceof DivPagerView) {
            return;
        }
        if (DivDataExtensionsKt.equalsToConstant(iknVar.y(), iknVar2 != null ? iknVar2.y() : null)) {
            return;
        }
        BaseDivViewExtensionsKt.applyPaddings(view, iknVar.y(), expressionResolver);
        if (DivDataExtensionsKt.isConstant(iknVar.y())) {
            return;
        }
        ExpressionSubscribersKt.observeEdgeInsets(expressionSubscriber, iknVar.y(), expressionResolver, new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindPaddings$1
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
                BaseDivViewExtensionsKt.applyPaddings(view, iknVar.y(), expressionResolver);
            }
        });
    }

    private final void bindTransform(final View view, final ikn iknVar, ikn iknVar2, final ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        if (DivDataExtensionsKt.equalsToConstant(iknVar.c(), iknVar2 != null ? iknVar2.c() : null)) {
            return;
        }
        BaseDivViewExtensionsKt.applyTransform(view, iknVar, expressionResolver);
        if (DivDataExtensionsKt.isConstant(iknVar.c())) {
            return;
        }
        ExpressionSubscribersKt.observeTransform(expressionSubscriber, iknVar.c(), expressionResolver, new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindTransform$1
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
                BaseDivViewExtensionsKt.applyTransform(view, iknVar, expressionResolver);
            }
        });
    }

    private final void bindVisibility(final View view, final Div2View div2View, final ikn iknVar, ikn iknVar2, final ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        if (ExpressionsKt.equalsToConstant(iknVar.getVisibility(), iknVar2 != null ? iknVar2.getVisibility() : null)) {
            return;
        }
        applyVisibility(view, div2View, iknVar, expressionResolver, iknVar2 == null);
        if (ExpressionsKt.isConstant(iknVar.getVisibility())) {
            return;
        }
        expressionSubscriber.addSubscription(iknVar.getVisibility().observe(expressionResolver, new izs<DivVisibility, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindVisibility$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(DivVisibility divVisibility) {
                invoke2(divVisibility);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DivVisibility divVisibility) {
                DivBaseBinder.this.applyVisibility(view, div2View, iknVar, expressionResolver, false);
            }
        }));
    }

    private final void clearLayoutProviderVariables(View view) {
        Object tag = view.getTag(R$id.div_layout_provider_listener_id);
        view.removeOnLayoutChangeListener(tag instanceof View.OnLayoutChangeListener ? (View.OnLayoutChangeListener) tag : null);
    }

    private final void updateSizeVariable(Div2View div2View, DisplayMetrics displayMetrics, String str, DivLayoutProviderVariablesHolder divLayoutProviderVariablesHolder, int i, int i2, int i3, int i4, ExpressionResolver expressionResolver) {
        int i5;
        if (str == null || str.length() == 0 || (i5 = i2 - i) == i4 - i3) {
            return;
        }
        if (divLayoutProviderVariablesHolder.contains(str)) {
            DivActionTypedUtilsKt.logError(div2View, new Throwable("Size subscriber affects original view size. Relayout was prevented."));
            return;
        }
        Map<ExpressionResolver, Map<String, Integer>> layoutSizes$div_release = div2View.getLayoutSizes$div_release();
        Map<String, Integer> map = layoutSizes$div_release.get(expressionResolver);
        if (map == null) {
            map = new LinkedHashMap<>();
            layoutSizes$div_release.put(expressionResolver, map);
        }
        map.put(str, Integer.valueOf(BaseDivViewExtensionsKt.pxToDp(Integer.valueOf(i5), displayMetrics)));
    }

    public final void bindBackground$div_release(BindingContext bindingContext, View view, ikn iknVar, ikn iknVar2, ExpressionSubscriber expressionSubscriber, Drawable drawable) {
        bindBackground(view, bindingContext, iknVar, iknVar2, expressionSubscriber, drawable);
        bindPaddings(view, iknVar, iknVar2, bindingContext.getExpressionResolver(), expressionSubscriber);
    }

    public final void bindId$div_release(Div2View div2View, View view, String str) {
        applyId(view, str, str == null ? -1 : div2View.getViewComponent$div_release().getViewIdProvider().getViewId(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void bindView(BindingContext bindingContext, View view, com.yandex.div2.a aVar, com.yandex.div2.a aVar2) {
        DivHolderView divHolderView = (DivHolderView) view;
        divHolderView.closeAllSubscription();
        divHolderView.setDiv(aVar);
        divHolderView.setBindingContext(bindingContext);
        bind(view, bindingContext, aVar.b(), aVar2 != null ? aVar2.b() : null);
    }
}
