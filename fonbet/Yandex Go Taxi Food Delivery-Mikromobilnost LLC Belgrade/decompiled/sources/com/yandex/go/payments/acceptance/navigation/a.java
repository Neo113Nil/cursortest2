package com.yandex.go.payments.acceptance.navigation;

import defpackage.ff;
import defpackage.g8e;
import defpackage.mu5;
import defpackage.ne;
import defpackage.okv;
import defpackage.pkv;
import defpackage.pz40;
import defpackage.qe;
import defpackage.qkv;
import defpackage.tje;
import defpackage.we;
import defpackage.wfd;
import defpackage.y4;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class a extends qkv {
    public final okv F;
    public final qe G;
    public final ff H;
    public final mu5 I;

    public a(okv okvVar, qe qeVar, ff ffVar) {
        super(0);
        this.F = okvVar;
        this.G = qeVar;
        this.H = ffVar;
        this.I = new mu5(new y4(7, this));
    }

    @Override // defpackage.qkv, defpackage.h55
    public final void G(Object obj) {
        ne neVar = (ne) obj;
        super.G(neVar);
        tje.N(o(), null, null, new AcceptancePaymentNotificationRouter$onAttach$1(this, neVar, null), 3);
    }

    @Override // defpackage.qkv, defpackage.h55
    public final void H(Object obj) {
        ne neVar = (ne) obj;
        String str = neVar.a;
        qe qeVar = this.G;
        Boolean bool = (Boolean) qeVar.b.get(str);
        if (bool != null ? bool.booleanValue() : false) {
            pz40 pz40Var = (pz40) qeVar.a.get(str);
            if ((pz40Var != null ? (we) ((r0) pz40Var).getValue() : null) != null) {
                qeVar.b(str, null);
                ff ffVar = this.H;
                ffVar.c(str);
                ffVar.b(str);
            }
        }
        qeVar.c.remove(str);
        super.H(neVar);
    }

    @Override // defpackage.qkv
    public final wfd P() {
        return this.I;
    }

    @Override // defpackage.qkv
    public final okv Q() {
        return this.F;
    }

    @Override // defpackage.qkv
    public final pkv R(Object obj) {
        ne neVar = (ne) obj;
        String o = g8e.o("acceptance_payment_notification_", neVar.a);
        Boolean bool = (Boolean) this.G.b.get(neVar.a);
        return new pkv(o, bool != null ? bool.booleanValue() : false, 10);
    }
}
