package com.yandex.div.core.view2;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.DivDataTag;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.SynchronizedWeakHashMap;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.divs.DivSightExtensionsKt;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.KLog;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.logging.Severity;
import com.yandex.div2.a;
import com.yandex.div2.v3;
import com.yandex.div2.zd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.a0t;
import xsna.apn;
import xsna.epx;
import xsna.izs;
import xsna.j5g;
import xsna.kxt0;
import xsna.ou4;
import xsna.s3q0;
import xsna.wzs;
import xsna.zcl;

/* compiled from: DivVisibilityActionTracker.kt */
/* loaded from: classes7.dex */
public class DivVisibilityActionTracker {
    private static final Companion Companion = new Companion(null);
    private boolean hasPostedUpdateVisibilityTask;
    private final ViewVisibilityCalculator viewVisibilityCalculator;
    private final DivVisibilityActionDispatcher visibilityActionDispatcher;
    private final Handler handler = new Handler(Looper.getMainLooper());
    private final DivVisibilityTokenHolder appearTrackedTokens = new DivVisibilityTokenHolder();
    private final DivVisibilityTokenHolder disappearTrackedTokens = new DivVisibilityTokenHolder();
    private final SightActionIsEnabledObserver isEnabledObserver = new SightActionIsEnabledObserver(new a0t<Div2View, ExpressionResolver, View, a, apn, s3q0>() { // from class: com.yandex.div.core.view2.DivVisibilityActionTracker$isEnabledObserver$1
        {
            super(5);
        }

        @Override // xsna.a0t
        public /* bridge */ /* synthetic */ s3q0 invoke(Div2View div2View, ExpressionResolver expressionResolver, View view, a aVar, apn apnVar) {
            invoke2(div2View, expressionResolver, view, aVar, apnVar);
            return s3q0.a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Div2View div2View, ExpressionResolver expressionResolver, View view, a aVar, apn apnVar) {
            if (apnVar instanceof zd) {
                DivVisibilityActionTracker.this.trackVisibilityActions(div2View, expressionResolver, view, aVar, Collections.singletonList(apnVar), EmptyList.b);
            } else if (apnVar instanceof v3) {
                DivVisibilityActionTracker.this.trackVisibilityActions(div2View, expressionResolver, view, aVar, EmptyList.b, Collections.singletonList(apnVar));
            }
        }
    }, new a0t<Div2View, ExpressionResolver, View, a, apn, s3q0>() { // from class: com.yandex.div.core.view2.DivVisibilityActionTracker$isEnabledObserver$2
        {
            super(5);
        }

        @Override // xsna.a0t
        public /* bridge */ /* synthetic */ s3q0 invoke(Div2View div2View, ExpressionResolver expressionResolver, View view, a aVar, apn apnVar) {
            invoke2(div2View, expressionResolver, view, aVar, apnVar);
            return s3q0.a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Div2View div2View, ExpressionResolver expressionResolver, View view, a aVar, apn apnVar) {
            DivVisibilityTokenHolder divVisibilityTokenHolder;
            DivVisibilityTokenHolder divVisibilityTokenHolder2;
            if (apnVar instanceof zd) {
                DivVisibilityActionTracker divVisibilityActionTracker = DivVisibilityActionTracker.this;
                divVisibilityTokenHolder2 = divVisibilityActionTracker.appearTrackedTokens;
                divVisibilityActionTracker.shouldTrackVisibilityAction(div2View, expressionResolver, null, apnVar, 0, divVisibilityTokenHolder2);
            } else if (apnVar instanceof v3) {
                DivVisibilityActionTracker divVisibilityActionTracker2 = DivVisibilityActionTracker.this;
                divVisibilityTokenHolder = divVisibilityActionTracker2.disappearTrackedTokens;
                divVisibilityActionTracker2.shouldTrackVisibilityAction(div2View, expressionResolver, null, apnVar, 0, divVisibilityTokenHolder);
            }
        }
    });
    private final WeakHashMap<View, a> visibleActions = new WeakHashMap<>();
    private final WeakHashMap<View, a> enqueuedVisibilityActions = new WeakHashMap<>();
    private final WeakHashMap<View, Boolean> previousVisibilityIsFull = new WeakHashMap<>();
    private final SynchronizedWeakHashMap<View, a> divWithWaitingDisappearActions = new SynchronizedWeakHashMap<>();
    private final WeakHashMap<View, Set<v3>> appearedForDisappearActions = new WeakHashMap<>();
    private final Runnable updateVisibilityTask = new ou4(this, 4);

