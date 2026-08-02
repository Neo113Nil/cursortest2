package com.yandex.go.payments.domain;

import defpackage.a2a0;
import defpackage.cda0;
import defpackage.d2a0;
import defpackage.dqe0;
import defpackage.g8e;
import defpackage.jst;
import defpackage.lv90;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import java.util.Arrays;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class m0 {
    public final ru.yandex.taxi.preorder.repositories.g a;
    public final cda0 b;
    public final d2a0 c;
    public final tt2 d;
    public final com.yandex.go.yb.data.u e;

    public m0(ru.yandex.taxi.preorder.repositories.g gVar, cda0 cda0Var, d2a0 d2a0Var, tt2 tt2Var, com.yandex.go.yb.data.u uVar) {
        this.a = gVar;
        this.b = cda0Var;
        this.c = d2a0Var;
        this.d = tt2Var;
        this.e = uVar;
    }

    public final Object a(ContinuationImpl continuationImpl) {
        lv90 c;
        ru.yandex.taxi.preorder.repositories.g gVar = this.a;
        boolean c2 = gVar.c();
        dqe0 dqe0Var = gVar.a;
        if (c2) {
            c = dqe0Var.a.w;
            if (c == null) {
                c = gVar.a.a.c();
            }
        } else {
            c = dqe0Var.a.c();
        }
        lv90 lv90Var = c;
        lv90 a = gVar.a();
        if (lv90Var.a != null) {
            return a2a0.a(this.c, lv90Var, a, null, continuationImpl, 8);
        }
        g8e.C("Unknown payment for conversion", jst.e);
        return this.c.a.b(a != null ? a.b : null, continuationImpl, true);
    }

    public final kotlinx.coroutines.flow.n b() {
        kotlinx.coroutines.flow.r0 r0Var = this.e.c().t;
        tpr t = kotlinx.coroutines.flow.e.t(((com.yandex.go.payments.paymentlist.data.c) this.b).u);
        ru.yandex.taxi.preorder.repositories.g gVar = this.a;
        tpr t2 = kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.p(kotlinx.coroutines.flow.e.n(r0Var, t, kotlinx.coroutines.flow.e.K((tpr[]) Arrays.copyOf(new tpr[]{gVar.c, new ru.yandex.taxi.preorder.repositories.f(((com.yandex.go.taxi.tariffs.internal.repository.k) gVar.b).j.b())}, 2)), new PreorderPaymentInfoInteractorImpl$basePaymentFlow$1(this, null)), 300L));
        this.d.getClass();
        return new kotlinx.coroutines.flow.n(new kotlinx.coroutines.flow.m0(kotlinx.coroutines.flow.e.F(t2, uyj.a), gVar.d(), new PreorderPaymentInfoInteractorImpl$infoFlow$1(3, null)), new PreorderPaymentInfoInteractorImpl$infoFlow$2(2, null));
    }
}
