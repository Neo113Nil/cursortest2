package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.zzw;
import defpackage.atx0;
import defpackage.h3s0;
import defpackage.hif;
import defpackage.s391;
import defpackage.vi71;
import defpackage.ycs0;
import defpackage.ykj;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class a {
    public static int h;
    public static PendingIntent i;
    public static final Pattern j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public final Context b;
    public final hif c;
    public final ScheduledThreadPoolExecutor d;
    public Messenger f;
    public zzd g;
    public final ycs0 a = new ycs0();
    public final Messenger e = new Messenger(new zzae(this, Looper.getMainLooper()));

    public a(Context context) {
        this.b = context;
        this.c = new hif(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = scheduledThreadPoolExecutor;
    }

    public final zzw a(Bundle bundle) {
        String num;
        synchronized (a.class) {
            int i2 = h;
            h = i2 + 1;
            num = Integer.toString(i2);
        }
        atx0 atx0Var = new atx0();
        synchronized (this.a) {
            this.a.put(num, atx0Var);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.c.k() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.b;
        synchronized (a.class) {
            try {
                if (i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    i = PendingIntent.getBroadcast(context, 0, intent2, s391.a);
                }
                intent.putExtra("app", i);
            } finally {
            }
        }
        intent.putExtra("kid", "|ID|" + num + "|");
        if (Log.isLoggable("Rpc", 3)) {
            intent.getExtras();
        }
        intent.putExtra("google.messenger", this.e);
        if (this.f != null || this.g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.g.zzb(obtain);
                }
            } catch (RemoteException unused) {
                Log.isLoggable("Rpc", 3);
            }
            atx0Var.a.c(ykj.w, new vi71(29, this, num, this.d.schedule(new h3s0(27, atx0Var), 30L, TimeUnit.SECONDS)));
            return atx0Var.a;
        }
        int k = this.c.k();
        Context context2 = this.b;
        if (k == 2) {
            context2.sendBroadcast(intent);
        } else {
            context2.startService(intent);
        }
        atx0Var.a.c(ykj.w, new vi71(29, this, num, this.d.schedule(new h3s0(27, atx0Var), 30L, TimeUnit.SECONDS)));
        return atx0Var.a;
    }

    public final void b(Bundle bundle, String str) {
        synchronized (this.a) {
            try {
                atx0 atx0Var = (atx0) this.a.remove(str);
                if (atx0Var == null) {
                    return;
                }
                atx0Var.a(bundle);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
