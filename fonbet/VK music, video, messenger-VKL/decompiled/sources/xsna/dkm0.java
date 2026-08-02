package xsna;

import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.k7r0;

/* compiled from: StoryUploadInfoParser.kt */
/* loaded from: classes2.dex */
public final class dkm0 implements k7r0<String> {
    public static final dkm0 b = new dkm0();

    @Override // xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        try {
            return jSONObject.getJSONObject("response").getString("upload_result");
        } catch (JSONException e) {
            throw new VKApiIllegalResponseException(e);
        }
    }

    @Override // xsna.k7r0
    public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
        return k7r0.a.a(this, qrj0Var2);
    }
}
