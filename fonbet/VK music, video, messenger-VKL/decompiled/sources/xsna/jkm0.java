package xsna;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import xsna.k7r0;

/* compiled from: StoryVideoUploader.kt */
/* loaded from: classes2.dex */
public final class jkm0<Result> implements k7r0 {
    public static final jkm0<Result> b = new jkm0<>();

    @Override // xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
        return new ocq0(jSONObject2.getString(ApiProtocol.KEY_UPLOAD_URL), jSONObject2.optString("fallback_upload_url", null));
    }

    @Override // xsna.k7r0
    public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
        return k7r0.a.a(this, qrj0Var2);
    }
}
