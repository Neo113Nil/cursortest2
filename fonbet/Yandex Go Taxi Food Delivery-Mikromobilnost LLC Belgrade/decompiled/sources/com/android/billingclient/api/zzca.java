package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.internal.play_billing.x;
import com.google.android.gms.internal.play_billing.zzau;
import defpackage.jd91;
import defpackage.xd91;
import java.util.Objects;

/* loaded from: classes10.dex */
final class zzca implements ServiceConnection {
    final /* synthetic */ e zza;

    public /* synthetic */ zzca(e eVar, jd91 jd91Var) {
        this.zza = eVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.internal.play_billing.g.g("BillingClientTesting", "Billing Override Service connected.");
        this.zza.C = zzau.zzc(iBinder);
        this.zza.B = 2;
        e eVar = this.zza;
        eVar.getClass();
        x d = xd91.d(26);
        Objects.requireNonNull(d, "ApiSuccess should not be null");
        eVar.g.l(d);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i = com.google.android.gms.internal.play_billing.g.a;
        Log.isLoggable("BillingClientTesting", 5);
        this.zza.C = null;
        this.zza.B = 0;
    }
}
