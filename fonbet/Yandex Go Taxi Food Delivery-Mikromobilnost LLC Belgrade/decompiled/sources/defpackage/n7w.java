package defpackage;

import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class n7w implements zsq0, yey0 {
    public static p7w c(yf90 yf90Var, p7w p7wVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        return new p7w(wcx.a(Q, jSONObject, "name", i, p7wVar != null ? p7wVar.a : null), wcx.e(Q, jSONObject, "value", wm11.b, i, p7wVar != null ? p7wVar.b : null, b.h, q5z.b));
    }

    public static JSONObject d(yf90 yf90Var, p7w p7wVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.t(yf90Var, jSONObject, "name", p7wVar.a);
        wwg.Z(yf90Var, jSONObject, "type", "integer");
        wcx.q(yf90Var, jSONObject, "value", p7wVar.b);
        return jSONObject;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (p7w) obj);
    }
}
