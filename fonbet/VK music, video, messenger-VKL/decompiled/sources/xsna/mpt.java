package xsna;

import org.json.JSONObject;
import xsna.k7r0;

/* compiled from: GetAnonymousTokenApiCommand.kt */
/* loaded from: classes.dex */
public final class mpt<Result> implements k7r0 {
    public static final mpt<Result> b = new mpt<>();

    @Override // xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        return jSONObject.getJSONObject("response").optString("token");
    }

    @Override // xsna.k7r0
    public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
        return k7r0.a.a(this, qrj0Var2);
    }
}
