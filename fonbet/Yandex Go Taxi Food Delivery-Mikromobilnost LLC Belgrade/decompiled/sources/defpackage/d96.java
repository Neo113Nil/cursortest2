package defpackage;

import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class d96 implements zsq0, yey0 {
    public static f96 c(yf90 yf90Var, f96 f96Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        return new f96(wcx.a(Q, jSONObject, "name", i, f96Var != null ? f96Var.a : null), wcx.e(Q, jSONObject, "value", wm11.a, i, f96Var != null ? f96Var.b : null, b.f, q5z.b));
    }

    public static JSONObject d(yf90 yf90Var, f96 f96Var) {
        JSONObject jSONObject = new JSONObject();
        wcx.t(yf90Var, jSONObject, "name", f96Var.a);
        wwg.Z(yf90Var, jSONObject, "type", "boolean");
        wcx.q(yf90Var, jSONObject, "value", f96Var.b);
        return jSONObject;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (f96) obj);
    }
}
