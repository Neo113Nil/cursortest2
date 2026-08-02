package xsna;

import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.api.sdk.VKApiConfig;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.push.core.network.http.BaseHttpHeadersHolder;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Lazy;
import okhttp3.m;
import okhttp3.t;
import org.json.JSONObject;
import ru.ok.android.sdk.SharedKt;
import xsna.k7r0;

/* compiled from: AnonymousTokenRequest.kt */
@ozl
/* loaded from: classes.dex */
public final class av2 extends nx2<String> {
    public final boolean b;
    public final l7r0 c;
    public final VKApiExecutionException d;
    public final LinkedHashMap e = new LinkedHashMap();

    /* compiled from: AnonymousTokenRequest.kt */
    /* loaded from: classes14.dex */
    public static final class a implements k7r0<String> {
        @Override // xsna.k7r0
        public final Object a(JSONObject jSONObject) {
            return jSONObject.getString("token");
        }

        public final String b(JSONObject jSONObject) {
            return jSONObject.getString("token");
        }

        @Override // xsna.k7r0
        public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
            return k7r0.a.a(this, qrj0Var2);
        }
    }

    public av2(boolean z, l7r0 l7r0Var, VKApiExecutionException vKApiExecutionException) {
        this.b = z;
        this.c = l7r0Var;
        this.d = vKApiExecutionException;
    }

    @Override // xsna.nx2
    public final String f(l7r0 l7r0Var) {
        VKApiExecutionException vKApiExecutionException;
        Map<String, String> z;
        String str;
        VKApiConfig vKApiConfig = l7r0Var.a;
        Lazy<String> lazy = vKApiConfig.f;
        l7r0 l7r0Var2 = this.c;
        g("client_id", String.valueOf(l7r0Var2.a.b));
        VKApiConfig vKApiConfig2 = l7r0Var2.a;
        g(SharedKt.PARAM_CLIENT_SECRET, vKApiConfig2.l);
        if (this.b && (vKApiExecutionException = this.d) != null && (z = vKApiExecutionException.z()) != null && (str = z.get(SharedKt.PARAM_ACCESS_TOKEN)) != null) {
            g(SharedKt.PARAM_ACCESS_TOKEN, str);
        }
        g("lang", vKApiConfig2.b());
        g(HttpRequest.DEFAULT_SCHEME, "1");
        if (lazy.getValue().length() > 0) {
            g("device_id", lazy.getValue());
        }
        String a2 = kpe0.a(kpe0.a, this.e, vKApiConfig.g, null, vKApiConfig.b, null, null, 244);
        String a3 = i5s.a(new StringBuilder("https://"), vKApiConfig.q.invoke(), "/get_anonym_token");
        t.a aVar = okhttp3.t.Companion;
        Pattern pattern = okhttp3.m.e;
        okhttp3.m a4 = m.a.a(BaseHttpHeadersHolder.CONTENT_TYPE_URLENCODED);
        aVar.getClass();
        alv alvVar = new alv(a3, 0L, 0, 0, t.a.a(a2, a4), null, 46);
        return (String) zdq.a(l7r0Var, alvVar, new bv2(alvVar, l7r0Var), false);
    }

    public final void g(String str, String str2) {
        if (str2 != null) {
            this.e.put(str, str2);
        }
    }
}
