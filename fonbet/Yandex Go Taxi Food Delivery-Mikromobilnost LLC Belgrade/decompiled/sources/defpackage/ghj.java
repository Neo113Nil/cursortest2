package defpackage;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class ghj implements zsq0, yey0 {
    public static ihj c(yf90 yf90Var, ihj ihjVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        return new ihj(wcx.a(Q, jSONObject, "name", i, ihjVar != null ? ihjVar.a : null), wcx.d(Q, jSONObject, "value", wm11.h, i, ihjVar != null ? ihjVar.b : null));
    }

    public static JSONObject d(yf90 yf90Var, ihj ihjVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.t(yf90Var, jSONObject, "name", ihjVar.a);
        wwg.Z(yf90Var, jSONObject, "type", "dict");
        wcx.q(yf90Var, jSONObject, "value", ihjVar.b);
        return jSONObject;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (ihj) obj);
    }
}
