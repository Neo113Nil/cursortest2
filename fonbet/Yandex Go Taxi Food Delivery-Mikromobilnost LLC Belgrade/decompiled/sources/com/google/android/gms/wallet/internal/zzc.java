package com.google.android.gms.wallet.internal;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import defpackage.cvw;
import java.lang.ref.WeakReference;

/* loaded from: classes11.dex */
final class zzc extends zzd {
    private final WeakReference zza;
    private final int zzb;

    public zzc(Activity activity, int i) {
        this.zza = new WeakReference(activity);
        this.zzb = i;
    }

    @Override // com.google.android.gms.wallet.internal.zzd, com.google.android.gms.wallet.internal.zzb, com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public final void onFullWalletLoaded(int i, FullWallet fullWallet, Bundle bundle) {
        int i2;
        Activity activity = (Activity) this.zza.get();
        if (activity == null) {
            return;
        }
        ConnectionResult connectionResult = new ConnectionResult(i, bundle != null ? (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT") : null);
        if (connectionResult.hasResolution()) {
            try {
                connectionResult.startResolutionForResult(activity, this.zzb);
                return;
            } catch (IntentSender.SendIntentException unused) {
                return;
            }
        }
        Intent intent = new Intent();
        if (connectionResult.isSuccess()) {
            intent.putExtra("com.google.android.gms.wallet.EXTRA_FULL_WALLET", fullWallet);
            i2 = -1;
        } else {
            int i3 = i == 408 ? 0 : 1;
            intent.putExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", i);
            i2 = i3;
        }
        PendingIntent createPendingResult = activity.createPendingResult(this.zzb, intent, 1073741824);
        if (createPendingResult == null) {
            return;
        }
        try {
            createPendingResult.send(i2);
        } catch (PendingIntent.CanceledException unused2) {
        }
    }

    @Override // com.google.android.gms.wallet.internal.zzd, com.google.android.gms.wallet.internal.zzb, com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public final void onMaskedWalletLoaded(int i, MaskedWallet maskedWallet, Bundle bundle) {
        int i2;
        Activity activity = (Activity) this.zza.get();
        if (activity == null) {
            return;
        }
        ConnectionResult connectionResult = new ConnectionResult(i, bundle != null ? (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT") : null);
        if (connectionResult.hasResolution()) {
            try {
                connectionResult.startResolutionForResult(activity, this.zzb);
                return;
            } catch (IntentSender.SendIntentException unused) {
                return;
            }
        }
        Intent intent = new Intent();
        if (connectionResult.isSuccess()) {
            intent.putExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET", maskedWallet);
            i2 = -1;
        } else {
            int i3 = i == 408 ? 0 : 1;
            intent.putExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", i);
            i2 = i3;
        }
        PendingIntent createPendingResult = activity.createPendingResult(this.zzb, intent, 1073741824);
        if (createPendingResult == null) {
            return;
        }
        try {
            createPendingResult.send(i2);
        } catch (PendingIntent.CanceledException unused2) {
        }
    }

    @Override // com.google.android.gms.wallet.internal.zzd, com.google.android.gms.wallet.internal.zzb, com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public final void onPreAuthorizationDetermined(int i, boolean z, Bundle bundle) {
        Activity activity = (Activity) this.zza.get();
        if (activity == null) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("com.google.android.gm.wallet.EXTRA_IS_USER_PREAUTHORIZED", z);
        PendingIntent createPendingResult = activity.createPendingResult(this.zzb, intent, 1073741824);
        if (createPendingResult == null) {
            return;
        }
        try {
            createPendingResult.send(-1);
        } catch (PendingIntent.CanceledException unused) {
        }
    }

    @Override // com.google.android.gms.wallet.internal.zzd, com.google.android.gms.wallet.internal.zzb, com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public final void onWalletObjectsCreated(int i, Bundle bundle) {
        cvw.m(bundle, "Bundle should not be null");
        Activity activity = (Activity) this.zza.get();
        if (activity == null) {
            return;
        }
        ConnectionResult connectionResult = new ConnectionResult(i, (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT"));
        if (connectionResult.hasResolution()) {
            try {
                connectionResult.startResolutionForResult(activity, this.zzb);
                return;
            } catch (IntentSender.SendIntentException unused) {
                return;
            }
        }
        Log.e("WalletClientImpl", "Create Wallet Objects confirmation UI will not be shown connection result: ".concat(connectionResult.toString()));
        Intent intent = new Intent();
        intent.putExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", 413);
        PendingIntent createPendingResult = activity.createPendingResult(this.zzb, intent, 1073741824);
        if (createPendingResult == null) {
            return;
        }
        try {
            createPendingResult.send(1);
        } catch (PendingIntent.CanceledException unused2) {
        }
    }
}
