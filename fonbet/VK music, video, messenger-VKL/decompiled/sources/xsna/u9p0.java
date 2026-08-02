package xsna;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: TopicsSyncTask.java */
/* loaded from: classes13.dex */
public final class u9p0 implements Runnable {
    public static final Object g = new Object();
    public static Boolean h;
    public static Boolean i;
    public final Context b;
    public final gi20 c;
    public final PowerManager.WakeLock d;
    public final t9p0 e;
    public final long f;

    /* compiled from: TopicsSyncTask.java */
    public class a extends BroadcastReceiver {

        @Nullable
        public u9p0 a;

        @Override // android.content.BroadcastReceiver
        public final synchronized void onReceive(Context context, Intent intent) {
            u9p0 u9p0Var = this.a;
            if (u9p0Var == null) {
                return;
            }
            if (u9p0Var.c()) {
                u9p0 u9p0Var2 = this.a;
                u9p0Var2.e.f.schedule(u9p0Var2, 0L, TimeUnit.SECONDS);
                context.unregisterReceiver(this);
                this.a = null;
            }
        }
    }

    public u9p0(t9p0 t9p0Var, Context context, gi20 gi20Var, long j) {
        this.e = t9p0Var;
        this.b = context;
        this.f = j;
        this.c = gi20Var;
        this.d = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean booleanValue;
        synchronized (g) {
            try {
                Boolean bool = i;
                booleanValue = bool == null ? bool != null ? bool.booleanValue() : context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 : bool.booleanValue();
                i = Boolean.valueOf(booleanValue);
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public static boolean b(Context context) {
        boolean booleanValue;
        synchronized (g) {
            try {
                Boolean bool = h;
                booleanValue = bool == null ? bool != null ? bool.booleanValue() : context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0 : bool.booleanValue();
                h = Boolean.valueOf(booleanValue);
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public final synchronized boolean c() {
        boolean z;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.b.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                z = activeNetworkInfo.isConnected();
            }
        } catch (Throwable th) {
            throw th;
        }
        return z;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public final void run() {
        t9p0 t9p0Var = this.e;
        Context context = this.b;
        boolean b = b(context);
        PowerManager.WakeLock wakeLock = this.d;
        if (b) {
            wakeLock.acquire(o5j.a);
        }
        try {
            try {
                try {
                    t9p0Var.d(true);
                    if (!this.c.c()) {
                        t9p0Var.d(false);
                        if (b(context)) {
                            try {
                                wakeLock.release();
                                return;
                            } catch (RuntimeException unused) {
                                return;
                            }
                        }
                        return;
                    }
                    if (!a(context) || c()) {
                        if (t9p0Var.e()) {
                            t9p0Var.d(false);
                        } else {
                            t9p0Var.f(this.f);
                        }
                        if (b(context)) {
                            wakeLock.release();
                            return;
                        }
                        return;
                    }
                    a aVar = new a();
                    aVar.a = this;
                    context.registerReceiver(aVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    if (b(context)) {
                        try {
                            wakeLock.release();
                        } catch (RuntimeException unused2) {
                        }
                    }
                } catch (IOException e) {
                    Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e.getMessage());
                    t9p0Var.d(false);
                    if (b(context)) {
                        wakeLock.release();
                    }
                }
            } catch (RuntimeException unused3) {
            }
        } catch (Throwable th) {
            if (b(context)) {
                try {
                    wakeLock.release();
                } catch (RuntimeException unused4) {
                }
            }
            throw th;
        }
    }
}
