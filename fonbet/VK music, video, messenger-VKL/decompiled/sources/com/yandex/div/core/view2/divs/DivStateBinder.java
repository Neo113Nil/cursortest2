package com.yandex.div.core.view2.divs;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationSet;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.downloader.DivPatchCache;
import com.yandex.div.core.downloader.DivPatchManager;
import com.yandex.div.core.expression.local.DivRuntimeVisitor;
import com.yandex.div.core.expression.local.UtilsKt;
import com.yandex.div.core.expression.variables.TwoWayStringVariableBinder;
import com.yandex.div.core.expression.variables.TwoWayVariableBinder;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.core.state.DivPathUtils;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.TemporaryDivStateCache;
import com.yandex.div.core.util.DivTreeWalk;
import com.yandex.div.core.util.DivTreeWalkKt;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivTransitionBuilder;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.animations.DivComparator;
import com.yandex.div.core.view2.animations.DivTransitionsKt;
import com.yandex.div.core.view2.animations.SceneRootWatcher;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.div.core.view2.divs.widgets.ReleaseUtils;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.core.view2.reuse.ReusableTokenList;
import com.yandex.div.core.view2.state.DivStateTransitionHolder;
import com.yandex.div.data.Variable;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.logging.Severity;
import com.yandex.div.state.DivStateCache;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivContentAlignmentHorizontal;
import com.yandex.div2.DivContentAlignmentVertical;
import com.yandex.div2.DivTransitionTrigger;
import com.yandex.div2.a;
import com.yandex.div2.ma;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.dnp0;
import xsna.e9e0;
import xsna.epx;
import xsna.gzs;
import xsna.hfr;
import xsna.ikn;
import xsna.izs;
import xsna.j5g;
import xsna.kxt0;
import xsna.rli0;
import xsna.s3q0;
import xsna.vlp0;
import xsna.zcl;
import xsna.zmp0;

/* compiled from: DivStateBinder.kt */
/* loaded from: classes7.dex */
public final class DivStateBinder extends DivViewBinder<a.m, ma, DivStateLayout> {
    private static final Companion Companion = new Companion(null);
    private final DivBaseBinder baseBinder;
    private final Div2Logger div2Logger;
    private final DivActionBeaconSender divActionBeaconSender;
    private final DivActionBinder divActionBinder;
    private final DivPatchCache divPatchCache;
    private final DivPatchManager divPatchManager;
    private final DivStateCache divStateCache;
    private final DivVisibilityActionTracker divVisibilityActionTracker;
    private final ErrorCollectors errorCollectors;
    private final DivRuntimeVisitor runtimeVisitor;
    private final TemporaryDivStateCache temporaryStateCache;
    private final TwoWayStringVariableBinder variableBinder;
    private final e9e0<DivBinder> viewBinder;
    private final DivViewCreator viewCreator;

