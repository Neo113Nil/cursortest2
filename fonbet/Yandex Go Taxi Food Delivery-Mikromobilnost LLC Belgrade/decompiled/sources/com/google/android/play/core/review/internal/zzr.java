package com.google.android.play.core.review.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import defpackage.enb1;

/* loaded from: classes11.dex */
final class zzr implements ServiceConnection {
    final /* synthetic */ c zza;

    public /* synthetic */ zzr(c cVar, enb1 enb1Var) {
        this.zza = cVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.zza.b.a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.zza.a().post(new a(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.zza.b.a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.zza.a().post(new b(this));
    }
}
