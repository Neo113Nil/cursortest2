package xsna;

import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.dto.common.id.UserId;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.k7r0;

/* compiled from: StoriesUploadParser.kt */
/* loaded from: classes2.dex */
public final class gcm0 implements k7r0<fcm0> {
    public static final gcm0 b = new gcm0();

    @Override // xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("response").getJSONArray("items").getJSONObject(0);
            return new fcm0(jSONObject2.getInt("id"), new UserId(jSONObject2.getLong("owner_id")), f370.D(jSONObject2, "access_key"));
        } catch (JSONException e) {
            throw new VKApiIllegalResponseException(e);
        }
    }

    @Override // xsna.k7r0
    public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
        return k7r0.a.a(this, qrj0Var2);
    }
}
