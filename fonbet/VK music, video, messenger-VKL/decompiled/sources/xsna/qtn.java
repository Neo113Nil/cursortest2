package xsna;

import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import xsna.k7r0;

/* compiled from: DocUploadParser.kt */
/* loaded from: classes2.dex */
public final class qtn implements k7r0<ocq0> {
    public static final qtn b = new qtn();

    @Override // xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        try {
            otn.a.a("DocUploadServerInfoParser", "UploadServer response: " + jSONObject);
            JSONObject jSONObject2 = jSONObject.getJSONObject("response");
            return new ocq0(jSONObject2.getString(ApiProtocol.KEY_UPLOAD_URL), jSONObject2.optString("fallback_upload_url", null));
        } catch (JSONException e) {
            throw new VKApiIllegalResponseException(e);
        }
    }

    @Override // xsna.k7r0
    public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
        return k7r0.a.a(this, qrj0Var2);
    }
}
