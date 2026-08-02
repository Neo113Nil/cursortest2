package com.yandex.go.inapp_calls.navigation.fullscreenintent;

import com.yandex.go.inapp_calls.experiment.InAppCallExperiment;
import defpackage.d6z;
import defpackage.hbp0;
import defpackage.j9j0;
import defpackage.k9j0;
import defpackage.mjv;
import defpackage.ny61;
import defpackage.pd51;
import defpackage.ris;
import defpackage.vpr;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class c implements vpr {
    public final /* synthetic */ d a;

    public c(d dVar) {
        this.a = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FullScreenIntentNotificationHandlerImpl$awaitConditionsForShowingModalView$1$invokeSuspend$$inlined$safeCollect$2$1 fullScreenIntentNotificationHandlerImpl$awaitConditionsForShowingModalView$1$invokeSuspend$$inlined$safeCollect$2$1;
        int i;
        InAppCallExperiment inAppCallExperiment;
        String Y;
        String Y2;
        String Y3;
        j9j0 j9j0Var;
        if (continuation instanceof FullScreenIntentNotificationHandlerImpl$awaitConditionsForShowingModalView$1$invokeSuspend$$inlined$safeCollect$2$1) {
            fullScreenIntentNotificationHandlerImpl$awaitConditionsForShowingModalView$1$invokeSuspend$$inlined$safeCollect$2$1 = (FullScreenIntentNotificationHandlerImpl$awaitConditionsForShowingModalView$1$invokeSuspend$$inlined$safeCollect$2$1) continuation;
            int i2 = fullScreenIntentNotificationHandlerImpl$awaitConditionsForShowingModalView$1$invokeSuspend$$inlined$safeCollect$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fullScreenIntentNotificationHandlerImpl$awaitConditionsForShowingModalView$1$invokeSuspend$$inlined$safeCollect$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = fullScreenIntentNotificationHandlerImpl$awaitConditionsForShowingModalView$1$invokeSuspend$$inlined$safeCollect$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fullScreenIntentNotificationHandlerImpl$awaitConditionsForShowingModalView$1$invokeSuspend$$inlined$safeCollect$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    inAppCallExperiment = (InAppCallExperiment) obj;
                    d dVar = this.a;
                    fullScreenIntentNotificationHandlerImpl$awaitConditionsForShowingModalView$1$invokeSuspend$$inlined$safeCollect$2$1.L$0 = null;
                    fullScreenIntentNotificationHandlerImpl$awaitConditionsForShowingModalView$1$invokeSuspend$$inlined$safeCollect$2$1.L$1 = null;
                    fullScreenIntentNotificationHandlerImpl$awaitConditionsForShowingModalView$1$invokeSuspend$$inlined$safeCollect$2$1.L$2 = inAppCallExperiment;
                    fullScreenIntentNotificationHandlerImpl$awaitConditionsForShowingModalView$1$invokeSuspend$$inlined$safeCollect$2$1.label = 1;
                    if (d.a(dVar, inAppCallExperiment, fullScreenIntentNotificationHandlerImpl$awaitConditionsForShowingModalView$1$invokeSuspend$$inlined$safeCollect$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    inAppCallExperiment = (InAppCallExperiment) fullScreenIntentNotificationHandlerImpl$awaitConditionsForShowingModalView$1$invokeSuspend$$inlined$safeCollect$2$1.L$2;
                    kotlin.b.b(obj2);
                }
                d dVar2 = this.a;
                k9j0 k9j0Var = dVar2.d;
                Y = d6z.Y(inAppCallExperiment, inAppCallExperiment.k.a);
                InAppCallExperiment.FullScreenRequestModal fullScreenRequestModal = inAppCallExperiment.k;
                Y2 = d6z.Y(inAppCallExperiment, fullScreenRequestModal.b);
                Y3 = d6z.Y(inAppCallExperiment, fullScreenRequestModal.c);
                if ((Y2.length() == 0 || Y.length() != 0) && Y3.length() != 0) {
                    j9j0Var = new j9j0(Y, Y2, !((Boolean) pd51.a.getValue()).booleanValue() ? d6z.Y(inAppCallExperiment, fullScreenRequestModal.f) : null, Y3);
                } else {
                    j9j0Var = null;
                }
                if (j9j0Var != null) {
                    InAppCallExperiment.FullScreenRequestModal.ShowMode showMode = inAppCallExperiment.k.e;
                    InAppCallExperiment.FullScreenRequestModal.ShowMode showMode2 = InAppCallExperiment.FullScreenRequestModal.ShowMode.FORCE;
                    if (showMode == showMode2 ? dVar2.a.a : !((Boolean) r1.b.getValue(r1, ris.c[0])).booleanValue()) {
                        if (inAppCallExperiment.k.e == showMode2) {
                            dVar2.a.a = true;
                        }
                        ris risVar = dVar2.a;
                        risVar.b.setValue(risVar, ris.c[0], Boolean.TRUE);
                        mjv mjvVar = dVar2.f.b;
                        mjvVar.getClass();
                        mjvVar.a.a("InAppCalls.FullscreenPermission.Shown", new HashMap(), 1, new HashMap());
                        hbp0.e(dVar2.i, null, null, new FullScreenIntentNotificationHandlerImpl$launchRequestFullScreenModalRouter$1(j9j0Var, dVar2, null), 3);
                    }
                }
                return zy11.a;
            }
        }
        fullScreenIntentNotificationHandlerImpl$awaitConditionsForShowingModalView$1$invokeSuspend$$inlined$safeCollect$2$1 = new FullScreenIntentNotificationHandlerImpl$awaitConditionsForShowingModalView$1$invokeSuspend$$inlined$safeCollect$2$1(this, continuation);
        Object obj22 = fullScreenIntentNotificationHandlerImpl$awaitConditionsForShowingModalView$1$invokeSuspend$$inlined$safeCollect$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fullScreenIntentNotificationHandlerImpl$awaitConditionsForShowingModalView$1$invokeSuspend$$inlined$safeCollect$2$1.label;
        if (i != 0) {
        }
        d dVar22 = this.a;
        k9j0 k9j0Var2 = dVar22.d;
        Y = d6z.Y(inAppCallExperiment, inAppCallExperiment.k.a);
        InAppCallExperiment.FullScreenRequestModal fullScreenRequestModal2 = inAppCallExperiment.k;
        Y2 = d6z.Y(inAppCallExperiment, fullScreenRequestModal2.b);
        Y3 = d6z.Y(inAppCallExperiment, fullScreenRequestModal2.c);
        if (Y2.length() == 0) {
        }
        j9j0Var = new j9j0(Y, Y2, !((Boolean) pd51.a.getValue()).booleanValue() ? d6z.Y(inAppCallExperiment, fullScreenRequestModal2.f) : null, Y3);
        if (j9j0Var != null) {
        }
        return zy11.a;
    }
}
