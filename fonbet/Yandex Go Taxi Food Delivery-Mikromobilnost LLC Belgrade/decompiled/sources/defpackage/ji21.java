package defpackage;

import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class ji21 implements zsq0, yey0 {
    public static li21 c(yf90 yf90Var, li21 li21Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        return new li21(wcx.a(Q, jSONObject, "name", i, li21Var != null ? li21Var.a : null), wcx.e(Q, jSONObject, "value", wm11.e, i, li21Var != null ? li21Var.b : null, b.e, q5z.b));
    }

    public static JSONObject d(yf90 yf90Var, li21 li21Var) {
        JSONObject jSONObject = new JSONObject();
        wcx.t(yf90Var, jSONObject, "name", li21Var.a);
        wwg.Z(yf90Var, jSONObject, "type", "url");
        wcx.p(li21Var.b, b.c, yf90Var, "value", jSONObject);
        return jSONObject;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (li21) obj);
    }
}
