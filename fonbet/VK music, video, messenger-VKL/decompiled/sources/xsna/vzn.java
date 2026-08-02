package xsna;

import org.json.JSONObject;
import xsna.k7r0;

/* compiled from: DonutGetFriendsApiCmd.kt */
/* loaded from: classes2.dex */
public final class vzn<Result> implements k7r0 {
    public static final vzn<Result> b = new vzn<>();

    @Override // xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        return jgq0.e(jSONObject.getJSONObject("response").getJSONArray("items"));
    }

    @Override // xsna.k7r0
    public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
        return k7r0.a.a(this, qrj0Var2);
    }
}
