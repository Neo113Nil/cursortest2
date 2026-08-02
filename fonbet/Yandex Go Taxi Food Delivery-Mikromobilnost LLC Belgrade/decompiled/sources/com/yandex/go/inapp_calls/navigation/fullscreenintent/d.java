package com.yandex.go.inapp_calls.navigation.fullscreenintent;

import com.yandex.go.inapp_calls.experiment.InAppCallExperiment;
import com.yandex.go.inapp_calls.experiment.q;
import defpackage.czo0;
import defpackage.dnr;
import defpackage.ea0;
import defpackage.hbp0;
import defpackage.i3y;
import defpackage.k9j0;
import defpackage.mjv;
import defpackage.mth;
import defpackage.n20;
import defpackage.njv;
import defpackage.ny61;
import defpackage.o8g0;
import defpackage.oep0;
import defpackage.ris;
import defpackage.yvf0;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;

/* loaded from: classes12.dex */
public final class d {
    public final ris a;
    public final yvf0 b;
    public final q c;
    public final k9j0 d;
    public final n20 e;
    public final njv f;
    public final o8g0 g;
    public final oep0 h;
    public final hbp0 i = new hbp0(new czo0(14), "", null);
    public final i3y j = kotlin.a.a(new dnr(3, this));

    public d(ris risVar, ea0 ea0Var, q qVar, k9j0 k9j0Var, n20 n20Var, njv njvVar, o8g0 o8g0Var, oep0 oep0Var) {
        this.a = risVar;
        this.b = ea0Var;
        this.c = qVar;
        this.d = k9j0Var;
        this.e = n20Var;
        this.f = njvVar;
        this.g = o8g0Var;
        this.h = oep0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(d dVar, InAppCallExperiment inAppCallExperiment, ContinuationImpl continuationImpl) {
        FullScreenIntentNotificationHandlerImpl$awaitOrderStateMatches$1 fullScreenIntentNotificationHandlerImpl$awaitOrderStateMatches$1;
        int i;
        dVar.getClass();
        if (continuationImpl instanceof FullScreenIntentNotificationHandlerImpl$awaitOrderStateMatches$1) {
            fullScreenIntentNotificationHandlerImpl$awaitOrderStateMatches$1 = (FullScreenIntentNotificationHandlerImpl$awaitOrderStateMatches$1) continuationImpl;
            int i2 = fullScreenIntentNotificationHandlerImpl$awaitOrderStateMatches$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fullScreenIntentNotificationHandlerImpl$awaitOrderStateMatches$1.label = i2 - Integer.MIN_VALUE;
                Object obj = fullScreenIntentNotificationHandlerImpl$awaitOrderStateMatches$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fullScreenIntentNotificationHandlerImpl$awaitOrderStateMatches$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    g X = e.X(new mth(((com.yandex.go.taxi.order.provider.a) dVar.e).v(), 6), new FullScreenIntentNotificationHandlerImpl$awaitOrderStateMatches$$inlined$flatMapLatest$1(3, null));
                    FullScreenIntentNotificationHandlerImpl$awaitOrderStateMatches$3 fullScreenIntentNotificationHandlerImpl$awaitOrderStateMatches$3 = new FullScreenIntentNotificationHandlerImpl$awaitOrderStateMatches$3(inAppCallExperiment, null);
                    fullScreenIntentNotificationHandlerImpl$awaitOrderStateMatches$1.L$0 = null;
                    fullScreenIntentNotificationHandlerImpl$awaitOrderStateMatches$1.label = 1;
                    if (e.x(X, fullScreenIntentNotificationHandlerImpl$awaitOrderStateMatches$3, fullScreenIntentNotificationHandlerImpl$awaitOrderStateMatches$1) == coroutineSingletons) {
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
        fullScreenIntentNotificationHandlerImpl$awaitOrderStateMatches$1 = new FullScreenIntentNotificationHandlerImpl$awaitOrderStateMatches$1(dVar, continuationImpl);
        Object obj2 = fullScreenIntentNotificationHandlerImpl$awaitOrderStateMatches$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fullScreenIntentNotificationHandlerImpl$awaitOrderStateMatches$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    public final void b() {
        if (this.g.c()) {
            return;
        }
        this.i.a();
        njv njvVar = this.f;
        if (!njv.g) {
            njv.g = true;
            mjv mjvVar = njvVar.b;
            mjvVar.getClass();
            mjvVar.a.a("InAppCalls.FullscreenPermission.NoPermission", new HashMap(), 1, new HashMap());
        }
        com.yandex.go.coroutines.b.g(this.i, null, null, new FullScreenIntentNotificationHandlerImpl$awaitConditionsForShowingModalView$1(this, null), 3);
    }
}
