package com.yandex.passport.api;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.yandex.passport.api.exception.PassportRuntimeUnknownException;
import com.yandex.passport.api.exception.PassportTurboAppAuthException;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.internal.entities.ClientToken;
import com.yandex.passport.internal.entities.JwtToken;
import com.yandex.passport.internal.report.kd;
import com.yandex.passport.internal.report.od;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import io.appmetrica.analytics.IReporterYandex;
import java.util.Collections;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public class h {
    public static final PassportEnvironmentImpl a = PassportEnvironmentImpl.PRODUCTION;
    public static final PassportEnvironmentImpl b = PassportEnvironmentImpl.TEAM_PRODUCTION;
    public static final PassportEnvironmentImpl c = PassportEnvironmentImpl.TESTING;
    public static final PassportEnvironmentImpl d = PassportEnvironmentImpl.TEAM_TESTING;
    public static final PassportEnvironmentImpl e = PassportEnvironmentImpl.RC;

    public static com.yandex.passport.internal.impl.p a(Context context) {
        IReporterYandex b2 = od.b(context);
        Thread.setDefaultUncaughtExceptionHandler(new com.yandex.passport.internal.m(new kd(context, b2)));
        com.yandex.passport.internal.s.b(context, b2);
        return new com.yandex.passport.internal.impl.p(context.getApplicationContext(), b2);
    }

    public static r b(Intent intent) {
        if (intent == null) {
            throw new PassportRuntimeUnknownException("intent is null");
        }
        List stringArrayListExtra = intent.getStringArrayListExtra(AuthSdkActivity.EXTRA_FLOW_ERRORS);
        if (stringArrayListExtra == null) {
            stringArrayListExtra = Collections.EMPTY_LIST;
        }
        String[] stringArrayExtra = intent.getStringArrayExtra(AuthSdkActivity.EXTRA_TOKEN_ERROR_MESSAGES);
        if (stringArrayExtra != null) {
            throw new PassportTurboAppAuthException(TextUtils.join(Extension.FIX_SPACE, stringArrayExtra), stringArrayListExtra);
        }
        String stringExtra = intent.getStringExtra(AuthSdkActivity.EXTRA_TOKEN);
        if (stringExtra == null) {
            throw new PassportTurboAppAuthException("intent does'n contains token", stringArrayListExtra);
        }
        String stringExtra2 = intent.getStringExtra(AuthSdkActivity.EXTRA_CLIENT_ID);
        if (stringExtra2 == null) {
            throw new PassportTurboAppAuthException("intent does'n contains clientId", stringArrayListExtra);
        }
        String stringExtra3 = intent.getStringExtra(AuthSdkActivity.EXTRA_JWT_TOKEN);
        if (stringExtra3 == null) {
            throw new PassportTurboAppAuthException("intent does'n contains jwtToken", stringArrayListExtra);
        }
        if (intent.getStringArrayListExtra(AuthSdkActivity.EXTRA_GRANTED_SCOPES) == null) {
            throw new PassportTurboAppAuthException("intent does'n contains grantedScopes", stringArrayListExtra);
        }
        new JwtToken(stringExtra3, 0L);
        new ClientToken(stringExtra, stringExtra2);
        return new r();
    }
}
