package com.yandex.go.preorder.deeplinks;

import com.yandex.go.zone.model.Zone;
import defpackage.jst;
import defpackage.ny61;
import defpackage.vre0;
import defpackage.vv20;
import defpackage.xby;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final com.yandex.go.taxi.tariffs.interactor.b a;
    public final vre0 b;

    public a(vre0 vre0Var, com.yandex.go.taxi.tariffs.interactor.b bVar) {
        this.a = bVar;
        this.b = vre0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(vv20 vv20Var, ContinuationImpl continuationImpl) {
        MobilityHubDeeplinkPreorderInteractor$handleRoute$1 mobilityHubDeeplinkPreorderInteractor$handleRoute$1;
        int i;
        zy11 zy11Var = zy11.a;
        try {
            if (continuationImpl instanceof MobilityHubDeeplinkPreorderInteractor$handleRoute$1) {
                mobilityHubDeeplinkPreorderInteractor$handleRoute$1 = (MobilityHubDeeplinkPreorderInteractor$handleRoute$1) continuationImpl;
                int i2 = mobilityHubDeeplinkPreorderInteractor$handleRoute$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    mobilityHubDeeplinkPreorderInteractor$handleRoute$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = mobilityHubDeeplinkPreorderInteractor$handleRoute$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = mobilityHubDeeplinkPreorderInteractor$handleRoute$1.label;
                    if (i == 0) {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    kotlin.b.b(obj);
                    if (vv20Var.b) {
                        Zone zone = vv20Var.a.b;
                        this.b.a = zone;
                        com.yandex.go.taxi.tariffs.interactor.b bVar = this.a;
                        mobilityHubDeeplinkPreorderInteractor$handleRoute$1.L$0 = null;
                        mobilityHubDeeplinkPreorderInteractor$handleRoute$1.L$1 = null;
                        mobilityHubDeeplinkPreorderInteractor$handleRoute$1.label = 1;
                        if (bVar.b(zone, mobilityHubDeeplinkPreorderInteractor$handleRoute$1) == coroutineSingletons) {
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
            xby.l(jst.e, "Preorder.RouteDeeplink:MOBILITY_HUB:TARIFFS", null, th, "Failed to process tariffs info", 2);
            return zy11Var;
        }
        mobilityHubDeeplinkPreorderInteractor$handleRoute$1 = new MobilityHubDeeplinkPreorderInteractor$handleRoute$1(this, continuationImpl);
        Object obj2 = mobilityHubDeeplinkPreorderInteractor$handleRoute$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobilityHubDeeplinkPreorderInteractor$handleRoute$1.label;
    }
}
