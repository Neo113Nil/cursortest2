package com.google.android.gms.wallet.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.firstparty.GetBuyFlowInitializationTokenResponse;
import defpackage.o25;
import defpackage.z791;

/* loaded from: classes11.dex */
final class zzh extends zzd {
    private final o25 zza;

    public zzh(o25 o25Var) {
        this.zza = o25Var;
    }

    @Override // com.google.android.gms.wallet.internal.zzd, com.google.android.gms.wallet.internal.zzb, com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public final void onBuyFlowInitializationTokenReceived(Status status, GetBuyFlowInitializationTokenResponse getBuyFlowInitializationTokenResponse, Bundle bundle) {
        this.zza.a(new z791(status, 1));
    }
}
