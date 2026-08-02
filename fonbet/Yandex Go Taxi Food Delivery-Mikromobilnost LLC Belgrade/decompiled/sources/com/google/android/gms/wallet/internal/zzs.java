package com.google.android.gms.wallet.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.firstparty.WarmUpUiProcessResponse;
import defpackage.atx0;
import defpackage.kt3;

/* loaded from: classes11.dex */
final class zzs extends zzd {
    private final atx0 zza;

    public zzs(atx0 atx0Var) {
        this.zza = atx0Var;
    }

    @Override // com.google.android.gms.wallet.internal.zzd, com.google.android.gms.wallet.internal.zzb, com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public final void onWarmUpUiProcessResponseReceived(Status status, WarmUpUiProcessResponse warmUpUiProcessResponse, Bundle bundle) {
        kt3.c(status, warmUpUiProcessResponse, this.zza);
    }
}
