package com.google.android.play.core.splitinstall.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import defpackage.m491;

/* loaded from: classes11.dex */
final class zzae implements ServiceConnection {
    final /* synthetic */ c zza;

    public /* synthetic */ zzae(c cVar, m491 m491Var) {
        this.zza = cVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.zza.b.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        c cVar = this.zza;
        cVar.a().post(new a(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.zza.b.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        c cVar = this.zza;
        cVar.a().post(new b(this));
    }
}
