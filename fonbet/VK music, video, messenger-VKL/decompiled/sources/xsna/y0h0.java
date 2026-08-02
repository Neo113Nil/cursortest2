package xsna;

import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.dto.common.ImageSizeKey;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.k7r0;

/* compiled from: ImageUploadParser.kt */
/* loaded from: classes2.dex */
public final class y0h0 implements k7r0<x0h0> {
    public static final y0h0 b = new y0h0();

    @Override // xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONArray("response").getJSONObject(0);
            long j = jSONObject2.getLong("id");
            int i = jSONObject2.getInt("album_id");
            jSONObject2.getInt("owner_id");
            jSONObject2.optString("text", "");
            String string = jSONObject2.has("access_key") ? jSONObject2.getString("access_key") : "";
            jSONObject2.getLong("date");
            Set<ImageSizeKey> set = plw.a;
            JSONArray optJSONArray = jSONObject2.optJSONArray("sizes");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            return new x0h0(j, i, plw.a(optJSONArray, plw.a), string);
        } catch (JSONException e) {
            throw new VKApiIllegalResponseException(e);
        }
    }

    @Override // xsna.k7r0
    public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
        return k7r0.a.a(this, qrj0Var2);
    }
}
