package com.google.android.gms.internal.identity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import defpackage.cvw;

/* loaded from: classes11.dex */
public final class zzd extends zzf {
    private final int zza;
    private Activity zzb;

    public zzd(int i, Activity activity) {
        this.zza = i;
        this.zzb = activity;
    }

    @Override // com.google.android.gms.internal.identity.zzf, com.google.android.gms.internal.identity.zzg
    public final void zzc(int i, Bundle bundle) {
        PendingIntent createPendingResult;
        if (i == 1) {
            Intent intent = new Intent();
            intent.putExtras(bundle);
            Activity activity = this.zzb;
            if (activity == null || (createPendingResult = activity.createPendingResult(this.zza, intent, 1073741824)) == null) {
                return;
            }
            try {
                createPendingResult.send(1);
                return;
            } catch (PendingIntent.CanceledException unused) {
                return;
            }
        }
        ConnectionResult connectionResult = new ConnectionResult(i, bundle != null ? (PendingIntent) bundle.getParcelable("com.google.android.gms.identity.intents.EXTRA_PENDING_INTENT") : null);
        boolean hasResolution = connectionResult.hasResolution();
        Activity activity2 = this.zzb;
        if (hasResolution) {
            try {
                cvw.l(activity2);
                connectionResult.startResolutionForResult(activity2, this.zza);
            } catch (PendingIntent.CanceledException | IntentSender.SendIntentException unused2) {
            }
        } else {
            cvw.l(activity2);
            PendingIntent createPendingResult2 = activity2.createPendingResult(this.zza, new Intent(), 1073741824);
            if (createPendingResult2 != null) {
                createPendingResult2.send(1);
            }
        }
    }
}
