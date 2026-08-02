package com.yandex.go.scooters.payments.data;

import com.yandex.go.payments.data.g;
import com.yandex.go.payments.domain.l0;
import defpackage.bvf0;
import defpackage.ha2;
import defpackage.hfa0;
import defpackage.kv90;
import defpackage.lv90;
import defpackage.m6a0;
import defpackage.ngo0;
import defpackage.tf91;
import defpackage.vez0;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes8.dex */
public final class c {
    public final ngo0 a;
    public final r0 b = bvf0.c(null);

    public c(ngo0 ngo0Var) {
        this.a = ngo0Var;
    }

    public final void a(m6a0 m6a0Var) {
        l0 b = this.a.b();
        if (m6a0Var != null) {
            kv90 kv90Var = lv90.Companion;
            PaymentMethod$Type paymentMethod$Type = m6a0Var.a;
            String str = m6a0Var.b;
            kv90Var.getClass();
            b.e.a(kv90.b(str, paymentMethod$Type), "no_feature");
        } else {
            b.g(null, "no_feature");
        }
        this.b.l(m6a0Var != null ? m6a0Var.c : null);
    }

    public final hfa0 b() {
        return tf91.c(this.a.b().b("no_feature"), c());
    }

    public final m6a0 c() {
        m6a0 c0;
        lv90 i = this.a.b().i("no_feature");
        m6a0 m6a0Var = (m6a0) this.b.getValue();
        if (i == null || (c0 = vez0.c0(i, null)) == null) {
            return null;
        }
        return new m6a0(c0.a, c0.b, m6a0Var);
    }

    public final ha2 d(boolean z) {
        l0 b = this.a.b();
        return e.n(new b(((g) b.a.a("no_feature")).d(), z), b.j("no_feature"), this.b, new ScootersPaymentMethodRepositoryImpl$listenCurrentPaymentOptions$2(this, null));
    }
}
