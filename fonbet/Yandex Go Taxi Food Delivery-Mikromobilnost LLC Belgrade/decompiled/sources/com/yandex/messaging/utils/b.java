package com.yandex.messaging.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import defpackage.bvf0;
import defpackage.hjt;
import defpackage.jl40;
import defpackage.kgx;
import defpackage.kse;
import defpackage.pzt0;
import defpackage.qoi0;
import defpackage.rp3;
import defpackage.tje;
import defpackage.vse;
import defpackage.z83;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes15.dex */
public final class b {
    public static final /* synthetic */ kgx[] g;
    public final Context a;
    public final vse b;
    public final kse c;
    public final r0 d;
    public final a e;
    public final rp3 f;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("updateJob", 0, "getUpdateJob()Lkotlinx/coroutines/Job;", b.class);
        qoi0.a.getClass();
        g = new kgx[]{mutablePropertyReference1Impl};
    }

    public b(Context context, vse vseVar, kse kseVar) {
        this.a = context;
        this.b = vseVar;
        this.c = kseVar;
        r0 c = bvf0.c(Boolean.FALSE);
        this.d = c;
        this.e = new a(c);
        this.f = new rp3();
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.yandex.messaging.utils.AppForegroundStatusProvider$1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                b bVar = b.this;
                kgx[] kgxVarArr = b.g;
                bVar.b();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                b bVar = b.this;
                kgx[] kgxVarArr = b.g;
                bVar.b();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                b bVar = b.this;
                kgx[] kgxVarArr = b.g;
                bVar.b();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                b bVar = b.this;
                kgx[] kgxVarArr = b.g;
                bVar.b();
            }
        });
        b();
    }

    public final boolean a() {
        this.c.getClass();
        Looper.myLooper();
        Looper.getMainLooper();
        z83.i();
        Context context = this.a;
        if (!((KeyguardManager) context.getSystemService("keyguard")).isKeyguardLocked()) {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
            ArrayList arrayList = new ArrayList();
            for (Object obj : runningAppProcesses) {
                if (((ActivityManager.RunningAppProcessInfo) obj).importance == 100) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    for (String str : ((ActivityManager.RunningAppProcessInfo) it.next()).pkgList) {
                        if (jl40.l(str, context.getPackageName())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void b() {
        this.b.getClass();
        pzt0 N = tje.N(hjt.a, this.c.c, null, new AppForegroundStatusProvider$updateStatus$1(this, null), 2);
        kgx kgxVar = g[0];
        this.f.a(N);
    }
}
