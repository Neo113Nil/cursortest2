package com.yandex.go.payments.superapp.payment;

import defpackage.a30;
import defpackage.cy90;
import defpackage.czo0;
import defpackage.dy90;
import defpackage.e5g;
import defpackage.ec80;
import defpackage.ey90;
import defpackage.g8e;
import defpackage.h3y;
import defpackage.hbp0;
import defpackage.i6r;
import defpackage.k5a0;
import defpackage.kjz;
import defpackage.m90;
import defpackage.rqo;
import defpackage.tt2;
import defpackage.u32;
import defpackage.uba0;
import defpackage.uyj;
import defpackage.vyz;
import defpackage.x9a0;
import defpackage.xvf0;

/* loaded from: classes8.dex */
public final class b {
    public final h3y a;
    public final cy90 b;
    public final vyz c;
    public final a30 d;

    public b(h3y h3yVar, cy90 cy90Var, vyz vyzVar, a30 a30Var) {
        this.a = h3yVar;
        this.b = cy90Var;
        this.c = vyzVar;
        this.d = a30Var;
    }

    public final dy90 a(String str, u32 u32Var, m90 m90Var, uba0 uba0Var) {
        hbp0 hbp0Var = new hbp0(new czo0(14), g8e.o("PaymentComponentScope_", str), null);
        i6r i6rVar = (i6r) this.a.get();
        x9a0 x9a0Var = uba0Var.d;
        if (x9a0Var == null) {
            kjz kjzVar = this.c.a;
            x9a0Var = new com.yandex.go.payments.paymentlist.domain.subtitles.replacement.a(str, (k5a0) ((ec80) kjzVar.b).get(), (rqo) ((xvf0) kjzVar.c).get());
        }
        uba0 a = uba0.a(uba0Var, null, x9a0Var, null, 55);
        i6rVar.getClass();
        str.getClass();
        u32Var.getClass();
        e5g e5gVar = new e5g(i6rVar, str, m90Var, hbp0Var, a);
        tt2 tt2Var = (tt2) this.b.a.a.get();
        ey90 ey90Var = new ey90(hbp0Var, e5gVar, tt2Var);
        if (ey90Var.c.compareAndSet(false, true)) {
            hbp0Var.a();
            tt2Var.getClass();
            hbp0.e(hbp0Var, uyj.a, null, new PaymentComponentHolderImpl$init$1(ey90Var, null), 2);
        }
        a30 a30Var = this.d;
        dy90 dy90Var = new dy90(ey90Var, str, a30Var);
        a30Var.a.put(str, dy90Var);
        return dy90Var;
    }
}
