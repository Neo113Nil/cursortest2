package com.google.android.gms.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import defpackage.z491;

/* loaded from: classes11.dex */
final class zzah extends BroadcastReceiver {
    private final /* synthetic */ z491 zzdc;

    public zzah(z491 z491Var) {
        this.zzdc = z491Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Log.isLoggable("InstanceID", 3);
        this.zzdc.c(intent);
    }
}
