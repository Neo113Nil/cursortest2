package xsna;

import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.dto.common.id.UserId;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import xsna.k7r0;

/* compiled from: UploadParsers.kt */
/* loaded from: classes2.dex */
public final class bet0 implements k7r0<iot0> {
    public static final bet0 b = new bet0();

    @Override // xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("response");
            return new iot0(jSONObject2.getLong("video_id"), new UserId(jSONObject2.getLong("owner_id")), jSONObject2.has("title") ? jSONObject2.getString("title") : "", jSONObject2.has("description") ? jSONObject2.getString("description") : "", new ocq0(jSONObject2.getString(ApiProtocol.KEY_UPLOAD_URL), jSONObject2.optString("fallback_upload_url", null)), jSONObject2.has("access_key") ? jSONObject2.getString("access_key") : "", null);
        } catch (JSONException e) {
            throw new VKApiIllegalResponseException(e);
        }
    }

    @Override // xsna.k7r0
    public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
        return k7r0.a.a(this, qrj0Var2);
    }
}
