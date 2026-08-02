package xsna;

import com.vk.api.sdk.exceptions.VKApiException;
import org.json.JSONObject;
import xsna.vx70;

/* compiled from: HttpPostChainCall.kt */
/* loaded from: classes15.dex */
public class bkv<T> extends ara<T> {
    public final vx70 b;
    public final xbr0 c;
    public final m7r0 d;
    public final k7r0<T> e;

    public bkv(l7r0 l7r0Var, vx70 vx70Var, xbr0 xbr0Var, m7r0 m7r0Var, k7r0<T> k7r0Var) {
        super(l7r0Var);
        this.b = vx70Var;
        this.c = xbr0Var;
        this.d = m7r0Var;
        this.e = k7r0Var;
    }

    @Override // xsna.ara
    public T a(zqa zqaVar) throws Exception {
        return c(this.b.e(new ly70(this.c), this.d));
    }

    public final T c(vx70.a aVar) {
        JSONObject jSONObject = aVar.a;
        if (jSONObject == null) {
            throw new VKApiException("Response returned null instead of valid string response");
        }
        if (jSONObject.has("error")) {
            throw mnh0.I("post", null, jSONObject);
        }
        return this.e.a(jSONObject);
    }
}
