package defpackage;

import com.adjust.sdk.Constants;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.yandex.messaging.core.net.ApiRequest;
import com.yandex.messaging.core.net.ApiResponse;
import com.yandex.messaging.core.net.entities.ErrorResponseData;
import com.yandex.messaging.data.e;
import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import io.appmetrica.analytics.AppMetricaYandex;
import java.lang.reflect.Type;
import ru.yandex.video.m3.ott.data.net.impl.ExtFunctionsKt;

/* loaded from: classes15.dex */
public final class ouu {
    public static final Object k = new Object();
    public final q6v a;
    public final x22 b;
    public final String c;
    public final String d;
    public final Moshi e;
    public final jwa0 f;
    public final v1r0 g;
    public final e h;
    public final lqo i;
    public final jwu j;

    public ouu(q6v q6vVar, x22 x22Var, String str, String str2, Moshi moshi, jwa0 jwa0Var, v1r0 v1r0Var, e eVar, lqo lqoVar, gsu gsuVar) {
        this.a = q6vVar;
        this.b = x22Var;
        this.c = str;
        this.d = str2;
        this.e = moshi;
        this.f = jwa0Var;
        this.g = v1r0Var;
        this.h = eVar;
        this.i = lqoVar;
        jwu jwuVar = new jwu();
        jwuVar.o(Constants.SCHEME);
        jwuVar.h((String) gsuVar.a.c(gsuVar.b));
        jwuVar.c("api/", false);
        this.j = jwuVar;
    }

    public static gg70 b(ouu ouuVar, String str, Type type, kvj0 kvj0Var) {
        gg70 b;
        new nuu();
        Moshi moshi = ouuVar.e;
        x22 x22Var = ouuVar.b;
        String str2 = kvj0Var.c;
        int i = kvj0Var.w;
        long j = kvj0Var.F - kvj0Var.E;
        rvj0 rvj0Var = kvj0Var.z;
        qq6 qq6Var = kvj0Var.d(256L).c;
        try {
            if (rvj0Var == null) {
                x22Var.reportError(str.concat(" call failed"), new Exception("body is null"));
                return gg70.a(i, str2, "body is null");
            }
            try {
                if (kvj0Var.J) {
                    ApiResponse apiResponse = (ApiResponse) moshi.adapter(Types.newParameterizedType(ApiResponse.class, type)).fromJson(rvj0Var.source());
                    if (apiResponse != null && WriteBlocks.OK.equals(apiResponse.getStatus())) {
                        ouuVar.f.d(j * 1000, "time2".concat(str));
                        dg70 dg70Var = new dg70(apiResponse.getData());
                        rvj0Var.close();
                        return dg70Var;
                    }
                    String I0 = qq6Var.I0();
                    x22Var.reportError(str.concat(" call failed"), new Exception(String.valueOf(i)));
                    b = gg70.a(i, str2, I0);
                } else {
                    String I02 = qq6Var.I0();
                    if (i / 100 != 5) {
                        x22Var.reportError(str.concat(" call failed"), new Exception(String.valueOf(i)));
                    }
                    ApiResponse apiResponse2 = (ApiResponse) moshi.adapter(Types.newParameterizedType(ApiResponse.class, ErrorResponseData.class)).fromJson(rvj0Var.source());
                    if (apiResponse2 != null && "error".equals(apiResponse2.getStatus())) {
                        Integer l = bvu0.l(10, ((ErrorResponseData) apiResponse2.getData()).code);
                        b = gg70.a(l != null ? l.intValue() : i, ((ErrorResponseData) apiResponse2.getData()).code, ((ErrorResponseData) apiResponse2.getData()).text);
                    }
                    b = gg70.a(i, str2, I02);
                }
            } catch (JsonDataException e) {
                x22Var.reportError(str.concat(" call failed"), e);
                b = gg70.b(i, str2);
            }
            rvj0Var.close();
            return b;
        } catch (Throwable th) {
            rvj0Var.close();
            throw th;
        }
    }

    public final t4j0 a(Object obj, String str) {
        if (obj == null) {
            obj = k;
        }
        ApiRequest apiRequest = new ApiRequest(str, obj);
        t4j0 t4j0Var = new t4j0();
        t4j0Var.a = this.j.e();
        t4j0Var.c.a(ExtFunctionsKt.HEADER_USER_AGENT, this.d);
        t4j0Var.c.a("X-VERSION", "5");
        t4j0Var.c.a("X-UUID", this.c);
        t4j0Var.c.a("X-Session-Id", this.g.a);
        t4j0Var.e("POST", new fzq(this.e.adapter(ApiRequest.class), apiRequest));
        String uuid = AppMetricaYandex.getUuid(((gm51) this.a).a);
        if (uuid != null && uuid.length() != 0) {
            t4j0Var.a("X-METRICA-UUID", uuid);
        }
        if (this.i.a(tz10.j)) {
            t4j0Var.c.g("X-Ya-Organization-Id", String.valueOf(this.h.c()));
        }
        return t4j0Var;
    }
}
