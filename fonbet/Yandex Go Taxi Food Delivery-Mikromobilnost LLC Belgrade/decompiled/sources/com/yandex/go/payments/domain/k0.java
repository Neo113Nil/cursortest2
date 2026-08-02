package com.yandex.go.payments.domain;

import com.yandex.go.zone.model.Zone;
import defpackage.drd;
import defpackage.edi0;
import defpackage.fga0;
import defpackage.gda0;
import defpackage.ha2;
import defpackage.jw90;
import defpackage.kjz;
import defpackage.kw90;
import defpackage.lea0;
import defpackage.lv90;
import defpackage.lw90;
import defpackage.n65;
import defpackage.qea0;
import defpackage.tea0;

/* loaded from: classes8.dex */
public final class k0 {
    public final lw90 a;
    public final fga0 b;
    public final drd c;
    public final com.yandex.go.payments.data.p d;
    public final qea0 e;
    public final tea0 f;
    public final kjz g;
    public final gda0 h;

    public k0(lw90 lw90Var, fga0 fga0Var, drd drdVar, com.yandex.go.payments.data.p pVar, qea0 qea0Var, tea0 tea0Var, kjz kjzVar, gda0 gda0Var) {
        this.a = lw90Var;
        this.b = fga0Var;
        this.c = drdVar;
        this.d = pVar;
        this.e = qea0Var;
        this.f = tea0Var;
        this.g = kjzVar;
        this.h = gda0Var;
    }

    public final edi0 a(lv90 lv90Var, Zone zone) {
        lea0 b = this.h.b(this.b.b.g(), lv90Var);
        if (b == null) {
            return null;
        }
        return new edi0(b, lw90.c(this.a, zone, new n65[0], 2).b(b));
    }

    public final ha2 b(kw90 kw90Var) {
        kotlinx.coroutines.flow.m0 a = ((j0) this.e).a(kw90Var);
        kjz kjzVar = this.g;
        return kotlinx.coroutines.flow.e.n(a, kotlinx.coroutines.flow.e.t(new kotlinx.coroutines.flow.m0(((com.yandex.go.payments.data.p) kjzVar.c).b(), new o0(((ru.yandex.taxi.preorder.repositories.g) kjzVar.b).d(), kjzVar), new PreorderSelectedPaymentInteractor$selectedPaymentFlow$1())), this.d.a(), new PaymentOptionsInteractor$preorderPaymentOptions$1(this, kw90Var, null));
    }

    public final ha2 c(jw90 jw90Var) {
        kotlinx.coroutines.flow.m0 a = ((j0) this.e).a(jw90Var);
        com.yandex.go.payments.data.p pVar = this.d;
        return kotlinx.coroutines.flow.e.n(a, pVar.b(), pVar.a(), new PaymentOptionsInteractor$zonePaymentOptions$1(this, jw90Var, null));
    }
}
