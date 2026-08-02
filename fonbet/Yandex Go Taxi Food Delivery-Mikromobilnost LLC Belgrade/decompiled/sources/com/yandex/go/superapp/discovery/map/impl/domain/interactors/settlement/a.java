package com.yandex.go.superapp.discovery.map.impl.domain.interactors.settlement;

import com.yandex.go.superapp.discovery.map.impl.experiments.SuperAppDiscoveryMapExperiment;
import com.yandex.go.superapp.discovery.map.impl.experiments.s;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class a {
    public final s a;
    public final d b;

    public a(s sVar, d dVar) {
        this.a = sVar;
        this.b = dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r6.b.c(r7, r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        SuperAppSettlementBboxInitializerInteractor$initSettlementBbox$1 superAppSettlementBboxInitializerInteractor$initSettlementBbox$1;
        int i;
        SuperAppDiscoveryMapExperiment.SettlementFocusingConfig settlementFocusingConfig;
        if (continuationImpl instanceof SuperAppSettlementBboxInitializerInteractor$initSettlementBbox$1) {
            superAppSettlementBboxInitializerInteractor$initSettlementBbox$1 = (SuperAppSettlementBboxInitializerInteractor$initSettlementBbox$1) continuationImpl;
            int i2 = superAppSettlementBboxInitializerInteractor$initSettlementBbox$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppSettlementBboxInitializerInteractor$initSettlementBbox$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppSettlementBboxInitializerInteractor$initSettlementBbox$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppSettlementBboxInitializerInteractor$initSettlementBbox$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superAppSettlementBboxInitializerInteractor$initSettlementBbox$1.label = 1;
                    obj = this.a.d(superAppSettlementBboxInitializerInteractor$initSettlementBbox$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    kotlin.b.b(obj);
                }
                settlementFocusingConfig = (SuperAppDiscoveryMapExperiment.SettlementFocusingConfig) obj;
                if (settlementFocusingConfig != null) {
                    superAppSettlementBboxInitializerInteractor$initSettlementBbox$1.L$0 = null;
                    superAppSettlementBboxInitializerInteractor$initSettlementBbox$1.label = 2;
                }
                return zy11.a;
            }
        }
        superAppSettlementBboxInitializerInteractor$initSettlementBbox$1 = new SuperAppSettlementBboxInitializerInteractor$initSettlementBbox$1(this, continuationImpl);
        Object obj2 = superAppSettlementBboxInitializerInteractor$initSettlementBbox$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppSettlementBboxInitializerInteractor$initSettlementBbox$1.label;
        if (i != 0) {
        }
        settlementFocusingConfig = (SuperAppDiscoveryMapExperiment.SettlementFocusingConfig) obj2;
        if (settlementFocusingConfig != null) {
        }
        return zy11.a;
    }
}
