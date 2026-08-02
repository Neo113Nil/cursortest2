package com.google.android.play.integrity.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import defpackage.oh61;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes11.dex */
public final class ad implements ServiceConnection {
    final /* synthetic */ e a;

    public /* synthetic */ ad(e eVar, oh61 oh61Var) {
        this.a = eVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a.b.a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.a.a().post(new c(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.b.a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.a.a().post(new d(this));
    }
}
