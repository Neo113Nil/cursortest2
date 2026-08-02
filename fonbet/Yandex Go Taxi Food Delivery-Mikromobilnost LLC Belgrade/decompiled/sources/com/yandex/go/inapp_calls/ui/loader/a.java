package com.yandex.go.inapp_calls.ui.loader;

import com.yandex.go.inapp_calls.experiment.InAppCallExperiment;
import com.yandex.go.inapp_calls.experiment.q;
import com.yandex.go.inapp_calls.repository.InAppCallsFeatureWrapper$State;
import com.yandex.go.inapp_calls.repository.c;
import defpackage.ad5;
import defpackage.fkv;
import defpackage.h2t;
import defpackage.mf1;
import defpackage.njv;
import defpackage.ny61;
import defpackage.xjv;
import defpackage.xur;
import defpackage.yi7;
import defpackage.zy11;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.o;

/* loaded from: classes12.dex */
public final class a extends ad5 {
    public final mf1 A;
    public final c B;
    public final yi7 C;
    public final q D;
    public final njv E;
    public final AtomicBoolean F;
    public final h2t x;
    public final String y;
    public final fkv z;

    public a(h2t h2tVar, String str, fkv fkvVar, mf1 mf1Var, c cVar, yi7 yi7Var, q qVar, njv njvVar) {
        super(xjv.class);
        this.x = h2tVar;
        this.y = str;
        this.z = fkvVar;
        this.A = mf1Var;
        this.B = cVar;
        this.C = yi7Var;
        this.D = qVar;
        this.E = njvVar;
        this.F = new AtomicBoolean(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Kg(a aVar, ContinuationImpl continuationImpl) {
        InAppCallsLoadingPresenter$awaitLoadingStateWithTimeout$1 inAppCallsLoadingPresenter$awaitLoadingStateWithTimeout$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof InAppCallsLoadingPresenter$awaitLoadingStateWithTimeout$1) {
            inAppCallsLoadingPresenter$awaitLoadingStateWithTimeout$1 = (InAppCallsLoadingPresenter$awaitLoadingStateWithTimeout$1) continuationImpl;
            int i2 = inAppCallsLoadingPresenter$awaitLoadingStateWithTimeout$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                inAppCallsLoadingPresenter$awaitLoadingStateWithTimeout$1.label = i2 - Integer.MIN_VALUE;
                Object obj = inAppCallsLoadingPresenter$awaitLoadingStateWithTimeout$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = inAppCallsLoadingPresenter$awaitLoadingStateWithTimeout$1.label;
                if (i != 0) {
                    b.b(obj);
                    InAppCallsLoadingPresenter$awaitLoadingStateWithTimeout$2 inAppCallsLoadingPresenter$awaitLoadingStateWithTimeout$2 = new InAppCallsLoadingPresenter$awaitLoadingStateWithTimeout$2(aVar, null);
                    inAppCallsLoadingPresenter$awaitLoadingStateWithTimeout$1.label = 1;
                    if (kotlinx.coroutines.a.w(2000L, inAppCallsLoadingPresenter$awaitLoadingStateWithTimeout$2, inAppCallsLoadingPresenter$awaitLoadingStateWithTimeout$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return zy11.a;
            }
        }
        inAppCallsLoadingPresenter$awaitLoadingStateWithTimeout$1 = new InAppCallsLoadingPresenter$awaitLoadingStateWithTimeout$1(aVar, continuationImpl);
        Object obj2 = inAppCallsLoadingPresenter$awaitLoadingStateWithTimeout$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inAppCallsLoadingPresenter$awaitLoadingStateWithTimeout$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
    
        if (r9 != r2) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        if (r9 == r2) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Lg(a aVar, ContinuationImpl continuationImpl) {
        InAppCallsLoadingPresenter$collectFeatureState$1 inAppCallsLoadingPresenter$collectFeatureState$1;
        int i;
        InAppCallExperiment inAppCallExperiment;
        c cVar = aVar.B;
        if (continuationImpl instanceof InAppCallsLoadingPresenter$collectFeatureState$1) {
            inAppCallsLoadingPresenter$collectFeatureState$1 = (InAppCallsLoadingPresenter$collectFeatureState$1) continuationImpl;
            int i2 = inAppCallsLoadingPresenter$collectFeatureState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                inAppCallsLoadingPresenter$collectFeatureState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = inAppCallsLoadingPresenter$collectFeatureState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = inAppCallsLoadingPresenter$collectFeatureState$1.label;
                if (i != 0) {
                    b.b(obj);
                    q qVar = aVar.D;
                    inAppCallsLoadingPresenter$collectFeatureState$1.label = 1;
                    obj = qVar.d.b(inAppCallsLoadingPresenter$collectFeatureState$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            b.b(obj);
                            return obj;
                        }
                        inAppCallExperiment = (InAppCallExperiment) inAppCallsLoadingPresenter$collectFeatureState$1.L$0;
                        b.b(obj);
                        o oVar = new o(e.t(new n(cVar.c(), new InAppCallsLoadingPresenter$collectFeatureState$2((InAppCallsFeatureWrapper$State) obj, aVar, null))), new InAppCallsLoadingPresenter$collectFeatureState$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
                        xur xurVar = new xur(5, aVar, inAppCallExperiment);
                        inAppCallsLoadingPresenter$collectFeatureState$1.L$0 = null;
                        inAppCallsLoadingPresenter$collectFeatureState$1.L$1 = null;
                        inAppCallsLoadingPresenter$collectFeatureState$1.L$2 = null;
                        inAppCallsLoadingPresenter$collectFeatureState$1.L$3 = null;
                        inAppCallsLoadingPresenter$collectFeatureState$1.L$4 = null;
                        inAppCallsLoadingPresenter$collectFeatureState$1.label = 3;
                        Object collect = oVar.collect(xurVar, inAppCallsLoadingPresenter$collectFeatureState$1);
                        return collect == coroutineSingletons ? coroutineSingletons : collect;
                    }
                    b.b(obj);
                }
                inAppCallExperiment = (InAppCallExperiment) obj;
                g c = cVar.c();
                inAppCallsLoadingPresenter$collectFeatureState$1.L$0 = inAppCallExperiment;
                inAppCallsLoadingPresenter$collectFeatureState$1.label = 2;
                obj = e.y(c, inAppCallsLoadingPresenter$collectFeatureState$1);
            }
        }
        inAppCallsLoadingPresenter$collectFeatureState$1 = new InAppCallsLoadingPresenter$collectFeatureState$1(aVar, continuationImpl);
        Object obj2 = inAppCallsLoadingPresenter$collectFeatureState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inAppCallsLoadingPresenter$collectFeatureState$1.label;
        if (i != 0) {
        }
        inAppCallExperiment = (InAppCallExperiment) obj2;
        g c2 = cVar.c();
        inAppCallsLoadingPresenter$collectFeatureState$1.L$0 = inAppCallExperiment;
        inAppCallsLoadingPresenter$collectFeatureState$1.label = 2;
        obj2 = e.y(c2, inAppCallsLoadingPresenter$collectFeatureState$1);
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        this.E.d.b(false);
    }
}
