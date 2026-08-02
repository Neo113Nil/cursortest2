package xsna;

import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.dto.common.im.Image;
import java.util.Collections;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.k7r0;

/* compiled from: UploadParsers.kt */
/* loaded from: classes2.dex */
public final class adu implements k7r0<zcu> {
    public static final adu b = new adu();

    @Override // xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("response").getJSONObject("graffiti");
            long j = jSONObject2.getLong("id");
            jSONObject2.getInt("owner_id");
            return new zcu(j, Collections.singletonList(new Image(jSONObject2.getInt("width"), jSONObject2.getInt("height"), jSONObject2.getString("url"), false)), jSONObject2.has("access_key") ? jSONObject2.getString("access_key") : "");
        } catch (JSONException e) {
            throw new VKApiIllegalResponseException(e);
        }
    }

    @Override // xsna.k7r0
    public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
        return k7r0.a.a(this, qrj0Var2);
    }
}
