package com.google.android.gms.wallet.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import defpackage.atx0;
import defpackage.jt3;
import defpackage.kt3;

/* loaded from: classes11.dex */
final class zzf extends zzd {
    private final atx0 zza;

    public zzf(atx0 atx0Var) {
        this.zza = atx0Var;
    }

    @Override // com.google.android.gms.wallet.internal.zzd, com.google.android.gms.wallet.internal.zzb, com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public final void onWalletObjectsCreated(int i, Bundle bundle) {
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT");
        kt3.c((pendingIntent == null || i != 6) ? new Status(i) : new Status(6, "Need to resolve PendingIntent", pendingIntent), new jt3(), this.zza);
    }
}
