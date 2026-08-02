package com.yandex.passport.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.yandex.passport.common.exception.InvalidTokenException;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.data.exceptions.FailedResponseException;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import defpackage.bvf0;
import defpackage.jl40;
import defpackage.lfx;
import defpackage.qke;
import defpackage.qoi0;
import defpackage.scc;
import defpackage.tje;
import defpackage.uyj;
import io.appmetrica.analytics.IReporterYandex;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes8.dex */
public abstract class s {
    public static final List a = scc.g("ru.rutaxi.vezet", "ru.rutaxi.vezet.beta", "ru.rutaxi.vezet.develop", "ru.rutaxi.vezet.debug", "com.its.rto", "com.its.rto.beta", "com.its.rto.develop", "com.its.rto.debug", "ru.yandex.vezet", "ru.yandex.vezet.develop", "ru.yandex.vezet.debug");

    public static boolean a(Context context, IReporterYandex iReporterYandex) {
        int i = 1;
        if (com.yandex.passport.common.util.a.d(context)) {
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "minification Check: application is debuggable", 8);
                return true;
            }
        } else {
            if (!com.yandex.passport.internal.ui.sloth.e.k()) {
                com.yandex.passport.internal.analytics.l lVar = com.yandex.passport.internal.analytics.l.f;
                IllegalStateException illegalStateException = new IllegalStateException("Release application is not minified");
                c(iReporterYandex, lVar, illegalStateException);
                new Handler(Looper.getMainLooper()).post(new n(i, illegalStateException));
                return false;
            }
            com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "minification Check: passed", 8);
            }
        }
        return true;
    }

    public static void b(Context context, IReporterYandex iReporterYandex) {
        com.yandex.passport.common.util.a.a = context.getApplicationContext();
        tje.N(bvf0.a(uyj.a.plus(com.yandex.passport.internal.util.p.o("RuntimeChecks"))), null, null, new PassportInitialization$runtimeChecks$1(context, iReporterYandex, null), 3);
    }

    public static void c(IReporterYandex iReporterYandex, com.yandex.passport.internal.analytics.m mVar, Exception exc) {
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.b(LogLevel.DEBUG, null, "sendErrorToMetrica: " + mVar, exc);
        }
        iReporterYandex.reportError(mVar.a, exc);
    }

    public static void d(PassportProcessGlobalComponent passportProcessGlobalComponent, b bVar) {
        boolean y;
        com.yandex.passport.internal.core.sync.a syncHelper = passportProcessGlobalComponent.getSyncHelper();
        com.yandex.passport.internal.core.accounts.a accountSynchronizer = passportProcessGlobalComponent.getAccountSynchronizer();
        Context context = syncHelper.a;
        if (qke.h(context, "android.permission.READ_SYNC_SETTINGS") == 0 && qke.h(context, "android.permission.WRITE_SYNC_SETTINGS") == 0) {
            Iterator it = bVar.f().iterator();
            while (it.hasNext()) {
                ModernAccount modernAccount = (ModernAccount) it.next();
                if (jl40.r(com.yandex.passport.common.a.a() - modernAccount.m297getRetrievalTimeR7zlAxo(), syncHelper.c) > 0) {
                    lfx[] lfxVarArr = {qoi0.a(IOException.class), qoi0.a(JSONException.class), qoi0.a(InvalidTokenException.class), qoi0.a(FailedResponseException.class)};
                    try {
                        accountSynchronizer.a(modernAccount.getAccount(), false);
                    } finally {
                        if (y) {
                        }
                    }
                } else {
                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "account synchronization on startup not required", 8);
                    }
                }
            }
            return;
        }
        com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "manual synchronization on startup is using because we don't have required sync permissions", 8);
        }
        Iterator it2 = bVar.b().iterator();
        while (it2.hasNext()) {
            Account account = (Account) it2.next();
            try {
                accountSynchronizer.a(account, false);
            } catch (InvalidTokenException e) {
                com.yandex.passport.common.logger.c cVar3 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.b(LogLevel.DEBUG, null, "account synchronization on startup is failed, account=" + account, e);
                }
            } catch (FailedResponseException e2) {
                com.yandex.passport.common.logger.c cVar4 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.b(LogLevel.DEBUG, null, "account synchronization on startup is failed, account=" + account, e2);
                }
            } catch (IOException e3) {
                com.yandex.passport.common.logger.c cVar5 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.b(LogLevel.DEBUG, null, "account synchronization on startup is failed, account=" + account, e3);
                }
            } catch (JSONException e4) {
                com.yandex.passport.common.logger.c cVar6 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.b(LogLevel.DEBUG, null, "account synchronization on startup is failed, account=" + account, e4);
                }
            }
        }
    }
}
