package com.yandex.go.overdraft;

import com.yandex.go.overdraft.api.domain.model.OverdraftContext;
import com.yandex.go.overdraft.domain.h;
import com.yandex.go.overdraft.domain.k;
import com.yandex.go.overdraft.domain.n;
import com.yandex.go.overdraft.domain.o;
import com.yandex.go.overdraft.domain.q;
import com.yandex.go.payments.api.model.PaymentsScreen;
import defpackage.aii;
import defpackage.cba0;
import defpackage.cca0;
import defpackage.cug;
import defpackage.cz51;
import defpackage.dy90;
import defpackage.f9y0;
import defpackage.fz80;
import defpackage.h0a0;
import defpackage.h3y;
import defpackage.h55;
import defpackage.ida0;
import defpackage.jb7;
import defpackage.m950;
import defpackage.mth;
import defpackage.nw70;
import defpackage.ny61;
import defpackage.oo31;
import defpackage.pex0;
import defpackage.pzt0;
import defpackage.ql21;
import defpackage.sz80;
import defpackage.tje;
import defpackage.tse;
import defpackage.uba0;
import defpackage.uj4;
import defpackage.uk10;
import defpackage.vba0;
import defpackage.w9a0;
import defpackage.wiq0;
import defpackage.wma0;
import defpackage.yy80;
import defpackage.z4g;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes13.dex */
public final class e extends h55 {
    public final fz80 D;
    public final nw70 E;
    public final o F;
    public final yy80 G;
    public final z4g H;
    public final h3y I;
    public final com.yandex.go.overdraft.domain.g J;
    public final cba0 K;
    public final tse L;
    public final com.yandex.go.payments.badges.a M;
    public final wiq0 N;
    public final f9y0 O;
    public final jb7 P;
    public final com.yandex.go.payments.superapp.payment.b Q;
    public final ql21 R;
    public final sz80 S;
    public final OverdraftContext T;
    public dy90 U;

