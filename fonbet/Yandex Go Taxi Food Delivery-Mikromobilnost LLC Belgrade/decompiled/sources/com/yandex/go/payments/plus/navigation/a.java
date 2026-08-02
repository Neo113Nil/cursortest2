package com.yandex.go.payments.plus.navigation;

import com.yandex.go.payments.api.model.PaymentsScreen;
import com.yandex.go.payments.paymentlist.domain.i;
import com.yandex.go.payments.plus.domain.PlusPurchasePaymentsInteractor$optionsFlow$$inlined$flatMapLatest$1;
import com.yandex.go.payments.plus.domain.c;
import defpackage.ajd0;
import defpackage.avj0;
import defpackage.bjd0;
import defpackage.c4m;
import defpackage.cca0;
import defpackage.cz51;
import defpackage.djd0;
import defpackage.f9y0;
import defpackage.g92;
import defpackage.gw7;
import defpackage.h55;
import defpackage.ida0;
import defpackage.k29;
import defpackage.kjz;
import defpackage.kyh0;
import defpackage.m950;
import defpackage.msd0;
import defpackage.ny61;
import defpackage.ryz;
import defpackage.tje;
import defpackage.uba0;
import defpackage.uj4;
import defpackage.uk10;
import defpackage.vba0;
import defpackage.vj4;
import defpackage.w9a0;
import defpackage.wid0;
import defpackage.wma0;
import defpackage.xid0;
import defpackage.xvf0;
import defpackage.y4a0;
import defpackage.yid0;
import defpackage.yvf0;
import defpackage.zuj0;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes13.dex */
public final class a extends h55 {
    public final yid0 D;
    public final ajd0 E;
    public final wid0 F;
    public final i G;
    public final yvf0 H;
    public final yvf0 I;
    public final zuj0 J;
    public final yvf0 K;
    public final k29 L;
    public final ryz M;
    public final vj4 N;
    public final yvf0 O;
    public final f9y0 P;
    public final c Q;

    public a(yid0 yid0Var, ajd0 ajd0Var, wid0 wid0Var, i iVar, yvf0 yvf0Var, yvf0 yvf0Var2, zuj0 zuj0Var, yvf0 yvf0Var3, k29 k29Var, ryz ryzVar, vj4 vj4Var, yvf0 yvf0Var4, f9y0 f9y0Var, c cVar) {
        super(null);
        this.D = yid0Var;
        this.E = ajd0Var;
        this.F = wid0Var;
        this.G = iVar;
        this.H = yvf0Var;
        this.I = yvf0Var2;
        this.J = zuj0Var;
        this.K = yvf0Var3;
        this.L = k29Var;
        this.M = ryzVar;
        this.N = vj4Var;
        this.O = yvf0Var4;
        this.P = f9y0Var;
        this.Q = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(a aVar, bjd0 bjd0Var, ContinuationImpl continuationImpl) {
        PlusPurchasePaymentsRouterImpl$createPayload$1 plusPurchasePaymentsRouterImpl$createPayload$1;
        int i;
        bjd0 bjd0Var2;
        aVar.getClass();
        if (continuationImpl instanceof PlusPurchasePaymentsRouterImpl$createPayload$1) {
            plusPurchasePaymentsRouterImpl$createPayload$1 = (PlusPurchasePaymentsRouterImpl$createPayload$1) continuationImpl;
            int i2 = plusPurchasePaymentsRouterImpl$createPayload$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusPurchasePaymentsRouterImpl$createPayload$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusPurchasePaymentsRouterImpl$createPayload$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusPurchasePaymentsRouterImpl$createPayload$1.label;
                if (i != 0) {
                    b.b(obj);
                    vj4 vj4Var = aVar.N;
                    PaymentsScreen paymentsScreen = PaymentsScreen.PLUS;
                    plusPurchasePaymentsRouterImpl$createPayload$1.L$0 = bjd0Var;
                    plusPurchasePaymentsRouterImpl$createPayload$1.label = 1;
                    obj = ((com.yandex.go.payments.badges.a) vj4Var).a(TariffOrderFlow.ORDER_FLOW_TAXI_KEY, null, paymentsScreen, plusPurchasePaymentsRouterImpl$createPayload$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    bjd0Var2 = bjd0Var;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bjd0Var2 = (bjd0) plusPurchasePaymentsRouterImpl$createPayload$1.L$0;
                    b.b(obj);
                }
                uj4 uj4Var = (uj4) obj;
                vba0 vba0Var = new vba0(PaymentsScreen.PLUS, new cca0(((avj0) aVar.J).h(kyh0.paymentmethod_title), 20, false, false), new wma0(EmptyList.a), new g92(2, new c4m(((avj0) aVar.F.a).h(kyh0.common_next), null, null, null)), TariffOrderFlow.ORDER_FLOW_TAXI_KEY, uj4Var, null, 64);
                uba0 uba0Var = new uba0((cz51) null, (uk10) null, new y4a0(16, aVar, bjd0Var2), aVar.P.a(null), (w9a0) null, 51);
                yid0 yid0Var = aVar.D;
                String str = bjd0Var2.a;
                kjz kjzVar = yid0Var.a;
                xid0 xid0Var = new xid0((c) ((xvf0) kjzVar.b).get(), (k29) ((gw7) kjzVar.c).get(), str);
                ajd0 ajd0Var = aVar.E;
                return new ida0(vba0Var, xid0Var, e.X(ajd0Var.b.b(), new PlusPurchasePaymentsInteractor$optionsFlow$$inlined$flatMapLatest$1(null, ajd0Var)), null, uba0Var);
            }
        }
        plusPurchasePaymentsRouterImpl$createPayload$1 = new PlusPurchasePaymentsRouterImpl$createPayload$1(aVar, continuationImpl);
        Object obj2 = plusPurchasePaymentsRouterImpl$createPayload$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusPurchasePaymentsRouterImpl$createPayload$1.label;
        if (i != 0) {
        }
        uj4 uj4Var2 = (uj4) obj2;
        vba0 vba0Var2 = new vba0(PaymentsScreen.PLUS, new cca0(((avj0) aVar.J).h(kyh0.paymentmethod_title), 20, false, false), new wma0(EmptyList.a), new g92(2, new c4m(((avj0) aVar.F.a).h(kyh0.common_next), null, null, null)), TariffOrderFlow.ORDER_FLOW_TAXI_KEY, uj4Var2, null, 64);
        uba0 uba0Var2 = new uba0((cz51) null, (uk10) null, new y4a0(16, aVar, bjd0Var2), aVar.P.a(null), (w9a0) null, 51);
        yid0 yid0Var2 = aVar.D;
        String str2 = bjd0Var2.a;
        kjz kjzVar2 = yid0Var2.a;
        xid0 xid0Var2 = new xid0((c) ((xvf0) kjzVar2.b).get(), (k29) ((gw7) kjzVar2.c).get(), str2);
        ajd0 ajd0Var2 = aVar.E;
        return new ida0(vba0Var2, xid0Var2, e.X(ajd0Var2.b.b(), new PlusPurchasePaymentsInteractor$optionsFlow$$inlined$flatMapLatest$1(null, ajd0Var2)), null, uba0Var2);
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        bjd0 bjd0Var = (bjd0) obj;
        if (this.G.f()) {
            tje.N(o(), null, null, new PlusPurchasePaymentsRouterImpl$openPaymentsList$1(this, bjd0Var, null), 3);
        } else {
            A((m950) this.H.get(), ((msd0) this.I.get()).g(), new djd0(this, bjd0Var));
        }
    }
}
