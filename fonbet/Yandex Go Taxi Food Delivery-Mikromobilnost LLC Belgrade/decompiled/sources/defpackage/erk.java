package defpackage;

import com.yandex.div2.j0;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class erk implements zsq0, yey0 {
    public static JSONObject c(yf90 yf90Var, j0 j0Var) {
        JSONObject jSONObject = new JSONObject();
        wcx.q(yf90Var, jSONObject, "down", j0Var.a);
        wcx.q(yf90Var, jSONObject, "forward", j0Var.b);
        wcx.q(yf90Var, jSONObject, "left", j0Var.c);
        wcx.q(yf90Var, jSONObject, "right", j0Var.d);
        wcx.q(yf90Var, jSONObject, "up", j0Var.e);
        return jSONObject;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        ums umsVar = wm11.c;
        abl0 abl0Var = q5z.c;
        kbs kbsVar = q5z.b;
        return new j0(wcx.j(Q, jSONObject, "down", umsVar, i, null, abl0Var, kbsVar), wcx.j(Q, jSONObject, "forward", umsVar, i, null, abl0Var, kbsVar), wcx.j(Q, jSONObject, "left", umsVar, i, null, abl0Var, kbsVar), wcx.j(Q, jSONObject, "right", umsVar, i, null, abl0Var, kbsVar), wcx.j(Q, jSONObject, "up", umsVar, i, null, abl0Var, kbsVar));
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return c(yf90Var, (j0) obj);
    }
}
