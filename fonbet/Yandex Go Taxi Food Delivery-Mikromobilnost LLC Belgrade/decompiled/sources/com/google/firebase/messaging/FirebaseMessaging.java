package com.google.firebase.messaging;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.a;
import com.google.android.gms.cloudmessaging.d;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;
import com.google.firebase.messaging.FirebaseMessaging;
import defpackage.atx0;
import defpackage.bb1;
import defpackage.c32;
import defpackage.cvw;
import defpackage.e89;
import defpackage.hcr;
import defpackage.iy2;
import defpackage.kbs;
import defpackage.l1d;
import defpackage.lxj;
import defpackage.lz10;
import defpackage.ndi0;
import defpackage.o370;
import defpackage.s59;
import defpackage.t26;
import defpackage.tig0;
import defpackage.u820;
import defpackage.udq0;
import defpackage.v150;
import defpackage.vzu0;
import defpackage.w53;
import defpackage.xen;
import defpackage.ykj;
import defpackage.yuf0;
import defpackage.zoy0;
import defpackage.zvf0;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class FirebaseMessaging {
    public static o370 k;
    public static zvf0 l = new l1d(5);
    public static ScheduledThreadPoolExecutor m;
    public final com.google.firebase.a a;
    public final Context b;
    public final yuf0 c;
    public final tig0 d;
    public final lxj e;
    public final ScheduledThreadPoolExecutor f;
    public final ThreadPoolExecutor g;
    public final u820 h;
    public boolean i;
    public final Application.ActivityLifecycleCallbacks j;

    public FirebaseMessaging(com.google.firebase.a aVar, zvf0 zvf0Var, zvf0 zvf0Var2, hcr hcrVar, zvf0 zvf0Var3, vzu0 vzu0Var) {
        aVar.a();
        Context context = aVar.a;
        final u820 u820Var = new u820(context);
        final yuf0 yuf0Var = new yuf0(aVar, u820Var, zvf0Var, zvf0Var2, hcrVar);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new v150("Firebase-Messaging-Task"));
        final int i = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new v150("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new v150("Firebase-Messaging-File-Io"));
        final int i2 = 0;
        this.i = false;
        l = zvf0Var3;
        this.a = aVar;
        this.e = new lxj(this, vzu0Var);
        aVar.a();
        final Context context2 = aVar.a;
        this.b = context2;
        FcmLifecycleCallbacks fcmLifecycleCallbacks = new FcmLifecycleCallbacks();
        this.h = u820Var;
        this.c = yuf0Var;
        this.d = new tig0(newSingleThreadExecutor);
        this.f = scheduledThreadPoolExecutor;
        this.g = threadPoolExecutor;
        aVar.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(fcmLifecycleCallbacks);
        } else {
            Objects.toString(context);
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: jcr
            public final /* synthetic */ FirebaseMessaging b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzw o;
                int i3 = i2;
                FirebaseMessaging firebaseMessaging = this.b;
                switch (i3) {
                    case 0:
                        if (firebaseMessaging.e.g() && firebaseMessaging.i(firebaseMessaging.e())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.i) {
                                    firebaseMessaging.h(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        final Context context3 = firebaseMessaging.b;
                        bb1.w(context3);
                        yuf0 yuf0Var2 = firebaseMessaging.c;
                        final boolean g = firebaseMessaging.g();
                        SharedPreferences v = sb2.v(context3);
                        if (!v.contains("proxy_retention") || v.getBoolean("proxy_retention", false) != g) {
                            a aVar2 = (a) yuf0Var2.c;
                            if (aVar2.c.j() >= 241100000) {
                                Bundle bundle = new Bundle();
                                bundle.putBoolean("proxy_retention", g);
                                o = d.a(aVar2.b).b(4, bundle);
                            } else {
                                o = udq0.o(new IOException("SERVICE_NOT_AVAILABLE"));
                            }
                            o.g(new b43(1), new t070() { // from class: axf0
                                @Override // defpackage.t070
                                public final void onSuccess(Object obj) {
                                    SharedPreferences.Editor edit = sb2.v(context3).edit();
                                    edit.putBoolean("proxy_retention", g);
                                    edit.apply();
                                }
                            });
                        }
                        if (firebaseMessaging.g()) {
                            firebaseMessaging.f();
                            return;
                        }
                        return;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new v150("Firebase-Messaging-Topics-Io"));
        udq0.h(scheduledThreadPoolExecutor2, new Callable() { // from class: cxz0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                bxz0 bxz0Var;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                u820 u820Var2 = u820Var;
                yuf0 yuf0Var2 = yuf0Var;
                synchronized (bxz0.class) {
                    try {
                        WeakReference weakReference = bxz0.b;
                        bxz0 bxz0Var2 = weakReference != null ? (bxz0) weakReference.get() : null;
                        if (bxz0Var2 == null) {
                            SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                            bxz0Var = new bxz0();
                            synchronized (bxz0Var) {
                                bxz0Var.a = oo2.f(sharedPreferences, scheduledThreadPoolExecutor3);
                            }
                            bxz0.b = new WeakReference(bxz0Var);
                        } else {
                            bxz0Var = bxz0Var2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new dxz0(firebaseMessaging, u820Var2, bxz0Var, yuf0Var2, context3, scheduledThreadPoolExecutor3);
            }
        }).g(scheduledThreadPoolExecutor, new s59(this));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: jcr
            public final /* synthetic */ FirebaseMessaging b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzw o;
                int i3 = i;
                FirebaseMessaging firebaseMessaging = this.b;
                switch (i3) {
                    case 0:
                        if (firebaseMessaging.e.g() && firebaseMessaging.i(firebaseMessaging.e())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.i) {
                                    firebaseMessaging.h(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        final Context context3 = firebaseMessaging.b;
                        bb1.w(context3);
                        yuf0 yuf0Var2 = firebaseMessaging.c;
                        final boolean g = firebaseMessaging.g();
                        SharedPreferences v = sb2.v(context3);
                        if (!v.contains("proxy_retention") || v.getBoolean("proxy_retention", false) != g) {
                            a aVar2 = (a) yuf0Var2.c;
                            if (aVar2.c.j() >= 241100000) {
                                Bundle bundle = new Bundle();
                                bundle.putBoolean("proxy_retention", g);
                                o = d.a(aVar2.b).b(4, bundle);
                            } else {
                                o = udq0.o(new IOException("SERVICE_NOT_AVAILABLE"));
                            }
                            o.g(new b43(1), new t070() { // from class: axf0
                                @Override // defpackage.t070
                                public final void onSuccess(Object obj) {
                                    SharedPreferences.Editor edit = sb2.v(context3).edit();
                                    edit.putBoolean("proxy_retention", g);
                                    edit.apply();
                                }
                            });
                        }
                        if (firebaseMessaging.g()) {
                            firebaseMessaging.f();
                            return;
                        }
                        return;
                }
            }
        });
    }

    public static void b(long j, Runnable runnable) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (m == null) {
                    m = new ScheduledThreadPoolExecutor(1, new v150("TAG"));
                }
                m.schedule(runnable, j, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized o370 c(Context context) {
        o370 o370Var;
        synchronized (FirebaseMessaging.class) {
            try {
                if (k == null) {
                    k = new o370(context, 18);
                }
                o370Var = k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return o370Var;
    }

    public static synchronized FirebaseMessaging getInstance(com.google.firebase.a aVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) aVar.b(FirebaseMessaging.class);
            cvw.m(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public final String a() {
        Task task;
        ndi0 e = e();
        if (!i(e)) {
            return (String) e.b;
        }
        String b = u820.b(this.a);
        tig0 tig0Var = this.d;
        synchronized (tig0Var) {
            task = (Task) ((w53) tig0Var.b).get(b);
            if (task != null) {
                Log.isLoggable("FirebaseMessaging", 3);
            } else {
                Log.isLoggable("FirebaseMessaging", 3);
                yuf0 yuf0Var = this.c;
                int i = 8;
                task = yuf0Var.t(yuf0Var.O(u820.b((com.google.firebase.a) yuf0Var.a), "*", new Bundle())).q(this.g, new t26(i, this, b, e)).i((Executor) tig0Var.a, new e89(i, tig0Var, b));
                ((w53) tig0Var.b).put(b, task);
            }
        }
        try {
            return (String) udq0.f(task);
        } catch (InterruptedException | ExecutionException e2) {
            kbs.r(e2);
            return null;
        }
    }

    public final zzw d() {
        atx0 atx0Var = new atx0();
        this.f.execute(new iy2(14, this, atx0Var));
        return atx0Var.a;
    }

    public final ndi0 e() {
        ndi0 b;
        o370 c = c(this.b);
        com.google.firebase.a aVar = this.a;
        aVar.a();
        String f = "[DEFAULT]".equals(aVar.b) ? "" : aVar.f();
        String b2 = u820.b(this.a);
        synchronized (c) {
            b = ndi0.b(((SharedPreferences) c.a).getString(f + "|T|" + b2 + "|*", null));
        }
        return b;
    }

    public final void f() {
        com.google.android.gms.cloudmessaging.a aVar = (com.google.android.gms.cloudmessaging.a) this.c.c;
        (aVar.c.j() >= 241100000 ? com.google.android.gms.cloudmessaging.d.a(aVar.b).c(5, Bundle.EMPTY).h(ykj.w, zoy0.y) : udq0.o(new IOException("SERVICE_NOT_AVAILABLE"))).g(this.f, new xen(10, this));
    }

    public final boolean g() {
        Context context = this.b;
        bb1.w(context);
        if (Binder.getCallingUid() != context.getApplicationInfo().uid) {
            Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
            return false;
        }
        if ("com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
            Log.isLoggable("FirebaseMessaging", 3);
            if (this.a.b(c32.class) != null) {
                return true;
            }
            if (lz10.a() && l != null) {
                return true;
            }
        }
        return false;
    }

    public final synchronized void h(long j) {
        b(j, new b(this, Math.min(Math.max(30L, 2 * j), 28800L)));
        this.i = true;
    }

    public final boolean i(ndi0 ndi0Var) {
        if (ndi0Var != null) {
            return System.currentTimeMillis() > ndi0Var.a + 604800000 || !this.h.a().equals((String) ndi0Var.c);
        }
        return true;
    }
}
