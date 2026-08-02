package com.google.android.gms.internal.p000authapi;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import defpackage.atx0;
import defpackage.ntx0;
import defpackage.o091;

/* loaded from: classes11.dex */
final class zbap extends zbo {
    final /* synthetic */ atx0 zba;

    public zbap(o091 o091Var, atx0 atx0Var) {
        this.zba = atx0Var;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbo, com.google.android.gms.internal.p000authapi.zbp
    public final void zbb(Status status, PendingIntent pendingIntent) {
        ntx0.a(status, pendingIntent, this.zba);
    }
}
