package com.yandex.go.preorder.deeplinks;

import com.yandex.go.zone.model.Zone;
import defpackage.a611;
import defpackage.jst;
import defpackage.ny61;
import defpackage.vre0;
import defpackage.xby;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class d {
    public final vre0 a;
    public final com.yandex.go.taxi.tariffs.interactor.b b;

    public d(vre0 vre0Var, com.yandex.go.taxi.tariffs.interactor.b bVar) {
        this.a = vre0Var;
        this.b = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(a611 a611Var, ContinuationImpl continuationImpl) {
        TransportDeeplinkPreorderInteractor$handleTransport$1 transportDeeplinkPreorderInteractor$handleTransport$1;
        int i;
        zy11 zy11Var = zy11.a;
        try {
            if (continuationImpl instanceof TransportDeeplinkPreorderInteractor$handleTransport$1) {
                transportDeeplinkPreorderInteractor$handleTransport$1 = (TransportDeeplinkPreorderInteractor$handleTransport$1) continuationImpl;
                int i2 = transportDeeplinkPreorderInteractor$handleTransport$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    transportDeeplinkPreorderInteractor$handleTransport$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = transportDeeplinkPreorderInteractor$handleTransport$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = transportDeeplinkPreorderInteractor$handleTransport$1.label;
                    if (i == 0) {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    kotlin.b.b(obj);
                    if (a611Var.b) {
                        Zone zone = a611Var.a.b;
                        this.a.a = zone;
                        com.yandex.go.taxi.tariffs.interactor.b bVar = this.b;
                        transportDeeplinkPreorderInteractor$handleTransport$1.L$0 = null;
                        transportDeeplinkPreorderInteractor$handleTransport$1.L$1 = null;
                        transportDeeplinkPreorderInteractor$handleTransport$1.label = 1;
                        if (bVar.b(zone, transportDeeplinkPreorderInteractor$handleTransport$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return zy11Var;
                }
            }
            if (i == 0) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            xby.l(jst.e, "Preorder.RouteDeeplink:TRANSPORT:TARIFFS", null, th, "Failed to process tariffs info", 2);
            return zy11Var;
        }
        transportDeeplinkPreorderInteractor$handleTransport$1 = new TransportDeeplinkPreorderInteractor$handleTransport$1(this, continuationImpl);
        Object obj2 = transportDeeplinkPreorderInteractor$handleTransport$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transportDeeplinkPreorderInteractor$handleTransport$1.label;
    }
}
