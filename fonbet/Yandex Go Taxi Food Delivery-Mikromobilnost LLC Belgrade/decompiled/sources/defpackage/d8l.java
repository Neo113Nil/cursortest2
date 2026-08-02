package defpackage;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class d8l implements zsq0, yey0 {
    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        ums umsVar = wm11.c;
        return new e8l(wcx.j(Q, jSONObject, "text", umsVar, i, null, q5z.c, q5z.b), wcx.d(Q, jSONObject, "value", umsVar, i, null));
    }

    @Override // defpackage.zsq0
    public final JSONObject b(yf90 yf90Var, Object obj) {
        e8l e8lVar = (e8l) obj;
        JSONObject jSONObject = new JSONObject();
        wcx.q(yf90Var, jSONObject, "text", e8lVar.a);
        wcx.q(yf90Var, jSONObject, "value", e8lVar.b);
        return jSONObject;
    }
}
