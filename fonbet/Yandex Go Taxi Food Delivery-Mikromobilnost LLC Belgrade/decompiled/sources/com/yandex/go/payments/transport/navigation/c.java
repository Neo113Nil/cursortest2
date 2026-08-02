package com.yandex.go.payments.transport.navigation;

import android.content.Context;
import defpackage.h55;
import defpackage.lz30;
import defpackage.qr30;
import defpackage.sr30;
import defpackage.tje;

/* loaded from: classes13.dex */
public final class c extends h55 {
    public final Context D;
    public final qr30 E;
    public final lz30 F;

    public c(Context context, qr30 qr30Var, lz30 lz30Var) {
        super(null);
        this.D = context;
        this.E = qr30Var;
        this.F = lz30Var;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new MtPaymentsRouter$onLaunch$1(this, (sr30) obj, null), 3);
    }
}