    /* compiled from: DivVisibilityActionTracker.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public DivVisibilityActionTracker(ViewVisibilityCalculator viewVisibilityCalculator, DivVisibilityActionDispatcher divVisibilityActionDispatcher) {
        this.viewVisibilityCalculator = viewVisibilityCalculator;
        this.visibilityActionDispatcher = divVisibilityActionDispatcher;
    }

    private void cancelTracking(CompositeLogId compositeLogId, View view, apn apnVar, DivVisibilityTokenHolder divVisibilityTokenHolder) {
        KLog kLog = KLog.INSTANCE;
        if (kLog.isAtLeast(Severity.INFO)) {
            kLog.print(4, "DivVisibilityActionTracker", "cancelTracking: id=" + compositeLogId);
        }
        divVisibilityTokenHolder.remove(compositeLogId, new izs<Map<CompositeLogId, ? extends apn>, s3q0>() { // from class: com.yandex.div.core.view2.DivVisibilityActionTracker$cancelTracking$2
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Map<CompositeLogId, ? extends apn> map) {
                invoke2(map);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Map<CompositeLogId, ? extends apn> map) {
                Handler handler;
                handler = DivVisibilityActionTracker.this.handler;
                handler.removeCallbacksAndMessages(map);
            }
        });
        Set<v3> set = this.appearedForDisappearActions.get(view);
        if (!(apnVar instanceof v3) || view == null || set == null) {
            return;
        }
        set.remove(apnVar);
        if (set.isEmpty()) {
            this.appearedForDisappearActions.remove(view);
            this.divWithWaitingDisappearActions.remove(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T extends apn> List<T> filterEnabled(List<? extends T> list, ExpressionResolver expressionResolver) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((apn) obj).isEnabled().evaluate(expressionResolver).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0046, code lost:
    
        if (r12 <= ((com.yandex.div2.v3) r11).k.evaluate(r9).longValue()) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r12 >= ((com.yandex.div2.zd) r11).k.evaluate(r9).longValue()) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        r12 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean shouldTrackVisibilityAction(Div2View div2View, ExpressionResolver expressionResolver, View view, apn apnVar, int i, DivVisibilityTokenHolder divVisibilityTokenHolder) {
        boolean z;
        if (!(apnVar instanceof zd)) {
            if (apnVar instanceof v3) {
                Set<v3> set = this.appearedForDisappearActions.get(view);
                if (set != null ? set.contains(apnVar) : false) {
                }
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Trying to check visibility for class without known visibility range");
                }
            }
            z = false;
        }
        CompositeLogId logId = divVisibilityTokenHolder.getLogId(CompositeLogIdKt.compositeLogIdOf(div2View, apnVar.a().evaluate(expressionResolver)));
        if (view != null && logId == null && z) {
            return true;
        }
        if ((view == null || logId != null || z) && (view == null || logId == null || !z)) {
            if (view != null && logId != null && !z) {
                cancelTracking(logId, view, apnVar, divVisibilityTokenHolder);
                return false;
            }
            if (view == null && logId != null) {
                cancelTracking(logId, null, apnVar, divVisibilityTokenHolder);
            }
        }
        return false;
    }

    private void startTracking(final Div2View div2View, final ExpressionResolver expressionResolver, final View view, final List<? extends apn> list, long j, DivVisibilityTokenHolder divVisibilityTokenHolder) {
        HashMap hashMap = new HashMap(list.size(), 1.0f);
        for (apn apnVar : list) {
            CompositeLogId compositeLogIdOf = CompositeLogIdKt.compositeLogIdOf(div2View, apnVar.a().evaluate(expressionResolver));
            KLog kLog = KLog.INSTANCE;
            if (kLog.isAtLeast(Severity.INFO)) {
                kLog.print(4, "DivVisibilityActionTracker", "startTracking: id=" + compositeLogIdOf);
            }
            Pair pair = new Pair(compositeLogIdOf, apnVar);
            hashMap.put(pair.i(), pair.j());
        }
        final Map<CompositeLogId, apn> synchronizedMap = Collections.synchronizedMap(hashMap);
        divVisibilityTokenHolder.add(synchronizedMap);
        final String logId = div2View.getLogId();
        Handler handler = this.handler;
        Runnable runnable = new Runnable() { // from class: com.yandex.div.core.view2.DivVisibilityActionTracker$startTracking$$inlined$postDelayed$1
            @Override // java.lang.Runnable
            public final void run() {
                WeakHashMap weakHashMap;
                DivVisibilityActionDispatcher divVisibilityActionDispatcher;
                WeakHashMap weakHashMap2;
                SynchronizedWeakHashMap synchronizedWeakHashMap;
                KLog kLog2 = KLog.INSTANCE;
                if (kLog2.isAtLeast(Severity.INFO)) {
                    kLog2.print(4, "DivVisibilityActionTracker", "dispatchActions: id=" + j5g.g0(synchronizedMap.keySet(), null, null, null, 0, null, 63));
                }
                weakHashMap = DivVisibilityActionTracker.this.appearedForDisappearActions;
                Set set = (Set) weakHashMap.get(view);
                if (set != null) {
                    List list2 = list;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list2) {
                        if (obj instanceof v3) {
                            arrayList.add(obj);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        set.remove((v3) it.next());
                    }
                    if (set.isEmpty()) {
                        weakHashMap2 = DivVisibilityActionTracker.this.appearedForDisappearActions;
                        weakHashMap2.remove(view);
                        synchronizedWeakHashMap = DivVisibilityActionTracker.this.divWithWaitingDisappearActions;
                        synchronizedWeakHashMap.remove(view);
                    }
                }
                if (epx.f(div2View.getLogId(), logId)) {
                    divVisibilityActionDispatcher = DivVisibilityActionTracker.this.visibilityActionDispatcher;
                    divVisibilityActionDispatcher.dispatchActions(div2View, expressionResolver, view, (apn[]) synchronizedMap.values().toArray(new apn[0]));
                }
            }
        };
        if (synchronizedMap == null) {
            handler.postDelayed(runnable, j);
        } else {
            handler.postDelayed(runnable, synchronizedMap, j);
        }
    }

    private void trackViewsHierarchy(BindingContext bindingContext, View view, a aVar, wzs<? super View, ? super a, Boolean> wzsVar) {
        if (wzsVar.invoke(view, aVar).booleanValue() && (view instanceof ViewGroup)) {
            kxt0 kxt0Var = new kxt0((ViewGroup) view);
            while (kxt0Var.hasNext()) {
                View next = kxt0Var.next();
                trackViewsHierarchy(bindingContext, next, bindingContext.getDivView().takeBindingDiv$div_release(next), wzsVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void trackVisibilityActions(Div2View div2View, ExpressionResolver expressionResolver, View view, a aVar, List<zd> list, List<v3> list2) {
        DivVisibilityActionTracker divVisibilityActionTracker = this;
        ExpressionResolver expressionResolver2 = expressionResolver;
        View view2 = view;
        Assert.assertMainThread();
        int calculateVisibilityPercentage = divVisibilityActionTracker.viewVisibilityCalculator.calculateVisibilityPercentage(view2);
        divVisibilityActionTracker.updateVisibility(view2, aVar, calculateVisibilityPercentage);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            Long valueOf = Long.valueOf(DivSightExtensionsKt.getDuration((zd) obj).evaluate(expressionResolver2).longValue());
            Object obj2 = linkedHashMap.get(valueOf);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(valueOf, obj2);
            }
            ((List) obj2).add(obj);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            long longValue = ((Number) entry.getKey()).longValue();
            List list3 = (List) entry.getValue();
            ArrayList arrayList = new ArrayList(list3.size());
            for (Object obj3 : list3) {
                int i = calculateVisibilityPercentage;
                if (divVisibilityActionTracker.shouldTrackVisibilityAction(div2View, expressionResolver2, view2, (zd) obj3, calculateVisibilityPercentage, divVisibilityActionTracker.appearTrackedTokens)) {
                    arrayList.add(obj3);
                }
                expressionResolver2 = expressionResolver;
                view2 = view;
                calculateVisibilityPercentage = i;
            }
            int i2 = calculateVisibilityPercentage;
            if (arrayList.isEmpty()) {
                expressionResolver2 = expressionResolver;
                view2 = view;
            } else {
                expressionResolver2 = expressionResolver;
                view2 = view;
                divVisibilityActionTracker.startTracking(div2View, expressionResolver2, view2, arrayList, longValue, divVisibilityActionTracker.appearTrackedTokens);
            }
            calculateVisibilityPercentage = i2;
        }
        int i3 = calculateVisibilityPercentage;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj4 : list2) {
            Long valueOf2 = Long.valueOf(DivSightExtensionsKt.getDuration((v3) obj4).evaluate(expressionResolver2).longValue());
            Object obj5 = linkedHashMap2.get(valueOf2);
            if (obj5 == null) {
                obj5 = new ArrayList();
                linkedHashMap2.put(valueOf2, obj5);
            }
            ((List) obj5).add(obj4);
        }
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            long longValue2 = ((Number) entry2.getKey()).longValue();
            List list4 = (List) entry2.getValue();
            List<v3> list5 = list4;
            boolean z = false;
            for (v3 v3Var : list5) {
                boolean z2 = z;
                z = true;
                boolean z3 = ((long) i3) > v3Var.k.evaluate(expressionResolver2).longValue();
                if (!z2 && !z3) {
                    z = false;
                }
                if (z3) {
                    WeakHashMap<View, Set<v3>> weakHashMap = divVisibilityActionTracker.appearedForDisappearActions;
                    Set<v3> set = weakHashMap.get(view2);
                    if (set == null) {
                        set = new LinkedHashSet<>();
                        weakHashMap.put(view2, set);
                    }
                    set.add(v3Var);
                }
            }
            if (z) {
                divVisibilityActionTracker.divWithWaitingDisappearActions.put(view2, aVar);
            }
            ArrayList arrayList2 = new ArrayList(list4.size());
            for (Object obj6 : list5) {
                if (divVisibilityActionTracker.shouldTrackVisibilityAction(div2View, expressionResolver2, view2, (v3) obj6, i3, divVisibilityActionTracker.disappearTrackedTokens)) {
                    arrayList2.add(obj6);
                }
                expressionResolver2 = expressionResolver;
                view2 = view;
            }
            if (!arrayList2.isEmpty()) {
                divVisibilityActionTracker.startTracking(div2View, expressionResolver, view, arrayList2, longValue2, divVisibilityActionTracker.disappearTrackedTokens);
            }
            divVisibilityActionTracker = this;
            expressionResolver2 = expressionResolver;
            view2 = view;
        }
    }

    public static /* synthetic */ void trackVisibilityActionsOf$default(DivVisibilityActionTracker divVisibilityActionTracker, Div2View div2View, ExpressionResolver expressionResolver, View view, a aVar, List list, List list2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackVisibilityActionsOf");
        }
        if ((i & 16) != 0) {
            list = DivUtilKt.getAllAppearActions(aVar.b());
        }
        List list3 = list;
        if ((i & 32) != 0) {
            list2 = DivUtilKt.getAllDisappearActions(aVar.b());
        }
        divVisibilityActionTracker.trackVisibilityActionsOf(div2View, expressionResolver, view, aVar, list3, list2);
    }

    private void updateVisibility(View view, a aVar, int i) {
        if (i > 0) {
            this.visibleActions.put(view, aVar);
        } else {
            this.visibleActions.remove(view);
        }
        if (this.hasPostedUpdateVisibilityTask) {
            return;
        }
        this.hasPostedUpdateVisibilityTask = true;
        this.handler.post(this.updateVisibilityTask);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateVisibilityTask$lambda$0(DivVisibilityActionTracker divVisibilityActionTracker) {
        divVisibilityActionTracker.visibilityActionDispatcher.dispatchVisibleViewsChanged(divVisibilityActionTracker.visibleActions);
        divVisibilityActionTracker.hasPostedUpdateVisibilityTask = false;
    }

    public void cancelTrackingViewsHierarchy(final BindingContext bindingContext, View view, a aVar) {
        trackViewsHierarchy(bindingContext, view, aVar, new wzs<View, a, Boolean>() { // from class: com.yandex.div.core.view2.DivVisibilityActionTracker$cancelTrackingViewsHierarchy$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // xsna.wzs
            public final Boolean invoke(View view2, a aVar2) {
                WeakHashMap weakHashMap;
                weakHashMap = DivVisibilityActionTracker.this.previousVisibilityIsFull;
                weakHashMap.remove(view2);
                if (aVar2 != null) {
                    DivVisibilityActionTracker divVisibilityActionTracker = DivVisibilityActionTracker.this;
                    BindingContext bindingContext2 = bindingContext;
                    DivVisibilityActionTracker.trackVisibilityActionsOf$default(divVisibilityActionTracker, bindingContext2.getDivView(), bindingContext2.getExpressionResolver(), null, aVar2, null, null, 48, null);
                }
                return Boolean.TRUE;
            }
        });
    }

    public Map<View, a> getDivWithWaitingDisappearActions() {
        return this.divWithWaitingDisappearActions.createMap();
    }

    public void startTrackingViewsHierarchy(final BindingContext bindingContext, View view, a aVar) {
        trackViewsHierarchy(bindingContext, view, aVar, new wzs<View, a, Boolean>() { // from class: com.yandex.div.core.view2.DivVisibilityActionTracker$startTrackingViewsHierarchy$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // xsna.wzs
            public final Boolean invoke(View view2, a aVar2) {
                ViewVisibilityCalculator viewVisibilityCalculator;
                WeakHashMap weakHashMap;
                boolean z;
                WeakHashMap weakHashMap2;
                viewVisibilityCalculator = DivVisibilityActionTracker.this.viewVisibilityCalculator;
                boolean isViewFullyVisible = viewVisibilityCalculator.isViewFullyVisible(view2);
                if (isViewFullyVisible) {
                    weakHashMap2 = DivVisibilityActionTracker.this.previousVisibilityIsFull;
                    if (epx.f(weakHashMap2.get(view2), Boolean.TRUE)) {
                        z = false;
                        return Boolean.valueOf(z);
                    }
                }
                Boolean valueOf = Boolean.valueOf(isViewFullyVisible);
                weakHashMap = DivVisibilityActionTracker.this.previousVisibilityIsFull;
                weakHashMap.put(view2, valueOf);
                if (aVar2 != null) {
                    DivVisibilityActionTracker divVisibilityActionTracker = DivVisibilityActionTracker.this;
                    BindingContext bindingContext2 = bindingContext;
                    DivVisibilityActionTracker.trackVisibilityActionsOf$default(divVisibilityActionTracker, bindingContext2.getDivView(), bindingContext2.getExpressionResolver(), view2, aVar2, null, null, 48, null);
                }
                z = true;
                return Boolean.valueOf(z);
            }
        });
    }

    public void trackDetachedView(BindingContext bindingContext, View view, a aVar) {
        List<v3> u = aVar.b().u();
        if (u == null) {
            return;
        }
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        trackVisibilityActions(bindingContext.getDivView(), expressionResolver, view, aVar, EmptyList.b, filterEnabled(u, expressionResolver));
    }

    public void trackVisibilityActionsOf(final Div2View div2View, final ExpressionResolver expressionResolver, final View view, final a aVar, final List<zd> list, final List<v3> list2) {
        View farthestLayoutCaller;
        List<v3> list3 = list2;
        final ArrayList u0 = j5g.u0(list3, list);
        if (u0.isEmpty()) {
            return;
        }
        final DivDataTag dataTag = div2View.getDataTag();
        if (view == null) {
            this.isEnabledObserver.cancelObserving(u0);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                shouldTrackVisibilityAction(div2View, expressionResolver, null, (zd) it.next(), 0, this.appearTrackedTokens);
            }
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                shouldTrackVisibilityAction(div2View, expressionResolver, null, (v3) it2.next(), 0, this.disappearTrackedTokens);
            }
            return;
        }
        if (this.enqueuedVisibilityActions.containsKey(view)) {
            return;
        }
        if (ViewsKt.isHierarchyLaidOut(view) && !view.isLayoutRequested()) {
            if (epx.f(div2View.getDataTag(), dataTag)) {
                this.isEnabledObserver.observe(view, div2View, expressionResolver, aVar, u0);
                trackVisibilityActions(div2View, expressionResolver, view, aVar, filterEnabled(list, expressionResolver), filterEnabled(list2, expressionResolver));
            }
            this.enqueuedVisibilityActions.remove(view);
            return;
        }
        farthestLayoutCaller = ViewsKt.farthestLayoutCaller(view);
        if (farthestLayoutCaller != null) {
            farthestLayoutCaller.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.DivVisibilityActionTracker$trackVisibilityActionsOf$$inlined$doOnHierarchyLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    view2.removeOnLayoutChangeListener(this);
                    if (epx.f(Div2View.this.getDataTag(), dataTag)) {
                        this.isEnabledObserver.observe(view, Div2View.this, expressionResolver, aVar, u0);
                        DivVisibilityActionTracker divVisibilityActionTracker = this;
                        Div2View div2View2 = Div2View.this;
                        ExpressionResolver expressionResolver2 = expressionResolver;
                        divVisibilityActionTracker.trackVisibilityActions(div2View2, expressionResolver2, view, aVar, divVisibilityActionTracker.filterEnabled(list, expressionResolver2), this.filterEnabled(list2, expressionResolver));
                    }
                    this.enqueuedVisibilityActions.remove(view);
                }
            });
            s3q0 s3q0Var = s3q0.a;
        }
        this.enqueuedVisibilityActions.put(view, aVar);
    }

    public void updateVisibleViews(List<? extends View> list) {
        Iterator<Map.Entry<View, a>> it = this.visibleActions.entrySet().iterator();
        while (it.hasNext()) {
            if (!list.contains(it.next().getKey())) {
                it.remove();
            }
        }
        if (this.hasPostedUpdateVisibilityTask) {
            return;
        }
        this.hasPostedUpdateVisibilityTask = true;
        this.handler.post(this.updateVisibilityTask);
    }
}
