package xsna;

import org.json.JSONObject;
import xsna.k7r0;

/* compiled from: ChatsJoinByLinkCmd.kt */
/* loaded from: classes2.dex */
public final class szb<Result> implements k7r0 {
    public static final szb<Result> b = new szb<>();

    @Override // xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.getJSONObject("response").getLong("chat_id"));
    }

    @Override // xsna.k7r0
    public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
        return k7r0.a.a(this, qrj0Var2);
    }
}
