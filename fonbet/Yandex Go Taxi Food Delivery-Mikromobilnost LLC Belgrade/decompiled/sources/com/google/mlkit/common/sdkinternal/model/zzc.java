package com.google.mlkit.common.sdkinternal.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.atx0;
import defpackage.d891;
import defpackage.wvi0;

/* loaded from: classes11.dex */
final class zzc extends BroadcastReceiver {
    final /* synthetic */ wvi0 zza;
    private final long zzb;
    private final atx0 zzc;

    public /* synthetic */ zzc(wvi0 wvi0Var, long j, atx0 atx0Var, d891 d891Var) {
        this.zzb = j;
        this.zzc = atx0Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getLongExtra("extra_download_id", -1L) == this.zzb) {
            throw null;
        }
    }
}
