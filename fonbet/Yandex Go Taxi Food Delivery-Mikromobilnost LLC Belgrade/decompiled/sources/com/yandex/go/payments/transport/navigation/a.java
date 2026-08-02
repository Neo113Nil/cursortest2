package com.yandex.go.payments.transport.navigation;

import defpackage.h0a0;
import defpackage.h55;
import defpackage.hfa0;
import defpackage.m950;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.po21;
import defpackage.sr30;
import defpackage.tje;
import defpackage.ur30;
import defpackage.yvf0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineStart;

/* loaded from: classes13.dex */
public final class a extends h55 implements m950 {
    public final yvf0 D;
    public final po21 E;
    public final com.yandex.go.payments.transport.domain.a F;
    public hfa0 G;

    public a(yvf0 yvf0Var, po21 po21Var, com.yandex.go.payments.transport.domain.a aVar) {
        super(null);
        this.D = yvf0Var;
        this.E = po21Var;
        this.F = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(a aVar, ur30 ur30Var, ContinuationImpl continuationImpl) {
        MtPaymentSelectionRouterImpl$createPaymentPayload$1 mtPaymentSelectionRouterImpl$createPaymentPayload$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof MtPaymentSelectionRouterImpl$createPaymentPayload$1) {
            mtPaymentSelectionRouterImpl$createPaymentPayload$1 = (MtPaymentSelectionRouterImpl$createPaymentPayload$1) continuationImpl;
            int i2 = mtPaymentSelectionRouterImpl$createPaymentPayload$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtPaymentSelectionRouterImpl$createPaymentPayload$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtPaymentSelectionRouterImpl$createPaymentPayload$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtPaymentSelectionRouterImpl$createPaymentPayload$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ur30Var.getClass();
                    po21 po21Var = aVar.E;
                    mtPaymentSelectionRouterImpl$createPaymentPayload$1.L$0 = ur30Var;
                    mtPaymentSelectionRouterImpl$createPaymentPayload$1.label = 1;
                    obj = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var).h(mtPaymentSelectionRouterImpl$createPaymentPayload$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ur30Var = (ur30) mtPaymentSelectionRouterImpl$createPaymentPayload$1.L$0;
                    kotlin.b.b(obj);
                }
                return new sr30(new h0a0(((mo21) obj).a(), null), ur30Var.a);
            }
        }
        mtPaymentSelectionRouterImpl$createPaymentPayload$1 = new MtPaymentSelectionRouterImpl$createPaymentPayload$1(aVar, continuationImpl);
        Object obj2 = mtPaymentSelectionRouterImpl$createPaymentPayload$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtPaymentSelectionRouterImpl$createPaymentPayload$1.label;
        if (i != 0) {
        }
        return new sr30(new h0a0(((mo21) obj2).a(), null), ur30Var.a);
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.G = null;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        ur30 ur30Var = (ur30) obj;
        this.G = null;
        tje.N(o(), null, CoroutineStart.UNDISPATCHED, new MtPaymentSelectionRouterImpl$onLaunch$1(ur30Var, this, null), 1);
        tje.N(o(), null, null, new MtPaymentSelectionRouterImpl$onLaunch$2(ur30Var, this, null), 3);
    }
}
