package com.yandex.passport.internal.network.client;

import com.yandex.messaging.ui.auth.ProxyPassportActivity;
import com.yandex.passport.internal.network.m;
import com.yandex.passport.internal.network.response.AccountType;
import com.yandex.passport.internal.network.response.AuthMethod;
import com.yandex.passport.internal.network.response.f;
import defpackage.kvj0;
import defpackage.tls;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class BackendClient$startAuthorization$1 extends FunctionReferenceImpl implements tls {
    public BackendClient$startAuthorization$1(Object obj) {
        super(1, obj, com.yandex.passport.internal.network.a.class, "parseAuthorizationStartResponse", "parseAuthorizationStartResponse(Lokhttp3/Response;)Lcom/yandex/passport/internal/network/response/AuthorizationStartResult;", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ((com.yandex.passport.internal.network.a) this.receiver).getClass();
        JSONObject b = com.yandex.passport.internal.network.a.b((kvj0) obj);
        String optString = b.optString("track_id");
        boolean optBoolean = b.optBoolean("can_authorize");
        boolean optBoolean2 = b.optBoolean("can_register");
        int optInt = b.optInt("primary_alias_type", -1);
        String e = m.e("masked_login", b);
        JSONArray optJSONArray = b.optJSONArray("auth_methods");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                AuthMethod a = AuthMethod.a(optJSONArray.getString(i));
                if (a != null) {
                    arrayList.add(a);
                }
            }
        }
        ArrayList e2 = com.yandex.passport.internal.network.a.e(b);
        JSONObject optJSONObject = b.optJSONObject(ProxyPassportActivity.KEY_PHONE_NUMBER);
        String string = optJSONObject == null ? null : optJSONObject.getString("international");
        JSONObject optJSONObject2 = b.optJSONObject("secure_phone_number");
        String string2 = optJSONObject2 != null ? optJSONObject2.getString("masked_international") : null;
        AccountType b2 = AccountType.b(m.e("account_type", b));
        if (b2 == null) {
            b2 = AccountType.a(Integer.valueOf(optInt));
        }
        return new f(optBoolean, optBoolean2, optString, arrayList, e2, string, e, b2, m.e("magic_link_email", b), string2);
    }
}
