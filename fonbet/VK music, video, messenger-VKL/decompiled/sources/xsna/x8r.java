package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.k7r0;

/* compiled from: ImageUploadParser.kt */
/* loaded from: classes2.dex */
public final class x8r implements k7r0<w8r> {
    public static final x8r b = new x8r();

    @Override // xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        VKApiExecutionException a;
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("files").getJSONObject("file1");
            if (!jSONObject2.has("error_code")) {
                return new w8r(jSONObject.toString());
            }
            int i = VKApiExecutionException.b;
            a = VKApiExecutionException.a.a(jSONObject2, (r2 & 2) != 0 ? null : "/v2/bulk_upload", null);
            throw a;
        } catch (JSONException e) {
            throw new VKApiIllegalResponseException(e);
        }
    }

    @Override // xsna.k7r0
    public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
        return k7r0.a.a(this, qrj0Var2);
    }
}
