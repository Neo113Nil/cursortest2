package com.yandex.passport.internal.network.client;

import android.text.TextUtils;
import com.yandex.passport.common.exception.InvalidTokenException;
import com.yandex.passport.data.exceptions.FailedResponseException;
import com.yandex.passport.internal.network.response.LoginSdkResult;
import com.yandex.passport.internal.report.jd;
import com.yandex.passport.internal.report.reporters.b1;
import com.yandex.passport.internal.report.x4;
import com.yandex.passport.internal.report.y4;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.kvj0;
import defpackage.tls;
import defpackage.z3k;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class BackendClient$acceptExternalApplicationPermissions$1 extends FunctionReferenceImpl implements tls {
    public BackendClient$acceptExternalApplicationPermissions$1(Object obj) {
        super(1, obj, com.yandex.passport.internal.network.a.class, "parseLoginSdkTokenResponse", "parseLoginSdkTokenResponse(Lokhttp3/Response;)Lcom/yandex/passport/internal/network/response/LoginSdkResult;", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        b1 b1Var = ((com.yandex.passport.internal.network.a) this.receiver).a;
        JSONObject b = com.yandex.passport.internal.network.a.b((kvj0) obj);
        ArrayList e = com.yandex.passport.internal.network.a.e(b);
        if (e != null && e.size() > 0) {
            b1Var.f(x4.w, new com.yandex.passport.internal.report.a((String) e.get(0), 26, false), new jd("null", 3));
            if (((String) e.get(0)).equals("invalid_grant")) {
                throw new InvalidTokenException();
            }
            throw new FailedResponseException((String) e.get(0));
        }
        b1Var.f(y4.w, new jd(b.optString("uid"), 3));
        String optString = b.optString("access_token");
        String optString2 = b.optString("token_type");
        long optLong = b.optLong("expires_in");
        if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
            return new LoginSdkResult(optString, optString2, optLong);
        }
        String optString3 = b.optString(AuthSdkActivity.RESPONSE_TYPE_CODE);
        if (!TextUtils.isEmpty(optString3)) {
            return new LoginSdkResult(optString3);
        }
        z3k.c("access_token or code should be in response");
        return null;
    }
}
