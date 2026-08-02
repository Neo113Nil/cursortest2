package com.yandex.div.core.view2;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.vkontakte.android.R;
import com.yandex.div.DivDataTag;
import com.yandex.div.core.Div2Context;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivCreationTracker;
import com.yandex.div.core.DivCustomContainerChildFactory;
import com.yandex.div.core.DivDataChangeListener;
import com.yandex.div.core.DivKit;
import com.yandex.div.core.DivViewConfig;
import com.yandex.div.core.DivViewDataPreloader;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.ObserverList;
import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.dagger.Div2Component;
import com.yandex.div.core.dagger.Div2ViewComponent;
import com.yandex.div.core.downloader.PersistentDivDataObserver;
import com.yandex.div.core.expression.ExpressionFallbacksHelperKt;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.ExpressionsRuntime;
import com.yandex.div.core.expression.local.RuntimeStore;
import com.yandex.div.core.expression.local.RuntimeStoreImpl;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.player.DivVideoActionHandler;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.DivViewState;
import com.yandex.div.core.state.StateConflictException;
import com.yandex.div.core.timer.DivTimerEventDispatcher;
import com.yandex.div.core.tooltip.DivTooltipController;
import com.yandex.div.core.util.DivTreeWalkKt;
import com.yandex.div.core.util.SingleTimeOnAttachCallback;
import com.yandex.div.core.view2.animations.DivComparator;
import com.yandex.div.core.view2.animations.DivTransitionHandler;
import com.yandex.div.core.view2.animations.DivTransitionsKt;
import com.yandex.div.core.view2.animations.SceneRootWatcher;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.DivLayoutProviderVariablesHolder;
import com.yandex.div.core.view2.divs.widgets.MediaReleaseViewVisitor;
import com.yandex.div.core.view2.divs.widgets.ReleaseUtils;
import com.yandex.div.core.view2.divs.widgets.ReleaseViewVisitor;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.logging.bind.BindingEventReporter;
import com.yandex.div.core.view2.logging.bind.BindingEventReporterProvider;
import com.yandex.div.core.view2.logging.bind.ForceRebindReporter;
import com.yandex.div.core.view2.logging.bind.SimpleRebindReporter;
import com.yandex.div.core.view2.logging.patch.PatchEventReporterProvider;
import com.yandex.div.core.view2.reuse.ComplexRebindReporter;
import com.yandex.div.core.view2.reuse.InputFocusTracker;
import com.yandex.div.core.view2.reuse.RebindTask;
import com.yandex.div.core.view2.reuse.ReusableTokenList;
import com.yandex.div.data.VariableMutationException;
import com.yandex.div.histogram.Div2ViewHistogramReporter;
import com.yandex.div.histogram.RenderConfiguration;
import com.yandex.div.histogram.reporter.HistogramReporter;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.core.VariableMutationHandler;
import com.yandex.div.internal.util.CollectionsKt;
import com.yandex.div.internal.widget.FrameContainerLayout;
import com.yandex.div.internal.widget.menu.OverflowMenuSubscriber$Listener;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.util.DivDataUtilsKt;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivTransitionSelector;
import com.yandex.div2.DivTransitionTrigger;
import com.yandex.div2.a;
import com.yandex.div2.j3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.b0u0;
import xsna.dnp0;
import xsna.epx;
import xsna.g5g;
import xsna.gzs;
import xsna.iut0;
import xsna.izs;
import xsna.j5g;
import xsna.msy;
import xsna.p5h0;
import xsna.rli0;
import xsna.s3q0;
import xsna.sk3;
import xsna.uki0;
import xsna.vlp0;
import xsna.wc2;
import xsna.ymp0;
import xsna.zcl;
import xsna.zmp0;

/* compiled from: Div2View.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes7.dex */
public class Div2View extends FrameContainerLayout implements DivViewFacade {
    private DivActionHandler actionHandler;
    private final boolean bindOnAttachEnabled;
    private SingleTimeOnAttachCallback bindOnAttachRunnable;
    private BindingContext bindingContext;
    private final ViewBindingProvider bindingProvider;
    private final BindingEventReporterProvider bindingReporterProvider;
    private final BulkActionHandler bulkActionsHandler;
    private ViewTreeObserver.OnPreDrawListener clearVariablesListener;
    private final boolean complexRebindEnabled;
    private DivViewConfig config;
    private final long constructorCallTime;
    private final Div2Context context;
    private DivDataTag dataTag;
    private final Div2Component div2Component;
    private final Div2Builder divBuilder;
    private j3 divData;
    private final List<Object> divDataChangedObservers;
    private DivTimerEventDispatcher divTimerEventDispatcher;
    private final DivTransitionHandler divTransitionHandler;
    private boolean drawWasSkipped;
    private boolean forceCanvasClipping;
    private final GestureDetector gestureDetector;
    private final Lazy histogramReporter$delegate;
    private boolean inMiddleOfBind;
    private final InputFocusTracker inputFocusTracker;
    private final Map<ExpressionResolver, Map<String, Integer>> layoutSizes;
    private final List<LoadReference> loadReferences;
    private final Object monitor;
    private RuntimeStore oldRuntimeStore;
    private final List<OverflowMenuSubscriber$Listener> overflowMenuListeners;
    private final PatchEventReporterProvider patchReporterProvider;
    private final ObserverList<PersistentDivDataObserver> persistentDivDataObservers;
    private DivDataTag prevDataTag;
    private RebindTask rebindTask;
    private final gzs<RenderConfiguration> renderConfig;
    private SingleTimeOnAttachCallback reportBindingFinishedRunnable;
    private SingleTimeOnAttachCallback reportBindingResumedRunnable;
    private RuntimeStore runtimeStore;
    private long stateId;
    private long timeCreated;
    private final Map<j3, DivLayoutProviderVariablesHolder> variablesHolders;
    private final Div2ViewComponent viewComponent;
    private final String viewCreateCallType;
    private final WeakHashMap<View, a> viewToDivBindings;

    /* compiled from: Div2View.kt */
    public final class BulkActionHandler {
        private int bulkModeDepth;
        private boolean isPendingStateTemporary = true;
        private final List<DivStatePath> pendingPaths = new ArrayList();
        private j3.b pendingState;

        public BulkActionHandler() {
        }

        private final void reset() {
            this.pendingState = null;
            this.isPendingStateTemporary = true;
            this.pendingPaths.clear();
        }

        public final void bulkActions(gzs<s3q0> gzsVar) {
            this.bulkModeDepth++;
            gzsVar.invoke();
            int i = this.bulkModeDepth - 1;
            this.bulkModeDepth = i;
            if (i == 0) {
                runBulkActions();
            }
        }

