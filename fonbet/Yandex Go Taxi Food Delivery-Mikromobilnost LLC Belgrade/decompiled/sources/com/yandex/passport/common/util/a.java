package com.yandex.passport.common.util;

import android.app.Application;
import android.content.Context;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.common.network.u;
import defpackage.b64;
import defpackage.d6z;
import defpackage.dvw;
import defpackage.f73;
import defpackage.j18;
import defpackage.nci0;
import defpackage.ny61;
import defpackage.tje;
import defpackage.wls;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes8.dex */
public abstract class a {
    public static Context a;

    public static final Object a(nci0 nci0Var, Continuation continuation) {
        IOException iOException;
        if (d(b())) {
            iOException = new IOException();
            iOException.setStackTrace((StackTraceElement[]) f73.n(1, iOException.getStackTrace().length, iOException.getStackTrace()));
        } else {
            iOException = null;
        }
        j18 j18Var = new j18(1, dvw.b(continuation));
        j18Var.u();
        nci0Var.I(new u(j18Var, iOException));
        j18Var.w(new d(0, nci0Var));
        Object s = j18Var.s();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s;
    }

    public static final Context b() {
        Application application;
        Context context = a;
        if (context != null) {
            return context;
        }
        try {
            application = (Application) Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", null).invoke(null, null);
        } catch (Throwable th) {
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "Error getting appCtx from reflection", th);
            }
            application = null;
        }
        if (application != null) {
            a = application;
            return application;
        }
        ny61.r("Unable to get appCtx");
        return null;
    }

    public static final boolean c(Context context) {
        return com.google.android.gms.common.a.d.d(context, com.google.android.gms.common.b.a) == 0;
    }

    public static final boolean d(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static final String e(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        return str;
    }

    public static final String f(String str) {
        return b64.k("[^\\x00-\\x7F]", str, "");
    }

    public static final Object g(wls wlsVar) {
        try {
            return j(new BlockingUtilKt$runBlockingCatching$1(wlsVar, null));
        } catch (TimeoutCancellationException e) {
            return new Result.Failure(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
    }

    public static final Object h(wls wlsVar) {
        try {
            return j(new BlockingUtilKt$runBlockingCatchingFlat$1(wlsVar, null));
        } catch (TimeoutCancellationException e) {
            return new Result.Failure(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
    }

    public static final Object i(wls wlsVar) {
        try {
            return d6z.d(tje.Y(EmptyCoroutineContext.a, new BlockingUtilKt$runBlockingSafe$1(wlsVar, null)));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return new Result.Failure(e);
        }
    }

    public static final Object j(wls wlsVar) {
        try {
            return ((Result) tje.Y(EmptyCoroutineContext.a, new BlockingUtilKt$runBlockingSafeFlat$1(wlsVar, null))).getValue();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return new Result.Failure(e);
        }
    }

    public static long k(int i, int i2) {
        int i3 = (i2 & 2) != 0 ? 0 : 1;
        int i4 = (i2 & 8) != 0 ? 0 : 1;
        if ((i2 & 16) != 0) {
            i = 0;
        }
        return com.yandex.passport.common.time.a.a((i3 * 744) + (i4 * 24) + i, 0, 0);
    }
}
