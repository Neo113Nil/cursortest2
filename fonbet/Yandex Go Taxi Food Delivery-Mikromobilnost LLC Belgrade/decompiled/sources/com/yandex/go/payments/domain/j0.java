package com.yandex.go.payments.domain;

import com.yandex.go.payments.maas.domain.MaasPaymentOptionRepository$maasFlow$$inlined$flatMapLatest$1;
import defpackage.ao51;
import defpackage.c200;
import defpackage.cxq0;
import defpackage.eci0;
import defpackage.fga0;
import defpackage.fvt;
import defpackage.gda0;
import defpackage.i200;
import defpackage.jw90;
import defpackage.mth;
import defpackage.qea0;
import defpackage.qgz0;
import defpackage.qqo;
import defpackage.rol0;
import defpackage.tpr;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class j0 implements qea0 {
    public final i200 a;
    public final fvt b;
    public final fga0 c;
    public final qgz0 d;
    public final c200 e;
    public final gda0 f;
    public final a g;
    public final cxq0 h;

    public j0(i200 i200Var, fvt fvtVar, fga0 fga0Var, qgz0 qgz0Var, c200 c200Var, gda0 gda0Var, a aVar, cxq0 cxq0Var) {
        this.a = i200Var;
        this.b = fvtVar;
        this.c = fga0Var;
        this.d = qgz0Var;
        this.e = c200Var;
        this.f = gda0Var;
        this.g = aVar;
        this.h = cxq0Var;
    }

    public final kotlinx.coroutines.flow.m0 a(jw90 jw90Var) {
        kotlinx.coroutines.flow.internal.g I = kotlinx.coroutines.flow.e.I(this.c.z(), new PaymentModelsInteractorImpl$paymentModelsFlow$1(2, null));
        rol0 e = ((com.yandex.go.payments.googlepay.domain.e) this.b).e();
        c200 c200Var = this.e;
        tpr t = kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.n(I, e, kotlinx.coroutines.flow.e.X(((qqo) c200Var.b.a.getValue()).a(), new MaasPaymentOptionRepository$maasFlow$$inlined$flatMapLatest$1(null, c200Var)), new PaymentModelsInteractorImpl$paymentModelsFlow$2(this, jw90Var, null)));
        cxq0 cxq0Var = this.h;
        b0 b0Var = new b0(new mth(((com.yandex.go.yb.data.u) cxq0Var.b).c().t, 4));
        eci0 eci0Var = ((ao51) cxq0Var.c).a;
        d0 d0Var = new d0(new mth(((com.yandex.go.loyalty.impl.common.data.c) cxq0Var.w).b(), 4));
        y yVar = (y) cxq0Var.x;
        return new kotlinx.coroutines.flow.m0(t, new kotlinx.coroutines.flow.n(kotlinx.coroutines.flow.e.K((tpr[]) Arrays.copyOf(new tpr[]{b0Var, eci0Var, d0Var, new f0(new mth(kotlinx.coroutines.flow.e.K(yVar.b.a(), new x(yVar.c.a.a())), 4))}, 4)), new PaymentMethodsTriggersInteractor$triggersFlow$4(2, null)), new PaymentModelsInteractorImpl$paymentModelsWithTriggersFlow$1(3, null));
    }
}
