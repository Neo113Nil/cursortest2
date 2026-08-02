package xsna;

import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.api.sdk.VKApiConfig;
import com.vk.auth.api.models.AuthResult;
import com.vk.push.core.network.http.BaseHttpHeadersHolder;
import com.vk.superapp.api.analytics.RegistrationStatParamsFactory;
import com.vk.superapp.api.exceptions.AuthException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import okhttp3.m;
import okhttp3.t;
import ru.ok.android.sdk.SharedKt;

/* compiled from: BaseAuthCommand.kt */
/* loaded from: classes11.dex */
public abstract class r56 extends nx2<AuthResult> {
    public final String b;
    public final int c;
    public final boolean d;
    public final LinkedHashMap e = new LinkedHashMap();

    public r56(String str, int i, boolean z) {
        this.b = str;
        this.c = i;
        this.d = z;
    }

    @Override // xsna.nx2
    public final AuthResult f(l7r0 l7r0Var) {
        VKApiConfig vKApiConfig = l7r0Var.a;
        zu2 zu2Var = new zu2(l7r0Var);
        for (int i = 0; i < 3; i++) {
            try {
                zu2Var.b();
                g(vKApiConfig);
                alv j = j(vKApiConfig);
                return n((com.vk.superapp.core.api.models.a) zdq.a(l7r0Var, j, new bo70(l7r0Var, l7r0Var.i(), j), true));
            } catch (AuthException.ExpiredAnonymousTokenException unused) {
                zu2.e(zu2Var, true, 2);
            } catch (AuthException.InvalidAnonymousTokenException unused2) {
                zu2.e(zu2Var, false, 2);
            }
        }
        throw new AuthException.UnknownException(0);
    }

    public final void g(VKApiConfig vKApiConfig) {
        boolean z = this.d;
        int i = this.c;
        if (z) {
            l6r0 value = vKApiConfig.C.getValue();
            String token = value != null ? value.getToken() : null;
            if (value == null || token == null || token.length() == 0) {
                i("client_id", String.valueOf(i));
                i(SharedKt.PARAM_CLIENT_SECRET, dgn0.b().l);
            } else {
                i("anonymous_token", token);
            }
        } else {
            i("client_id", String.valueOf(i));
        }
        i(HttpRequest.DEFAULT_SCHEME, "1");
        String str = vKApiConfig.g;
        Lazy<String> lazy = vKApiConfig.f;
        i("v", str);
        i("lang", vKApiConfig.b());
        if (lazy.getValue().length() > 0) {
            i("device_id", lazy.getValue());
        }
        Iterator it = RegistrationStatParamsFactory.a().iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            i((String) pair.d(), (String) pair.g());
        }
    }

    public final void i(String str, String str2) {
        if (str2 != null) {
            this.e.put(str, str2);
        }
    }

    public final alv j(VKApiConfig vKApiConfig) {
        String a = kpe0.a(kpe0.a, this.e, vKApiConfig.g, k(), vKApiConfig.b, null, EmptyList.b, 144);
        int l = l();
        int i = dgn0.a().j;
        long j = dgn0.a().i;
        t.a aVar = okhttp3.t.Companion;
        Pattern pattern = okhttp3.m.e;
        okhttp3.m a2 = m.a.a(BaseHttpHeadersHolder.CONTENT_TYPE_URLENCODED);
        aVar.getClass();
        return new alv(this.b, j, i, l, t.a.a(a, a2), null, 32);
    }

    public String k() {
        return null;
    }

    public int l() {
        return dgn0.a().j;
    }

    public abstract AuthResult n(com.vk.superapp.core.api.models.a aVar) throws Exception;
}
