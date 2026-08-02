package com.yandex.go.yb.data;

import com.yandex.go.yb.experiments.ChangeToYbWalletExperiment;
import defpackage.cda0;
import defpackage.cne0;
import defpackage.dne0;
import defpackage.gay0;
import defpackage.gv51;
import defpackage.jbh;
import defpackage.mth;
import defpackage.py51;
import defpackage.qqo;
import defpackage.rgf;
import defpackage.rqo;
import defpackage.tpr;

/* loaded from: classes15.dex */
public final class i {
    public final gay0 a;
    public final qqo b;
    public final cne0 c;
    public final tpr d;

    public i(dne0 dne0Var, cda0 cda0Var, rqo rqoVar, gv51 gv51Var, py51 py51Var, rgf rgfVar, gay0 gay0Var) {
        this.a = gay0Var;
        this.b = ((jbh) rqoVar).c(ChangeToYbWalletExperiment.q);
        this.c = dne0Var.a("YANDEX_CARD_STATUS_NOTIFICATIONS");
        this.d = kotlinx.coroutines.flow.e.t(new mth(kotlinx.coroutines.flow.e.m(py51Var.b(), gv51Var.a, ((com.yandex.go.payments.paymentlist.data.c) cda0Var).u, kotlinx.coroutines.flow.e.d(rgfVar.a), new YbCardStatusNotificationRepository$ybCardStatusNotificationFlow$1(this, null)), 6));
    }
}
