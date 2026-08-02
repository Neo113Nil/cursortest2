package com.ybsdk.feature.qr.payments.internal.screens.list.presentation;

import defpackage.ds31;
import defpackage.m04;
import defpackage.p0v0;
import defpackage.pzt0;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.uc5;
import defpackage.xlf0;
import defpackage.yfg0;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final tfl0 B;
    public final com.ybsdk.feature.qr.payments.internal.screens.list.data.a C;
    public final m04 D;
    public pzt0 E;
    public pzt0 F;

    public a(yfg0 yfg0Var, tfl0 tfl0Var, com.ybsdk.feature.qr.payments.internal.screens.list.data.a aVar, m04 m04Var) {
        super(new xlf0(25), yfg0Var);
        this.B = tfl0Var;
        this.C = aVar;
        this.D = m04Var;
        pzt0 pzt0Var = this.E;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.E = tje.N(ds31.a(this), null, null, new QrSubscriptionListViewModel$loadSubscriptions$1(this, null), 3);
    }

    public final void b0() {
        this.B.e();
    }

    public final void c0() {
        this.D.a.Y.a.a("qr.subscriptions.closed", null);
    }

    public final void d0(p0v0 p0v0Var) {
        pzt0 pzt0Var = this.F;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.F = tje.N(ds31.a(this), null, null, new QrSubscriptionListViewModel$onRemoveItem$1(this, p0v0Var, null), 3);
    }

    public final void e0() {
        pzt0 pzt0Var = this.E;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.E = tje.N(ds31.a(this), null, null, new QrSubscriptionListViewModel$loadSubscriptions$1(this, null), 3);
    }

    public final void f0() {
        this.D.a.Y.a.a("qr.subscriptions.shown", null);
    }
}
