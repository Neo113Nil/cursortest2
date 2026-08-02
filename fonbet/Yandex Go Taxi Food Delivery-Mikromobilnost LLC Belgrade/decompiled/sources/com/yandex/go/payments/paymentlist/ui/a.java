package com.yandex.go.payments.paymentlist.ui;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import defpackage.e6a0;
import defpackage.pey;
import defpackage.tje;

/* loaded from: classes8.dex */
public final class a implements q {
    public final /* synthetic */ e6a0 a;

    public a(e6a0 e6a0Var) {
        this.a = e6a0Var;
    }

    @Override // androidx.lifecycle.q
    public final void M1(pey peyVar, Lifecycle.Event event) {
        e6a0 e6a0Var = this.a;
        Lifecycle lifecycle = e6a0Var.a;
        if (event == Lifecycle.Event.ON_START) {
            if (!e6a0Var.d) {
                e6a0Var.d = true;
                return;
            }
            tje.N(r.a(lifecycle), null, null, new PaymentMethodLargestContentfulListener$createObserver$1$onStateChanged$1(e6a0Var, null), 3);
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            lifecycle.d(this);
        }
    }
}
