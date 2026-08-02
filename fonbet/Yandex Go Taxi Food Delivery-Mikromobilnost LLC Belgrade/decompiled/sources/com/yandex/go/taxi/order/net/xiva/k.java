package com.yandex.go.taxi.order.net.xiva;

import defpackage.eci0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class k implements tpr {
    public final /* synthetic */ tpr a;

    public k(eci0 eci0Var) {
        this.a = eci0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        WebSocketTrackerDataSource$remoteDataFlow$$inlined$filterIsInstance$1$1 webSocketTrackerDataSource$remoteDataFlow$$inlined$filterIsInstance$1$1;
        int i;
        if (continuation instanceof WebSocketTrackerDataSource$remoteDataFlow$$inlined$filterIsInstance$1$1) {
            webSocketTrackerDataSource$remoteDataFlow$$inlined$filterIsInstance$1$1 = (WebSocketTrackerDataSource$remoteDataFlow$$inlined$filterIsInstance$1$1) continuation;
            int i2 = webSocketTrackerDataSource$remoteDataFlow$$inlined$filterIsInstance$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webSocketTrackerDataSource$remoteDataFlow$$inlined$filterIsInstance$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = webSocketTrackerDataSource$remoteDataFlow$$inlined$filterIsInstance$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webSocketTrackerDataSource$remoteDataFlow$$inlined$filterIsInstance$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    j jVar = new j(vprVar);
                    webSocketTrackerDataSource$remoteDataFlow$$inlined$filterIsInstance$1$1.L$0 = null;
                    webSocketTrackerDataSource$remoteDataFlow$$inlined$filterIsInstance$1$1.L$1 = null;
                    webSocketTrackerDataSource$remoteDataFlow$$inlined$filterIsInstance$1$1.L$2 = null;
                    webSocketTrackerDataSource$remoteDataFlow$$inlined$filterIsInstance$1$1.label = 1;
                    if (this.a.collect(jVar, webSocketTrackerDataSource$remoteDataFlow$$inlined$filterIsInstance$1$1) == coroutineSingletons) {
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
        webSocketTrackerDataSource$remoteDataFlow$$inlined$filterIsInstance$1$1 = new WebSocketTrackerDataSource$remoteDataFlow$$inlined$filterIsInstance$1$1(this, continuation);
        Object obj2 = webSocketTrackerDataSource$remoteDataFlow$$inlined$filterIsInstance$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webSocketTrackerDataSource$remoteDataFlow$$inlined$filterIsInstance$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
