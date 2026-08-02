package xsna;

import com.vk.api.sdk.VKApiConfig;
import java.util.LinkedHashMap;
import org.json.JSONObject;
import ru.ok.android.sdk.SharedKt;
import xsna.gy70;
import xsna.vu2;

/* compiled from: SuperMethodChainCall.kt */
/* loaded from: classes.dex */
public class ren0<T> extends kj20<T> {
    @Override // xsna.kj20, xsna.ara
    public T a(zqa zqaVar) throws Exception {
        gy70.a aVar = this.c;
        boolean z = aVar instanceof vu2.a;
        boolean z2 = z ? ((vu2.a) aVar).r : false;
        boolean z3 = z ? aVar.l : false;
        if (z2) {
            l7r0 l7r0Var = this.a;
            VKApiConfig vKApiConfig = l7r0Var.a;
            VKApiConfig vKApiConfig2 = l7r0Var.a;
            l6r0 value = vKApiConfig.C.getValue();
            String token = value != null ? value.getToken() : null;
            if (value == null || token == null || token.length() == 0 || z3) {
                aVar.a("client_id", String.valueOf(vKApiConfig2.b));
                aVar.a(SharedKt.PARAM_CLIENT_SECRET, vKApiConfig2.l);
                aVar.f.remove(SharedKt.PARAM_ACCESS_TOKEN);
                if (!z3) {
                    l7r0 l7r0Var2 = ((shx) this).a;
                    s03 s03Var = l7r0Var2.a.F;
                    JSONObject put = new JSONObject().put("device_id", l7r0Var2.a.f).put("is_anonymous_token_used", value != null);
                    String token2 = value != null ? value.getToken() : null;
                    s03Var.invoke("error_client_secret_instead_of_anonymous", put.put("is_anonymous_token_null_or_empty", token2 == null || token2.length() == 0).put("version", aVar.d).put("method", aVar.c));
                }
            } else {
                aVar.a(SharedKt.PARAM_ACCESS_TOKEN, token);
                LinkedHashMap linkedHashMap = aVar.f;
                linkedHashMap.remove("client_id");
                linkedHashMap.remove(SharedKt.PARAM_CLIENT_SECRET);
            }
        }
        return (T) super.a(zqaVar);
    }
}
