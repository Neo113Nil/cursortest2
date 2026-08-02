package xsna;

import com.ironsource.X3;
import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.k7r0;

/* compiled from: DocUploadParser.kt */
/* loaded from: classes2.dex */
public final class ptn implements k7r0<String> {
    public static final ptn b = new ptn();

    @Override // xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        try {
            otn.a.a("DocUploadServerInfoParser", "response: " + jSONObject);
            return jSONObject.getString(X3.i.b);
        } catch (JSONException e) {
            throw new VKApiIllegalResponseException(e);
        }
    }

    @Override // xsna.k7r0
    public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
        return k7r0.a.a(this, qrj0Var2);
    }
}
