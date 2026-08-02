package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.zzw;
import defpackage.gnb1;
import defpackage.v150;
import defpackage.wjb1;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes11.dex */
public final class d {
    public static d e;
    public final Context a;
    public final ScheduledExecutorService b;
    public zzp c = new zzp(this, null);
    public int d = 1;

    public d(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.b = scheduledExecutorService;
        this.a = context.getApplicationContext();
    }

    public static synchronized d a(Context context) {
        d dVar;
        synchronized (d.class) {
            try {
                if (e == null) {
                    e = new d(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new v150("MessengerIpcClient"))));
                }
                dVar = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    public final zzw b(int i, Bundle bundle) {
        int i2;
        synchronized (this) {
            i2 = this.d;
            this.d = i2 + 1;
        }
        return d(new wjb1(i2, i, bundle, 0));
    }

    public final zzw c(int i, Bundle bundle) {
        int i2;
        synchronized (this) {
            i2 = this.d;
            this.d = i2 + 1;
        }
        return d(new wjb1(i2, i, bundle, 1));
    }

    public final synchronized zzw d(gnb1 gnb1Var) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                gnb1Var.toString();
            }
            if (!this.c.zzg(gnb1Var)) {
                zzp zzpVar = new zzp(this, null);
                this.c = zzpVar;
                zzpVar.zzg(gnb1Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return gnb1Var.b.a;
    }
}
