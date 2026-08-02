package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;
import xsna.hzg0;

/* compiled from: EncryptedPreference.kt */
/* loaded from: classes.dex */
public final class pjp {
    public static hzg0 a;
    public static volatile boolean b;
    public static final ReentrantLock c = new ReentrantLock();
    public static Future<?> d;

    public static String a(String str) {
        Future<?> future = d;
        if (future != null) {
            future.get();
        }
        hzg0 hzg0Var = a;
        if (hzg0Var == null) {
            hzg0Var = null;
        }
        return hzg0Var.getString(str, null);
    }

    public static void b(final Context context, ExecutorService executorService, boolean z) {
        ReentrantLock reentrantLock = c;
        reentrantLock.lock();
        try {
            if (b) {
                reentrantLock.unlock();
                return;
            }
            final hzg0 hzg0Var = new hzg0(context, "EncryptedPreference2");
            if (z) {
                d = executorService.submit(new Runnable() { // from class: xsna.njp
                    @Override // java.lang.Runnable
                    public final void run() {
                        new qjp(context).a("EncryptedPreference2", new h2a(1), hzg0Var);
                    }
                });
            }
            executorService.submit(new Runnable() { // from class: xsna.ojp
                @Override // java.lang.Runnable
                public final void run() {
                    hzg0 hzg0Var2 = hzg0.this;
                    hzg0Var2.a();
                    hzg0Var2.b();
                }
            });
            a = hzg0Var;
            b = true;
            s3q0 s3q0Var = s3q0.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static void c(String str, String str2) {
        Future<?> future = d;
        if (future != null) {
            future.get();
        }
        hzg0 hzg0Var = a;
        if (hzg0Var == null) {
            hzg0Var = null;
        }
        SharedPreferences.Editor edit = hzg0Var.edit();
        if (str2 != null) {
            ((hzg0.b) edit).putString(str, str2);
        } else {
            ((hzg0.b) edit).remove(str);
        }
        ((hzg0.b) edit).apply();
    }
}
