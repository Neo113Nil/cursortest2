package defpackage;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class f4k implements zsq0, nyi {
    public static e4k c(JSONObject jSONObject) {
        return new e4k((String) wwg.F("animator_id", jSONObject));
    }

    public static JSONObject d(yf90 yf90Var, e4k e4kVar) {
        JSONObject jSONObject = new JSONObject();
        wwg.Z(yf90Var, jSONObject, "animator_id", e4kVar.a);
        wwg.Z(yf90Var, jSONObject, "type", "animator_stop");
        return jSONObject;
    }

    @Override // defpackage.nyi
    public final /* bridge */ /* synthetic */ Object a(yf90 yf90Var, JSONObject jSONObject) {
        return c(jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (e4k) obj);
    }
}
