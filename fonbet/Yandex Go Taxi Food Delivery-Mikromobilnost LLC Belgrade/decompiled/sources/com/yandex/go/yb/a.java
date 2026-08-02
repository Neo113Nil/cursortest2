package com.yandex.go.yb;

import defpackage.be9;
import defpackage.hbp0;
import defpackage.mv51;
import defpackage.o2y0;
import defpackage.o400;
import defpackage.pzt0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.xv51;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes15.dex */
public final class a implements xv51 {
    public final /* synthetic */ b a;
    public final /* synthetic */ be9 b;
    public final /* synthetic */ mv51 c;
    public final /* synthetic */ PaymentMethod$Type w;
    public final /* synthetic */ o2y0 x;

    public a(b bVar, be9 be9Var, mv51 mv51Var, PaymentMethod$Type paymentMethod$Type, o2y0 o2y0Var) {
        this.a = bVar;
        this.b = be9Var;
        this.c = mv51Var;
        this.w = paymentMethod$Type;
        this.x = o2y0Var;
    }

    @Override // defpackage.xv51
    public final void b() {
        b bVar = this.a;
        pzt0 pzt0Var = bVar.p;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        hbp0 hbp0Var = bVar.c.a;
        bVar.b.getClass();
        sjh sjhVar = uyj.a;
        bVar.p = tje.N(hbp0Var, o400.a, null, new SuggestYbCardInRideRouterImpl$getChangePaymentSuggestCallback$1$onScreenDismissed$1(bVar, this.b, this.c, this.w, this.x, null), 2);
    }
}
