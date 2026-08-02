package defpackage;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class cvk implements zsq0, yey0 {
    public static JSONObject c(yf90 yf90Var, evk evkVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.q(yf90Var, jSONObject, "pattern", evkVar.a);
        wwg.Z(yf90Var, jSONObject, "type", "regex");
        return jSONObject;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        return new evk(wcx.d(udq0.Q(yf90Var), jSONObject, "pattern", wm11.c, yf90Var.i(), null));
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return c(yf90Var, (evk) obj);
    }
}
