package com.google.android.play.core.splitinstall.internal;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import defpackage.il0;
import defpackage.wfb1;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class e {
    public final il0 a;
    public final IntentFilter b;
    public final Context c;
    public final HashSet d = new HashSet();
    public zzr e = null;
    public volatile boolean f = false;

    public e(il0 il0Var, IntentFilter intentFilter, Context context) {
        this.a = il0Var;
        this.b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext != null ? applicationContext : context;
    }

    public final void a() {
        zzr zzrVar;
        wfb1 wfb1Var = null;
        if ((this.f || !this.d.isEmpty()) && this.e == null) {
            zzr zzrVar2 = new zzr(this, wfb1Var);
            this.e = zzrVar2;
            int i = Build.VERSION.SDK_INT;
            Context context = this.c;
            IntentFilter intentFilter = this.b;
            if (i >= 33) {
                context.registerReceiver(zzrVar2, intentFilter, 2);
            } else {
                context.registerReceiver(zzrVar2, intentFilter);
            }
        }
        if (this.f || !this.d.isEmpty() || (zzrVar = this.e) == null) {
            return;
        }
        this.c.unregisterReceiver(zzrVar);
        this.e = null;
    }
}