    /* compiled from: DivStateBinder.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public DivStateBinder(DivBaseBinder divBaseBinder, DivViewCreator divViewCreator, e9e0<DivBinder> e9e0Var, DivStateCache divStateCache, TemporaryDivStateCache temporaryDivStateCache, DivActionBinder divActionBinder, DivActionBeaconSender divActionBeaconSender, DivPatchManager divPatchManager, DivPatchCache divPatchCache, Div2Logger div2Logger, DivVisibilityActionTracker divVisibilityActionTracker, ErrorCollectors errorCollectors, TwoWayStringVariableBinder twoWayStringVariableBinder, DivRuntimeVisitor divRuntimeVisitor) {
        super(divBaseBinder);
        this.baseBinder = divBaseBinder;
        this.viewCreator = divViewCreator;
        this.viewBinder = e9e0Var;
        this.divStateCache = divStateCache;
        this.temporaryStateCache = temporaryDivStateCache;
        this.divActionBinder = divActionBinder;
        this.divActionBeaconSender = divActionBeaconSender;
        this.divPatchManager = divPatchManager;
        this.divPatchCache = divPatchCache;
        this.div2Logger = div2Logger;
        this.divVisibilityActionTracker = divVisibilityActionTracker;
        this.errorCollectors = errorCollectors;
        this.variableBinder = twoWayStringVariableBinder;
        this.runtimeVisitor = divRuntimeVisitor;
    }

    private final void bind(final DivStateLayout divStateLayout, final BindingContext bindingContext, ma maVar, ma maVar2, ma.a aVar, DivStatePath divStatePath) {
        BaseDivViewExtensionsKt.applyDivActions(divStateLayout, bindingContext, maVar.b, maVar.d, maVar.z, maVar.q, maVar.w, maVar.v, maVar.D, maVar.C, maVar.c, maVar.k);
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        fixAlignment(divStateLayout, maVar, maVar2, expressionResolver);
        observeStateIdVariable(divStateLayout, maVar, bindingContext, divStatePath);
        BaseDivViewExtensionsKt.bindClipChildren(divStateLayout, maVar.l, maVar2 != null ? maVar2.l : null, expressionResolver);
        final List<DivAction> list = aVar.e;
        divStateLayout.setSwipeOutCallback(list != null ? new gzs<s3q0>() { // from class: com.yandex.div.core.view2.divs.DivStateBinder$bind$1$1
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
                DivStateBinder.this.swipeOut(divStateLayout, bindingContext.getDivView(), expressionResolver, list);
            }
        } : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ad A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void bindState(DivStateLayout divStateLayout, BindingContext bindingContext, ma maVar, ma.a aVar, ma maVar2, ma.a aVar2, com.yandex.div2.a aVar3, DivStatePath divStatePath, ExpressionResolver expressionResolver, String str) {
        BindingContext bindingContext2;
        ma.a aVar4;
        ma maVar3;
        Div2View div2View;
        DivStatePath divStatePath2;
        ExpressionResolver expressionResolver2;
        View view;
        boolean z;
        ExpressionResolver expressionResolver3;
        Div2View div2View2;
        final com.yandex.div2.a aVar5;
        BindingContext bindingContext3;
        ExpressionResolver expressionResolver4;
        com.yandex.div2.a aVar6;
        Div2View div2View3;
        ma maVar4;
        ikn b;
        String id;
        List<View> buildViewsForId;
        View view2;
        com.yandex.div2.a aVar7;
        View view3;
        ma maVar5;
        ma.a aVar8;
        ReusableTokenList currentRebindReusableList$div_release;
        DivStateBinder divStateBinder = this;
        Div2View divView = bindingContext.getDivView();
        ExpressionResolver expressionResolver5 = bindingContext.getExpressionResolver();
        com.yandex.div2.a aVar9 = aVar.c;
        String str2 = aVar.d;
        ikn b2 = aVar9 != null ? aVar9.b() : null;
        DivStatePath append$div_release = divStatePath.append$div_release(str, aVar, str2);
        View childAt = divStateLayout.getChildCount() != 0 ? divStateLayout.getChildAt(0) : null;
        View uniqueViewForDiv = (aVar9 == null || (currentRebindReusableList$div_release = divView.getCurrentRebindReusableList$div_release()) == null) ? null : currentRebindReusableList$div_release.getUniqueViewForDiv(aVar9);
        if (epx.f(divStateLayout.getStateId(), str2)) {
            bindingContext2 = bindingContext;
            aVar4 = aVar;
            maVar3 = maVar;
            if (b2 != null) {
                if (childAt == null || expressionResolver == null) {
                    div2View = divView;
                    divStatePath2 = append$div_release;
                    expressionResolver2 = expressionResolver5;
                } else {
                    div2View = divView;
                    divStatePath2 = append$div_release;
                    expressionResolver2 = expressionResolver5;
                    if (DivComparator.areDivsReplaceable$default(DivComparator.INSTANCE, aVar3, aVar9, expressionResolver, expressionResolver5, null, 16, null)) {
                        z = true;
                        view = !z ? childAt : divStateBinder.getIncomingView(uniqueViewForDiv, aVar9, expressionResolver2);
                        if (!z) {
                            ReleaseUtils.INSTANCE.releaseAndRemoveChildren$div_release(divStateLayout, div2View);
                            divStateLayout.addView(view);
                        }
                        if (view != null) {
                            divStateBinder.viewBinder.get().bind(bindingContext2, view, aVar9, divStatePath2);
                        }
                    }
                }
                z = false;
                if (!z) {
                }
                if (!z) {
                }
                if (view != null) {
                }
            } else {
                div2View = divView;
                divStatePath2 = append$div_release;
                expressionResolver2 = expressionResolver5;
                ReleaseUtils.INSTANCE.releaseAndRemoveChildren$div_release(divStateLayout, div2View);
                view = null;
            }
        } else {
            if (aVar9 != null) {
                view3 = divStateBinder.getIncomingView(uniqueViewForDiv, aVar9, expressionResolver5);
                maVar5 = maVar;
                aVar8 = aVar2;
                bindingContext2 = bindingContext;
            } else {
                view3 = null;
                bindingContext2 = bindingContext;
                maVar5 = maVar;
                aVar8 = aVar2;
            }
            vlp0 replaceViewsAnimated = divStateBinder.replaceViewsAnimated(bindingContext2, maVar5, aVar, aVar8, view3, childAt);
            aVar4 = aVar;
            maVar3 = maVar5;
            view = view3;
            if (replaceViewsAnimated != null) {
                zmp0.b(divStateLayout);
                SceneRootWatcher.INSTANCE.watchFor(divStateLayout, replaceViewsAnimated);
                zmp0.a(divStateLayout, replaceViewsAnimated);
            }
            ReleaseUtils.INSTANCE.releaseAndRemoveChildren$div_release(divStateLayout, divView);
            if (view != null) {
                divStateLayout.addView(view);
                if (aVar9 != null) {
                    divStateBinder.viewBinder.get().bind(bindingContext2, view, aVar9, append$div_release);
                }
            }
            if (childAt != null) {
                divView.getDivTransitionHandler$div_release().runTransitions(divStateLayout, false);
            }
            div2View = divView;
            divStatePath2 = append$div_release;
            expressionResolver2 = expressionResolver5;
        }
        if (childAt != null) {
            childAt.startAnimation(new AnimationSet(false));
            if (!epx.f(maVar2, maVar3) || !aVar4.equals(aVar2)) {
                div2View.unbindViewFromDiv$div_release(childAt);
                if (aVar3 != null && expressionResolver != null) {
                    expressionResolver3 = expressionResolver2;
                    div2View2 = div2View;
                    aVar5 = aVar9;
                    DivVisibilityActionTracker.trackVisibilityActionsOf$default(divStateBinder.divVisibilityActionTracker, div2View2, expressionResolver, null, aVar3, null, null, 48, null);
                    divStateBinder.untrackRecursively(childAt, div2View2, expressionResolver);
                    if (view != null || b2 == null || (b2.z() == null && b2.s() == null)) {
                        bindingContext3 = bindingContext2;
                        expressionResolver4 = expressionResolver3;
                        aVar6 = aVar5;
                        div2View3 = div2View2;
                        maVar4 = maVar3;
                    } else {
                        div2View2.bindViewToDiv$div_release(view, aVar5);
                        final ExpressionResolver expressionResolver6 = expressionResolver3;
                        final View view4 = view;
                        final Div2View div2View4 = div2View2;
                        maVar4 = maVar3;
                        bindingContext3 = bindingContext2;
                        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.DivStateBinder$bindState$$inlined$doOnNextLayout$1
                            @Override // android.view.View.OnLayoutChangeListener
                            public void onLayoutChange(View view5, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                                DivVisibilityActionTracker divVisibilityActionTracker;
                                view5.removeOnLayoutChangeListener(this);
                                divVisibilityActionTracker = DivStateBinder.this.divVisibilityActionTracker;
                                DivVisibilityActionTracker.trackVisibilityActionsOf$default(divVisibilityActionTracker, div2View4, expressionResolver6, view4, aVar5, null, null, 48, null);
                            }
                        };
                        divStateBinder = this;
                        expressionResolver4 = expressionResolver6;
                        aVar6 = aVar5;
                        div2View3 = div2View4;
                        view4.addOnLayoutChangeListener(onLayoutChangeListener);
                    }
                    if (aVar3 != null && (b = aVar3.b()) != null && (id = b.getId()) != null) {
                        buildViewsForId = divStateBinder.divPatchManager.buildViewsForId(bindingContext3, id);
                        if (buildViewsForId != null) {
                            if (buildViewsForId.size() > 1) {
                                KLog kLog = KLog.INSTANCE;
                                if (kLog.isAtLeast(Severity.ERROR)) {
                                    kLog.print(6, "DivStateBinder", "Unable to patch state because there is more than 1 div in the patch");
                                }
                            } else {
                                view2 = (View) j5g.a0(buildViewsForId);
                                List<com.yandex.div2.a> patchDivListById = divStateBinder.divPatchCache.getPatchDivListById(div2View3.getDataTag(), id);
                                aVar7 = patchDivListById != null ? (com.yandex.div2.a) j5g.a0(patchDivListById) : null;
                                if (view2 != null && aVar7 != null) {
                                    ReleaseUtils.INSTANCE.releaseAndRemoveChildren$div_release(divStateLayout, div2View3);
                                    divStateLayout.addView(view2);
                                    if (DivUtilKt.getHasSightActions(aVar7.b())) {
                                        div2View3.bindViewToDiv$div_release(view2, aVar7);
                                    }
                                    divStateBinder.viewBinder.get().bind(bindingContext3, view2, aVar7, divStatePath2);
                                }
                            }
                        }
                        view2 = null;
                        List<com.yandex.div2.a> patchDivListById2 = divStateBinder.divPatchCache.getPatchDivListById(div2View3.getDataTag(), id);
                        aVar7 = patchDivListById2 != null ? (com.yandex.div2.a) j5g.a0(patchDivListById2) : null;
                        if (view2 != null) {
                            ReleaseUtils.INSTANCE.releaseAndRemoveChildren$div_release(divStateLayout, div2View3);
                            divStateLayout.addView(view2);
                            if (DivUtilKt.getHasSightActions(aVar7.b())) {
                            }
                            divStateBinder.viewBinder.get().bind(bindingContext3, view2, aVar7, divStatePath2);
                        }
                    }
                    divStateLayout.setActiveStateDiv$div_release(aVar6);
                    divStateLayout.setPath(divStatePath2);
                    if (childAt == null) {
                        divStateBinder.runtimeVisitor.createAndAttachRuntimesToState(div2View3, maVar4, divStatePath, expressionResolver4);
                        return;
                    }
                    return;
                }
            }
        }
        expressionResolver3 = expressionResolver2;
        div2View2 = div2View;
        aVar5 = aVar9;
        if (view != null) {
        }
        bindingContext3 = bindingContext2;
        expressionResolver4 = expressionResolver3;
        aVar6 = aVar5;
        div2View3 = div2View2;
        maVar4 = maVar3;
        if (aVar3 != null) {
            buildViewsForId = divStateBinder.divPatchManager.buildViewsForId(bindingContext3, id);
            if (buildViewsForId != null) {
            }
            view2 = null;
            List<com.yandex.div2.a> patchDivListById22 = divStateBinder.divPatchCache.getPatchDivListById(div2View3.getDataTag(), id);
            aVar7 = patchDivListById22 != null ? (com.yandex.div2.a) j5g.a0(patchDivListById22) : null;
            if (view2 != null) {
            }
        }
        divStateLayout.setActiveStateDiv$div_release(aVar6);
        divStateLayout.setPath(divStatePath2);
        if (childAt == null) {
        }
    }

    private final void createLayoutParams(View view) {
        view.setLayoutParams(new DivLayoutParams(-1, -2));
    }

    private final DivContentAlignmentHorizontal extractParentContentAlignmentHorizontal(View view, ExpressionResolver expressionResolver) {
        ViewParent parent = view.getParent();
        DivHolderView divHolderView = parent instanceof DivHolderView ? (DivHolderView) parent : null;
        com.yandex.div2.a div = divHolderView != null ? divHolderView.getDiv() : null;
        a.C2110a c2110a = div instanceof a.C2110a ? (a.C2110a) div : null;
        if (c2110a == null) {
            return null;
        }
        return c2110a.c.o.evaluate(expressionResolver);
    }

    private final DivContentAlignmentVertical extractParentContentAlignmentVertical(View view, ExpressionResolver expressionResolver) {
        ViewParent parent = view.getParent();
        DivHolderView divHolderView = parent instanceof DivHolderView ? (DivHolderView) parent : null;
        com.yandex.div2.a div = divHolderView != null ? divHolderView.getDiv() : null;
        a.C2110a c2110a = div instanceof a.C2110a ? (a.C2110a) div : null;
        if (c2110a == null) {
            return null;
        }
        return c2110a.c.p.evaluate(expressionResolver);
    }

    private final void fixAlignment(DivStateLayout divStateLayout, ma maVar, ma maVar2, ExpressionResolver expressionResolver) {
        DivAlignmentHorizontal alignmentHorizontal;
        DivAlignmentVertical evaluate;
        Expression<DivAlignmentHorizontal> expression = maVar.e;
        Expression<DivAlignmentVertical> expression2 = maVar.f;
        DivAlignmentVertical divAlignmentVertical = null;
        if (epx.f(expression, maVar2 != null ? maVar2.e : null)) {
            if (epx.f(expression2, maVar2 != null ? maVar2.f : null)) {
                return;
            }
        }
        if (expression == null || (alignmentHorizontal = expression.evaluate(expressionResolver)) == null) {
            DivContentAlignmentHorizontal extractParentContentAlignmentHorizontal = extractParentContentAlignmentHorizontal(divStateLayout, expressionResolver);
            alignmentHorizontal = extractParentContentAlignmentHorizontal != null ? DivUtilKt.toAlignmentHorizontal(extractParentContentAlignmentHorizontal) : null;
        }
        if (expression2 == null || (evaluate = expression2.evaluate(expressionResolver)) == null) {
            DivContentAlignmentVertical extractParentContentAlignmentVertical = extractParentContentAlignmentVertical(divStateLayout, expressionResolver);
            if (extractParentContentAlignmentVertical != null) {
                divAlignmentVertical = DivUtilKt.toAlignmentVertical(extractParentContentAlignmentVertical);
            }
        } else {
            divAlignmentVertical = evaluate;
        }
        BaseDivViewExtensionsKt.applyAlignment(divStateLayout, alignmentHorizontal, divAlignmentVertical);
    }

    private final View getIncomingView(View view, com.yandex.div2.a aVar, ExpressionResolver expressionResolver) {
        if (view != null) {
            return view;
        }
        View create = this.viewCreator.create(aVar, expressionResolver);
        createLayoutParams(create);
        return create;
    }

    private final Pair<ma.a, ma.a> getStates(ma maVar, BindingContext bindingContext, DivStateLayout divStateLayout, DivStatePath divStatePath, String str) {
        Object obj;
        String id = bindingContext.getDivView().getDivTag().getId();
        String str2 = divStatePath.getStatesString$div_release() + '/' + str;
        String state = this.temporaryStateCache.getState(id, str2);
        if (state == null) {
            state = this.divStateCache.getState(id, str2);
        }
        Object obj2 = null;
        if (state != null) {
            izs<String, s3q0> variableUpdater = divStateLayout.getVariableUpdater();
            if (variableUpdater != null) {
                variableUpdater.invoke(state);
            }
        } else {
            String str3 = maVar.H;
            state = str3 != null ? getValueFromVariable(bindingContext, str3) : null;
        }
        Iterator<T> it = maVar.I.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((ma.a) obj).d, divStateLayout.getStateId())) {
                break;
            }
        }
        ma.a aVar = (ma.a) obj;
        if (aVar == null) {
            aVar = DivUtilKt.getDefaultState(maVar, bindingContext.getExpressionResolver());
        }
        Iterator<T> it2 = maVar.I.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (epx.f(((ma.a) next).d, state)) {
                obj2 = next;
                break;
            }
        }
        ma.a aVar2 = (ma.a) obj2;
        if (aVar2 == null) {
            aVar2 = DivUtilKt.getDefaultState(maVar, bindingContext.getExpressionResolver());
        }
        return new Pair<>(aVar, aVar2);
    }

    private final String getValueFromVariable(BindingContext bindingContext, String str) {
        Variable mutableVariable;
        Object value;
        VariableController variableController = UtilsKt.getVariableController(bindingContext.getExpressionResolver());
        if (variableController == null || (mutableVariable = variableController.getMutableVariable(str)) == null || (value = mutableVariable.getValue()) == null) {
            return null;
        }
        return value.toString();
    }

    private final void observeStateIdVariable(final DivStateLayout divStateLayout, final ma maVar, final BindingContext bindingContext, final DivStatePath divStatePath) {
        String str = maVar.H;
        if (str == null) {
            return;
        }
        divStateLayout.addSubscription(this.variableBinder.bindVariable(bindingContext, str, new TwoWayVariableBinder.Callbacks() { // from class: com.yandex.div.core.view2.divs.DivStateBinder$observeStateIdVariable$subscription$1
            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void setViewStateChangeListener(izs<? super String, s3q0> izsVar) {
                DivStateLayout.this.setVariableUpdater(izsVar);
            }

            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void onVariableChanged(String str2) {
                Object obj;
                if (str2 == null || DivStateLayout.this.getStateId() == null || str2.equals(DivStateLayout.this.getStateId())) {
                    return;
                }
                Iterator<T> it = maVar.I.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (epx.f(((ma.a) obj).d, str2)) {
                            break;
                        }
                    }
                }
                bindingContext.getDivView().switchToState(divStatePath.append$div_release(DivPathUtils.getId$div_release$default(DivPathUtils.INSTANCE, maVar, null, 1, null), (ma.a) obj, str2), true);
            }
        }, divStatePath));
    }

    private final vlp0 replaceViewsAnimated(BindingContext bindingContext, ma maVar, ma.a aVar, ma.a aVar2, View view, View view2) {
        BindingContext bindingContext2;
        ExpressionResolver expressionResolver;
        com.yandex.div2.a aVar3;
        com.yandex.div2.a aVar4;
        if (view2 == null || (bindingContext2 = BaseDivViewExtensionsKt.getBindingContext(view2)) == null || (expressionResolver = bindingContext2.getExpressionResolver()) == null) {
            return setupAnimation(bindingContext, aVar, aVar2, view, view2);
        }
        ExpressionResolver expressionResolver2 = bindingContext.getExpressionResolver();
        return (!DivTransitionsKt.allowsTransitionsOnStateChange(maVar, expressionResolver2) || ((aVar2 == null || (aVar4 = aVar2.c) == null || !DivUtilKt.containsStateInnerTransitions(aVar4, expressionResolver)) && ((aVar3 = aVar.c) == null || !DivUtilKt.containsStateInnerTransitions(aVar3, expressionResolver2)))) ? setupAnimation(bindingContext, aVar, aVar2, view, view2) : setupTransitions(bindingContext.getDivView().getViewComponent$div_release().getTransitionBuilder(), bindingContext.getDivView().getViewComponent$div_release().getStateTransitionHolder(), aVar, aVar2, expressionResolver2, expressionResolver);
    }

    private final vlp0 setupAnimation(BindingContext bindingContext, ma.a aVar, ma.a aVar2, View view, View view2) {
        List<DivAnimation> list;
        vlp0 transition;
        BindingContext bindingContext2;
        List<DivAnimation> list2;
        vlp0 transition2;
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        DivAnimation divAnimation = aVar.a;
        ExpressionResolver expressionResolver2 = null;
        DivAnimation divAnimation2 = aVar2 != null ? aVar2.b : null;
        if (divAnimation == null && divAnimation2 == null) {
            return null;
        }
        dnp0 dnp0Var = new dnp0();
        if (divAnimation != null && view != null) {
            if (divAnimation.e.evaluate(expressionResolver) != DivAnimation.Name.SET) {
                list2 = Collections.singletonList(divAnimation);
            } else {
                list2 = divAnimation.d;
                if (list2 == null) {
                    list2 = EmptyList.b;
                }
            }
            for (DivAnimation divAnimation3 : list2) {
                transition2 = DivStateBinderKt.toTransition(divAnimation3, true, expressionResolver);
                if (transition2 != null) {
                    dnp0Var.c(transition2.addTarget(view).setDuration(divAnimation3.a.evaluate(expressionResolver).longValue()).setStartDelay(divAnimation3.g.evaluate(expressionResolver).longValue()).setInterpolator(DivUtilKt.getAndroidInterpolator(divAnimation3.c.evaluate(expressionResolver))));
                }
            }
        }
        if (view2 != null && (bindingContext2 = BaseDivViewExtensionsKt.getBindingContext(view2)) != null) {
            expressionResolver2 = bindingContext2.getExpressionResolver();
        }
        if (divAnimation2 != null && expressionResolver2 != null) {
            if (divAnimation2.e.evaluate(expressionResolver2) != DivAnimation.Name.SET) {
                list = Collections.singletonList(divAnimation2);
            } else {
                list = divAnimation2.d;
                if (list == null) {
                    list = EmptyList.b;
                }
            }
            for (DivAnimation divAnimation4 : list) {
                transition = DivStateBinderKt.toTransition(divAnimation4, false, expressionResolver2);
                if (transition != null) {
                    dnp0Var.c(transition.addTarget(view2).setDuration(divAnimation4.a.evaluate(expressionResolver2).longValue()).setStartDelay(divAnimation4.g.evaluate(expressionResolver2).longValue()).setInterpolator(DivUtilKt.getAndroidInterpolator(divAnimation4.c.evaluate(expressionResolver2))));
                }
            }
        }
        if (view2 != null) {
            view2.clearAnimation();
        }
        return dnp0Var;
    }

    private final vlp0 setupTransitions(DivTransitionBuilder divTransitionBuilder, DivStateTransitionHolder divStateTransitionHolder, ma.a aVar, ma.a aVar2, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        DivTreeWalk walk;
        DivTreeWalk onEnter;
        com.yandex.div2.a aVar3;
        DivTreeWalk walk2;
        DivTreeWalk onEnter2;
        hfr hfrVar = null;
        if (epx.f(aVar, aVar2)) {
            return null;
        }
        hfr j = (aVar2 == null || (aVar3 = aVar2.c) == null || (walk2 = DivTreeWalkKt.walk(aVar3, expressionResolver2)) == null || (onEnter2 = walk2.onEnter(new izs<com.yandex.div2.a, Boolean>() { // from class: com.yandex.div.core.view2.divs.DivStateBinder$setupTransitions$transition$1
            @Override // xsna.izs
            public final Boolean invoke(com.yandex.div2.a aVar4) {
                return Boolean.valueOf(!(aVar4 instanceof a.m));
            }
        })) == null) ? null : rli0.j(onEnter2, new izs<DivItemBuilderResult, Boolean>() { // from class: com.yandex.div.core.view2.divs.DivStateBinder$setupTransitions$transition$2
            @Override // xsna.izs
            public final Boolean invoke(DivItemBuilderResult divItemBuilderResult) {
                List<DivTransitionTrigger> l = divItemBuilderResult.getDiv().b().l();
                return Boolean.valueOf(l != null ? DivTransitionsKt.allowsTransitionsOnStateChange(l) : true);
            }
        });
        com.yandex.div2.a aVar4 = aVar.c;
        if (aVar4 != null && (walk = DivTreeWalkKt.walk(aVar4, expressionResolver)) != null && (onEnter = walk.onEnter(new izs<com.yandex.div2.a, Boolean>() { // from class: com.yandex.div.core.view2.divs.DivStateBinder$setupTransitions$transition$3
            @Override // xsna.izs
            public final Boolean invoke(com.yandex.div2.a aVar5) {
                return Boolean.valueOf(!(aVar5 instanceof a.m));
            }
        })) != null) {
            hfrVar = rli0.j(onEnter, new izs<DivItemBuilderResult, Boolean>() { // from class: com.yandex.div.core.view2.divs.DivStateBinder$setupTransitions$transition$4
                @Override // xsna.izs
                public final Boolean invoke(DivItemBuilderResult divItemBuilderResult) {
                    List<DivTransitionTrigger> l = divItemBuilderResult.getDiv().b().l();
                    return Boolean.valueOf(l != null ? DivTransitionsKt.allowsTransitionsOnStateChange(l) : true);
                }
            });
        }
        dnp0 buildTransitions = divTransitionBuilder.buildTransitions(j, hfrVar, expressionResolver2, expressionResolver);
        divStateTransitionHolder.append(buildTransitions);
        return buildTransitions;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void swipeOut(final DivStateLayout divStateLayout, final Div2View div2View, final ExpressionResolver expressionResolver, final List<DivAction> list) {
        div2View.bulkActions$div_release(new gzs<s3q0>() { // from class: com.yandex.div.core.view2.divs.DivStateBinder$swipeOut$1
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
                DivActionBinder divActionBinder;
                divActionBinder = DivStateBinder.this.divActionBinder;
                final Div2View div2View2 = div2View;
                final ExpressionResolver expressionResolver2 = expressionResolver;
                List<DivAction> list2 = list;
                final DivStateBinder divStateBinder = DivStateBinder.this;
                final DivStateLayout divStateLayout2 = divStateLayout;
                divActionBinder.handleActions$div_release(div2View2, expressionResolver2, list2, "state_swipe_out", new izs<DivAction, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivStateBinder$swipeOut$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // xsna.izs
                    public /* bridge */ /* synthetic */ s3q0 invoke(DivAction divAction) {
                        invoke2(divAction);
                        return s3q0.a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DivAction divAction) {
                        Div2Logger div2Logger;
                        DivActionBeaconSender divActionBeaconSender;
                        div2Logger = DivStateBinder.this.div2Logger;
                        div2Logger.logSwipedAway(div2View2, expressionResolver2, divStateLayout2, divAction);
                        divActionBeaconSender = DivStateBinder.this.divActionBeaconSender;
                        divActionBeaconSender.sendSwipeOutActionBeacon(divAction, expressionResolver2);
                    }
                });
            }
        });
    }

    private final void untrackRecursively(View view, Div2View div2View, ExpressionResolver expressionResolver) {
        Div2View div2View2;
        ExpressionResolver expressionResolver2;
        if (view instanceof ViewGroup) {
            kxt0 kxt0Var = new kxt0((ViewGroup) view);
            while (kxt0Var.hasNext()) {
                View next = kxt0Var.next();
                com.yandex.div2.a unbindViewFromDiv$div_release = div2View.unbindViewFromDiv$div_release(next);
                if (unbindViewFromDiv$div_release != null) {
                    div2View2 = div2View;
                    expressionResolver2 = expressionResolver;
                    DivVisibilityActionTracker.trackVisibilityActionsOf$default(this.divVisibilityActionTracker, div2View2, expressionResolver2, null, unbindViewFromDiv$div_release, null, null, 48, null);
                } else {
                    div2View2 = div2View;
                    expressionResolver2 = expressionResolver;
                }
                untrackRecursively(next, div2View2, expressionResolver2);
                div2View = div2View2;
                expressionResolver = expressionResolver2;
            }
        }
    }

    public void bindView(final BindingContext bindingContext, DivStateLayout divStateLayout, a.m mVar, final DivStatePath divStatePath) {
        DivStatePath divStatePath2;
        ma maVar;
        ma maVar2 = mVar.c;
        a.m div = divStateLayout.getDiv();
        BindingContext bindingContext2 = divStateLayout.getBindingContext();
        ExpressionResolver expressionResolver = bindingContext2 != null ? bindingContext2.getExpressionResolver() : null;
        String id$div_release = DivPathUtils.INSTANCE.getId$div_release(maVar2, new gzs<s3q0>() { // from class: com.yandex.div.core.view2.divs.DivStateBinder$bindView$id$1
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
                ErrorCollectors errorCollectors;
                errorCollectors = DivStateBinder.this.errorCollectors;
                errorCollectors.getOrCreate(bindingContext.getDivView().getDataTag(), bindingContext.getDivView().getDivData()).logError(ParsingExceptionKt.missingValue("id", divStatePath.toString()));
            }
        });
        DivStatePath divStatePath3 = divStatePath;
        Pair<ma.a, ma.a> states = getStates(maVar2, bindingContext, divStateLayout, divStatePath3, id$div_release);
        ma.a d = states.d();
        ma.a g = states.g();
        if (d == null || g == null) {
            return;
        }
        com.yandex.div2.a activeStateDiv$div_release = divStateLayout.getActiveStateDiv$div_release();
        if (div != mVar) {
            this.baseBinder.bindView(bindingContext, divStateLayout, mVar, activeStateDiv$div_release);
            if (div != null) {
                divStatePath2 = divStatePath3;
                maVar = div.c;
            } else {
                divStatePath2 = divStatePath3;
                maVar = null;
            }
            bind(divStateLayout, bindingContext, maVar2, maVar, g, divStatePath2);
            divStatePath3 = divStatePath2;
        }
        bindState(divStateLayout, bindingContext, maVar2, g, div != null ? div.c : null, d, activeStateDiv$div_release, divStatePath3, expressionResolver, id$div_release);
    }
}
