package com.yandex.go.payments.menu.navigation;

import defpackage.dy90;
import defpackage.jaa0;
import defpackage.jv5;
import defpackage.kv90;
import defpackage.lca0;
import defpackage.lv90;
import defpackage.m950;
import defpackage.mm10;
import defpackage.nsd0;
import defpackage.rb8;
import defpackage.tje;
import defpackage.wqw;
import defpackage.z80;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes8.dex */
public final class a implements nsd0 {
    public final boolean a;
    public final /* synthetic */ b b;

    public a(b bVar, boolean z) {
        this.b = bVar;
        this.a = z;
    }

    @Override // defpackage.nsd0
    public final void d(wqw wqwVar) {
        PaymentMethod$Type a;
        if (wqwVar == null) {
            wqwVar = null;
        }
        if (wqwVar != null) {
            z80 z80Var = (z80) wqwVar;
            jv5 b = z80Var.b();
            if (!z80Var.a() && z80Var.f()) {
                b bVar = this.b;
                bVar.M.a();
                dy90 dy90Var = bVar.b0;
                if (dy90Var != null && (a = z80Var.e().a()) != null) {
                    kv90 kv90Var = lv90.Companion;
                    String c = z80Var.c();
                    kv90Var.getClass();
                    dy90Var.a.b().e.a(kv90.b(c, a), "no_feature");
                }
                PaymentMethod$Type a2 = z80Var.e().a();
                if (((rb8) b).a()) {
                    if (this.a && ((jaa0) bVar.S.get()).a().contains(PaymentMethod$Type.CARD)) {
                        bVar.z((m950) bVar.E.get(), new mm10(bVar, 0));
                        return;
                    }
                    return;
                }
                if (!((Boolean) ((lca0) bVar.V.get()).a.c()).booleanValue() || a2 == PaymentMethod$Type.MBANK_ACCOUNT) {
                    return;
                }
                tje.N(bVar.o(), null, null, new MenuPaymentMethodsListRouter$PmlRouterEventsListenerImpl$onCardAdded$2(bVar, z80Var, null), 3);
            }
        }
    }
}
