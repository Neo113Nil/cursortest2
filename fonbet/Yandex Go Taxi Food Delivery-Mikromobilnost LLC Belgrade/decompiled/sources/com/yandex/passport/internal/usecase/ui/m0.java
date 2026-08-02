package com.yandex.passport.internal.usecase.ui;

import android.net.Uri;
import com.adjust.sdk.Constants;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.social.esia.EsiaBindWebClient;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.TimeoutCancellationException;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes2.dex */
public final class m0 extends com.yandex.passport.common.domain.a {
    public final com.yandex.passport.common.ui.lang.b b;
    public final com.yandex.passport.internal.network.e c;

    public m0(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.ui.lang.b bVar, com.yandex.passport.internal.network.e eVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        this.b = bVar;
        this.c = eVar;
    }

    @Override // com.yandex.passport.common.domain.d
    public final Object b(Object obj, Continuation continuation) {
        Object failure;
        try {
            failure = new com.yandex.passport.common.url.b(c((k0) obj));
        } catch (TimeoutCancellationException e) {
            failure = new Result.Failure(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        return new Result(failure);
    }

    public final String c(k0 k0Var) {
        String str;
        Uid uid = k0Var.a;
        String str2 = k0Var.b;
        Environment environment = uid.getEnvironment();
        com.yandex.passport.common.url.a aVar = com.yandex.passport.common.url.b.Companion;
        Uri.Builder scheme = new Uri.Builder().scheme(Constants.SCHEME);
        int[] iArr = l0.a;
        Uri.Builder appendQueryParameter = scheme.authority(iArr[environment.ordinal()] == 1 ? "oauth.yandex.ru" : "oauth-test.yandex.ru").appendPath("authorize").appendQueryParameter("client_id", str2).appendQueryParameter("response_type", k0Var.c).appendQueryParameter("force_confirm", String.valueOf(k0Var.d)).appendQueryParameter("origin", "yandex_auth_sdk_android");
        Locale b = ((com.yandex.passport.internal.ui.lang.a) this.b).b();
        int i = com.yandex.passport.common.ui.lang.a.a;
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("language", b.getLanguage());
        com.yandex.passport.internal.network.e eVar = this.c;
        Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter(EsiaBindWebClient.REDIRECT_PARAM_NAME, Uri.parse(((com.yandex.passport.internal.network.l) eVar).a(str2, environment)).buildUpon().appendPath("auth").appendPath("finish").appendQueryParameter("app_platform", ConstantDeviceInfo.APP_PLATFORM).build().toString());
        if (iArr[environment.ordinal()] == 1) {
            str = ((com.yandex.passport.internal.network.l) eVar).m(environment, null) + "/finish?status=cancel&error=access_denied";
        } else {
            str = ((com.yandex.passport.internal.network.l) eVar).m(environment, null) + "/finish?status=cancel&error=access_denied";
        }
        Uri build = appendQueryParameter3.appendQueryParameter("backpath", str).appendQueryParameter(CommonUrlParts.APP_ID, k0Var.e).appendQueryParameter("fingerprint", k0Var.f).appendQueryParameter("app_platform", ConstantDeviceInfo.APP_PLATFORM).appendQueryParameter(ClidProvider.STATE, k0Var.g).build();
        aVar.getClass();
        return build.toString();
    }
}
