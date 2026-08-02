package yads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import xsna.epx;
import xsna.qb3;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class xd2 extends BroadcastReceiver {
    public static final vd2 h = new vd2();
    public static volatile xd2 i;
    public final Context a;
    public final hx2 b;
    public final ud2 c;
    public final td2 d;
    public final WeakHashMap e = new WeakHashMap();
    public final Object f = new Object();
    public sd2 g = sd2.d;

    public xd2(Context context, Executor executor, hx2 hx2Var, ud2 ud2Var, td2 td2Var) {
        this.a = context;
        this.b = hx2Var;
        this.c = ud2Var;
        this.d = td2Var;
        executor.execute(new qb3(this, 21));
    }

    public static final void a(xd2 xd2Var) {
        sd2 a = xd2Var.c.a();
        xd2Var.g = a;
        Objects.toString(a);
        try {
            xd2Var.d.getClass();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            if (Build.VERSION.SDK_INT >= 33) {
                xd2Var.a.registerReceiver(xd2Var, intentFilter, 2);
            } else {
                xd2Var.a.registerReceiver(xd2Var, intentFilter);
            }
        } catch (Exception unused) {
        }
    }

    public final void b(wd2 wd2Var) {
        synchronized (this.f) {
            this.e.remove(wd2Var);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        sd2 sd2Var;
        HashSet hashSet;
        synchronized (this.f) {
            try {
                sd2 sd2Var2 = this.g;
                String action = intent.getAction();
                sd2 sd2Var3 = epx.f(action, "android.intent.action.SCREEN_OFF") ? sd2.c : epx.f(action, "android.intent.action.USER_PRESENT") ? sd2.d : (this.g == sd2.d || !epx.f(action, "android.intent.action.SCREEN_ON")) ? this.g : sd2.b;
                this.g = sd2Var3;
                if (sd2Var2 != sd2Var3) {
                    Objects.toString(sd2Var3);
                }
                sd2Var = this.g;
                hashSet = new HashSet(this.e.keySet());
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((wd2) it.next()).a(sd2Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (r4.g == yads.sd2.d) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        boolean z;
        qu2 a = this.b.a(this.a);
        synchronized (this.f) {
            z = true;
            if (a != null) {
                try {
                    if (a.h) {
                        sd2 sd2Var = this.g;
                        if (sd2Var != sd2.b) {
                            if (sd2Var == sd2.d) {
                            }
                            z = false;
                        }
                    }
                } finally {
                }
            }
        }
        return z;
    }

    public final void a(wd2 wd2Var) {
        synchronized (this.f) {
            this.e.put(wd2Var, null);
            s3q0 s3q0Var = s3q0.a;
        }
    }
}
