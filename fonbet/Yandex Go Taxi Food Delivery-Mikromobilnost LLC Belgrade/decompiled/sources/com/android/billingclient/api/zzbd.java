package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.util.Log;
import com.google.android.gms.internal.play_billing.zzab;
import defpackage.z991;
import java.lang.ref.WeakReference;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
final class zzbd extends zzab {
    final WeakReference zza;
    final ResultReceiver zzb;

    public /* synthetic */ zzbd(WeakReference weakReference, ResultReceiver resultReceiver, z991 z991Var) {
        this.zza = weakReference;
        this.zzb = resultReceiver;
    }

    @Override // com.google.android.gms.internal.play_billing.zzab, com.google.android.gms.internal.play_billing.zzac
    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            this.zzb.send(6, null);
            return;
        }
        if (!bundle.containsKey("RESPONSE_CODE")) {
            int i = com.google.android.gms.internal.play_billing.g.a;
            Log.isLoggable("BillingClient", 5);
            this.zzb.send(6, bundle);
            return;
        }
        int a = com.google.android.gms.internal.play_billing.g.a(bundle, "BillingClient");
        if (a != 0) {
            Log.isLoggable("BillingClient", 5);
            this.zzb.send(a, bundle);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
        if (pendingIntent == null) {
            com.google.android.gms.internal.play_billing.g.g("BillingClient", "User has acknowledged the alternative billing only dialog before.");
            this.zzb.send(0, bundle);
            return;
        }
        try {
            Activity activity = (Activity) this.zza.get();
            Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivityV2.class);
            intent.putExtra("alternative_billing_only_dialog_result_receiver", this.zzb);
            intent.putExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT", pendingIntent);
            activity.startActivity(intent);
        } catch (RuntimeException e) {
            com.google.android.gms.internal.play_billing.g.h("BillingClient");
            Bundle bundle2 = new Bundle();
            bundle2.putInt("RESPONSE_CODE", 6);
            bundle2.putString("DEBUG_MESSAGE", "An internal error occurred.");
            bundle2.putInt("INTERNAL_LOG_ERROR_REASON", 75);
            String name = e.getClass().getName();
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            bundle2.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", name + Extension.COLON_SPACE + message);
            this.zzb.send(6, bundle2);
        }
    }
}
