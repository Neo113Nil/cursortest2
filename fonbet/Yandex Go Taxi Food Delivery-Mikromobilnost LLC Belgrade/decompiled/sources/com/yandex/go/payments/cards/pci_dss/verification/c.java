package com.yandex.go.payments.cards.pci_dss.verification;

import com.yandex.go.payments.addmethod.data.model.AddPaymentInfo$AddPaymentInfoStatus;
import defpackage.ai0;
import defpackage.asz0;
import defpackage.avj0;
import defpackage.c88;
import defpackage.jl40;
import defpackage.k88;
import defpackage.kyh0;
import defpackage.m950;
import defpackage.ny61;
import defpackage.p88;
import defpackage.q88;
import defpackage.r88;
import defpackage.s88;
import defpackage.sy60;
import defpackage.t88;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wi0;
import defpackage.zi0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class c implements vpr {
    public final /* synthetic */ d a;

    public c(d dVar) {
        this.a = dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x008a, code lost:
    
        if (kotlinx.coroutines.a.i(1000, r0) == r1) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x006a, code lost:
    
        if (r3 == r1) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(t88 t88Var, Continuation continuation) {
        Card3dsPollingBaseRouter$checkUrl$2$1$emit$1 card3dsPollingBaseRouter$checkUrl$2$1$emit$1;
        int i;
        if (continuation instanceof Card3dsPollingBaseRouter$checkUrl$2$1$emit$1) {
            card3dsPollingBaseRouter$checkUrl$2$1$emit$1 = (Card3dsPollingBaseRouter$checkUrl$2$1$emit$1) continuation;
            int i2 = card3dsPollingBaseRouter$checkUrl$2$1$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                card3dsPollingBaseRouter$checkUrl$2$1$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = card3dsPollingBaseRouter$checkUrl$2$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = card3dsPollingBaseRouter$checkUrl$2$1$emit$1.label;
                zy11 zy11Var = zy11.a;
                d dVar = this.a;
                switch (i) {
                    case 0:
                        kotlin.b.b(obj);
                        wi0 wi0Var = dVar.J;
                        ai0 ai0Var = new ai0(((avj0) dVar.D).h(kyh0.payment_methods_add_card_in_progress), AddPaymentInfo$AddPaymentInfoStatus.LOADING);
                        card3dsPollingBaseRouter$checkUrl$2$1$emit$1.L$0 = t88Var;
                        card3dsPollingBaseRouter$checkUrl$2$1$emit$1.label = 1;
                        wi0Var.a(ai0Var, card3dsPollingBaseRouter$checkUrl$2$1$emit$1);
                        break;
                    case 1:
                        t88Var = (t88) card3dsPollingBaseRouter$checkUrl$2$1$emit$1.L$0;
                        kotlin.b.b(obj);
                        zi0 zi0Var = (zi0) dVar.H.get();
                        dVar.K = zi0Var;
                        dVar.z(zi0Var, sy60.Q2);
                        card3dsPollingBaseRouter$checkUrl$2$1$emit$1.L$0 = t88Var;
                        card3dsPollingBaseRouter$checkUrl$2$1$emit$1.L$1 = null;
                        card3dsPollingBaseRouter$checkUrl$2$1$emit$1.label = 2;
                        break;
                    case 2:
                        t88Var = (t88) card3dsPollingBaseRouter$checkUrl$2$1$emit$1.L$0;
                        kotlin.b.b(obj);
                        if (jl40.l(t88Var, p88.e)) {
                            card3dsPollingBaseRouter$checkUrl$2$1$emit$1.L$0 = null;
                            card3dsPollingBaseRouter$checkUrl$2$1$emit$1.L$1 = null;
                            card3dsPollingBaseRouter$checkUrl$2$1$emit$1.label = 3;
                            Object Q = d.Q(dVar, card3dsPollingBaseRouter$checkUrl$2$1$emit$1);
                            if (Q != coroutineSingletons) {
                                return Q;
                            }
                        } else if (jl40.l(t88Var, p88.c)) {
                            card3dsPollingBaseRouter$checkUrl$2$1$emit$1.L$0 = null;
                            card3dsPollingBaseRouter$checkUrl$2$1$emit$1.L$1 = null;
                            card3dsPollingBaseRouter$checkUrl$2$1$emit$1.label = 4;
                            Object P = d.P(dVar, card3dsPollingBaseRouter$checkUrl$2$1$emit$1);
                            if (P != coroutineSingletons) {
                                return P;
                            }
                        } else if (jl40.l(t88Var, p88.d)) {
                            card3dsPollingBaseRouter$checkUrl$2$1$emit$1.L$0 = null;
                            card3dsPollingBaseRouter$checkUrl$2$1$emit$1.L$1 = null;
                            card3dsPollingBaseRouter$checkUrl$2$1$emit$1.label = 5;
                            Object R = dVar.R(new c88(((avj0) dVar.D).h(kyh0.change_payment_error)), card3dsPollingBaseRouter$checkUrl$2$1$emit$1);
                            if (R != coroutineSingletons) {
                                return R;
                            }
                        } else {
                            if (t88Var instanceof s88) {
                                dVar.A((m950) dVar.I.get(), new asz0(((s88) t88Var).a), new k88(dVar, 0));
                                zi0 zi0Var2 = dVar.K;
                                if (zi0Var2 != null) {
                                    zi0Var2.i();
                                }
                                dVar.K = null;
                                return zy11Var;
                            }
                            if (t88Var instanceof r88) {
                                String str = ((r88) t88Var).a;
                                card3dsPollingBaseRouter$checkUrl$2$1$emit$1.L$0 = null;
                                card3dsPollingBaseRouter$checkUrl$2$1$emit$1.L$1 = null;
                                card3dsPollingBaseRouter$checkUrl$2$1$emit$1.label = 6;
                                dVar.getClass();
                                Object R2 = dVar.R(new c88(str), card3dsPollingBaseRouter$checkUrl$2$1$emit$1);
                                if (R2 != coroutineSingletons) {
                                    return R2;
                                }
                            } else if (t88Var instanceof q88) {
                                int i3 = ((q88) t88Var).a;
                                card3dsPollingBaseRouter$checkUrl$2$1$emit$1.L$0 = null;
                                card3dsPollingBaseRouter$checkUrl$2$1$emit$1.L$1 = null;
                                card3dsPollingBaseRouter$checkUrl$2$1$emit$1.label = 7;
                                dVar.getClass();
                                Object R3 = dVar.R(new c88(((avj0) dVar.D).h(i3 == 4 ? kyh0.confirm_card_4dbc_description : kyh0.confirm_card_cvn_description)), card3dsPollingBaseRouter$checkUrl$2$1$emit$1);
                                if (R3 != coroutineSingletons) {
                                    return R3;
                                }
                            } else if (jl40.l(t88Var, p88.b)) {
                                card3dsPollingBaseRouter$checkUrl$2$1$emit$1.L$0 = null;
                                card3dsPollingBaseRouter$checkUrl$2$1$emit$1.L$1 = null;
                                card3dsPollingBaseRouter$checkUrl$2$1$emit$1.label = 8;
                                Object R4 = dVar.R(new c88(((avj0) dVar.D).h(kyh0.add_credit_card_is_expired_error)), card3dsPollingBaseRouter$checkUrl$2$1$emit$1);
                                if (R4 != coroutineSingletons) {
                                    return R4;
                                }
                            } else {
                                if (!jl40.l(t88Var, p88.a)) {
                                    w511.b();
                                    return null;
                                }
                                card3dsPollingBaseRouter$checkUrl$2$1$emit$1.L$0 = null;
                                card3dsPollingBaseRouter$checkUrl$2$1$emit$1.L$1 = null;
                                card3dsPollingBaseRouter$checkUrl$2$1$emit$1.label = 9;
                                Object R5 = dVar.R(new c88(((avj0) dVar.D).h(kyh0.verify_payment_fail)), card3dsPollingBaseRouter$checkUrl$2$1$emit$1);
                                if (R5 != coroutineSingletons) {
                                    return R5;
                                }
                            }
                        }
                        return coroutineSingletons;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        kotlin.b.b(obj);
                        return obj;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        card3dsPollingBaseRouter$checkUrl$2$1$emit$1 = new Card3dsPollingBaseRouter$checkUrl$2$1$emit$1(this, continuation);
        Object obj2 = card3dsPollingBaseRouter$checkUrl$2$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = card3dsPollingBaseRouter$checkUrl$2$1$emit$1.label;
        zy11 zy11Var2 = zy11.a;
        d dVar2 = this.a;
        switch (i) {
        }
    }
}
