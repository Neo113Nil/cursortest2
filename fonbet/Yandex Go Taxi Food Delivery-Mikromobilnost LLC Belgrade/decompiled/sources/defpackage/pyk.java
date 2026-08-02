package defpackage;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class pyk implements zsq0, yey0 {
    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        abl0 abl0Var = q5z.c;
        return new qyk(wcx.h(Q, jSONObject, "height_variable_name", i, null, abl0Var), wcx.h(Q, jSONObject, "width_variable_name", i, null, abl0Var));
    }

    @Override // defpackage.zsq0
    public final JSONObject b(yf90 yf90Var, Object obj) {
        qyk qykVar = (qyk) obj;
        JSONObject jSONObject = new JSONObject();
        wcx.t(yf90Var, jSONObject, "height_variable_name", qykVar.a);
        wcx.t(yf90Var, jSONObject, "width_variable_name", qykVar.b);
        return jSONObject;
    }
}
