package com.yandex.go.payments.paymentlist.domain.preselect;

import com.yandex.go.payments.data.model.response.PaymentMethods;
import defpackage.fga0;
import defpackage.gtq0;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wsx;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class a {
    public final tt2 a;
    public final fga0 b;
    public final wsx c;
    public final kotlinx.coroutines.sync.a d = gtq0.a();

    public a(tt2 tt2Var, fga0 fga0Var, wsx wsxVar) {
        this.a = tt2Var;
        this.b = fga0Var;
        this.c = wsxVar;
    }

    public final Object a(PaymentMethods paymentMethods, Continuation continuation) {
        this.a.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new LastPaymentMethodApplyInteractor$tryApply$2(this, paymentMethods, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
