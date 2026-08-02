package com.yandex.passport.internal.network.client;

import com.yandex.passport.internal.network.m;
import com.yandex.passport.internal.network.response.ExternalApplicationPermissionsResult;
import defpackage.kvj0;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class BackendClient$getExternalApplicationPermissions$1 extends FunctionReferenceImpl implements tls {
    public BackendClient$getExternalApplicationPermissions$1(Object obj) {
        super(1, obj, com.yandex.passport.internal.network.a.class, "parseExternalApplicationPermissionsResponse", "parseExternalApplicationPermissionsResponse(Lokhttp3/Response;)Lcom/yandex/passport/internal/network/response/ExternalApplicationPermissionsResult;", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ((com.yandex.passport.internal.network.a) this.receiver).getClass();
        JSONObject b = com.yandex.passport.internal.network.a.b((kvj0) obj);
        com.yandex.passport.internal.network.a.h(b);
        String string = b.getString("request_id");
        boolean optBoolean = b.optBoolean("require_user_confirm", false);
        JSONObject jSONObject = b.getJSONObject("client");
        return new ExternalApplicationPermissionsResult(string, m.e("title", jSONObject), m.e("icon_url", jSONObject), com.yandex.passport.internal.network.a.g(jSONObject.getJSONObject("scopes")), optBoolean, com.yandex.passport.internal.network.a.g(b.getJSONObject("already_granted_scopes")), com.yandex.passport.internal.network.a.g(b.getJSONObject("requested_scopes")));
    }
}
