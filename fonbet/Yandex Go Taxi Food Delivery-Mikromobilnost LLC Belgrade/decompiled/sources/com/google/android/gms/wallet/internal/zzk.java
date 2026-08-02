package com.google.android.gms.wallet.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.PaymentMetadata;
import defpackage.atx0;
import defpackage.kt3;

/* loaded from: classes11.dex */
final class zzk extends zzd {
    private final atx0 zza;

    public zzk(atx0 atx0Var) {
        this.zza = atx0Var;
    }

    @Override // com.google.android.gms.wallet.internal.zzd, com.google.android.gms.wallet.internal.zzb, com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public final void onPaymentMetadataLoaded(Status status, PaymentMetadata paymentMetadata, Bundle bundle) {
        kt3.c(status, paymentMetadata, this.zza);
    }
}