        public final void runBulkActions() {
            j3.b bVar = this.pendingState;
            if (bVar == null) {
                return;
            }
            long j = bVar.b;
            if (j != Div2View.this.getStateId$div_release()) {
                Div2View.this.switchToState(j, this.isPendingStateTemporary);
            } else if (Div2View.this.getChildCount() > 0) {
                try {
                    Div2View.this.getViewComponent$div_release().getStateSwitcher().switchStates(bVar, CollectionsKt.immutableCopy(this.pendingPaths), Div2View.this.getExpressionResolver());
                } catch (StateConflictException e) {
                    DivActionTypedUtilsKt.logError(Div2View.this, e);
                    Div2View.this.resetToInitialState();
                }
            }
            reset();
        }

        public final void switchMultipleStates(j3.b bVar, List<DivStatePath> list, boolean z) {
            j3.b bVar2 = this.pendingState;
            if (bVar2 != null && !epx.f(bVar, bVar2)) {
                reset();
            }
            this.pendingState = bVar;
            this.isPendingStateTemporary = this.isPendingStateTemporary && z;
            List<DivStatePath> list2 = list;
            g5g.y(list2, this.pendingPaths);
            Div2View div2View = Div2View.this;
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                div2View.getDiv2Component$div_release().getStateManager().updateStates(div2View.getDivTag().getId(), (DivStatePath) it.next(), z);
            }
            if (this.bulkModeDepth == 0) {
                runBulkActions();
            }
        }

