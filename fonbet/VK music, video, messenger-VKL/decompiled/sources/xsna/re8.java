package xsna;

import org.json.JSONObject;
import xsna.k7r0;

/* compiled from: BroadcastDataProvider.kt */
/* loaded from: classes7.dex */
public final class re8<Result> implements k7r0 {
    public static final re8<Result> b = new re8<>();

    @Override // xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
        return new cfw0(jSONObject2.getString("video_id"), jSONObject2.getString("owner_id"), jSONObject2.getJSONObject("stream").getString("ov_id"));
    }

    @Override // xsna.k7r0
    public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
        return k7r0.a.a(this, qrj0Var2);
    }
}
