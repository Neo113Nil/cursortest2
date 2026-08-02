package com.yandex.go.payments.lpm.navigation;

import com.yandex.go.payments.api.model.PaymentsScreen;
import com.yandex.go.payments.domain.l0;
import com.yandex.go.payments.lpm.domain.e;
import com.yandex.go.yb.data.u;
import defpackage.ao51;
import defpackage.azz;
import defpackage.bca0;
import defpackage.bzz;
import defpackage.cca0;
import defpackage.czz;
import defpackage.d4m;
import defpackage.dca0;
import defpackage.dzz;
import defpackage.eyz;
import defpackage.g90;
import defpackage.g92;
import defpackage.gyz;
import defpackage.h55;
import defpackage.hdu;
import defpackage.hfa0;
import defpackage.i5m;
import defpackage.i6r;
import defpackage.j5g;
import defpackage.lyz;
import defpackage.m6a0;
import defpackage.m950;
import defpackage.mc;
import defpackage.n3w;
import defpackage.ny61;
import defpackage.qu;
import defpackage.ru2;
import defpackage.ryz;
import defpackage.tea0;
import defpackage.tf91;
import defpackage.tje;
import defpackage.tpr;
import defpackage.uba0;
import defpackage.uj4;
import defpackage.vba0;
import defpackage.w511;
import defpackage.wma0;
import defpackage.wyz;
import defpackage.xvf0;
import defpackage.yyz;
import defpackage.zxz;
import defpackage.zzs;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class d extends h55 implements m950 {
    public final com.yandex.go.payments.badges.a D;
    public final String E;
    public final com.yandex.go.payments.data.c F;
    public final i6r G;
    public final uba0 H;
    public final eyz I;
    public final wyz J;

    public d(com.yandex.go.payments.badges.a aVar, String str, com.yandex.go.payments.data.c cVar, i6r i6rVar, uba0 uba0Var, eyz eyzVar, wyz wyzVar) {
        super(null);
        this.D = aVar;
        this.E = str;
        this.F = cVar;
        this.G = i6rVar;
        this.H = uba0Var;
        this.I = eyzVar;
        this.J = wyzVar;
    }

    public static final void P(d dVar, e eVar) {
        dVar.getClass();
        hfa0 c = tf91.c(eVar.c.b(eVar.a.b), (m6a0) ((r0) eVar.k.c).getValue());
        if (c.a.isEmpty()) {
            dVar.r(new qu(9));
        } else {
            dVar.r(new czz(c, 0));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Q(d dVar, azz azzVar, ContinuationImpl continuationImpl) {
        LpmPaymentRouterImpl$createPmlPayload$1 lpmPaymentRouterImpl$createPmlPayload$1;
        int i;
        int i2;
        dca0 bca0Var;
        tpr tprVar;
        azz azzVar2 = azzVar;
        dVar.getClass();
        if (continuationImpl instanceof LpmPaymentRouterImpl$createPmlPayload$1) {
            lpmPaymentRouterImpl$createPmlPayload$1 = (LpmPaymentRouterImpl$createPmlPayload$1) continuationImpl;
            int i3 = lpmPaymentRouterImpl$createPmlPayload$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lpmPaymentRouterImpl$createPmlPayload$1.label = i3 - Integer.MIN_VALUE;
                Object obj = lpmPaymentRouterImpl$createPmlPayload$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lpmPaymentRouterImpl$createPmlPayload$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.go.payments.badges.a aVar = dVar.D;
                    String str = dVar.E;
                    PaymentsScreen paymentsScreen = azzVar2.a;
                    lpmPaymentRouterImpl$createPmlPayload$1.L$0 = azzVar2;
                    lpmPaymentRouterImpl$createPmlPayload$1.label = 1;
                    obj = aVar.a(str, null, paymentsScreen, lpmPaymentRouterImpl$createPmlPayload$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    azzVar2 = (azz) lpmPaymentRouterImpl$createPmlPayload$1.L$0;
                    kotlin.b.b(obj);
                }
                uj4 uj4Var = (uj4) obj;
                i2 = dzz.a[azzVar2.i.ordinal()];
                int i4 = 2;
                if (i2 != 1) {
                    bca0Var = new bca0(azzVar2.j, azzVar2.k, true);
                } else {
                    if (i2 != 2) {
                        w511.b();
                        return null;
                    }
                    bca0Var = new cca0(azzVar2.g, azzVar2.h, azzVar2.f, azzVar2.k, true, azzVar2.e);
                }
                dca0 dca0Var = bca0Var;
                PaymentsScreen paymentsScreen2 = azzVar2.a;
                wma0 wma0Var = new wma0(EmptyList.a);
                String str2 = dVar.E;
                tprVar = azzVar2.p;
                if (tprVar == null) {
                    tprVar = new g92(i4, d4m.a);
                }
                return new vba0(paymentsScreen2, dca0Var, wma0Var, tprVar, str2, uj4Var, null, 64);
            }
        }
        lpmPaymentRouterImpl$createPmlPayload$1 = new LpmPaymentRouterImpl$createPmlPayload$1(dVar, continuationImpl);
        Object obj2 = lpmPaymentRouterImpl$createPmlPayload$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lpmPaymentRouterImpl$createPmlPayload$1.label;
        if (i != 0) {
        }
        uj4 uj4Var2 = (uj4) obj2;
        i2 = dzz.a[azzVar2.i.ordinal()];
        int i42 = 2;
        if (i2 != 1) {
        }
        dca0 dca0Var2 = bca0Var;
        PaymentsScreen paymentsScreen22 = azzVar2.a;
        wma0 wma0Var2 = new wma0(EmptyList.a);
        String str22 = dVar.E;
        tprVar = azzVar2.p;
        if (tprVar == null) {
        }
        return new vba0(paymentsScreen22, dca0Var2, wma0Var2, tprVar, str22, uj4Var2, null, 64);
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        com.yandex.go.payments.data.c cVar = this.F;
        cVar.d = "";
        cVar.e = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [ffa0] */
    @Override // defpackage.h55
    public final void J(Object obj) {
        azz azzVar = (azz) obj;
        ru2 ru2Var = this.J.a;
        e eVar = new e(azzVar, (u) ((xvf0) ru2Var.a).get(), (l0) ((xvf0) ru2Var.b).get(), (ao51) ((xvf0) ru2Var.c).get(), (ryz) ((xvf0) ru2Var.d).get(), (zxz) ((xvf0) ru2Var.e).get(), (com.yandex.go.payments.data.c) ((xvf0) ru2Var.f).get(), (tea0) ((xvf0) ru2Var.g).get(), i5m.a((xvf0) ru2Var.h), (lyz) ((n3w) ru2Var.i).a);
        yyz yyzVar = new yyz(0, eVar);
        bzz bzzVar = azzVar.l;
        yyz yyzVar2 = yyzVar;
        if (bzzVar != null) {
            yyzVar2 = bzzVar.a(yyzVar);
        }
        tje.N(o(), null, null, new LpmPaymentRouterImpl$onLaunch$1(this, eVar, null), 3);
        tje.N(o(), null, null, new LpmPaymentRouterImpl$onLaunch$2(eVar, null), 3);
        tje.N(o(), null, null, new LpmPaymentRouterImpl$onLaunch$3(this, eVar, null), 3);
        LpmPaymentRouterImpl$createPmlRouter$1 lpmPaymentRouterImpl$createPmlRouter$1 = new LpmPaymentRouterImpl$createPmlRouter$1(0, eVar, e.class, "getPaymentsAdditionalParams", "getPaymentsAdditionalParams()Lru/yandex/taxi/payment_options/model/PaymentModelsAdditionalParams;", 0);
        zzs zzsVar = azzVar.c.a;
        mc mcVar = this.I.a;
        a aVar = new a(lpmPaymentRouterImpl$createPmlRouter$1, zzsVar, (gyz) mcVar.a.get(), (g90) mcVar.b.get());
        uba0 a = uba0.a(this.H, new hdu(eVar, azzVar.n), null, azzVar.o, 27);
        String str = this.E;
        str.getClass();
        i6r i6rVar = this.G;
        i6rVar.getClass();
        tje.N(o(), null, null, new LpmPaymentRouterImpl$launchPaymentsList$1(this, new j5g(i6rVar, str, aVar, yyzVar2, eVar, a).a(), azzVar, eVar, null), 3);
    }
}
