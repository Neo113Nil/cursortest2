package com.google.android.gms.wallet.internal;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import defpackage.atx0;
import defpackage.hwa1;
import defpackage.kt3;

/* loaded from: classes11.dex */
final class zzq extends zzd {
    private final atx0 zza;

    public zzq(atx0 atx0Var) {
        this.zza = atx0Var;
    }

    @Override // com.google.android.gms.wallet.internal.zzd, com.google.android.gms.wallet.internal.zzb, com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public final void onIsReadyToPayDetermined(Status status, boolean z, Bundle bundle) {
        Parcelable.Creator<com.google.android.gms.wallet.zzr> creator = com.google.android.gms.wallet.zzr.CREATOR;
        byte[] byteArray = bundle.getByteArray("com.google.android.gms.wallet.IsReadyToPayResponse");
        kt3.c(status, byteArray == null ? null : (com.google.android.gms.wallet.zzr) hwa1.a(byteArray, com.google.android.gms.wallet.zzr.CREATOR), this.zza);
    }
}
