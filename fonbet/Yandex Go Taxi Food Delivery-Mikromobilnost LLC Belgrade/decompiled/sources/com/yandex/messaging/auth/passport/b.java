package com.yandex.messaging.auth.passport;

import android.content.Context;
import android.net.Uri;
import com.yandex.passport.api.e;
import com.yandex.passport.api.exception.PassportException;
import com.yandex.passport.api.i;
import com.yandex.passport.internal.impl.f;
import com.yandex.passport.internal.impl.g;
import com.yandex.passport.internal.m;
import com.yandex.passport.internal.provider.communication.p;
import com.yandex.passport.internal.report.kd;
import com.yandex.passport.internal.report.od;
import com.yandex.passport.internal.s;
import defpackage.ny61;
import defpackage.pl3;
import defpackage.tcc;
import defpackage.tje;
import defpackage.uja1;
import defpackage.uqb1;
import defpackage.vh3;
import defpackage.wfa1;
import defpackage.wl3;
import defpackage.zy11;
import io.appmetrica.analytics.IReporterYandex;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class b {
    public final Context a;
    public final f b;
    public final e c;

    public b(Context context) {
        this.a = context;
        IReporterYandex b = od.b(context);
        Thread.setDefaultUncaughtExceptionHandler(new m(new kd(context, b)));
        s.b(context, b);
        if (p.a == null) {
            p.a = p.a();
        }
        f fVar = new f(context.getApplicationContext(), b);
        this.b = fVar;
        this.c = (g) fVar.f.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object b(b bVar, ContinuationImpl continuationImpl) {
        PassportAuthApi$disableVpnBlocker$1 passportAuthApi$disableVpnBlocker$1;
        int i;
        if (continuationImpl instanceof PassportAuthApi$disableVpnBlocker$1) {
            passportAuthApi$disableVpnBlocker$1 = (PassportAuthApi$disableVpnBlocker$1) continuationImpl;
            int i2 = passportAuthApi$disableVpnBlocker$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                passportAuthApi$disableVpnBlocker$1.label = i2 - Integer.MIN_VALUE;
                Object obj = passportAuthApi$disableVpnBlocker$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = passportAuthApi$disableVpnBlocker$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                f fVar = bVar.b;
                passportAuthApi$disableVpnBlocker$1.label = 1;
                Object C = fVar.C(passportAuthApi$disableVpnBlocker$1);
                return C == coroutineSingletons ? coroutineSingletons : C;
            }
        }
        passportAuthApi$disableVpnBlocker$1 = new PassportAuthApi$disableVpnBlocker$1(bVar, continuationImpl);
        Object obj2 = passportAuthApi$disableVpnBlocker$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = passportAuthApi$disableVpnBlocker$1.label;
        if (i == 0) {
        }
    }

    public final void a(wl3 wl3Var, Uri uri) {
        Object value = ((Result) tje.Y(EmptyCoroutineContext.a, new PassportAuthApi$acceptAuthInTrack$1(this, wl3Var, uri, null))).getValue();
        if (!(value instanceof Result.Failure)) {
            ((Boolean) value).getClass();
            value = zy11.a;
        }
        Throwable a = Result.a(value);
        if (a == null) {
            return;
        }
        if (!(a instanceof PassportException)) {
            throw a;
        }
        throw wfa1.d((PassportException) a);
    }

    public final void c(String str) {
        Throwable a = Result.a(((Result) tje.Y(EmptyCoroutineContext.a, new PassportAuthApi$dropToken$1(this, str, null))).getValue());
        if (a == null) {
            return;
        }
        if (!(a instanceof PassportException)) {
            throw a;
        }
        throw wfa1.d((PassportException) a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.Result$Failure] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    public final List d(vh3 vh3Var) {
        ?? failure;
        Object value = ((Result) tje.Y(EmptyCoroutineContext.a, new PassportAuthApi$getAccounts$1(this, vh3Var, null))).getValue();
        if (!(value instanceof Result.Failure)) {
            try {
                List list = (List) value;
                failure = new ArrayList(tcc.n(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    failure.add(uja1.a((i) it.next()));
                }
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            value = failure;
        }
        Throwable a = Result.a(value);
        if (a == null) {
            return (List) value;
        }
        if (a instanceof PassportException) {
            throw wfa1.d((PassportException) a);
        }
        throw a;
    }

    public final pl3 e(wl3 wl3Var) {
        Object value = ((Result) tje.Y(EmptyCoroutineContext.a, new PassportAuthApi$getToken$1(this, wl3Var, null))).getValue();
        Throwable a = Result.a(value);
        if (a == null) {
            return uqb1.f(((com.yandex.passport.api.f) value).a);
        }
        if (a instanceof PassportException) {
            throw wfa1.d((PassportException) a);
        }
        throw a;
    }
}
