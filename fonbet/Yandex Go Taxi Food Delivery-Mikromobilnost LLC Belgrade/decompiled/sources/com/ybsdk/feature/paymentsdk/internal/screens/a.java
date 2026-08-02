package com.ybsdk.feature.paymentsdk.internal.screens;

import defpackage.ds31;
import defpackage.ija0;
import defpackage.t7a0;
import defpackage.tje;
import defpackage.tw51;
import defpackage.uc5;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final tw51 B;

    public a(tw51 tw51Var, ija0 ija0Var) {
        super(new t7a0(16), ija0Var);
        this.B = tw51Var;
        tje.N(ds31.a(this), null, null, new PaymentSdkViewModel$subscribeToEvents$1(this, null), 3);
    }
}
