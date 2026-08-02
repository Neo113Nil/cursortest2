package com.yandex.go.superapp.tracking.data;

import defpackage.m49;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.j;

/* loaded from: classes8.dex */
public final class d implements tpr {
    public final /* synthetic */ tpr[] a;
    public final /* synthetic */ e b;

    public d(tpr[] tprVarArr, e eVar) {
        this.a = tprVarArr;
        this.b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TrackingRepositoryImpl$start$$inlined$combine$1$1 trackingRepositoryImpl$start$$inlined$combine$1$1;
        int i;
        if (continuation instanceof TrackingRepositoryImpl$start$$inlined$combine$1$1) {
            trackingRepositoryImpl$start$$inlined$combine$1$1 = (TrackingRepositoryImpl$start$$inlined$combine$1$1) continuation;
            int i2 = trackingRepositoryImpl$start$$inlined$combine$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trackingRepositoryImpl$start$$inlined$combine$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = trackingRepositoryImpl$start$$inlined$combine$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = trackingRepositoryImpl$start$$inlined$combine$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr[] tprVarArr = this.a;
                    m49 m49Var = new m49(tprVarArr, 8);
                    TrackingRepositoryImpl$start$$inlined$combine$1$3 trackingRepositoryImpl$start$$inlined$combine$1$3 = new TrackingRepositoryImpl$start$$inlined$combine$1$3(null, this.b);
                    trackingRepositoryImpl$start$$inlined$combine$1$1.L$0 = null;
                    trackingRepositoryImpl$start$$inlined$combine$1$1.L$1 = null;
                    trackingRepositoryImpl$start$$inlined$combine$1$1.L$2 = null;
                    trackingRepositoryImpl$start$$inlined$combine$1$1.label = 1;
                    if (j.a(vprVar, m49Var, trackingRepositoryImpl$start$$inlined$combine$1$3, trackingRepositoryImpl$start$$inlined$combine$1$1, tprVarArr) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        trackingRepositoryImpl$start$$inlined$combine$1$1 = new TrackingRepositoryImpl$start$$inlined$combine$1$1(this, continuation);
        Object obj2 = trackingRepositoryImpl$start$$inlined$combine$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackingRepositoryImpl$start$$inlined$combine$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
