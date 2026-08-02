package com.yandex.go.intentprocessor;

import defpackage.iv20;
import defpackage.jst;
import defpackage.k4l0;
import defpackage.l4l0;
import defpackage.ny61;
import defpackage.p7z;
import defpackage.t7z;
import defpackage.vv20;
import defpackage.wdz;
import defpackage.xby;
import defpackage.z7w;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class j implements z7w {
    public final com.yandex.go.taxi.summary.mobilityhub.deeplink.b a;
    public final wdz b;

    public j(com.yandex.go.taxi.summary.mobilityhub.deeplink.b bVar, wdz wdzVar) {
        this.a = bVar;
        this.b = wdzVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // defpackage.z7w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(t7z t7zVar, Continuation continuation) {
        MobilityHubIntentProcessor$process$1 mobilityHubIntentProcessor$process$1;
        int i;
        k4l0 k4l0Var;
        iv20 iv20Var;
        try {
            if (continuation instanceof MobilityHubIntentProcessor$process$1) {
                mobilityHubIntentProcessor$process$1 = (MobilityHubIntentProcessor$process$1) continuation;
                int i2 = mobilityHubIntentProcessor$process$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    mobilityHubIntentProcessor$process$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = mobilityHubIntentProcessor$process$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = mobilityHubIntentProcessor$process$1.label;
                    k4l0Var = k4l0.a;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        p7z p7zVar = t7zVar instanceof p7z ? (p7z) t7zVar : null;
                        if (p7zVar == null) {
                            return k4l0Var;
                        }
                        iv20 l = this.b.l(p7zVar.a.a);
                        com.yandex.go.taxi.summary.mobilityhub.deeplink.b bVar = this.a;
                        mobilityHubIntentProcessor$process$1.L$0 = null;
                        mobilityHubIntentProcessor$process$1.L$1 = null;
                        mobilityHubIntentProcessor$process$1.L$2 = l;
                        mobilityHubIntentProcessor$process$1.label = 1;
                        obj = bVar.a(l, mobilityHubIntentProcessor$process$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        iv20Var = l;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        iv20Var = (iv20) mobilityHubIntentProcessor$process$1.L$2;
                        kotlin.b.b(obj);
                    }
                    return new l4l0((vv20) obj, iv20Var.d);
                }
            }
            if (i != 0) {
            }
            return new l4l0((vv20) obj, iv20Var.d);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            xby.l(jst.e, "INTENT_PROCESSOR_ERROR:MOBILITY_HUB", null, th, "Error fetching data from mobility hub deeplink", 2);
            return k4l0Var;
        }
        mobilityHubIntentProcessor$process$1 = new MobilityHubIntentProcessor$process$1(this, (ContinuationImpl) continuation);
        Object obj2 = mobilityHubIntentProcessor$process$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobilityHubIntentProcessor$process$1.label;
        k4l0Var = k4l0.a;
    }
}
