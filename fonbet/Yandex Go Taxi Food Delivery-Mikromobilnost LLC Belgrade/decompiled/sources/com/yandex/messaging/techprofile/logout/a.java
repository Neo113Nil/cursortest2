package com.yandex.messaging.techprofile.logout;

import android.os.Handler;
import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import defpackage.c9v;
import defpackage.d5j0;
import defpackage.jwu;
import defpackage.kwu;
import defpackage.l3s;
import defpackage.m3s;
import defpackage.nci0;
import defpackage.t4j0;
import defpackage.yxf0;
import java.util.UUID;
import okhttp3.OkHttpClient;

/* loaded from: classes15.dex */
public final class a {
    public final JsonAdapter a = new Moshi.Builder().build().adapter(LogoutApiCalls$ApiRequest.class);
    public final OkHttpClient b = new OkHttpClient(new OkHttpClient.a());

    /* JADX WARN: Type inference failed for: r3v0, types: [com.yandex.messaging.techprofile.logout.LogoutApiCalls$Params] */
    public final nci0 a(String str, final String str2, yxf0 yxf0Var) {
        Handler handler = new Handler();
        jwu jwuVar = new jwu();
        jwuVar.o(Constants.SCHEME);
        jwuVar.h(str);
        jwuVar.b("logout_client");
        jwuVar.b("");
        kwu e = jwuVar.e();
        l3s l3sVar = new l3s();
        final ?? r3 = new Object(str2) { // from class: com.yandex.messaging.techprofile.logout.LogoutApiCalls$Params

            @Json(name = "logout_token")
            public final String token;

            {
                this.token = str2;
            }
        };
        l3sVar.b("request", this.a.toJson(new Object(r3) { // from class: com.yandex.messaging.techprofile.logout.LogoutApiCalls$ApiRequest

            @Json(name = "params")
            public final LogoutApiCalls$Params params;

            {
                this.params = r3;
            }
        }));
        m3s m3sVar = new m3s(l3sVar.a, l3sVar.b);
        t4j0 t4j0Var = new t4j0();
        t4j0Var.a = e;
        t4j0Var.c.a("X-Request-Id", UUID.randomUUID().toString());
        t4j0Var.e("POST", m3sVar);
        nci0 nci0Var = (nci0) this.b.newCall(new d5j0(t4j0Var));
        nci0Var.I(new c9v(17, handler, yxf0Var));
        return nci0Var;
    }
}