        public final void switchState(j3.b bVar, DivStatePath divStatePath, boolean z) {
            switchMultipleStates(bVar, Collections.singletonList(divStatePath), z);
        }
    }

    private Div2View(Div2Context div2Context, AttributeSet attributeSet, int i, long j) {
        super(div2Context, attributeSet, i);
        this.context = div2Context;
        this.constructorCallTime = j;
        this.div2Component = getContext$div_release().getDiv2Component$div_release();
        this.viewComponent = getDiv2Component$div_release().viewComponent().divView(this).build();
        this.bindOnAttachEnabled = getDiv2Component$div_release().isBindOnAttachEnabled();
        this.complexRebindEnabled = getDiv2Component$div_release().isComplexRebindEnabled();
        this.bindingProvider = getViewComponent$div_release().getBindingProvider();
        this.bindingReporterProvider = new BindingEventReporterProvider(this);
        this.patchReporterProvider = new PatchEventReporterProvider(this);
        this.divBuilder = getContext$div_release().getDiv2Component$div_release().getDiv2Builder();
        this.loadReferences = new ArrayList();
        this.overflowMenuListeners = new ArrayList();
        this.divDataChangedObservers = new ArrayList();
        this.persistentDivDataObservers = new ObserverList<>();
        this.viewToDivBindings = new WeakHashMap<>();
        this.bulkActionsHandler = new BulkActionHandler();
        this.runtimeStore = RuntimeStore.Companion.getEMPTY();
        this.bindingContext = new BindingContext(this, ExpressionResolver.EMPTY);
        this.monitor = new Object();
        this.stateId = DivDataUtilsKt.getINVALID_STATE_ID(j3.j);
        this.config = DivViewConfig.DEFAULT;
        this.renderConfig = new gzs<RenderConfiguration>() { // from class: com.yandex.div.core.view2.Div2View$renderConfig$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // xsna.gzs
            public final RenderConfiguration invoke() {
                return DivKit.Companion.getInstance(Div2View.this.getContext$div_release()).getComponent$div_release().getHistogramRecordConfiguration().getRenderConfiguration().get();
            }
        };
        this.histogramReporter$delegate = msy.a(LazyThreadSafetyMode.NONE, new gzs<Div2ViewHistogramReporter>() { // from class: com.yandex.div.core.view2.Div2View$histogramReporter$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // xsna.gzs
            public final Div2ViewHistogramReporter invoke() {
                gzs gzsVar;
                final Div2View div2View = Div2View.this;
                gzs<HistogramReporter> gzsVar2 = new gzs<HistogramReporter>() { // from class: com.yandex.div.core.view2.Div2View$histogramReporter$2.1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // xsna.gzs
                    public final HistogramReporter invoke() {
                        return Div2View.this.getDiv2Component$div_release().getHistogramReporter();
                    }
                };
                gzsVar = Div2View.this.renderConfig;
                return new Div2ViewHistogramReporter(gzsVar2, gzsVar);
            }
        });
        this.gestureDetector = new GestureDetector(getContext$div_release(), new GestureDetector.SimpleOnGestureListener() { // from class: com.yandex.div.core.view2.Div2View$gestureDetector$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                Div2View div2View = Div2View.this;
                BaseDivViewExtensionsKt.clearFocusOnClick(div2View, div2View.getInputFocusTracker$div_release());
                return true;
            }
        }, new Handler(Looper.getMainLooper()));
        this.inputFocusTracker = getViewComponent$div_release().getInputFocusTracker();
        this.layoutSizes = new LinkedHashMap();
        this.variablesHolders = new LinkedHashMap();
        DivDataTag divDataTag = DivDataTag.INVALID;
        this.dataTag = divDataTag;
        this.prevDataTag = divDataTag;
        this.timeCreated = -1L;
        this.viewCreateCallType = getDiv2Component$div_release().getDivCreationTracker().getViewCreateCallType();
        this.drawWasSkipped = true;
        this.divTransitionHandler = new DivTransitionHandler(this);
        this.timeCreated = DivCreationTracker.Companion.getCurrentUptimeMillis();
        getDiv2Component$div_release().getReleaseManager().observeDivLifecycle(this);
    }

    private void addNewStateViewWithTransition(j3 j3Var, j3 j3Var2, a aVar, j3.b bVar, View view, boolean z, boolean z2) {
        vlp0 prepareTransition = z ? prepareTransition(j3Var, j3Var2, aVar, bVar.a) : null;
        if (prepareTransition != null) {
            p5h0 p5h0Var = (p5h0) getTag(R.id.transition_current_scene);
            if (p5h0Var != null) {
                p5h0Var.d = new wc2(this, 3);
            }
        } else {
            ReleaseUtils.INSTANCE.releaseAndRemoveChildren$div_release(this, this);
        }
        if (z2) {
            getDiv2Component$div_release().getDivBinder().bind(getBindingContext$div_release(), view, bVar.a, DivStatePath.Companion.fromState$div_release(bVar));
        }
        if (prepareTransition == null) {
            addView(view);
            getViewComponent$div_release().getErrorMonitor().connect(this);
            return;
        }
        zmp0.b(this);
        p5h0 p5h0Var2 = new p5h0();
        p5h0Var2.a = this;
        p5h0Var2.b = view;
        SceneRootWatcher.INSTANCE.watchFor(p5h0Var2, prepareTransition);
        zmp0.d(p5h0Var2, prepareTransition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addNewStateViewWithTransition$lambda$41(Div2View div2View) {
        ReleaseUtils.INSTANCE.releaseAndRemoveChildren$div_release(div2View, div2View);
    }

    private View buildViewAndUpdateState(j3.b bVar, long j, boolean z) {
        getDiv2Component$div_release().getStateManager().updateState(getDataTag(), j, z);
        View buildView = this.divBuilder.buildView(bVar.a, getBindingContext$div_release(), DivStatePath.Companion.fromState$div_release(bVar));
        getDiv2Component$div_release().getDivBinder().attachIndicators$div_release();
        return buildView;
    }

    public static /* synthetic */ View buildViewAndUpdateState$default(Div2View div2View, j3.b bVar, long j, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildViewAndUpdateState");
        }
        if ((i & 4) != 0) {
            z = true;
        }
        return div2View.buildViewAndUpdateState(bVar, j, z);
    }

    private View buildViewAsyncAndUpdateState(final j3.b bVar, long j, boolean z) {
        getDiv2Component$div_release().getStateManager().updateState(getDataTag(), j, z);
        final DivStatePath fromState$div_release = DivStatePath.Companion.fromState$div_release(bVar);
        final View createView = this.divBuilder.createView(bVar.a, getBindingContext$div_release(), fromState$div_release);
        if (this.bindOnAttachEnabled) {
            setBindOnAttachRunnable$div_release(new SingleTimeOnAttachCallback(this, new gzs<s3q0>() { // from class: com.yandex.div.core.view2.Div2View$buildViewAsyncAndUpdateState$1
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
                    boolean isExpressionResolveFail;
                    Div2View div2View = Div2View.this;
                    View view = createView;
                    j3.b bVar2 = bVar;
                    try {
                        div2View.getDiv2Component$div_release().getDivBinder().bind(div2View.getBindingContext$div_release(), view, bVar2.a, fromState$div_release);
                    } catch (ParsingException e) {
                        isExpressionResolveFail = ExpressionFallbacksHelperKt.isExpressionResolveFail(e);
                        if (!isExpressionResolveFail) {
                            throw e;
                        }
                    }
                    Div2View.this.getDiv2Component$div_release().getDivBinder().attachIndicators$div_release();
                }
            }));
            return createView;
        }
        getDiv2Component$div_release().getDivBinder().bind(getBindingContext$div_release(), createView, bVar.a, fromState$div_release);
        if (isAttachedToWindow()) {
            getDiv2Component$div_release().getDivBinder().attachIndicators$div_release();
            return createView;
        }
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.div.core.view2.Div2View$buildViewAsyncAndUpdateState$$inlined$doOnAttach$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                this.removeOnAttachStateChangeListener(this);
                this.getDiv2Component$div_release().getDivBinder().attachIndicators$div_release();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
            }
        });
        return createView;
    }

    public static /* synthetic */ View buildViewAsyncAndUpdateState$default(Div2View div2View, j3.b bVar, long j, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildViewAsyncAndUpdateState");
        }
        if ((i & 4) != 0) {
            z = true;
        }
        return div2View.buildViewAsyncAndUpdateState(bVar, j, z);
    }

    private void cancelImageLoads() {
        Iterator<T> it = this.loadReferences.iterator();
        while (it.hasNext()) {
            ((LoadReference) it.next()).cancel();
        }
        this.loadReferences.clear();
    }

    private boolean complexRebind(j3 j3Var, j3 j3Var2, ComplexRebindReporter complexRebindReporter) {
        j3.b stateToBind = getStateToBind(j3Var);
        if (stateToBind == null) {
            complexRebindReporter.onComplexRebindFatalNoState();
            return false;
        }
        getHistogramReporter().onRebindingStarted();
        setDivData$div_release(j3Var);
        RebindTask rebindTask = this.rebindTask;
        if (rebindTask == null) {
            RebindTask rebindTask2 = new RebindTask(this, getDiv2Component$div_release().getDivBinder(), getOldExpressionResolver$div_release(), getExpressionResolver(), complexRebindReporter);
            this.rebindTask = rebindTask2;
            rebindTask = rebindTask2;
        }
        getDiv2Component$div_release().getStateManager().updateState(getDataTag(), stateToBind.b, false);
        if (!rebindTask.prepareAndRebind(j3Var2, j3Var, (ViewGroup) getView().getChildAt(0), DivStatePath.Companion.fromState$div_release(stateToBind))) {
            return false;
        }
        requestLayout();
        getHistogramReporter().onRebindingFinished();
        return true;
    }

    private void discardChildrenVisibility() {
        ExpressionResolver expressionResolver;
        DivVisibilityActionTracker visibilityActionTracker = getDiv2Component$div_release().getVisibilityActionTracker();
        for (Map.Entry<View, a> entry : this.viewToDivBindings.entrySet()) {
            View key = entry.getKey();
            a value = entry.getValue();
            BindingContext bindingContext = BaseDivViewExtensionsKt.getBindingContext(key);
            if (bindingContext != null && (expressionResolver = bindingContext.getExpressionResolver()) != null) {
                DivVisibilityActionTracker.trackVisibilityActionsOf$default(visibilityActionTracker, this, expressionResolver, null, value, null, null, 48, null);
            }
        }
    }

    private void discardStateVisibility(j3.b bVar) {
        DivVisibilityActionTracker.trackVisibilityActionsOf$default(getDiv2Component$div_release().getVisibilityActionTracker(), this, getExpressionResolver(), null, bVar.a, null, null, 48, null);
    }

    private boolean forceSwitchToState(long j, boolean z) {
        Object obj;
        Object obj2;
        setStateId$div_release(j);
        DivViewState currentState = getCurrentState();
        Long valueOf = currentState != null ? Long.valueOf(currentState.getCurrentDivStateId()) : null;
        j3 divData = getDivData();
        if (divData == null) {
            return false;
        }
        List<j3.b> list = divData.c;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            long j2 = ((j3.b) obj).b;
            if (valueOf != null && j2 == valueOf.longValue()) {
                break;
            }
        }
        j3.b bVar = (j3.b) obj;
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (((j3.b) obj2).b == j) {
                break;
            }
        }
        j3.b bVar2 = (j3.b) obj2;
        if (bVar2 == null) {
            return false;
        }
        if (bVar != null) {
            discardStateVisibility(bVar);
        }
        trackStateVisibility(bVar2);
        boolean areDivsReplaceable$default = DivComparator.areDivsReplaceable$default(DivComparator.INSTANCE, bVar != null ? bVar.a : null, bVar2.a, getExpressionResolver(), getExpressionResolver(), null, 16, null);
        addNewStateViewWithTransition(divData, divData, bVar != null ? bVar.a : null, bVar2, areDivsReplaceable$default ? updateState(j, z) : buildViewAndUpdateState(bVar2, j, z), DivTransitionsKt.allowsTransitionsOnDataChange(divData, getExpressionResolver()), areDivsReplaceable$default);
        return true;
    }

    private DivVideoActionHandler getDivVideoActionHandler() {
        return getDiv2Component$div_release().getDivVideoActionHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Div2ViewHistogramReporter getHistogramReporter() {
        return (Div2ViewHistogramReporter) this.histogramReporter$delegate.getValue();
    }

    private ExpressionResolver getResolver(RuntimeStore runtimeStore) {
        ExpressionsRuntime rootRuntime;
        ExpressionResolverImpl expressionResolver;
        RuntimeStoreImpl runtimeStoreImpl = runtimeStore instanceof RuntimeStoreImpl ? (RuntimeStoreImpl) runtimeStore : null;
        return (runtimeStoreImpl == null || (rootRuntime = runtimeStoreImpl.getRootRuntime()) == null || (expressionResolver = rootRuntime.getExpressionResolver()) == null) ? ExpressionResolver.EMPTY : expressionResolver;
    }

    private j3.b getStateToBind(j3 j3Var) {
        Object obj;
        Iterator<T> it = j3Var.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((j3.b) obj).b == getStateId$div_release()) {
                break;
            }
        }
        j3.b bVar = (j3.b) obj;
        return bVar == null ? (j3.b) j5g.a0(j3Var.c) : bVar;
    }

    private DivTooltipController getTooltipController() {
        return getDiv2Component$div_release().getTooltipController();
    }

    private uki0<DivItemBuilderResult> itemSequenceForTransition(j3 j3Var, a aVar, final ExpressionResolver expressionResolver) {
        DivTransitionSelector divTransitionSelector;
        Expression<DivTransitionSelector> expression;
        final sk3 sk3Var = new sk3();
        if (j3Var == null || (expression = j3Var.e) == null || (divTransitionSelector = expression.evaluate(expressionResolver)) == null) {
            divTransitionSelector = DivTransitionSelector.NONE;
        }
        sk3Var.addLast(divTransitionSelector);
        return rli0.j(DivTreeWalkKt.walk(aVar, expressionResolver).onEnter(new izs<a, Boolean>() { // from class: com.yandex.div.core.view2.Div2View$itemSequenceForTransition$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public final Boolean invoke(a aVar2) {
                if (aVar2 instanceof a.m) {
                    sk3Var.addLast(((a.m) aVar2).c.L.evaluate(expressionResolver));
                }
                return Boolean.TRUE;
            }
        }).onLeave(new izs<a, s3q0>() { // from class: com.yandex.div.core.view2.Div2View$itemSequenceForTransition$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(a aVar2) {
                invoke2(aVar2);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(a aVar2) {
                if (aVar2 instanceof a.m) {
                    sk3Var.removeLast();
                }
            }
        }), new izs<DivItemBuilderResult, Boolean>() { // from class: com.yandex.div.core.view2.Div2View$itemSequenceForTransition$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public final Boolean invoke(DivItemBuilderResult divItemBuilderResult) {
                boolean allowsTransitionsOnDataChange;
                List<DivTransitionTrigger> l = divItemBuilderResult.getDiv().b().l();
                if (l != null) {
                    allowsTransitionsOnDataChange = DivTransitionsKt.allowsTransitionsOnDataChange(l);
                } else {
                    DivTransitionSelector g = sk3Var.g();
                    allowsTransitionsOnDataChange = g != null ? DivTransitionsKt.allowsTransitionsOnDataChange(g) : false;
                }
                return Boolean.valueOf(allowsTransitionsOnDataChange);
            }
        });
    }

    private void notifyBindEnded() {
        setInMiddleOfBind$div_release(false);
        Iterator<PersistentDivDataObserver> it = this.persistentDivDataObservers.iterator();
        while (it.hasNext()) {
            it.next().onAfterDivDataChanged();
        }
    }

    private void notifyBindStarted() {
        if (getInMiddleOfBind$div_release()) {
            DivActionTypedUtilsKt.logError(this, new RuntimeException("New binding started when previous not ended!"));
        }
        setInMiddleOfBind$div_release(true);
        Iterator<PersistentDivDataObserver> it = this.persistentDivDataObservers.iterator();
        while (it.hasNext()) {
            it.next().onBeforeDivDataChanged();
        }
    }

    private vlp0 prepareTransition(j3 j3Var, final j3 j3Var2, a aVar, a aVar2) {
        if (aVar == aVar2) {
            return null;
        }
        final dnp0 buildTransitions = getViewComponent$div_release().getTransitionBuilder().buildTransitions(aVar != null ? itemSequenceForTransition(j3Var, aVar, getOldExpressionResolver$div_release()) : null, aVar2 != null ? itemSequenceForTransition(j3Var2, aVar2, getExpressionResolver()) : null, getOldExpressionResolver$div_release(), getExpressionResolver());
        if (buildTransitions.b.size() == 0) {
            return null;
        }
        final DivDataChangeListener divDataChangeListener = getDiv2Component$div_release().getDivDataChangeListener();
        divDataChangeListener.beforeAnimatedDataChange(this, j3Var2);
        buildTransitions.addListener(new ymp0() { // from class: com.yandex.div.core.view2.Div2View$prepareTransition$$inlined$doOnEnd$1
            @Override // xsna.ymp0, xsna.vlp0.i
            public void onTransitionEnd(vlp0 vlp0Var) {
                divDataChangeListener.afterAnimatedDataChange(this, j3Var2);
                vlp0.this.removeListener(this);
            }
        });
        return buildTransitions;
    }

    private void rebind(j3 j3Var, boolean z, SimpleRebindReporter simpleRebindReporter) {
        try {
            if (getChildCount() == 0) {
                simpleRebindReporter.onSimpleRebindNoChild();
                updateNow(j3Var, getDataTag(), simpleRebindReporter);
                return;
            }
            j3.b stateToBind = getStateToBind(j3Var);
            if (stateToBind == null) {
                simpleRebindReporter.onSimpleRebindFatalNoState();
                return;
            }
            getHistogramReporter().onRebindingStarted();
            ErrorCollector orNull = getViewComponent$div_release().getErrorCollectors().getOrNull(getDataTag(), getDivData());
            if (orNull != null) {
                orNull.cleanRuntimeWarningsAndErrors();
            }
            setDivData$div_release(j3Var);
            getDiv2Component$div_release().getStateManager().updateState(getDataTag(), stateToBind.b, true);
            getDiv2Component$div_release().getDivBinder().bind(getBindingContext$div_release(), getChildAt(0), stateToBind.a, DivStatePath.Companion.fromState$div_release(stateToBind));
            requestLayout();
            if (z) {
                getDiv2Component$div_release().getDivStateChangeListener().onDivAnimatedStateChanged(this);
            }
            tryAttachVariableTriggers(j3Var);
            getHistogramReporter().onRebindingFinished();
            simpleRebindReporter.onSimpleRebindSuccess();
        } catch (Exception e) {
            simpleRebindReporter.onSimpleRebindException(e);
            updateNow(j3Var, getDataTag(), simpleRebindReporter);
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("", e);
            }
        }
    }

    private void sendCreationHistograms() {
        if (this.timeCreated < 0) {
            return;
        }
        getDiv2Component$div_release().getDivCreationTracker().sendHistograms(this.constructorCallTime, this.timeCreated, getDiv2Component$div_release().getHistogramReporter(), this.viewCreateCallType);
        this.timeCreated = -1L;
    }

    private j3.b state(j3 j3Var) {
        Object obj;
        long stateId = stateId(j3Var);
        Iterator<T> it = j3Var.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((j3.b) obj).b == stateId) {
                break;
            }
        }
        return (j3.b) obj;
    }

    private long stateId(j3 j3Var) {
        DivViewState currentState = getCurrentState();
        return currentState != null ? currentState.getCurrentDivStateId() : DivDataUtilsKt.getInitialStateId(j3Var);
    }

    private void stopLoadAndSubscriptions() {
        this.viewToDivBindings.clear();
        cancelTooltips();
        clearSubscriptions();
        this.divDataChangedObservers.clear();
    }

    private boolean switchToDivData(j3 j3Var, j3 j3Var2, ForceRebindReporter forceRebindReporter) {
        Div2View div2View;
        View buildViewAndUpdateState$default;
        j3.b state = j3Var != null ? state(j3Var) : null;
        j3.b state2 = state(j3Var2);
        setStateId$div_release(stateId(j3Var2));
        if (state2 == null) {
            forceRebindReporter.onForceRebindFatalNoState();
            return false;
        }
        if (j3Var == null) {
            div2View = this;
            buildViewAndUpdateState$default = buildViewAsyncAndUpdateState$default(div2View, state2, getStateId$div_release(), false, 4, null);
        } else {
            div2View = this;
            buildViewAndUpdateState$default = buildViewAndUpdateState$default(div2View, state2, getStateId$div_release(), false, 4, null);
        }
        View view = buildViewAndUpdateState$default;
        if (state != null) {
            discardStateVisibility(state);
        }
        trackStateVisibility(state2);
        div2View.addNewStateViewWithTransition(j3Var, j3Var2, state != null ? state.a : null, state2, view, (j3Var != null && DivTransitionsKt.allowsTransitionsOnDataChange(j3Var, getOldExpressionResolver$div_release())) || DivTransitionsKt.allowsTransitionsOnDataChange(j3Var2, getExpressionResolver()), false);
        if (j3Var != null) {
            forceRebindReporter.onForceRebindSuccess();
        } else {
            forceRebindReporter.onFirstBindingCompleted();
        }
        return true;
    }

    private void trackStateVisibility(j3.b bVar) {
        DivVisibilityActionTracker.trackVisibilityActionsOf$default(getDiv2Component$div_release().getVisibilityActionTracker(), this, getExpressionResolver(), getView(), bVar.a, null, null, 48, null);
    }

    private void tryAttachVariableTriggers(j3 j3Var) {
        j3.b state;
        if ((this.bindOnAttachEnabled && !getView().isAttachedToWindow()) || j3Var == null || (state = state(j3Var)) == null) {
            return;
        }
        getViewComponent$div_release().getRuntimeVisitor().createAndAttachRuntimes(state.a, DivStatePath.Companion.fromState$div_release(state), this);
    }

    private boolean updateNow(j3 j3Var, DivDataTag divDataTag, ForceRebindReporter forceRebindReporter) {
        j3 divData = getDivData();
        if (divData == null) {
            getHistogramReporter().onBindingStarted();
        } else {
            getHistogramReporter().onRebindingStarted();
        }
        cleanup(false);
        setDataTag$div_release(divDataTag);
        setDivData$div_release(j3Var);
        boolean switchToDivData = switchToDivData(divData, j3Var, forceRebindReporter);
        tryAttachVariableTriggers(j3Var);
        if (divData != null) {
            getHistogramReporter().onRebindingFinished();
            return switchToDivData;
        }
        if (!this.bindOnAttachEnabled) {
            getHistogramReporter().onBindingFinished();
            return switchToDivData;
        }
        getHistogramReporter().onBindingPaused();
        this.reportBindingResumedRunnable = new SingleTimeOnAttachCallback(this, new gzs<s3q0>() { // from class: com.yandex.div.core.view2.Div2View$updateNow$1
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
                Div2ViewHistogramReporter histogramReporter;
                histogramReporter = Div2View.this.getHistogramReporter();
                histogramReporter.onBindingResumed();
            }
        });
        this.reportBindingFinishedRunnable = new SingleTimeOnAttachCallback(this, new gzs<s3q0>() { // from class: com.yandex.div.core.view2.Div2View$updateNow$2
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
                Div2ViewHistogramReporter histogramReporter;
                histogramReporter = Div2View.this.getHistogramReporter();
                histogramReporter.onBindingFinished();
            }
        });
        return switchToDivData;
    }

    private void updateRuntimeStore(j3 j3Var, DivDataTag divDataTag) {
        RuntimeStore runtimeStore;
        if (j3Var == null) {
            return;
        }
        this.oldRuntimeStore = getRuntimeStore$div_release();
        setRuntimeStore$div_release(getDiv2Component$div_release().getRuntimeStoreProvider().getOrCreate$div_release(divDataTag, j3Var, this));
        getRuntimeStore$div_release().updateSubscriptions();
        if (!epx.f(this.oldRuntimeStore, getRuntimeStore$div_release()) && (runtimeStore = this.oldRuntimeStore) != null) {
            runtimeStore.clearBindings(this);
        }
        setBindingContext$div_release(new BindingContext(this, getExpressionResolver()));
    }

    public static /* synthetic */ void updateRuntimeStore$default(Div2View div2View, j3 j3Var, DivDataTag divDataTag, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateRuntimeStore");
        }
        if ((i & 1) != 0) {
            j3Var = div2View.getDivData();
        }
        if ((i & 2) != 0) {
            divDataTag = div2View.getDataTag();
        }
        div2View.updateRuntimeStore(j3Var, divDataTag);
    }

    private View updateState(long j, boolean z) {
        View childAt = getView().getChildAt(0);
        getDiv2Component$div_release().getStateManager().updateState(getDataTag(), j, z);
        getDiv2Component$div_release().getDivBinder().attachIndicators$div_release();
        return childAt;
    }

    private void updateTimers() {
        DivTimerEventDispatcher divTimerEventDispatcher$div_release;
        j3 divData = getDivData();
        if (divData == null) {
            return;
        }
        DivTimerEventDispatcher orCreate$div_release = getDiv2Component$div_release().getDivTimersControllerProvider().getOrCreate$div_release(getDataTag(), divData, getExpressionResolver());
        if (!epx.f(getDivTimerEventDispatcher$div_release(), orCreate$div_release) && (divTimerEventDispatcher$div_release = getDivTimerEventDispatcher$div_release()) != null) {
            divTimerEventDispatcher$div_release.onDetach(this);
        }
        setDivTimerEventDispatcher$div_release(orCreate$div_release);
        if (orCreate$div_release != null) {
            orCreate$div_release.onAttach(this);
        }
    }

    public void addLoadReference(LoadReference loadReference, View view) {
        synchronized (this.monitor) {
            this.loadReferences.add(loadReference);
        }
    }

    public void addPersistentDivDataObserver$div_release(PersistentDivDataObserver persistentDivDataObserver) {
        synchronized (this.monitor) {
            this.persistentDivDataObservers.addObserver(persistentDivDataObserver);
        }
    }

    public void applyTimerCommand(String str, String str2) {
        DivTimerEventDispatcher divTimerEventDispatcher$div_release = getDivTimerEventDispatcher$div_release();
        if (divTimerEventDispatcher$div_release != null) {
            divTimerEventDispatcher$div_release.changeState(str, str2);
        }
    }

    public boolean applyVideoCommand(String str, String str2, ExpressionResolver expressionResolver) {
        return getDivVideoActionHandler().handleAction(this, str, str2, expressionResolver);
    }

    public void bindViewToDiv$div_release(View view, a aVar) {
        this.viewToDivBindings.put(view, aVar);
    }

    public void bulkActions$div_release(gzs<s3q0> gzsVar) {
        this.bulkActionsHandler.bulkActions(gzsVar);
    }

    public void cancelTooltips() {
        getTooltipController().cancelTooltips(this);
    }

    public void cleanup() {
        synchronized (this.monitor) {
            cleanup(true);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public void clearSubscriptions() {
        synchronized (this.monitor) {
            this.overflowMenuListeners.clear();
            s3q0 s3q0Var = s3q0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void discardVisibilityTracking() {
        List<j3.b> list;
        j3 divData = getDivData();
        j3.b bVar = null;
        if (divData != null && (list = divData.c) != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((j3.b) next).b == getStateId$div_release()) {
                    bVar = next;
                    break;
                }
            }
            bVar = bVar;
        }
        if (bVar != null) {
            discardStateVisibility(bVar);
        }
        discardChildrenVisibility();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.drawWasSkipped) {
            getHistogramReporter().onDrawStarted();
        }
        super.dispatchDraw(canvas);
        if (this.drawWasSkipped) {
            getHistogramReporter().onDrawFinished();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        this.drawWasSkipped = false;
        getHistogramReporter().onDrawStarted();
        super.draw(canvas);
        getHistogramReporter().onDrawFinished();
        this.drawWasSkipped = true;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        if (view != null && view.getVisibility() == 0) {
            BaseDivViewExtensionsKt.drawShadow(view, canvas);
        }
        return super.drawChild(canvas, view, j);
    }

    public DivActionHandler getActionHandler() {
        return this.actionHandler;
    }

    public SingleTimeOnAttachCallback getBindOnAttachRunnable$div_release() {
        return this.bindOnAttachRunnable;
    }

    public BindingContext getBindingContext$div_release() {
        return this.bindingContext;
    }

    public ViewTreeObserver.OnPreDrawListener getClearVariablesListener$div_release() {
        return this.clearVariablesListener;
    }

    public boolean getComplexRebindInProgress$div_release() {
        RebindTask rebindTask = this.rebindTask;
        if (rebindTask != null) {
            return rebindTask.getRebindInProgress();
        }
        return false;
    }

    public String getComponentName() {
        return getHistogramReporter().getComponent();
    }

    public DivViewConfig getConfig() {
        return this.config;
    }

    public Div2Context getContext$div_release() {
        return this.context;
    }

    public ReusableTokenList getCurrentRebindReusableList$div_release() {
        RebindTask rebindTask;
        if (getComplexRebindInProgress$div_release() && (rebindTask = this.rebindTask) != null) {
            return rebindTask.getReusableList();
        }
        return null;
    }

    public DivStatePath getCurrentRootPath$div_release() {
        List<j3.b> list;
        Object obj;
        DivStatePath fromState$div_release;
        j3 divData = getDivData();
        if (divData != null && (list = divData.c) != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((j3.b) obj).b == getStateId$div_release()) {
                    break;
                }
            }
            j3.b bVar = (j3.b) obj;
            if (bVar != null && (fromState$div_release = DivStatePath.Companion.fromState$div_release(bVar)) != null) {
                return fromState$div_release;
            }
        }
        return DivStatePath.Companion.fromState(getStateId$div_release());
    }

    public DivViewState getCurrentState() {
        j3 divData = getDivData();
        if (divData == null) {
            return null;
        }
        DivViewState state = getDiv2Component$div_release().getStateManager().getState(getDataTag());
        List<j3.b> list = divData.c;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (j3.b bVar : list) {
                if (state != null && bVar.b == state.getCurrentDivStateId()) {
                    return state;
                }
            }
        }
        return null;
    }

    public long getCurrentStateId() {
        return getStateId$div_release();
    }

    public DivCustomContainerChildFactory getCustomContainerChildFactory$div_release() {
        return getDiv2Component$div_release().getDivCustomContainerChildFactory();
    }

    public DivDataTag getDataTag() {
        return this.dataTag;
    }

    public Div2Component getDiv2Component$div_release() {
        return this.div2Component;
    }

    public j3 getDivData() {
        return this.divData;
    }

    public DivDataTag getDivTag() {
        return getDataTag();
    }

    public DivTimerEventDispatcher getDivTimerEventDispatcher$div_release() {
        return this.divTimerEventDispatcher;
    }

    public DivTransitionHandler getDivTransitionHandler$div_release() {
        return this.divTransitionHandler;
    }

    public ExpressionResolver getExpressionResolver() {
        return getResolver(getRuntimeStore$div_release());
    }

    public boolean getForceCanvasClipping() {
        return this.forceCanvasClipping;
    }

    public boolean getInMiddleOfBind$div_release() {
        return this.inMiddleOfBind;
    }

    public InputFocusTracker getInputFocusTracker$div_release() {
        return this.inputFocusTracker;
    }

    public Map<ExpressionResolver, Map<String, Integer>> getLayoutSizes$div_release() {
        return this.layoutSizes;
    }

    public String getLogId() {
        String str;
        j3 divData = getDivData();
        return (divData == null || (str = divData.b) == null) ? "" : str;
    }

    public MediaReleaseViewVisitor getMediaReleaseViewVisitor$div_release() {
        return getViewComponent$div_release().getMediaReleaseViewVisitor();
    }

    public ExpressionResolver getOldExpressionResolver$div_release() {
        return getResolver(this.oldRuntimeStore);
    }

    public DivDataTag getPrevDataTag() {
        return this.prevDataTag;
    }

    public ReleaseViewVisitor getReleaseViewVisitor$div_release() {
        return getViewComponent$div_release().getReleaseViewVisitor();
    }

    public RuntimeStore getRuntimeStore$div_release() {
        return this.runtimeStore;
    }

    public long getStateId$div_release() {
        return this.stateId;
    }

    public Map<j3, DivLayoutProviderVariablesHolder> getVariablesHolders$div_release() {
        return this.variablesHolders;
    }

    @Override // com.yandex.div.core.DivViewFacade
    public Div2View getView() {
        return this;
    }

    public Div2ViewComponent getViewComponent$div_release() {
        return this.viewComponent;
    }

    public boolean getVisualErrorsEnabled() {
        return getViewComponent$div_release().getErrorMonitor().getEnabled$div_release();
    }

    public void handleAction(DivAction divAction, String str, ExpressionResolver expressionResolver) {
        handleActionWithResult(divAction, str, expressionResolver);
    }

    public boolean handleActionWithResult(DivAction divAction, String str, ExpressionResolver expressionResolver) {
        return getDiv2Component$div_release().getActionBinder().handleAction$div_release(this, expressionResolver, divAction, str, null, getActionHandler());
    }

    @Override // com.yandex.div.core.DivViewFacade
    public void hideTooltip(String str) {
        getTooltipController().hideTooltip(str, this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        SingleTimeOnAttachCallback singleTimeOnAttachCallback = this.reportBindingResumedRunnable;
        if (singleTimeOnAttachCallback != null) {
            singleTimeOnAttachCallback.onAttach();
        }
        tryAttachVariableTriggers(getDivData());
        SingleTimeOnAttachCallback bindOnAttachRunnable$div_release = getBindOnAttachRunnable$div_release();
        if (bindOnAttachRunnable$div_release != null) {
            bindOnAttachRunnable$div_release.onAttach();
        }
        SingleTimeOnAttachCallback singleTimeOnAttachCallback2 = this.reportBindingFinishedRunnable;
        if (singleTimeOnAttachCallback2 != null) {
            singleTimeOnAttachCallback2.onAttach();
        }
        DivTimerEventDispatcher divTimerEventDispatcher$div_release = getDivTimerEventDispatcher$div_release();
        if (divTimerEventDispatcher$div_release != null) {
            divTimerEventDispatcher$div_release.onAttach(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        discardVisibilityTracking();
        DivTimerEventDispatcher divTimerEventDispatcher$div_release = getDivTimerEventDispatcher$div_release();
        if (divTimerEventDispatcher$div_release != null) {
            divTimerEventDispatcher$div_release.onDetach(this);
        }
        getViewComponent$div_release().getAnimatorController().onDetachedFromWindow();
        getRuntimeStore$div_release().onDetachedFromWindow(this);
    }

    @Override // com.yandex.div.internal.widget.FrameContainerLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        getHistogramReporter().onLayoutStarted();
        super.onLayout(z, i, i2, i3, i4);
        tryLogVisibility();
        getHistogramReporter().onLayoutFinished();
    }

    @Override // com.yandex.div.internal.widget.FrameContainerLayout, android.view.View
    public void onMeasure(int i, int i2) {
        getHistogramReporter().onMeasureStarted();
        super.onMeasure(i, i2);
        getHistogramReporter().onMeasureFinished();
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (getInputFocusTracker$div_release().isFocusedOnInput()) {
            this.gestureDetector.onTouchEvent(motionEvent);
            if (motionEvent.getAction() == 0) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void removePersistentDivDataObserver$div_release(PersistentDivDataObserver persistentDivDataObserver) {
        synchronized (this.monitor) {
            this.persistentDivDataObservers.removeObserver(persistentDivDataObserver);
        }
    }

    public void resetToInitialState() {
        DivViewState currentState = getCurrentState();
        if (currentState != null) {
            currentState.reset();
        }
        getDiv2Component$div_release().getTemporaryDivStateCache().resetCard(getDivTag().getId());
        switchToInitialState();
    }

    public a rootDiv$div_release() {
        j3.b state;
        j3 divData = getDivData();
        if (divData == null || (state = state(divData)) == null) {
            return null;
        }
        return state.a;
    }

    public void setActionHandler(DivActionHandler divActionHandler) {
        this.actionHandler = divActionHandler;
    }

    public void setBindOnAttachRunnable$div_release(SingleTimeOnAttachCallback singleTimeOnAttachCallback) {
        this.bindOnAttachRunnable = singleTimeOnAttachCallback;
    }

    public void setBindingContext$div_release(BindingContext bindingContext) {
        this.bindingContext = bindingContext;
    }

    public void setClearVariablesListener$div_release(ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        this.clearVariablesListener = onPreDrawListener;
    }

    public void setComponentName(String str) {
        getHistogramReporter().setComponent(str);
    }

    public void setConfig(DivViewConfig divViewConfig) {
        this.config = divViewConfig;
    }

    public boolean setData(j3 j3Var, DivDataTag divDataTag) {
        return setData(j3Var, getDivData(), divDataTag);
    }

    public void setDataTag$div_release(DivDataTag divDataTag) {
        setPrevDataTag$div_release(this.dataTag);
        this.dataTag = divDataTag;
        this.bindingProvider.update(divDataTag, getDivData());
    }

    public void setDivData$div_release(j3 j3Var) {
        this.divData = j3Var;
        updateRuntimeStore$default(this, null, null, 3, null);
        updateTimers();
        this.bindingProvider.update(getDataTag(), this.divData);
    }

    public void setDivTimerEventDispatcher$div_release(DivTimerEventDispatcher divTimerEventDispatcher) {
        this.divTimerEventDispatcher = divTimerEventDispatcher;
    }

    public void setForceCanvasClipping(boolean z) {
        this.forceCanvasClipping = z;
    }

    public void setInMiddleOfBind$div_release(boolean z) {
        this.inMiddleOfBind = z;
    }

    public void setPrevDataTag$div_release(DivDataTag divDataTag) {
        this.prevDataTag = divDataTag;
    }

    public void setRuntimeStore$div_release(RuntimeStore runtimeStore) {
        this.runtimeStore = runtimeStore;
    }

    public void setStateId$div_release(long j) {
        this.stateId = j;
    }

    public VariableMutationException setVariable(String str, String str2) {
        return VariableMutationHandler.Companion.setVariable(this, str, str2, getExpressionResolver());
    }

    public void setVisualErrorsEnabled(boolean z) {
        getViewComponent$div_release().getErrorMonitor().setEnabled$div_release(z);
    }

    @Override // com.yandex.div.core.DivViewFacade
    public void showTooltip(String str) {
        DivTooltipController.showTooltip$default(getTooltipController(), str, getBindingContext$div_release(), false, 4, null);
    }

    public j3.b stateToBind(j3 j3Var) {
        return getStateToBind(j3Var);
    }

    public void subscribe(OverflowMenuSubscriber$Listener overflowMenuSubscriber$Listener) {
        synchronized (this.monitor) {
            this.overflowMenuListeners.add(overflowMenuSubscriber$Listener);
        }
    }

    public void switchToInitialState() {
        j3 divData = getDivData();
        if (divData == null) {
            return;
        }
        long initialStateId = DivDataUtilsKt.getInitialStateId(divData);
        DivViewState currentState = getCurrentState();
        if (currentState != null) {
            initialStateId = currentState.getCurrentDivStateId();
        }
        switchToState(initialStateId);
    }

    @Override // com.yandex.div.core.DivViewFacade
    public void switchToState(long j, boolean z) {
        synchronized (this.monitor) {
            try {
                if (j != DivDataUtilsKt.getINVALID_STATE_ID(j3.j)) {
                    SingleTimeOnAttachCallback bindOnAttachRunnable$div_release = getBindOnAttachRunnable$div_release();
                    if (bindOnAttachRunnable$div_release != null) {
                        bindOnAttachRunnable$div_release.cancel();
                    }
                    forceSwitchToState(j, z);
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public a takeBindingDiv$div_release(View view) {
        return this.viewToDivBindings.get(view);
    }

    public void trackChildrenVisibility() {
        ExpressionResolver expressionResolver;
        DivVisibilityActionTracker visibilityActionTracker = getDiv2Component$div_release().getVisibilityActionTracker();
        for (Map.Entry<View, a> entry : this.viewToDivBindings.entrySet()) {
            View key = entry.getKey();
            a value = entry.getValue();
            BindingContext bindingContext = BaseDivViewExtensionsKt.getBindingContext(key);
            if (bindingContext != null && (expressionResolver = bindingContext.getExpressionResolver()) != null) {
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                if (key.isAttachedToWindow()) {
                    DivVisibilityActionTracker.trackVisibilityActionsOf$default(visibilityActionTracker, this, expressionResolver, key, value, null, null, 48, null);
                } else {
                    DivVisibilityActionTracker.trackVisibilityActionsOf$default(visibilityActionTracker, this, expressionResolver, null, value, null, null, 48, null);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void tryLogVisibility() {
        List<j3.b> list;
        j3 divData = getDivData();
        j3.b bVar = null;
        if (divData != null && (list = divData.c) != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((j3.b) next).b == getStateId$div_release()) {
                    bVar = next;
                    break;
                }
            }
            bVar = bVar;
        }
        if (bVar != null) {
            trackStateVisibility(bVar);
        }
        trackChildrenVisibility();
    }

    public a unbindViewFromDiv$div_release(View view) {
        return this.viewToDivBindings.remove(view);
    }

    public boolean setData(j3 j3Var, j3 j3Var2, DivDataTag divDataTag) {
        synchronized (this.monitor) {
            j3 j3Var3 = j3Var2;
            BindingEventReporter bindingEventReporter = this.bindingReporterProvider.get(j3Var3, j3Var);
            boolean z = false;
            if (j3Var == null) {
                bindingEventReporter.onBindingFatalNoData();
                return false;
            }
            if (getDivData() == j3Var) {
                bindingEventReporter.onBindingFatalSameData();
                return false;
            }
            notifyBindStarted();
            SingleTimeOnAttachCallback bindOnAttachRunnable$div_release = getBindOnAttachRunnable$div_release();
            if (bindOnAttachRunnable$div_release != null) {
                bindOnAttachRunnable$div_release.cancel();
            }
            getHistogramReporter().onRenderStarted();
            j3 divData = getDivData();
            if (divData != null) {
                j3Var3 = divData;
            }
            updateRuntimeStore(j3Var, divDataTag);
            setDataTag$div_release(divDataTag);
            for (j3.b bVar : j3Var.c) {
                DivViewDataPreloader.preload$default(getDiv2Component$div_release().getDivViewDataPreloader(), bVar.a, getBindingContext$div_release(), DivStatePath.Companion.fromState$div_release(bVar), null, 8, null);
            }
            boolean isDivDataReplaceable = DivComparator.INSTANCE.isDivDataReplaceable(j3Var3, j3Var, getStateId$div_release(), getOldExpressionResolver$div_release(), getExpressionResolver(), bindingEventReporter);
            if (j3Var3 != null && !DivTransitionsKt.allowsTransitionsOnDataChange(j3Var, getExpressionResolver())) {
                if (isDivDataReplaceable || !this.complexRebindEnabled || !(getView().getChildAt(0) instanceof ViewGroup) || !complexRebind(j3Var, j3Var3, bindingEventReporter)) {
                    if (isDivDataReplaceable) {
                        rebind(j3Var, false, bindingEventReporter);
                    } else {
                        z = updateNow(j3Var, divDataTag, bindingEventReporter);
                    }
                }
                getDiv2Component$div_release().getDivBinder().attachIndicators$div_release();
                sendCreationHistograms();
                notifyBindEnded();
                return z;
            }
            z = updateNow(j3Var, divDataTag, bindingEventReporter);
            getDiv2Component$div_release().getDivBinder().attachIndicators$div_release();
            sendCreationHistograms();
            notifyBindEnded();
            return z;
        }
    }

    @Override // com.yandex.div.core.DivViewFacade
    public void showTooltip(String str, boolean z) {
        getTooltipController().showTooltip(str, getBindingContext$div_release(), z);
    }

    private void cleanup(boolean z) {
        RebindTask rebindTask = this.rebindTask;
        if (rebindTask != null) {
            rebindTask.clear();
            s3q0 s3q0Var = s3q0.a;
            this.rebindTask = null;
        }
        discardVisibilityTracking();
        cancelImageLoads();
        ReleaseUtils releaseUtils = ReleaseUtils.INSTANCE;
        releaseUtils.releaseMedia$div_release(this, this);
        stopLoadAndSubscriptions();
        getDiv2Component$div_release().getBitmapEffectHelper().release();
        if (z) {
            releaseUtils.releaseAndRemoveChildren$div_release(this, this);
        }
        ErrorCollector orNull = getViewComponent$div_release().getErrorCollectors().getOrNull(getDataTag(), getDivData());
        if (orNull != null) {
            orNull.cleanRuntimeWarningsAndErrors();
        }
        setDivData$div_release(null);
        setDataTag$div_release(DivDataTag.INVALID);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.div.core.DivViewFacade
    public void switchToState(DivStatePath divStatePath, boolean z) {
        List<j3.b> list;
        synchronized (this.monitor) {
            try {
                j3 divData = getDivData();
                j3.b bVar = null;
                if (divData != null && (list = divData.c) != null) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (((j3.b) next).b == divStatePath.getTopLevelStateId()) {
                            bVar = next;
                            break;
                        }
                    }
                    bVar = bVar;
                }
                this.bulkActionsHandler.switchState(bVar, divStatePath, z);
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void getBindOnAttachRunnable$div_release$annotations() {
    }

    public static /* synthetic */ void getForceCanvasClipping$annotations() {
    }

    public static /* synthetic */ void getStateId$div_release$annotations() {
    }

    private static /* synthetic */ void getViewCreateCallType$annotations() {
    }

    public /* synthetic */ Div2View(Div2Context div2Context, AttributeSet attributeSet, int i, int i2, zcl zclVar) {
        this(div2Context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public Div2View(Div2Context div2Context, AttributeSet attributeSet, int i) {
        this(div2Context, attributeSet, i, SystemClock.uptimeMillis());
    }
}
