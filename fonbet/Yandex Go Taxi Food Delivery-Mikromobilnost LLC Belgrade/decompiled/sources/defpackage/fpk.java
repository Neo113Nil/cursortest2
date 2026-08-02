package defpackage;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class fpk implements zsq0, yey0 {
    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        return new gpk(wcx.a(Q, jSONObject, "id", i, null), wcx.h(Q, jSONObject, "params", i, null, q5z.c));
    }

    @Override // defpackage.zsq0
    public final JSONObject b(yf90 yf90Var, Object obj) {
        gpk gpkVar = (gpk) obj;
        JSONObject jSONObject = new JSONObject();
        wcx.t(yf90Var, jSONObject, "id", gpkVar.a);
        wcx.t(yf90Var, jSONObject, "params", gpkVar.b);
        return jSONObject;
    }
}
