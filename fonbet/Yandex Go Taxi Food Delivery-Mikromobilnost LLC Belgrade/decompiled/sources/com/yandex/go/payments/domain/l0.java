package com.yandex.go.payments.domain;

import defpackage.aiq0;
import defpackage.dqh;
import defpackage.h0a0;
import defpackage.kv90;
import defpackage.lea0;
import defpackage.lv90;
import defpackage.lvt;
import defpackage.mdh;
import defpackage.n2v0;
import defpackage.nfa0;
import defpackage.o400;
import defpackage.oea0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zut;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes8.dex */
public final class l0 {
    public final nfa0 a;
    public final com.yandex.go.payments.superapp.payment.a b;
    public final tt2 c;
    public final dqh d;
    public final aiq0 e;
    public n2v0 f;

    public l0(nfa0 nfa0Var, com.yandex.go.payments.superapp.payment.a aVar, tt2 tt2Var, dqh dqhVar, aiq0 aiq0Var) {
        this.a = nfa0Var;
        this.b = aVar;
        this.c = tt2Var;
        this.d = dqhVar;
        this.e = aiq0Var;
    }

    public static /* synthetic */ Object d(l0 l0Var, h0a0 h0a0Var, String str, boolean z, ContinuationImpl continuationImpl, int i) {
        if ((i & 2) != 0) {
            str = "no_feature";
        }
        return l0Var.c(h0a0Var, str, false, continuationImpl);
    }

    public final void a() {
        Iterator it = kotlin.collections.a.N0(this.a.a.values()).iterator();
        while (it.hasNext()) {
            ((com.yandex.go.payments.data.g) it.next()).a();
        }
    }

    public final oea0 b(String str) {
        return (oea0) ((com.yandex.go.payments.data.g) this.a.a(str)).d().getValue();
    }

    public final Object c(h0a0 h0a0Var, String str, boolean z, ContinuationImpl continuationImpl) {
        this.c.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new PaymentsInteractorImpl$getPaymentModels$2(this, str, false, h0a0Var, z, null), continuationImpl);
    }

    public final Object e(List list, Continuation continuation) {
        this.c.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(o400.a, new PaymentsInteractorImpl$hasBoundCardsInGooglePay$2(this, list, null), continuation);
    }

    public final Object f(Continuation continuation) {
        this.c.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(o400.a, new PaymentsInteractorImpl$isGooglePayEnabled$2(this, null), continuation);
    }

    public final void g(lea0 lea0Var, String str) {
        lv90 lv90Var;
        if (lea0Var != null) {
            kv90 kv90Var = lv90.Companion;
            PaymentMethod$Type c = lea0Var.c();
            String id = lea0Var.getId();
            kv90Var.getClass();
            lv90Var = kv90.b(id, c);
        } else {
            lv90Var = null;
        }
        this.e.a(lv90Var, str);
    }

    public final Object h(zut zutVar, lvt lvtVar, ContinuationImpl continuationImpl) {
        this.c.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(o400.a, new PaymentsInteractorImpl$selectGooglePayCard$2(this, lvtVar, zutVar, null), continuationImpl);
    }

    public final lv90 i(String str) {
        aiq0 aiq0Var = this.e;
        return aiq0Var.b.b(aiq0Var.b(str));
    }

    public final kotlinx.coroutines.flow.n j(String str) {
        aiq0 aiq0Var = this.e;
        return aiq0Var.b.c(aiq0Var.b(str));
    }
}
