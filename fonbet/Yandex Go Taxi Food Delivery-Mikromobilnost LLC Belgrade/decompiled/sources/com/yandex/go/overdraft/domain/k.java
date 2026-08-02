package com.yandex.go.overdraft.domain;

import com.yandex.go.overdraft.api.domain.model.OverdraftContext;
import defpackage.aq80;
import defpackage.c0g;
import defpackage.fvt;
import defpackage.h3y;
import defpackage.i6r;
import defpackage.lvt;
import defpackage.m6a0;
import defpackage.mdh;
import defpackage.o400;
import defpackage.oep0;
import defpackage.pzt0;
import defpackage.sjh;
import defpackage.sz80;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.ycq0;
import defpackage.yj70;
import defpackage.yy80;
import defpackage.z4g;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.activity.MainActivity;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final class k {
    public final tse a;
    public final aq80 b;
    public final h3y c;
    public final h3y d;
    public final com.yandex.go.overdraft.ui.g e;
    public final ycq0 f;
    public final yy80 g;
    public final OverdraftContext h;
    public final yj70 i;
    public final z4g j;
    public final oep0 k;
    public final fvt l;
    public pzt0 m;

    public k(tse tseVar, aq80 aq80Var, h3y h3yVar, h3y h3yVar2, com.yandex.go.overdraft.ui.g gVar, ycq0 ycq0Var, yy80 yy80Var, OverdraftContext overdraftContext, yj70 yj70Var, z4g z4gVar, oep0 oep0Var, fvt fvtVar, tt2 tt2Var) {
        this.a = tseVar;
        this.b = aq80Var;
        this.c = h3yVar;
        this.d = h3yVar2;
        this.e = gVar;
        this.f = ycq0Var;
        this.g = yy80Var;
        this.h = overdraftContext;
        this.i = yj70Var;
        this.j = z4gVar;
        this.k = oep0Var;
        this.l = fvtVar;
    }

    public static final Object a(k kVar, m6a0 m6a0Var, List list, SuspendLambda suspendLambda) {
        kVar.getClass();
        String str = (String) kotlin.collections.a.R(list);
        zy11 zy11Var = zy11.a;
        if (str == null) {
            sjh sjhVar = uyj.a;
            Object k0 = tje.k0(o400.a, new OverdraftPayInteractor$closeScreenWithNoDebts$2(kVar, null), suspendLambda);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (k0 != coroutineSingletons) {
                k0 = zy11Var;
            }
            if (k0 == coroutineSingletons) {
                return k0;
            }
        } else {
            sjh sjhVar2 = uyj.a;
            Object k02 = tje.k0(mdh.b, new OverdraftPayInteractor$pollDebtForPayment$2(kVar, m6a0Var, list, null), suspendLambda);
            if (k02 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return k02;
            }
        }
        return zy11Var;
    }

    public final void b(List list) {
        if (!list.isEmpty()) {
            ((sz80) this.b.a).c = list;
        }
        m6a0 a = ((sz80) this.b.a).a();
        if (a == null) {
            return;
        }
        PaymentMethod$Type paymentMethod$Type = a.a;
        yy80 yy80Var = this.g;
        String code = paymentMethod$Type.getCode();
        ru.yandex.taxi.analytics.i d = ((ru.yandex.taxi.analytics.j) yy80Var.a).d("Overdraft.SelectCard.PayDebtTapped");
        d.d("payment_type", code);
        d.m();
        if (PaymentMethod$Type.GOOGLE_PAY != paymentMethod$Type) {
            tse tseVar = this.a;
            sjh sjhVar = uyj.a;
            tje.N(tseVar, mdh.b, null, new OverdraftPayInteractor$payDebt$1(this, a, list, null), 2);
            return;
        }
        com.yandex.go.overdraft.g gVar = (com.yandex.go.overdraft.g) this.i.a;
        fvt fvtVar = (fvt) gVar.O.get();
        MainActivity mainActivity = ((c0g) ((i6r) gVar.J.get())).w;
        fvtVar.getClass();
        ((com.yandex.go.payments.googlepay.domain.e) fvtVar).m(mainActivity, true, lvt.f);
        tse tseVar2 = this.a;
        sjh sjhVar2 = uyj.a;
        this.m = tje.N(tseVar2, mdh.b, null, new OverdraftPayInteractor$observeSelectGooglePayResult$1(this, null), 2);
    }
}
