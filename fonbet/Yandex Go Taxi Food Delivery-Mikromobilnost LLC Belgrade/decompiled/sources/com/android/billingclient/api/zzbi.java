package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.util.Log;
import com.google.android.gms.internal.play_billing.zzao;
import defpackage.z991;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;

/* loaded from: classes10.dex */
final class zzbi extends zzao {
    final WeakReference zza;
    final ResultReceiver zzb;

    public /* synthetic */ zzbi(WeakReference weakReference, ResultReceiver resultReceiver, z991 z991Var) {
        this.zza = weakReference;
        this.zzb = resultReceiver;
    }

    @Override // com.google.android.gms.internal.play_billing.zzao, com.google.android.gms.internal.play_billing.zzap
    public final void zza(Bundle bundle) throws RemoteException {
        ResultReceiver resultReceiver = this.zzb;
        if (resultReceiver == null) {
            int i = com.google.android.gms.internal.play_billing.g.a;
            Log.isLoggable("BillingClient", 5);
            return;
        }
        if (bundle == null) {
            resultReceiver.send(0, null);
            return;
        }
        Activity activity = (Activity) this.zza.get();
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("KEY_LAUNCH_INTENT");
        if (activity == null || pendingIntent == null) {
            this.zzb.send(0, null);
            int i2 = com.google.android.gms.internal.play_billing.g.a;
            Log.isLoggable("BillingClient", 5);
            return;
        }
        try {
            Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
            intent.putExtra("in_app_message_result_receiver", this.zzb);
            intent.putExtra("IN_APP_MESSAGE_INTENT", pendingIntent);
            activity.startActivity(intent);
        } catch (CancellationException unused) {
            this.zzb.send(0, null);
            com.google.android.gms.internal.play_billing.g.h("BillingClient");
        }
    }
}
