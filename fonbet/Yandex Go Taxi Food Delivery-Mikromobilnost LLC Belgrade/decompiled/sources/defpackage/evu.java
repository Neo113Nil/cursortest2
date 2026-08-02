package defpackage;

import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.yandex.messaging.internal.net.HttpRequestTag;
import io.appmetrica.analytics.AppMetricaYandex;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import ru.yandex.video.m3.ott.data.net.impl.ExtFunctionsKt;

/* loaded from: classes15.dex */
public final class evu {
    public final q6v a;
    public final String b;
    public final String c;
    public final gsu d;

    public evu(q6v q6vVar, String str, String str2, gsu gsuVar) {
        this.a = q6vVar;
        this.b = str;
        this.c = str2;
        this.d = gsuVar;
    }

    public final t4j0 a(String str, Iterable iterable) {
        jwu jwuVar = new jwu();
        jwuVar.o(Constants.SCHEME);
        gsu gsuVar = this.d;
        jwuVar.h((String) gsuVar.a.c(gsuVar.c));
        jwuVar.c(str, false);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ijg0 ijg0Var = (ijg0) it.next();
            jwuVar.d(ijg0Var.a, ijg0Var.b);
        }
        t4j0 b = b(jwuVar.e());
        b.c();
        return b;
    }

    public final t4j0 b(kwu kwuVar) {
        t4j0 t4j0Var = new t4j0();
        t4j0Var.a = kwuVar;
        HttpRequestTag httpRequestTag = HttpRequestTag.FileRequest;
        t4j0Var.e = t4j0Var.e.E(qoi0.a(Object.class), httpRequestTag);
        t4j0Var.c.a(ExtFunctionsKt.HEADER_USER_AGENT, this.c);
        t4j0Var.c.a("X-VERSION", String.valueOf(5));
        t4j0Var.c.a("X-UUID", this.b);
        String uuid = AppMetricaYandex.getUuid(((gm51) this.a).a);
        if (!TextUtils.isEmpty(uuid)) {
            t4j0Var.a("X-METRICA-UUID", uuid);
        }
        return t4j0Var;
    }

    public final t4j0 c(String str, HashMap hashMap) {
        jwu jwuVar = new jwu();
        jwuVar.o(Constants.SCHEME);
        gsu gsuVar = this.d;
        jwuVar.h((String) gsuVar.a.c(gsuVar.c));
        jwuVar.c(str, false);
        for (Map.Entry entry : hashMap.entrySet()) {
            jwuVar.d((String) entry.getKey(), (String) entry.getValue());
        }
        return b(jwuVar.e());
    }
}
