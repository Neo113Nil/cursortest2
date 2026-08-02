package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import defpackage.b43;
import defpackage.cxq0;
import defpackage.el11;
import defpackage.eqn;
import defpackage.f45;
import defpackage.l8a1;
import defpackage.udq0;
import defpackage.zgl;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes11.dex */
public final class a {
    public static final Object c = new Object();
    public static WithinAppServiceConnection d;
    public final Context a;
    public final b43 b = new b43(1);

    public a(Context context) {
        this.a = context;
    }

    public static Task a(Context context, Intent intent, boolean z) {
        WithinAppServiceConnection withinAppServiceConnection;
        Log.isLoggable("FirebaseMessaging", 3);
        synchronized (c) {
            try {
                if (d == null) {
                    d = new WithinAppServiceConnection(context, "com.google.firebase.MESSAGING_EVENT");
                }
                withinAppServiceConnection = d;
            } finally {
            }
        }
        if (!z) {
            return withinAppServiceConnection.sendIntent(intent).h(new b43(1), new zgl(26));
        }
        if (cxq0.v().y(context)) {
            synchronized (l8a1.a) {
                try {
                    l8a1.c(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        l8a1.b.a();
                    }
                    withinAppServiceConnection.sendIntent(intent).b(new el11(18, intent));
                } finally {
                }
            }
        } else {
            withinAppServiceConnection.sendIntent(intent);
        }
        return udq0.p(-1);
    }

    public final Task b(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        Context context = this.a;
        int i = 1;
        boolean z = context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z2 = (intent.getFlags() & SelfTester_JCP.IMITA) != 0;
        if (z && !z2) {
            return a(context, intent, z2);
        }
        eqn eqnVar = new eqn(i, context, intent);
        b43 b43Var = this.b;
        return udq0.h(b43Var, eqnVar).i(b43Var, new f45(context, intent, z2));
    }
}
