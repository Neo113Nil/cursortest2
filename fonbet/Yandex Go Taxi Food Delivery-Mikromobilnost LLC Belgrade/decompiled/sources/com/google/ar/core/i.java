package com.google.ar.core;

import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import defpackage.lz;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes11.dex */
public final class i implements Runnable {
    public final /* synthetic */ InstallActivity a;
    public final /* synthetic */ c0 b;
    public final /* synthetic */ d0 c;

    public i(d0 d0Var, InstallActivity installActivity, c0 c0Var) {
        this.a = installActivity;
        this.b = c0Var;
        this.c = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d0 d0Var = this.c;
        c0 c0Var = this.b;
        InstallActivity installActivity = this.a;
        try {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            com.google.ar.core.dependencies.h hVar = d0Var.c;
            String str = installActivity.getApplicationInfo().packageName;
            Bundle bundle = new Bundle();
            bundle.putCharSequence("package.name", "com.google.ar.core");
            hVar.d(str, Collections.singletonList(bundle), new Bundle(), new ad(this, atomicBoolean, c0Var, installActivity));
            new Handler().postDelayed(new lz(this, atomicBoolean, installActivity, c0Var, 29), 3000L);
        } catch (RemoteException unused) {
            d0.e(installActivity, c0Var);
        }
    }
}
