package com.google.android.gms.wallet.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import defpackage.o25;
import defpackage.z791;

/* loaded from: classes11.dex */
public final class zzg extends zzd {
    private final o25 zza;

    public zzg(o25 o25Var) {
        this.zza = o25Var;
    }

    @Override // com.google.android.gms.wallet.internal.zzd, com.google.android.gms.wallet.internal.zzb, com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public final void onExecuteBuyFlowStatusReceived(Status status, Bundle bundle) {
        bundle.getString("com.google.android.gms.wallet.firstparty.EXTRA_ORDER_ID");
        bundle.getString("com.google.android.gms.wallet.firstparty.EXTRA_DISPLAY_MESSAGE");
        bundle.getByteArray("com.google.android.gms.wallet.firstparty.EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN");
        this.zza.a(new z791(status, 0));
    }
}
