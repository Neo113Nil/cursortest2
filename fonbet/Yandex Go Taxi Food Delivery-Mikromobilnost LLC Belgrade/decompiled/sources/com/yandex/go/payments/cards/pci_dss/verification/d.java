package com.yandex.go.payments.cards.pci_dss.verification;

import com.yandex.go.payments.addmethod.data.model.AddPaymentInfo$AddPaymentInfoStatus;
import defpackage.ai0;
import defpackage.aj0;
import defpackage.avj0;
import defpackage.c88;
import defpackage.gf41;
import defpackage.h55;
import defpackage.jwx0;
import defpackage.k88;
import defpackage.kyh0;
import defpackage.m950;
import defpackage.n88;
import defpackage.ny61;
import defpackage.qu;
import defpackage.tje;
import defpackage.v88;
import defpackage.wi0;
import defpackage.yvf0;
import defpackage.zi0;
import defpackage.zuj0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class d extends h55 {
    public final zuj0 D;
    public final yvf0 E;
    public final v88 F;
    public final gf41 G;
    public final aj0 H;
    public final jwx0 I;
    public final wi0 J;
    public zi0 K;

    public d(zuj0 zuj0Var, yvf0 yvf0Var, v88 v88Var, gf41 gf41Var, aj0 aj0Var, jwx0 jwx0Var, wi0 wi0Var) {
        super(null);
        this.D = zuj0Var;
        this.E = yvf0Var;
        this.F = v88Var;
        this.G = gf41Var;
        this.H = aj0Var;
        this.I = jwx0Var;
        this.J = wi0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        if (kotlinx.coroutines.a.i(1000, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        if (r3 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(d dVar, ContinuationImpl continuationImpl) {
        Card3dsPollingBaseRouter$showFailedState$1 card3dsPollingBaseRouter$showFailedState$1;
        int i;
        dVar.getClass();
        if (continuationImpl instanceof Card3dsPollingBaseRouter$showFailedState$1) {
            card3dsPollingBaseRouter$showFailedState$1 = (Card3dsPollingBaseRouter$showFailedState$1) continuationImpl;
            int i2 = card3dsPollingBaseRouter$showFailedState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                card3dsPollingBaseRouter$showFailedState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = card3dsPollingBaseRouter$showFailedState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = card3dsPollingBaseRouter$showFailedState$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    wi0 wi0Var = dVar.J;
                    ai0 ai0Var = new ai0(((avj0) dVar.D).h(kyh0.payment_methods_add_card_failure), AddPaymentInfo$AddPaymentInfoStatus.ERROR);
                    card3dsPollingBaseRouter$showFailedState$1.label = 1;
                    wi0Var.a(ai0Var, card3dsPollingBaseRouter$showFailedState$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        dVar.r(new qu(9));
                        return zy11Var;
                    }
                    kotlin.b.b(obj);
                }
                card3dsPollingBaseRouter$showFailedState$1.label = 2;
            }
        }
        card3dsPollingBaseRouter$showFailedState$1 = new Card3dsPollingBaseRouter$showFailedState$1(dVar, continuationImpl);
        Object obj2 = card3dsPollingBaseRouter$showFailedState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = card3dsPollingBaseRouter$showFailedState$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        card3dsPollingBaseRouter$showFailedState$1.label = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        if (kotlinx.coroutines.a.i(1000, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        if (r3 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Q(d dVar, ContinuationImpl continuationImpl) {
        Card3dsPollingBaseRouter$showSuccessState$1 card3dsPollingBaseRouter$showSuccessState$1;
        int i;
        dVar.getClass();
        if (continuationImpl instanceof Card3dsPollingBaseRouter$showSuccessState$1) {
            card3dsPollingBaseRouter$showSuccessState$1 = (Card3dsPollingBaseRouter$showSuccessState$1) continuationImpl;
            int i2 = card3dsPollingBaseRouter$showSuccessState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                card3dsPollingBaseRouter$showSuccessState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = card3dsPollingBaseRouter$showSuccessState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = card3dsPollingBaseRouter$showSuccessState$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    wi0 wi0Var = dVar.J;
                    ai0 ai0Var = new ai0(((avj0) dVar.D).h(kyh0.payment_methods_add_card_success), AddPaymentInfo$AddPaymentInfoStatus.DONE);
                    card3dsPollingBaseRouter$showSuccessState$1.label = 1;
                    wi0Var.a(ai0Var, card3dsPollingBaseRouter$showSuccessState$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        dVar.r(new qu(9));
                        return zy11Var;
                    }
                    kotlin.b.b(obj);
                }
                card3dsPollingBaseRouter$showSuccessState$1.label = 2;
            }
        }
        card3dsPollingBaseRouter$showSuccessState$1 = new Card3dsPollingBaseRouter$showSuccessState$1(dVar, continuationImpl);
        Object obj2 = card3dsPollingBaseRouter$showSuccessState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = card3dsPollingBaseRouter$showSuccessState$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        card3dsPollingBaseRouter$showSuccessState$1.label = 2;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new Card3dsPollingBaseRouter$onLaunch$1(this, (n88) obj, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        if (kotlinx.coroutines.a.i(1000, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        if (r3 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object R(c88 c88Var, Continuation continuation) {
        Card3dsPollingBaseRouter$launchCard3dsFailedRouter$1 card3dsPollingBaseRouter$launchCard3dsFailedRouter$1;
        int i;
        if (continuation instanceof Card3dsPollingBaseRouter$launchCard3dsFailedRouter$1) {
            card3dsPollingBaseRouter$launchCard3dsFailedRouter$1 = (Card3dsPollingBaseRouter$launchCard3dsFailedRouter$1) continuation;
            int i2 = card3dsPollingBaseRouter$launchCard3dsFailedRouter$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                card3dsPollingBaseRouter$launchCard3dsFailedRouter$1.label = i2 - Integer.MIN_VALUE;
                Object obj = card3dsPollingBaseRouter$launchCard3dsFailedRouter$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = card3dsPollingBaseRouter$launchCard3dsFailedRouter$1.label;
                zy11 zy11Var = zy11.a;
                int i3 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ai0 ai0Var = new ai0(((avj0) this.D).h(kyh0.payment_methods_add_card_failure), AddPaymentInfo$AddPaymentInfoStatus.ERROR);
                    card3dsPollingBaseRouter$launchCard3dsFailedRouter$1.L$0 = c88Var;
                    card3dsPollingBaseRouter$launchCard3dsFailedRouter$1.label = 1;
                    this.J.a(ai0Var, card3dsPollingBaseRouter$launchCard3dsFailedRouter$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        c88Var = (c88) card3dsPollingBaseRouter$launchCard3dsFailedRouter$1.L$0;
                        kotlin.b.b(obj);
                        zi0 zi0Var = this.K;
                        if (zi0Var != null) {
                            zi0Var.i();
                        }
                        A((m950) this.E.get(), c88Var, new k88(this, i3));
                        return zy11Var;
                    }
                    c88Var = (c88) card3dsPollingBaseRouter$launchCard3dsFailedRouter$1.L$0;
                    kotlin.b.b(obj);
                }
                card3dsPollingBaseRouter$launchCard3dsFailedRouter$1.L$0 = c88Var;
                card3dsPollingBaseRouter$launchCard3dsFailedRouter$1.label = 2;
            }
        }
        card3dsPollingBaseRouter$launchCard3dsFailedRouter$1 = new Card3dsPollingBaseRouter$launchCard3dsFailedRouter$1(this, continuation);
        Object obj2 = card3dsPollingBaseRouter$launchCard3dsFailedRouter$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = card3dsPollingBaseRouter$launchCard3dsFailedRouter$1.label;
        zy11 zy11Var2 = zy11.a;
        int i32 = 1;
        if (i != 0) {
        }
        card3dsPollingBaseRouter$launchCard3dsFailedRouter$1.L$0 = c88Var;
        card3dsPollingBaseRouter$launchCard3dsFailedRouter$1.label = 2;
    }
}
