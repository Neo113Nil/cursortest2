package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.payment;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import defpackage.g8e;
import defpackage.gio;
import defpackage.ie60;
import defpackage.k5c;
import defpackage.mdd0;
import defpackage.nfd0;
import defpackage.pqx0;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.u7d0;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class a {
    public final k5c a;
    public final nfd0 b;
    public final u7d0 c;
    public final mdd0 d;
    public PlusPayCompositeOffers.Offer e;
    public pzt0 f;

    public a(k5c k5cVar, nfd0 nfd0Var, u7d0 u7d0Var, mdd0 mdd0Var) {
        this.a = k5cVar;
        this.b = nfd0Var;
        this.c = u7d0Var;
        this.d = mdd0Var;
    }

    public final void a(PlusPayCompositeOffers.Offer offer, String str) {
        this.e = offer;
        gio gioVar = ((pqx0) this.b).a;
        String sessionId = offer.getMeta().getSessionId();
        gioVar.getClass();
        LinkedHashMap x = g8e.x("session_id", sessionId);
        x.put("_meta", gio.a(new HashMap()));
        gioVar.e("PlusPayment.Step.Payment3DS.Start", x);
        this.f = tje.N(this.a, null, null, new Confirmation3dsAnalyticsController$on3dsState$1(this, str, null), 3);
    }

    public final void b() {
        PlusPayCompositeOffers.Offer offer = this.e;
        if (offer != null) {
            pzt0 pzt0Var = this.f;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            tje.N(this.a, ie60.a, null, new Confirmation3dsAnalyticsController$onNon3dsState$1$1(this, offer, null), 2);
            this.e = null;
        }
    }
}
