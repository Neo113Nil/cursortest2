package com.yandex.go.overdraft;

import com.yandex.go.overdraft.domain.n;
import com.yandex.go.overdraft.domain.o;
import com.yandex.go.payments.api.model.PaymentsScreen;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.ama;
import defpackage.azz;
import defpackage.cz51;
import defpackage.dy90;
import defpackage.f9y0;
import defpackage.h0a0;
import defpackage.jb7;
import defpackage.l90;
import defpackage.lz70;
import defpackage.m6a0;
import defpackage.mth;
import defpackage.mvg;
import defpackage.nsd0;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.t32;
import defpackage.tje;
import defpackage.tse;
import defpackage.u32;
import defpackage.uba0;
import defpackage.uk10;
import defpackage.w9a0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.overdraft.OverdraftPaymentMethodsRouter$onLaunch$1", f = "OverdraftPaymentMethodsRouter.kt", l = {HProv.ALG_SID_SHA3_224, 81}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OverdraftPaymentMethodsRouter$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ h0a0 $payload;
    boolean Z$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverdraftPaymentMethodsRouter$onLaunch$1(e eVar, h0a0 h0a0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$payload = h0a0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OverdraftPaymentMethodsRouter$onLaunch$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OverdraftPaymentMethodsRouter$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00f0, code lost:
    
        if (com.yandex.go.overdraft.e.P(r5, r26) == r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00f2, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0031, code lost:
    
        if (r2 == r1) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            jb7 jb7Var = this.this$0.P;
            this.label = 1;
            a = ((com.yandex.go.payments.experiments.g) jb7Var.w).a(this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = obj;
        }
        boolean booleanValue = ((Boolean) a).booleanValue();
        final e eVar = this.this$0;
        if (booleanValue) {
            h0a0 h0a0Var = this.$payload;
            f9y0 f9y0Var = eVar.O;
            pex0 m = ((k) eVar.N).m();
            uba0 uba0Var = new uba0((cz51) null, (uk10) null, (nsd0) null, f9y0Var.a(m != null ? m.b : null), (w9a0) null, 55);
            com.yandex.go.payments.superapp.payment.b bVar = eVar.Q;
            u32.a.getClass();
            dy90 a2 = bVar.a(TariffOrderFlow.ORDER_FLOW_TAXI_KEY, t32.b, new l90(), uba0Var);
            eVar.U = a2;
            com.yandex.go.payments.lpm.navigation.d a3 = a2.a.a();
            d dVar = new d(kotlinx.coroutines.flow.e.d(eVar.R.a), eVar);
            PaymentsScreen paymentsScreen = PaymentsScreen.DEBTS;
            m6a0 a4 = eVar.S.a();
            lz70 lz70Var = new lz70(7, eVar);
            o oVar = eVar.F;
            eVar.A(a3, new azz(paymentsScreen, "no_feature", h0a0Var, a4, false, false, null, false, false, null, null, null, lz70Var, null, new wls() { // from class: com.yandex.go.overdraft.a
                @Override // defpackage.wls
                public final Object invoke(Object obj2, Object obj3) {
                    e eVar2 = e.this;
                    tje.N(eVar2.o(), null, null, new OverdraftPaymentMethodsRouter$launchLpmPaymentMethods$2$1(eVar2, null), 3);
                    eVar2.G.g();
                    return zy11.a;
                }
            }, null, new n(new mth(oVar.a.c(), 6), oVar), dVar, 89216), new ama(6, eVar));
        } else {
            this.Z$0 = booleanValue;
            this.label = 2;
        }
        return zy11.a;
    }
}
