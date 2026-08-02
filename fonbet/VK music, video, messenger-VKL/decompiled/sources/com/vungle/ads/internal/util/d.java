package com.vungle.ads.internal.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import xsna.s3q0;

/* loaded from: classes7.dex */
public final class d implements Application.ActivityLifecycleCallbacks {
    public static final d f = new d();
    public volatile int b;
    public volatile boolean c;
    public volatile c d;
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final CopyOnWriteArraySet e = new CopyOnWriteArraySet();

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((b) it.next()).b(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.b++;
        if (this.c || this.b != 1) {
            return;
        }
        this.c = true;
        c cVar = this.d;
        if (cVar != null) {
            Context context = (Context) cVar.b().get();
            if (context != null) {
                a.a(context, cVar.c(), cVar.d(), cVar.a());
            }
            this.d = null;
        }
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((b) it.next()).b();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.b--;
        if (this.c && this.b == 0) {
            this.c = false;
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((b) it.next()).a();
            }
        }
    }

    public static final boolean a(d dVar, Context context, Intent intent, Intent intent2, com.vungle.ads.internal.ui.m mVar) {
        dVar.getClass();
        try {
            if (intent != null) {
                context.startActivity(intent);
                if (mVar != null) {
                    mVar.a(true);
                }
            } else {
                if (intent2 == null) {
                    return false;
                }
                context.startActivity(intent2);
            }
        } catch (Exception e) {
            boolean z = u.a;
            t.b("ActivityManager", "Failed to start activity: " + e);
            if (intent != null && mVar != null) {
                try {
                    mVar.a(false);
                } catch (Exception unused) {
                    return false;
                }
            }
            if (intent != null && intent2 != null) {
                context.startActivity(intent2);
            }
            return false;
        }
        return true;
    }

    public static final void a(d dVar, Context context) {
        Object failure;
        if (dVar.a.getAndSet(true)) {
            return;
        }
        try {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(dVar);
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            boolean z = u.a;
            t.a("ActivityManager", "Error initializing ActivityManager", a);
            dVar.a.set(false);
        }
    }

    public static final boolean a(d dVar) {
        return !dVar.a.get() || dVar.c;
    }

    public static final void a(d dVar, b bVar) {
        dVar.e.add(bVar);
    }

    public final void a(b bVar) {
        this.e.remove(bVar);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
