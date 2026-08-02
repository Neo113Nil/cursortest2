package com.yandex.go.information;

import defpackage.auv;
import defpackage.avq0;
import defpackage.buv;
import defpackage.bvq0;
import defpackage.kuv;
import defpackage.pgd;
import defpackage.tje;
import defpackage.tls;
import defpackage.uuv;
import defpackage.zy11;

/* loaded from: classes12.dex */
public final /* synthetic */ class a implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ pgd b;
    public final /* synthetic */ kuv c;

    public /* synthetic */ a(pgd pgdVar, kuv kuvVar, int i) {
        this.a = i;
        this.b = pgdVar;
        this.c = kuvVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        kuv kuvVar = this.c;
        pgd pgdVar = this.b;
        switch (i) {
            case 0:
                buv buvVar = (buv) pgdVar;
                tje.N(buvVar.o(), null, null, new InformationComposeRouter$content$1$1$1(buvVar, (uuv) obj, (auv) kuvVar, null), 3);
                break;
            default:
                bvq0 bvq0Var = (bvq0) pgdVar;
                tje.N(bvq0Var.o(), null, null, new ServiceComposeRouter$content$1$1$1(bvq0Var, (uuv) obj, (avq0) kuvVar, null), 3);
                break;
        }
        return zy11Var;
    }
}
