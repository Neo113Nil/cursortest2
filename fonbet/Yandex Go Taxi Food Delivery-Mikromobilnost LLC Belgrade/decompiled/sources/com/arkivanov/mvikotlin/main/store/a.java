package com.arkivanov.mvikotlin.main.store;

import defpackage.hd00;
import defpackage.kp50;
import defpackage.la6;
import defpackage.ose;
import defpackage.qje;
import defpackage.sls;
import defpackage.tls;
import defpackage.vkh;
import defpackage.wkh;
import defpackage.ymi0;
import defpackage.zy11;

/* loaded from: classes.dex */
public final class a {
    public static wkh a(Object obj, la6 la6Var, sls slsVar, ymi0 ymi0Var) {
        ose oseVar = (ose) slsVar.invoke();
        final wkh wkhVar = new wkh(obj, la6Var, oseVar, ymi0Var);
        hd00.a();
        if (!wkhVar.h) {
            wkhVar.h = true;
            wkhVar.d.d(qje.K(new DefaultStore$init$1(1, wkhVar, wkh.class, "onIntent", "onIntent(Ljava/lang/Object;)V", 0)));
            wkhVar.e.d(qje.K(new DefaultStore$init$2(1, wkhVar, wkh.class, "onAction", "onAction(Ljava/lang/Object;)V", 0)));
            kp50.A(oseVar.a, new vkh(wkhVar));
            if (la6Var != null) {
                la6Var.c(new tls() { // from class: com.arkivanov.mvikotlin.main.store.DefaultStore$init$4
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        hd00.a();
                        wkh.this.e.a(obj2);
                        return zy11.a;
                    }
                });
            }
            if (la6Var != null) {
                la6Var.invoke();
            }
        }
        return wkhVar;
    }
}
