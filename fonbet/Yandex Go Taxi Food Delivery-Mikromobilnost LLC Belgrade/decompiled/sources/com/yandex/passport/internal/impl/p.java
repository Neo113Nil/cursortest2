package com.yandex.passport.internal.impl;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import com.yandex.passport.R;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.exception.PassportAccountNotAuthorizedException;
import com.yandex.passport.api.exception.PassportAccountNotFoundException;
import com.yandex.passport.api.exception.PassportActionForbiddenException;
import com.yandex.passport.api.exception.PassportCredentialsNotFoundException;
import com.yandex.passport.api.exception.PassportIOException;
import com.yandex.passport.api.exception.PassportRuntimeUnknownException;
import com.yandex.passport.api.l2;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.credentials.ClientCredentials;
import com.yandex.passport.internal.credentials.Credentials;
import com.yandex.passport.internal.entities.ClientToken;
import com.yandex.passport.internal.methods.l0;
import com.yandex.passport.internal.methods.p1;
import com.yandex.passport.internal.methods.requester.CommonRequesterKt$requestMethodBlocking$1;
import com.yandex.passport.internal.methods.service.PassportMethodBinderService;
import com.yandex.passport.internal.methods.x0;
import com.yandex.passport.internal.properties.AuthorizationUrlProperties;
import defpackage.b64;
import defpackage.evu0;
import defpackage.g0c;
import defpackage.lfx;
import defpackage.qoi0;
import defpackage.x4e;
import io.appmetrica.analytics.IReporterYandex;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;

/* loaded from: classes15.dex */
public final class p implements a {
    public final IReporterYandex a;
    public final String b;
    public final boolean c;
    public final com.yandex.passport.internal.methods.requester.f d;
    public final j e;

    public p(Context context, IReporterYandex iReporterYandex) {
        this.a = iReporterYandex;
        String string = context.getResources().getString(R.string.passport_process_name);
        this.b = string;
        this.c = evu0.J(string);
        this.d = new com.yandex.passport.internal.methods.requester.f(context, new com.yandex.passport.common.network.u(context.getContentResolver(), com.yandex.passport.internal.util.p.l(context.getPackageName())), iReporterYandex);
        this.e = new j(new g(this));
    }

    public final void a(String str) {
        x();
        try {
            if (evu0.J(str)) {
                d(0L, "dropToken");
            }
            com.yandex.passport.internal.methods.requester.f fVar = this.d;
            l0 l0Var = new l0(new ClientToken(str, ""));
            lfx[] lfxVarArr = new lfx[0];
            if (!"robolectric".equals(Build.FINGERPRINT)) {
                Looper.getMainLooper();
                Looper.myLooper();
            }
            Object h = com.yandex.passport.common.util.a.h(new CommonRequesterKt$requestMethodBlocking$1(fVar, l0Var, null));
            lfx[] lfxVarArr2 = (lfx[]) Arrays.copyOf(lfxVarArr, 0);
            Throwable a = Result.a(h);
            if (a == null) {
                return;
            }
            for (lfx lfxVar : lfxVarArr2) {
                if (((g0c) lfxVar).e(a)) {
                    throw a;
                }
            }
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "catch non-PassportException from provider", a);
            }
            throw new PassportRuntimeUnknownException(a);
        } catch (RuntimeException e) {
            k(e);
            throw e;
        }
    }

    public final String b(AuthorizationUrlProperties authorizationUrlProperties) {
        x();
        try {
            com.yandex.passport.internal.methods.requester.f fVar = this.d;
            AuthorizationUrlProperties.Companion.getClass();
            x0 x0Var = new x0(com.yandex.passport.internal.properties.d.a(authorizationUrlProperties));
            lfx[] lfxVarArr = {qoi0.a(PassportAccountNotFoundException.class), qoi0.a(PassportAccountNotAuthorizedException.class), qoi0.a(PassportIOException.class)};
            if (!"robolectric".equals(Build.FINGERPRINT)) {
                Looper.getMainLooper();
                Looper.myLooper();
            }
            Object h = com.yandex.passport.common.util.a.h(new CommonRequesterKt$requestMethodBlocking$1(fVar, x0Var, null));
            lfx[] lfxVarArr2 = (lfx[]) Arrays.copyOf(lfxVarArr, 3);
            Throwable a = Result.a(h);
            if (a == null) {
                return (String) h;
            }
            for (lfx lfxVar : lfxVarArr2) {
                if (((g0c) lfxVar).e(a)) {
                    throw a;
                }
            }
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "catch non-PassportException from provider", a);
            }
            throw new PassportRuntimeUnknownException(a);
        } catch (RuntimeException e) {
            k(e);
            throw e;
        }
    }

    public final ClientToken c(PassportUidImpl passportUidImpl, Credentials credentials) {
        x();
        try {
            com.yandex.passport.internal.methods.requester.f fVar = this.d;
            PassportUidImpl.Companion.getClass();
            PassportUidImpl a = l2.a(passportUidImpl);
            ClientCredentials.Factory.getClass();
            p1 p1Var = new p1(a, new Credentials(credentials.getEncryptedId(), credentials.getEncryptedSecret()));
            lfx[] lfxVarArr = {qoi0.a(PassportAccountNotFoundException.class), qoi0.a(PassportAccountNotAuthorizedException.class), qoi0.a(PassportCredentialsNotFoundException.class), qoi0.a(PassportActionForbiddenException.class), qoi0.a(PassportIOException.class), qoi0.a(PassportRuntimeUnknownException.class)};
            if (!"robolectric".equals(Build.FINGERPRINT)) {
                Looper.getMainLooper();
                Looper.myLooper();
            }
            Object h = com.yandex.passport.common.util.a.h(new CommonRequesterKt$requestMethodBlocking$1(fVar, p1Var, null));
            lfx[] lfxVarArr2 = (lfx[]) Arrays.copyOf(lfxVarArr, 6);
            Throwable a2 = Result.a(h);
            if (a2 == null) {
                if (!evu0.J(((ClientToken) h).getValue())) {
                    return (ClientToken) h;
                }
                d(passportUidImpl.getValue(), "getToken");
                throw new PassportAccountNotAuthorizedException();
            }
            for (lfx lfxVar : lfxVarArr2) {
                if (((g0c) lfxVar).e(a2)) {
                    throw a2;
                }
            }
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "catch non-PassportException from provider", a2);
            }
            throw new PassportRuntimeUnknownException(a2);
        } catch (RuntimeException e) {
            k(e);
            throw e;
        }
    }

    public final void d(long j, String str) {
        HashMap p = x4e.p(PassportMethodBinderService.KEY_METHOD_NAME, str);
        p.put("uid", String.valueOf(j));
        p.put("am_version", "7.55.1");
        this.a.reportEvent(com.yandex.passport.internal.analytics.l.h.a, p);
    }

    @Override // com.yandex.passport.internal.impl.a
    public final void k(RuntimeException runtimeException) {
        this.a.reportError("error", runtimeException);
    }

    @Override // com.yandex.passport.internal.impl.a
    public final void x() {
        if (!com.yandex.passport.internal.util.p.m() || this.c) {
            return;
        }
        Map<String, Object> i = kotlin.collections.b.i(new Pair("passport_process_name", b64.p(new StringBuilder("'"), this.b, '\'')), new Pair("am_version", "7.55.1"), new Pair("error", Log.getStackTraceString(new RuntimeException("This method must not be called from ':passport' process"))));
        this.a.reportEvent(com.yandex.passport.internal.analytics.l.o.a, i);
    }
}
