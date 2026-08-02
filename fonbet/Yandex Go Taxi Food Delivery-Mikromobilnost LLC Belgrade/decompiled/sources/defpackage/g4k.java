package defpackage;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class g4k implements zsq0, yey0 {
    public static JSONObject c(yf90 yf90Var, i4k i4kVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.t(yf90Var, jSONObject, "animator_id", i4kVar.a);
        wwg.Z(yf90Var, jSONObject, "type", "animator_stop");
        return jSONObject;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        return new i4k(wcx.a(udq0.Q(yf90Var), jSONObject, "animator_id", yf90Var.i(), null));
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return c(yf90Var, (i4k) obj);
    }
}
