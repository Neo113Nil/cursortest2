package com.yandex.go.scooters.domain.polling;

import defpackage.ny61;
import defpackage.t2e0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class h implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ a b;

    public h(vpr vprVar, a aVar) {
        this.a = vprVar;
        this.b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScootersPollingInteractorImpl$listenPolling$lambda$0$2$$inlined$map$1$2$1 scootersPollingInteractorImpl$listenPolling$lambda$0$2$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ScootersPollingInteractorImpl$listenPolling$lambda$0$2$$inlined$map$1$2$1) {
            scootersPollingInteractorImpl$listenPolling$lambda$0$2$$inlined$map$1$2$1 = (ScootersPollingInteractorImpl$listenPolling$lambda$0$2$$inlined$map$1$2$1) continuation;
            int i2 = scootersPollingInteractorImpl$listenPolling$lambda$0$2$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPollingInteractorImpl$listenPolling$lambda$0$2$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersPollingInteractorImpl$listenPolling$lambda$0$2$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPollingInteractorImpl$listenPolling$lambda$0$2$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Object value = ((Result) obj).getValue();
                    String str = this.b.h;
                    t2e0 t2e0Var = new t2e0(value);
                    scootersPollingInteractorImpl$listenPolling$lambda$0$2$$inlined$map$1$2$1.L$0 = null;
                    scootersPollingInteractorImpl$listenPolling$lambda$0$2$$inlined$map$1$2$1.L$1 = null;
                    scootersPollingInteractorImpl$listenPolling$lambda$0$2$$inlined$map$1$2$1.L$2 = null;
                    scootersPollingInteractorImpl$listenPolling$lambda$0$2$$inlined$map$1$2$1.L$3 = null;
                    scootersPollingInteractorImpl$listenPolling$lambda$0$2$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(t2e0Var, scootersPollingInteractorImpl$listenPolling$lambda$0$2$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        scootersPollingInteractorImpl$listenPolling$lambda$0$2$$inlined$map$1$2$1 = new ScootersPollingInteractorImpl$listenPolling$lambda$0$2$$inlined$map$1$2$1(this, continuation);
        Object obj22 = scootersPollingInteractorImpl$listenPolling$lambda$0$2$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPollingInteractorImpl$listenPolling$lambda$0$2$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
