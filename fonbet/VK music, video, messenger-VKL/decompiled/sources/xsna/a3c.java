package xsna;

import com.vk.api.sdk.exceptions.VKApiException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: CheckoutChainCall.kt */
/* loaded from: classes6.dex */
public abstract class a3c<T> extends ara<T> {
    public final alv b;

    public a3c(alv alvVar, l7r0 l7r0Var) {
        super(l7r0Var);
        this.b = alvVar;
    }

    @Override // xsna.ara
    public final T a(zqa zqaVar) {
        JSONObject jSONObject;
        try {
            jSONObject = uu2.a(this.a.i(), this.b, zqaVar).a;
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
        }
        if (jSONObject != null) {
            return c(jSONObject);
        }
        throw new VKApiException("Response returned null instead of valid string response");
    }

    public abstract T c(JSONObject jSONObject);
}
