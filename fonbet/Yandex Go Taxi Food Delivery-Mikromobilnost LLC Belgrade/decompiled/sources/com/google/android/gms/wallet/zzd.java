package com.google.android.gms.wallet;

import android.app.Activity;
import android.app.Fragment;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import defpackage.hc91;
import defpackage.it3;
import defpackage.kt3;

@Deprecated
/* loaded from: classes11.dex */
public final class zzd extends Fragment {
    public static final /* synthetic */ int zzb = 0;
    boolean zza;
    private int zzc;
    private hc91 zzd;

    private final void zzb() {
        hc91 hc91Var = this.zzd;
        if (hc91Var == null || hc91Var.b != this) {
            return;
        }
        hc91Var.b = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final void zza(Task task) {
        if (this.zza) {
            return;
        }
        int i = 1;
        this.zza = true;
        Activity activity = getActivity();
        activity.getFragmentManager().beginTransaction().remove(this).commit();
        int i2 = this.zzc;
        if (task == null) {
            kt3.d(activity, i2, 0, new Intent());
            return;
        }
        int i3 = kt3.b;
        if (activity.isFinishing()) {
            Log.isLoggable("AutoResolveHelper", 3);
            return;
        }
        Exception j = task.j();
        if (j instanceof ResolvableApiException) {
            try {
                ((ResolvableApiException) j).f(activity, i2);
                return;
            } catch (IntentSender.SendIntentException e) {
                if (Log.isLoggable("AutoResolveHelper", 6)) {
                    Log.e("AutoResolveHelper", "Error starting pending intent!", e);
                    return;
                }
                return;
            }
        }
        Intent intent = new Intent();
        if (task.o()) {
            ((it3) task.k()).putIntoIntent(intent);
            i = -1;
        } else if (j instanceof ApiException) {
            ApiException apiException = (ApiException) j;
            intent.putExtra("com.google.android.gms.common.api.AutoResolveHelper.status", new Status(apiException.b(), apiException.getMessage(), (PendingIntent) null));
        } else {
            if (Log.isLoggable("AutoResolveHelper", 6)) {
                Log.e("AutoResolveHelper", "Unexpected non API exception!", j);
            }
            intent.putExtra("com.google.android.gms.common.api.AutoResolveHelper.status", new Status(8, "Unexpected non API exception when trying to deliver the task result to an activity!"));
        }
        kt3.d(activity, i2, i, intent);
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.zzc = getArguments().getInt("requestCode");
        if (kt3.a != getArguments().getLong("initializationElapsedRealtime")) {
            this.zzd = null;
        } else {
            this.zzd = (hc91) hc91.x.get(getArguments().getInt("resolveCallId"));
        }
        boolean z = false;
        if (bundle != null && bundle.getBoolean("delivered")) {
            z = true;
        }
        this.zza = z;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        zzb();
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        hc91 hc91Var = this.zzd;
        if (hc91Var != null) {
            hc91Var.b = this;
            hc91Var.a();
        } else {
            Log.isLoggable("AutoResolveHelper", 5);
            zza(null);
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("delivered", this.zza);
        zzb();
    }
}
