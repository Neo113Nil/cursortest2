package com.ybsdk.feature.transactions.impl.ui.screens.transaction.divkit;

import com.ybsdk.feature.transactions.impl.data.c;
import defpackage.acj;
import defpackage.c1x0;
import defpackage.ds31;
import defpackage.tf01;
import defpackage.tje;
import defpackage.uc5;
import defpackage.zgl;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final c B;
    public final c1x0 C;
    public final DivTransactionScreenParams D;
    public final tf01 E;

    public a(c cVar, c1x0 c1x0Var, DivTransactionScreenParams divTransactionScreenParams, tf01 tf01Var) {
        super(new acj(16), new zgl(1));
        this.B = cVar;
        this.C = c1x0Var;
        this.D = divTransactionScreenParams;
        this.E = tf01Var;
        tje.N(ds31.a(this), null, null, new DivTransactionInfoViewModel$loadData$1(this, null), 3);
    }
}
