package com.google.android.gms.fido.fido2;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.fido.zzl;
import defpackage.atx0;
import defpackage.ntx0;
import defpackage.vuz;
import defpackage.ywq;

/* loaded from: classes11.dex */
final class zzt extends zzl {
    final /* synthetic */ atx0 zza;

    public zzt(ywq ywqVar, atx0 atx0Var) {
        this.zza = atx0Var;
    }

    @Override // com.google.android.gms.internal.fido.zzl, com.google.android.gms.internal.fido.zzm
    public final void zzb(Status status, PendingIntent pendingIntent) {
        ntx0.a(status, new vuz(), this.zza);
    }
}
