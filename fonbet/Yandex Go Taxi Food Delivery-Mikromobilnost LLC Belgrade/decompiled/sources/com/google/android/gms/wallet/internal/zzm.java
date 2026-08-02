package com.google.android.gms.wallet.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import defpackage.o25;

/* loaded from: classes11.dex */
final class zzm extends zzd {
    private final o25 zza;

    public zzm(o25 o25Var) {
        this.zza = o25Var;
    }

    @Override // com.google.android.gms.wallet.internal.zzd, com.google.android.gms.wallet.internal.zzb, com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public final void onInitializeBuyFlowStatusReceived(Status status, Bundle bundle) {
        this.zza.a(status);
    }
}
