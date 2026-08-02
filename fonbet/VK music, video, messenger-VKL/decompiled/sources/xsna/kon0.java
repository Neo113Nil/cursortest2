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
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: SyncTask.java */
/* loaded from: classes.dex */
public final class kon0 implements Runnable {
    public final long b;
    public final PowerManager.WakeLock c;
    public final FirebaseMessaging d;

    @SuppressLint({"ThreadPoolCreation"})
    public final ThreadPoolExecutor e = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zt50("firebase-iid-executor"));

    /* compiled from: SyncTask.java */
    /* loaded from: classes13.dex */
    public static class a extends BroadcastReceiver {

        @Nullable
        public kon0 a;

        public a(kon0 kon0Var) {
            this.a = kon0Var;
        }

        public final void a() {
            this.a.d.d.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            kon0 kon0Var = this.a;
            if (kon0Var != null && kon0Var.a()) {
                kon0 kon0Var2 = this.a;
                kon0Var2.d.getClass();
                FirebaseMessaging.c(0L, kon0Var2);
                this.a.d.d.unregisterReceiver(this);
                this.a = null;
            }
        }
    }

    @SuppressLint({"InvalidWakeLockTag"})
    public kon0(FirebaseMessaging firebaseMessaging, long j) {
        this.d = firebaseMessaging;
        this.b = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.d.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.c = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public final boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.d.d.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final boolean b() throws IOException {
        try {
            if (this.d.a() != null) {
                return true;
            }
            Log.e("FirebaseMessaging", "Token retrieval failed: null");
            return false;
        } catch (IOException e) {
            String message = e.getMessage();
            if ("SERVICE_NOT_AVAILABLE".equals(message) || "INTERNAL_SERVER_ERROR".equals(message) || "InternalServerError".equals(message)) {
                e.getMessage();
                return false;
            }
            if (e.getMessage() == null) {
                return false;
            }
            throw e;
        } catch (SecurityException unused) {
            return false;
        }
    }

    @Override // java.lang.Runnable
    @SuppressLint({"WakelockTimeout"})
    public final void run() {
        PowerManager.WakeLock wakeLock = this.c;
        kri0 a2 = kri0.a();
        FirebaseMessaging firebaseMessaging = this.d;
        if (a2.c(firebaseMessaging.d)) {
            wakeLock.acquire();
        }
        try {
            try {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.l = true;
                }
                if (!firebaseMessaging.k.c()) {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.l = false;
                    }
                    if (kri0.a().c(firebaseMessaging.d)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (kri0.a().b(firebaseMessaging.d) && !a()) {
                    new a(this).a();
                    if (kri0.a().c(firebaseMessaging.d)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (b()) {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.l = false;
                    }
                } else {
                    firebaseMessaging.i(this.b);
                }
                if (kri0.a().c(firebaseMessaging.d)) {
                    wakeLock.release();
                }
            } catch (IOException e) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e.getMessage() + ". Won't retry the operation.");
                synchronized (firebaseMessaging) {
                    firebaseMessaging.l = false;
                    if (kri0.a().c(firebaseMessaging.d)) {
                        wakeLock.release();
                    }
                }
            }
        } catch (Throwable th) {
            if (kri0.a().c(firebaseMessaging.d)) {
                wakeLock.release();
            }
            throw th;
        }
    }
}
