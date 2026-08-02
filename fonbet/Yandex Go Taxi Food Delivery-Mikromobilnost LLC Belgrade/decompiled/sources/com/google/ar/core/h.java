package com.google.ar.core;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.ar.core.ArCoreApk;

/* loaded from: classes11.dex */
public final class h implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ l b;
    public final /* synthetic */ d0 c;

    public h(d0 d0Var, Context context, l lVar) {
        this.a = context;
        this.b = lVar;
        this.c = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l lVar = this.b;
        try {
            com.google.ar.core.dependencies.h hVar = this.c.c;
            String str = this.a.getApplicationInfo().packageName;
            Bundle bundle = new Bundle();
            bundle.putCharSequence("package.name", "com.google.ar.core");
            hVar.e(str, bundle, new z(lVar));
        } catch (RemoteException e) {
            Log.e("ARCore-InstallService", "requestInfo threw", e);
            lVar.a(ArCoreApk.Availability.UNKNOWN_ERROR);
        }
    }
}
