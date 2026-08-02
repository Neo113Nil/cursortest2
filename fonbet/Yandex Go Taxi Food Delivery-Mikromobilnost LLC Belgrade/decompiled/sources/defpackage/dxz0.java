package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.c;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class dxz0 {
    public final Context a;
    public final u820 b;
    public final yuf0 c;
    public final FirebaseMessaging d;
    public final ScheduledThreadPoolExecutor f;
    public final bxz0 h;
    public final w53 e = new w53();
    public boolean g = false;

    public dxz0(FirebaseMessaging firebaseMessaging, u820 u820Var, bxz0 bxz0Var, yuf0 yuf0Var, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.d = firebaseMessaging;
        this.b = u820Var;
        this.h = bxz0Var;
        this.c = yuf0Var;
        this.a = context;
        this.f = scheduledThreadPoolExecutor;
    }

    public static void a(Task task) {
        try {
            udq0.g(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e) {
            dac.g("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            kbs.r(e2);
        }
    }

    public final void b(String str) {
        String a = this.d.a();
        yuf0 yuf0Var = this.c;
        yuf0Var.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(yuf0Var.t(yuf0Var.O(a, "/topics/" + str, bundle)));
    }

    public final void c(String str) {
        String a = this.d.a();
        yuf0 yuf0Var = this.c;
        yuf0Var.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        a(yuf0Var.t(yuf0Var.O(a, "/topics/" + str, bundle)));
    }

    public final synchronized void d(boolean z) {
        this.g = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e() {
        axz0 a;
        bxz0 bxz0Var;
        while (true) {
            synchronized (this) {
                try {
                    a = this.h.a();
                    if (a == null) {
                        Log.isLoggable("FirebaseMessaging", 3);
                        return true;
                    }
                } finally {
                }
            }
            try {
                String str = a.b;
                String str2 = a.a;
                int hashCode = str.hashCode();
                if (hashCode != 83) {
                    if (hashCode == 85 && str.equals("U")) {
                        c(str2);
                        Log.isLoggable("FirebaseMessaging", 3);
                        bxz0Var = this.h;
                        synchronized (bxz0Var) {
                            oo2 oo2Var = bxz0Var.a;
                            String str3 = a.c;
                            synchronized (((ArrayDeque) oo2Var.w)) {
                                if (((ArrayDeque) oo2Var.w).remove(str3)) {
                                    ((ScheduledThreadPoolExecutor) oo2Var.x).execute(new mmp0(16, oo2Var));
                                }
                            }
                        }
                        synchronized (this.e) {
                            try {
                                String str4 = a.c;
                                if (this.e.containsKey(str4)) {
                                    ArrayDeque arrayDeque = (ArrayDeque) this.e.get(str4);
                                    atx0 atx0Var = (atx0) arrayDeque.poll();
                                    if (atx0Var != null) {
                                        atx0Var.a(null);
                                    }
                                    if (arrayDeque.isEmpty()) {
                                        this.e.remove(str4);
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    Log.isLoggable("FirebaseMessaging", 3);
                    bxz0Var = this.h;
                    synchronized (bxz0Var) {
                    }
                } else {
                    if (str.equals("S")) {
                        b(str2);
                        Log.isLoggable("FirebaseMessaging", 3);
                        bxz0Var = this.h;
                        synchronized (bxz0Var) {
                        }
                    }
                    Log.isLoggable("FirebaseMessaging", 3);
                    bxz0Var = this.h;
                    synchronized (bxz0Var) {
                    }
                }
            } catch (IOException e) {
                if (!"SERVICE_NOT_AVAILABLE".equals(e.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(e.getMessage()) && !"TOO_MANY_SUBSCRIBERS".equals(e.getMessage())) {
                    if (e.getMessage() != null) {
                        throw e;
                    }
                    Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                    return false;
                }
                Log.e("FirebaseMessaging", "Topic operation failed: " + e.getMessage() + ". Will retry Topic operation.");
                return false;
            }
        }
    }

    public final void f(long j) {
        this.f.schedule(new c(this, this.a, this.b, Math.min(Math.max(30L, 2 * j), 28800L)), j, TimeUnit.SECONDS);
        d(true);
    }
}
