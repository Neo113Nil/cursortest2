package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import defpackage.k50;
import defpackage.m50;
import defpackage.qf91;

/* loaded from: classes10.dex */
public class ProxyBillingActivityV2 extends ComponentActivity {
    private m50 zza;
    private m50 zzb;
    private ResultReceiver zzc;
    private ResultReceiver zzd;

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.zza = registerForActivityResult(new k50(), new qf91(0, this));
        this.zzb = registerForActivityResult(new k50(), new qf91(1, this));
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.zzc = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
                return;
            } else {
                if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                    this.zzd = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
                    return;
                }
                return;
            }
        }
        com.google.android.gms.internal.play_billing.g.g("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.zzc = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            this.zza.a(new IntentSenderRequest(pendingIntent.getIntentSender(), null, 0, 0));
        } else if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.zzd = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            this.zzb.a(new IntentSenderRequest(pendingIntent2.getIntentSender(), null, 0, 0));
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.zzc;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.zzd;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
    }

    public final void zza(ActivityResult activityResult) {
        Intent data = activityResult.getData();
        int i = com.google.android.gms.internal.play_billing.g.d(data, "ProxyBillingActivityV2").a;
        ResultReceiver resultReceiver = this.zzc;
        if (resultReceiver != null) {
            resultReceiver.send(i, data == null ? null : data.getExtras());
        }
        if (activityResult.getResultCode() != -1 || i != 0) {
            activityResult.getResultCode();
            Log.isLoggable("ProxyBillingActivityV2", 5);
        }
        finish();
    }

    public final void zzb(ActivityResult activityResult) {
        Intent data = activityResult.getData();
        int i = com.google.android.gms.internal.play_billing.g.d(data, "ProxyBillingActivityV2").a;
        ResultReceiver resultReceiver = this.zzd;
        if (resultReceiver != null) {
            resultReceiver.send(i, data == null ? null : data.getExtras());
        }
        if (activityResult.getResultCode() != -1 || i != 0) {
            int resultCode = activityResult.getResultCode();
            StringBuilder sb = new StringBuilder("External offer dialog finished with resultCode: ");
            sb.append(resultCode);
            sb.append(" and billing's responseCode: ");
            sb.append(i);
            Log.isLoggable("ProxyBillingActivityV2", 5);
        }
        finish();
    }
}
