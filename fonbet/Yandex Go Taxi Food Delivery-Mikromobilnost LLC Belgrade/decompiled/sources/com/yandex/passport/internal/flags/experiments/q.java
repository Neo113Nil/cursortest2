package com.yandex.passport.internal.flags.experiments;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.core.app.JobIntentService;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.common.permission.Permission;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.d6z;
import defpackage.hjt;
import defpackage.jl40;
import defpackage.qke;
import defpackage.s8o;
import defpackage.tje;
import defpackage.w511;
import kotlin.Pair;

/* loaded from: classes8.dex */
public final class q {
    public static final long e = com.yandex.passport.common.util.a.k(0, 247);
    public static final long f = com.yandex.passport.common.util.a.k(3, 239);
    public static final long g = com.yandex.passport.common.util.a.k(1, 239);
    public static final /* synthetic */ int h = 0;
    public final g a;
    public final com.yandex.passport.common.a b;
    public final com.yandex.passport.common.permission.c c;
    public final o d;

    public q(g gVar, com.yandex.passport.common.a aVar, com.yandex.passport.common.permission.c cVar, o oVar) {
        this.a = gVar;
        this.b = aVar;
        this.c = cVar;
        this.d = oVar;
    }

    public final void a(ExperimentsUpdater$LoadingStrategy experimentsUpdater$LoadingStrategy, Environment environment) {
        long b;
        long b2;
        this.b.getClass();
        long a = com.yandex.passport.common.a.a();
        g gVar = this.a;
        SharedPreferences sharedPreferences = gVar.a;
        SharedPreferences sharedPreferences2 = gVar.a;
        b = com.yandex.passport.common.time.a.b(0L, 0L, 0L, sharedPreferences.getLong("__last__updated__time", 0L));
        boolean e2 = com.yandex.passport.common.time.a.e(b, 0L);
        long j = a - b;
        int i = p.a[experimentsUpdater$LoadingStrategy.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    w511.b();
                    return;
                } else if (!e2) {
                    long j2 = f;
                    if (jl40.r(j, j2) <= 0 && (jl40.r(a, j2) >= 0 || jl40.r(a, b) >= 0)) {
                        return;
                    }
                }
            } else if (!e2 && jl40.r(j, e) <= 0) {
                return;
            }
        }
        if (experimentsUpdater$LoadingStrategy != ExperimentsUpdater$LoadingStrategy.FORCED) {
            long a2 = com.yandex.passport.common.a.a();
            b2 = com.yandex.passport.common.time.a.b(0L, 0L, 0L, sharedPreferences2.getLong("__last__enqueue__time", 0L));
            if (jl40.r(a2 - b2, g) < 0) {
                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "doEnqueue was called less than one hour ago", 8);
                    return;
                }
                return;
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = sharedPreferences2.edit();
        edit.putLong("__last__enqueue__time", currentTimeMillis);
        edit.apply();
        Permission permission = Permission.WAKE_LOCK;
        com.yandex.passport.common.permission.b bVar = com.yandex.passport.common.permission.c.b;
        Context context = this.c.a;
        bVar.getClass();
        int h2 = qke.h(context, permission.getPermissionString());
        o oVar = this.d;
        if (h2 == 0) {
            Context context2 = (Context) oVar.a;
            JobIntentService.enqueueWork(context2, (Class<?>) FetchExperimentsService.class, 542962, d6z.B(context2, FetchExperimentsService.class, s8o.d(new Pair[]{new Pair(WebViewActivity.KEY_ENVIRONMENT, environment)})));
            return;
        }
        com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "WAKE_LOCK permission is not enabled", 8);
        }
        ((com.yandex.passport.common.coroutine.e) oVar.b).getClass();
        tje.N(hjt.a, ((com.yandex.passport.common.coroutine.b) ((com.yandex.passport.common.coroutine.a) oVar.c)).d, null, new ExperimentsUpdater$UpdateEnqueuePerformer$enqueueWithCoroutine$1(environment, null), 2);
    }
}