    public e(fz80 fz80Var, nw70 nw70Var, o oVar, yy80 yy80Var, z4g z4gVar, h3y h3yVar, com.yandex.go.overdraft.domain.g gVar, cba0 cba0Var, tse tseVar, com.yandex.go.payments.badges.a aVar, wiq0 wiq0Var, f9y0 f9y0Var, jb7 jb7Var, com.yandex.go.payments.superapp.payment.b bVar, ql21 ql21Var, sz80 sz80Var, OverdraftContext overdraftContext) {
        super(null);
        this.D = fz80Var;
        this.E = nw70Var;
        this.F = oVar;
        this.G = yy80Var;
        this.H = z4gVar;
        this.I = h3yVar;
        this.J = gVar;
        this.K = cba0Var;
        this.L = tseVar;
        this.M = aVar;
        this.N = wiq0Var;
        this.O = f9y0Var;
        this.P = jb7Var;
        this.Q = bVar;
        this.R = ql21Var;
        this.S = sz80Var;
        this.T = overdraftContext;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(e eVar, ContinuationImpl continuationImpl) {
        OverdraftPaymentMethodsRouter$launchPmPaymentMethods$1 overdraftPaymentMethodsRouter$launchPmPaymentMethods$1;
        int i;
        m950 m950Var;
        e eVar2;
        eVar.getClass();
        if (continuationImpl instanceof OverdraftPaymentMethodsRouter$launchPmPaymentMethods$1) {
            overdraftPaymentMethodsRouter$launchPmPaymentMethods$1 = (OverdraftPaymentMethodsRouter$launchPmPaymentMethods$1) continuationImpl;
            int i2 = overdraftPaymentMethodsRouter$launchPmPaymentMethods$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                overdraftPaymentMethodsRouter$launchPmPaymentMethods$1.label = i2 - Integer.MIN_VALUE;
                Object obj = overdraftPaymentMethodsRouter$launchPmPaymentMethods$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = overdraftPaymentMethodsRouter$launchPmPaymentMethods$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    m950 m950Var2 = (m950) eVar.H.get();
                    overdraftPaymentMethodsRouter$launchPmPaymentMethods$1.L$0 = eVar;
                    overdraftPaymentMethodsRouter$launchPmPaymentMethods$1.L$1 = m950Var2;
                    overdraftPaymentMethodsRouter$launchPmPaymentMethods$1.label = 1;
                    Object Q = eVar.Q(overdraftPaymentMethodsRouter$launchPmPaymentMethods$1);
                    if (Q == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    m950Var = m950Var2;
                    obj = Q;
                    eVar2 = eVar;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m950Var = (m950) overdraftPaymentMethodsRouter$launchPmPaymentMethods$1.L$1;
                    eVar2 = (e) overdraftPaymentMethodsRouter$launchPmPaymentMethods$1.L$0;
                    kotlin.b.b(obj);
                }
                eVar2.A(m950Var, obj, new aii(eVar, 3));
                return zy11.a;
            }
        }
        overdraftPaymentMethodsRouter$launchPmPaymentMethods$1 = new OverdraftPaymentMethodsRouter$launchPmPaymentMethods$1(eVar, continuationImpl);
        Object obj2 = overdraftPaymentMethodsRouter$launchPmPaymentMethods$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = overdraftPaymentMethodsRouter$launchPmPaymentMethods$1.label;
        if (i != 0) {
        }
        eVar2.A(m950Var, obj2, new aii(eVar, 3));
        return zy11.a;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        k kVar = this.D.d;
        pzt0 pzt0Var = kVar.m;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        kVar.m = null;
        ((sz80) kVar.b.a).c = EmptyList.a;
        dy90 dy90Var = this.U;
        if (dy90Var != null) {
            dy90Var.dispose();
        }
        this.U = null;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new OverdraftPaymentMethodsRouter$onLaunch$1(this, (h0a0) obj, null), 3);
        yy80 yy80Var = this.G;
        cug cugVar = yy80Var.f;
        String b = yy80.b(this.T);
        boolean z = yy80Var.d().c;
        boolean e = yy80Var.e();
        boolean f = yy80Var.f();
        double c = yy80Var.c();
        cugVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(MetaDataField.SCREEN_FIELD, b);
        oo31.q(z, hashMap, "has_overdraft", e, "is_card_available");
        hashMap.put("is_cash_available", Boolean.valueOf(f));
        hashMap.put("cumulative_debt", Double.valueOf(c));
        cugVar.a.a("DebtPaymentMenu.Shown", hashMap, 1, new HashMap());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Q(ContinuationImpl continuationImpl) {
        OverdraftPaymentMethodsRouter$createPmPayload$1 overdraftPaymentMethodsRouter$createPmPayload$1;
        int i;
        String str;
        if (continuationImpl instanceof OverdraftPaymentMethodsRouter$createPmPayload$1) {
            overdraftPaymentMethodsRouter$createPmPayload$1 = (OverdraftPaymentMethodsRouter$createPmPayload$1) continuationImpl;
            int i2 = overdraftPaymentMethodsRouter$createPmPayload$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                overdraftPaymentMethodsRouter$createPmPayload$1.label = i2 - Integer.MIN_VALUE;
                Object obj = overdraftPaymentMethodsRouter$createPmPayload$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = overdraftPaymentMethodsRouter$createPmPayload$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pex0 m = ((com.yandex.go.taxi.tariffs.internal.repository.k) this.N).m();
                    String str2 = m != null ? m.b : null;
                    PaymentsScreen paymentsScreen = PaymentsScreen.DEBTS;
                    overdraftPaymentMethodsRouter$createPmPayload$1.L$0 = str2;
                    overdraftPaymentMethodsRouter$createPmPayload$1.label = 1;
                    Object a = this.M.a(TariffOrderFlow.ORDER_FLOW_TAXI_KEY, str2, paymentsScreen, overdraftPaymentMethodsRouter$createPmPayload$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str = str2;
                    obj = a;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) overdraftPaymentMethodsRouter$createPmPayload$1.L$0;
                    kotlin.b.b(obj);
                }
                uj4 uj4Var = (uj4) obj;
                PaymentsScreen paymentsScreen2 = PaymentsScreen.DEBTS;
                cca0 cca0Var = new cca0(null, 21, false, false);
                wma0 wma0Var = new wma0(EmptyList.a);
                o oVar = this.F;
                int i3 = 6;
                return new ida0(new vba0(paymentsScreen2, cca0Var, wma0Var, new n(new mth(oVar.a.c(), i3), oVar), TariffOrderFlow.ORDER_FLOW_TAXI_KEY, uj4Var, null, 64), this.D, new q(new mth(((h) this.E.b).c(), i3)), null, new uba0((cz51) null, (uk10) null, new b(this), this.O.a(str), (w9a0) null, 51));
            }
        }
        overdraftPaymentMethodsRouter$createPmPayload$1 = new OverdraftPaymentMethodsRouter$createPmPayload$1(this, continuationImpl);
        Object obj2 = overdraftPaymentMethodsRouter$createPmPayload$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = overdraftPaymentMethodsRouter$createPmPayload$1.label;
        if (i != 0) {
        }
        uj4 uj4Var2 = (uj4) obj2;
        PaymentsScreen paymentsScreen22 = PaymentsScreen.DEBTS;
        cca0 cca0Var2 = new cca0(null, 21, false, false);
        wma0 wma0Var2 = new wma0(EmptyList.a);
        o oVar2 = this.F;
        int i32 = 6;
        return new ida0(new vba0(paymentsScreen22, cca0Var2, wma0Var2, new n(new mth(oVar2.a.c(), i32), oVar2), TariffOrderFlow.ORDER_FLOW_TAXI_KEY, uj4Var2, null, 64), this.D, new q(new mth(((h) this.E.b).c(), i32)), null, new uba0((cz51) null, (uk10) null, new b(this), this.O.a(str), (w9a0) null, 51));
    }
}
