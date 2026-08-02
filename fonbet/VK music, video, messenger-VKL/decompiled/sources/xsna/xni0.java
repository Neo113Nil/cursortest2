package xsna;

import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import xsna.k7r0;

/* compiled from: ImageUploadParser.kt */
/* loaded from: classes2.dex */
public final class xni0 implements k7r0<wni0> {
    public static final xni0 b = new xni0();

    @Override // xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("response");
            ocq0 ocq0Var = new ocq0(jSONObject2.getString(ApiProtocol.KEY_UPLOAD_URL), jSONObject2.optString("fallback_upload_url", null));
            jSONObject2.getInt("album_id");
            jSONObject2.getInt("user_id");
            return new wni0(ocq0Var);
        } catch (JSONException e) {
            throw new VKApiIllegalResponseException(e);
        }
    }

    @Override // xsna.k7r0
    public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
        return k7r0.a.a(this, qrj0Var2);
    }
}
