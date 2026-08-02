package defpackage;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class oqk implements zsq0, yey0 {
    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        ums umsVar = wm11.c;
        z3k z3kVar = pqk.b;
        abl0 abl0Var = q5z.c;
        return new qqk(wcx.e(Q, jSONObject, "key", umsVar, i, null, abl0Var, z3kVar), wcx.j(Q, jSONObject, "placeholder", umsVar, i, null, abl0Var, pqk.c), wcx.j(Q, jSONObject, "regex", umsVar, i, null, abl0Var, q5z.b));
    }

    @Override // defpackage.zsq0
    public final JSONObject b(yf90 yf90Var, Object obj) {
        qqk qqkVar = (qqk) obj;
        JSONObject jSONObject = new JSONObject();
        wcx.q(yf90Var, jSONObject, "key", qqkVar.a);
        wcx.q(yf90Var, jSONObject, "placeholder", qqkVar.b);
        wcx.q(yf90Var, jSONObject, "regex", qqkVar.c);
        return jSONObject;
    }
}
