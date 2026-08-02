package xsna;

import org.json.JSONObject;

/* compiled from: UtilsResolveScreenName.kt */
/* loaded from: classes6.dex */
public final class b4r0 extends rdx0<aag0> {
    public b4r0(String str) {
        super("utils.resolveScreenName");
        j("screen_name", str);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        aag0 aag0Var;
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("response");
            aag0Var = new aag0(jSONObject2.getLong("object_id"), jSONObject2.optLong("group_id"), jSONObject2.getString("type"));
        } catch (Throwable unused) {
            aag0Var = null;
        }
        return aag0Var == null ? new aag0(-1L, -1L, "unknown") : aag0Var;
    }
}
