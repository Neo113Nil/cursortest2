package xsna;

import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.api.sdk.VKApiConfig;
import com.vk.push.core.network.http.BaseHttpHeadersHolder;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.regex.Pattern;
import okhttp3.m;
import okhttp3.t;
import ru.ok.android.commons.http.Http;

/* compiled from: SignAnonymousTokenRequest.kt */
/* loaded from: classes14.dex */
public final class ulj0 extends nx2<String> {
    public final String b;
    public final LinkedHashMap c = new LinkedHashMap();

    public ulj0(String str) {
        this.b = str;
    }

    @Override // xsna.nx2
    public final String f(l7r0 l7r0Var) {
        VKApiConfig vKApiConfig = l7r0Var.a;
        LinkedHashMap linkedHashMap = this.c;
        String str = this.b;
        if (str != null) {
            linkedHashMap.put("signature_base64", str);
        }
        String b = vKApiConfig.b();
        if (b != null) {
            linkedHashMap.put("lang", b);
        }
        linkedHashMap.put(HttpRequest.DEFAULT_SCHEME, "1");
        String value = vKApiConfig.f.getValue();
        if (value != null) {
            linkedHashMap.put("device_id", value);
        }
        String a = kpe0.a(kpe0.a, linkedHashMap, vKApiConfig.g, null, vKApiConfig.b, null, null, 244);
        String a2 = i5s.a(new StringBuilder("https://"), vKApiConfig.q.invoke(), "/sign_anonymous_token");
        t.a aVar = okhttp3.t.Companion;
        Pattern pattern = okhttp3.m.e;
        okhttp3.m a3 = m.a.a(BaseHttpHeadersHolder.CONTENT_TYPE_URLENCODED);
        aVar.getClass();
        okhttp3.s a4 = t.a.a(a, a3);
        l6r0 value2 = vKApiConfig.C.getValue();
        String token = value2 != null ? value2.getToken() : null;
        if (token == null) {
            token = "";
        }
        alv alvVar = new alv(a2, 0L, 0, 0, a4, Collections.singletonList(new gnk(Http.Header.AUTHORIZATION, "Bearer ".concat(token))), 14);
        return (String) zdq.a(l7r0Var, alvVar, new tlj0(alvVar, l7r0Var), true);
    }
}
