package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import defpackage.cvw;
import defpackage.o25;
import defpackage.om2;
import defpackage.pm2;
import defpackage.yst;
import defpackage.zm2;

/* loaded from: classes11.dex */
public abstract class a extends BasePendingResult implements o25 {
    public final pm2 H;
    public final zm2 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(zm2 zm2Var, yst ystVar) {
        super(ystVar);
        cvw.m(ystVar, "GoogleApiClient must not be null");
        cvw.m(zm2Var, "Api must not be null");
        this.H = zm2Var.b;
        this.I = zm2Var;
    }

    public abstract void m(om2 om2Var);

    public final void n(Status status) {
        cvw.d("Failed result must not be success", !status.isSuccess());
        a(f(status));
    }
}
