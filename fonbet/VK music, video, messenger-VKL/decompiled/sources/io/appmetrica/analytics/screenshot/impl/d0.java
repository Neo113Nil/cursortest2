package io.appmetrica.analytics.screenshot.impl;

import android.app.ActivityManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;
import xsna.epx;
import xsna.ox5;

/* loaded from: classes8.dex */
public final class d0 implements Runnable {
    public final /* synthetic */ g0 a;

    public d0(g0 g0Var) {
        this.a = g0Var;
    }

    public static final Boolean a(g0 g0Var, d0 d0Var, C5369n c5369n, ActivityManager activityManager) {
        Object obj;
        List<ActivityManager.RunningServiceInfo> runningServices = activityManager.getRunningServices(200);
        if (runningServices == null) {
            runningServices = EmptyList.b;
        }
        for (ActivityManager.RunningServiceInfo runningServiceInfo : runningServices) {
        }
        Iterator<T> it = runningServices.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((ActivityManager.RunningServiceInfo) obj).process, "com.android.systemui:screenshot")) {
                break;
            }
        }
        if (((ActivityManager.RunningServiceInfo) obj) != null) {
            ((C5378x) g0Var.b).a("ServiceScreenshotCaptor");
        }
        return Boolean.valueOf(g0Var.c.postDelayed(d0Var, TimeUnit.SECONDS.toMillis(c5369n.b)));
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5369n c5369n = this.a.e;
        if (this.a.d || c5369n == null || !c5369n.a) {
            return;
        }
        SystemServiceUtils.accessSystemServiceByNameSafely(this.a.a.getContext(), "activity", "running service screenshot captor", "ActivityManager", new ox5(this.a, this, c5369n));
    }
}
