package defpackage;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class epk implements zsq0, nyi {
    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        String str = (String) wwg.F("id", jSONObject);
        Object opt = jSONObject.opt("params");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        return new bpk(str, (JSONObject) (opt != null ? opt : null));
    }

    @Override // defpackage.zsq0
    public final JSONObject b(yf90 yf90Var, Object obj) {
        bpk bpkVar = (bpk) obj;
        JSONObject jSONObject = new JSONObject();
        wwg.Z(yf90Var, jSONObject, "id", bpkVar.a);
        wwg.Z(yf90Var, jSONObject, "params", bpkVar.b);
        return jSONObject;
    }
}
