package defpackage;

import com.yandex.div2.DivEvaluableType;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class lrk implements zsq0, yey0 {
    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        return new mrk(wcx.a(Q, jSONObject, "name", i, null), wcx.b(Q, jSONObject, "type", i, null, DivEvaluableType.FROM_STRING, q5z.b));
    }

    @Override // defpackage.zsq0
    public final JSONObject b(yf90 yf90Var, Object obj) {
        mrk mrkVar = (mrk) obj;
        JSONObject jSONObject = new JSONObject();
        wcx.t(yf90Var, jSONObject, "name", mrkVar.a);
        wcx.s(mrkVar.b, DivEvaluableType.TO_STRING, yf90Var, "type", jSONObject);
        return jSONObject;
    }
}
