package defpackage;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.zzw;
import com.google.android.gms.wallet.zzd;

/* loaded from: classes11.dex */
public abstract class kt3 {
    public static final long a = SystemClock.elapsedRealtime();
    public static final /* synthetic */ int b = 0;

    public static Status a(Intent intent) {
        if (intent == null) {
            return null;
        }
        return (Status) intent.getParcelableExtra("com.google.android.gms.common.api.AutoResolveHelper.status");
    }

    public static void b(zzw zzwVar, Activity activity, int i) {
        hc91 hc91Var = new hc91();
        int incrementAndGet = hc91.y.incrementAndGet();
        hc91Var.a = incrementAndGet;
        hc91.x.put(incrementAndGet, hc91Var);
        hc91.w.postDelayed(hc91Var, 600000L);
        zzwVar.b(hc91Var);
        FragmentTransaction beginTransaction = activity.getFragmentManager().beginTransaction();
        int i2 = hc91Var.a;
        int i3 = zzd.zzb;
        Bundle bundle = new Bundle();
        bundle.putInt("resolveCallId", i2);
        bundle.putInt("requestCode", i);
        bundle.putLong("initializationElapsedRealtime", a);
        zzd zzdVar = new zzd();
        zzdVar.setArguments(bundle);
        int i4 = hc91Var.a;
        StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 47);
        sb.append("com.google.android.gms.wallet.AutoResolveHelper");
        sb.append(i4);
        beginTransaction.add(zzdVar, sb.toString()).commit();
    }

    public static void c(Status status, Object obj, atx0 atx0Var) {
        if (status.isSuccess()) {
            atx0Var.a(obj);
        } else {
            atx0Var.a.r(sn2.a(status));
        }
    }

    public static void d(Activity activity, int i, int i2, Intent intent) {
        PendingIntent createPendingResult = activity.createPendingResult(i, intent, 1073741824);
        if (createPendingResult == null) {
            Log.isLoggable("AutoResolveHelper", 5);
            return;
        }
        try {
            createPendingResult.send(i2);
        } catch (PendingIntent.CanceledException e) {
            if (Log.isLoggable("AutoResolveHelper", 6)) {
                Log.e("AutoResolveHelper", "Exception sending pending result", e);
            }
        }
    }
}
