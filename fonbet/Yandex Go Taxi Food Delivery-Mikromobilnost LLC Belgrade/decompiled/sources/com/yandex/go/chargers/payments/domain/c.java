package com.yandex.go.chargers.payments.domain;

import com.yandex.go.chargers.domain.ChargersCompositePaymentInteractor$ChargersCompositePaymentState;
import com.yandex.go.chargers.plus.api.ChargersPlusPlaqueExperiment;
import defpackage.ffx;
import defpackage.hfa0;
import defpackage.jma;
import defpackage.m6a0;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vez0;
import defpackage.vit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes.dex */
public final class c {
    public final tse a;
    public final jma b;
    public final com.yandex.go.chargers.payments.data.a c;
    public final vit d;
    public final n0 e = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);

    public c(tse tseVar, jma jmaVar, com.yandex.go.chargers.payments.data.a aVar, vit vitVar) {
        this.a = tseVar;
        this.b = jmaVar;
        this.c = aVar;
        this.d = vitVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Enum a(c cVar, hfa0 hfa0Var, ContinuationImpl continuationImpl) {
        ChargersCompositePaymentInteractorImpl$toChargersCompositePaymentState$1 chargersCompositePaymentInteractorImpl$toChargersCompositePaymentState$1;
        int i;
        boolean z;
        boolean a;
        cVar.getClass();
        if (continuationImpl instanceof ChargersCompositePaymentInteractorImpl$toChargersCompositePaymentState$1) {
            chargersCompositePaymentInteractorImpl$toChargersCompositePaymentState$1 = (ChargersCompositePaymentInteractorImpl$toChargersCompositePaymentState$1) continuationImpl;
            int i2 = chargersCompositePaymentInteractorImpl$toChargersCompositePaymentState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersCompositePaymentInteractorImpl$toChargersCompositePaymentState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersCompositePaymentInteractorImpl$toChargersCompositePaymentState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersCompositePaymentInteractorImpl$toChargersCompositePaymentState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    jma jmaVar = cVar.b;
                    chargersCompositePaymentInteractorImpl$toChargersCompositePaymentState$1.L$0 = hfa0Var;
                    chargersCompositePaymentInteractorImpl$toChargersCompositePaymentState$1.label = 1;
                    obj = jmaVar.a.b(chargersCompositePaymentInteractorImpl$toChargersCompositePaymentState$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hfa0Var = (hfa0) chargersCompositePaymentInteractorImpl$toChargersCompositePaymentState$1.L$0;
                    kotlin.b.b(obj);
                }
                z = ((ChargersPlusPlaqueExperiment) obj).b;
                m6a0 d = hfa0Var.d();
                a = d == null ? d.a() : false;
                if (!z && vez0.G(hfa0Var)) {
                    return !a ? ChargersCompositePaymentInteractor$ChargersCompositePaymentState.ENABLED_CHECKED : !a ? ChargersCompositePaymentInteractor$ChargersCompositePaymentState.ENABLED_UNCHECKED : ChargersCompositePaymentInteractor$ChargersCompositePaymentState.DISABLED;
                }
                return ChargersCompositePaymentInteractor$ChargersCompositePaymentState.DISABLED;
            }
        }
        chargersCompositePaymentInteractorImpl$toChargersCompositePaymentState$1 = new ChargersCompositePaymentInteractorImpl$toChargersCompositePaymentState$1(cVar, continuationImpl);
        Object obj2 = chargersCompositePaymentInteractorImpl$toChargersCompositePaymentState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersCompositePaymentInteractorImpl$toChargersCompositePaymentState$1.label;
        if (i != 0) {
        }
        z = ((ChargersPlusPlaqueExperiment) obj2).b;
        m6a0 d2 = hfa0Var.d();
        if (d2 == null) {
        }
        if (!z) {
            return ChargersCompositePaymentInteractor$ChargersCompositePaymentState.DISABLED;
        }
        if (!a) {
        }
    }

    public final g b() {
        return kotlinx.coroutines.flow.e.I(this.e, new ChargersCompositePaymentInteractorImpl$compositePaymentToggleFlow$1(this, null));
    }

    public final void c() {
        com.yandex.go.coroutines.b.g(this.a, null, null, new ChargersCompositePaymentInteractorImpl$toggleCompositePayment$1(this, null), 3);
    }
}
