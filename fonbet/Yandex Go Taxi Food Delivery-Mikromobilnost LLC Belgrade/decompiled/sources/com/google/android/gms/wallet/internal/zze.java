package com.google.android.gms.wallet.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import defpackage.atx0;
import defpackage.ntx0;

/* loaded from: classes11.dex */
final class zze extends zzd {
    private final atx0 zza;

    public zze(atx0 atx0Var) {
        this.zza = atx0Var;
    }

    @Override // com.google.android.gms.wallet.internal.zzd, com.google.android.gms.wallet.internal.zzb, com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public final void onIsReadyToPayDetermined(Status status, boolean z, Bundle bundle) {
        ntx0.a(status, Boolean.valueOf(z), this.zza);
    }

    @Override // com.google.android.gms.wallet.internal.zzd, com.google.android.gms.wallet.internal.zzb, com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public final void onPreAuthorizationDetermined(int i, boolean z, Bundle bundle) {
        ntx0.a(new Status(i), Boolean.valueOf(z), this.zza);
    }
}
