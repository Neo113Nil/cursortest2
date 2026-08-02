package defpackage;

import com.yandex.div2.DivActionTimer$Action;
import com.yandex.div2.m;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class jak implements zsq0, yey0 {
    public static lak c(yf90 yf90Var, lak lakVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        return new lak(wcx.e(Q, jSONObject, "action", m.a, i, lakVar != null ? lakVar.a : null, DivActionTimer$Action.FROM_STRING, q5z.b), wcx.d(Q, jSONObject, "id", wm11.c, i, lakVar != null ? lakVar.b : null));
    }

    public static JSONObject d(yf90 yf90Var, lak lakVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.p(lakVar.a, DivActionTimer$Action.TO_STRING, yf90Var, "action", jSONObject);
        wcx.q(yf90Var, jSONObject, "id", lakVar.b);
        wwg.Z(yf90Var, jSONObject, "type", "timer");
        return jSONObject;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (lak) obj);
    }
}
