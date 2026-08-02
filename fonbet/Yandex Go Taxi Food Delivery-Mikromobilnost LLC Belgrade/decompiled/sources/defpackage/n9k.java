package defpackage;

import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class n9k implements zsq0, yey0 {
    public static p9k c(yf90 yf90Var, p9k p9kVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        return new p9k(wcx.d(Q, jSONObject, "id", wm11.c, i, p9kVar != null ? p9kVar.a : null), wcx.j(Q, jSONObject, "multiple", wm11.a, i, p9kVar != null ? p9kVar.b : null, b.f, q5z.b));
    }

    public static JSONObject d(yf90 yf90Var, p9k p9kVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.q(yf90Var, jSONObject, "id", p9kVar.a);
        wcx.q(yf90Var, jSONObject, "multiple", p9kVar.b);
        wwg.Z(yf90Var, jSONObject, "type", "show_tooltip");
        return jSONObject;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (p9k) obj);
    }
}
