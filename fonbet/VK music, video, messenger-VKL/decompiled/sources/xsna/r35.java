package xsna;

import org.json.JSONObject;
import xsna.k7r0;

/* compiled from: AuthGetVkConnectRemoteConfig.kt */
/* loaded from: classes6.dex */
public final class r35<Result> implements k7r0 {
    public static final r35<Result> b = new r35<>();

    @Override // xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        return new wmu0(jSONObject.getString("user_visible_auth"), jSONObject.optString("edu_auth_url"), jSONObject.optString("edu_reg_url"));
    }

    @Override // xsna.k7r0
    public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
        return k7r0.a.a(this, qrj0Var2);
    }
}
