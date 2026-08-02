package com.google.ar.core;

import android.content.pm.PackageInstaller;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes11.dex */
final class ab extends PackageInstaller.SessionCallback {
    final Map a = new HashMap();
    final /* synthetic */ c0 b;
    final /* synthetic */ d0 c;

    public ab(d0 d0Var, c0 c0Var) {
        this.b = c0Var;
        this.c = d0Var;
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onActiveChanged(int i, boolean z) {
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onBadgingChanged(int i) {
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onCreated(int i) {
        this.a.put(Integer.valueOf(i), this.c.g.getSessionInfo(i));
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onFinished(int i, boolean z) {
        PackageInstaller.SessionInfo sessionInfo = (PackageInstaller.SessionInfo) this.a.remove(Integer.valueOf(i));
        if (sessionInfo == null || !"com.google.ar.core".equals(sessionInfo.getAppPackageName())) {
            return;
        }
        Log.i("ARCore-InstallService", "Detected ARCore install completion");
        this.b.a(w.c);
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onProgressChanged(int i, float f) {
    }
}
