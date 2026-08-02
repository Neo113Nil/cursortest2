package xsna;

import com.ironsource.O6;
import com.vk.api.external.exceptions.NonSecretMethodCallException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import ru.ok.android.api.methods.authV2.login.LoginApiConstants;
import ru.ok.android.sdk.SharedKt;

/* compiled from: AnonymousOkHttpExecutor.kt */
/* loaded from: classes.dex */
public class tu2 extends vx70 {
    public static final List<String> i = e43.l(SharedKt.PARAM_ACCESS_TOKEN, "key", SharedKt.PARAM_CLIENT_SECRET, "anonymous_token", O6.e1, LoginApiConstants.RESULT_NAME_AUTH_TOKEN, "exchange_token", "exchange_tokens", "common_token", "hash", "api_key", "api_hash", "access_key", "access_hash", "webview_refresh_token", "webview_access_token", "wat", "tracker_token", "session", LoginApiConstants.PARAM_NAME_PASSWORD, "password2", LoginApiConstants.PARAM_NAME_OLD_PASSWORD, "new_password");

    /* compiled from: AnonymousOkHttpExecutor.kt */
    /* loaded from: classes14.dex */
    public static final class a {
        public final JSONObject a;
        public final okhttp3.k b;
        public final int c;
        public final String d;

        public a(JSONObject jSONObject, okhttp3.k kVar, int i, String str) {
            this.a = jSONObject;
            this.b = kVar;
            this.c = i;
            this.d = str;
        }

        public final okhttp3.k a() {
            return this.b;
        }

        public final JSONObject b() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            JSONObject jSONObject = this.a;
            return this.d.hashCode() + shy.a(this.c, (((jSONObject == null ? 0 : jSONObject.hashCode()) * 31) + Arrays.hashCode(this.b.b)) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperMethodResponse(responseBodyJson=");
            sb.append(this.a);
            sb.append(", headers=");
            sb.append(this.b);
            sb.append(", code=");
            sb.append(this.c);
            sb.append(", lastRequestUrl=");
            return ho8.a(sb, this.d, ')');
        }
    }

    @Override // xsna.vx70
    public final void a(gy70 gy70Var) {
        String j = j(gy70Var);
        String i2 = i(gy70Var);
        if (j == null || j.length() == 0) {
            if ((i2 == null || i2.length() == 0) && !gy70Var.i) {
                vu2 vu2Var = gy70Var instanceof vu2 ? (vu2) gy70Var : null;
                if (vu2Var == null || vu2Var.s) {
                    return;
                }
                throw new NonSecretMethodCallException("Trying to call " + gy70Var.d + " without auth: " + rl3.I(new String[]{(j == null || j.length() == 0) ? "st" : null, (i2 == null || i2.length() == 0) ? "at" : null}) + ". Mark it with allowNoAuth if needed");
            }
        }
    }

    @Override // xsna.vx70
    public c200 c(boolean z, d13 d13Var, w03 w03Var) {
        return new c200(z, i, d13Var, w03Var);
    }

    @Override // xsna.vx70
    public final String i(gy70 gy70Var) {
        String str;
        if (!(gy70Var instanceof vu2)) {
            return super.i(gy70Var);
        }
        vu2 vu2Var = (vu2) gy70Var;
        Object obj = null;
        if (vu2Var.r || gy70Var.l) {
            return null;
        }
        Iterator<T> it = this.e.getValue().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (epx.f(((h7r0) next).e, vu2Var.t)) {
                obj = next;
                break;
            }
        }
        h7r0 h7r0Var = (h7r0) obj;
        if (h7r0Var != null && (str = h7r0Var.a) != null) {
            return str;
        }
        String str2 = vu2Var.p;
        return str2 == null ? i7r0.a(this.e.getValue()) : str2;
    }

    @Override // xsna.vx70
    public final String j(gy70 gy70Var) {
        if (!(gy70Var instanceof vu2)) {
            return super.j(gy70Var);
        }
        vu2 vu2Var = (vu2) gy70Var;
        if (vu2Var.r || gy70Var.l) {
            return null;
        }
        String str = vu2Var.q;
        return str == null ? i7r0.b(this.e.getValue()) : str;
    }
}
