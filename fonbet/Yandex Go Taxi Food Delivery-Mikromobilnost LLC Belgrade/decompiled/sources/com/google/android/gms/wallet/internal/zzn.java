package com.google.android.gms.wallet.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import defpackage.o25;
import defpackage.y96;

/* loaded from: classes11.dex */
final class zzn extends zzd {
    private final o25 zza;

    public zzn(o25 o25Var) {
        this.zza = o25Var;
    }

    @Override // com.google.android.gms.wallet.internal.zzd, com.google.android.gms.wallet.internal.zzb, com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public final void onIsReadyToPayDetermined(Status status, boolean z, Bundle bundle) {
        this.zza.a(new y96(status, z));
    }
}
