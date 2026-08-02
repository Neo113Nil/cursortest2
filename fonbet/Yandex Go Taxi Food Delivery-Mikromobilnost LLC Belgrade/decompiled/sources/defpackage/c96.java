package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c96 implements zsq0, nyi {
    public static b96 c(yf90 yf90Var, JSONObject jSONObject) {
        return new b96(a.b(yf90Var, jSONObject, "value", wm11.a, b.f, q5z.b), (String) wwg.F("name", jSONObject));
    }

    public static JSONObject d(yf90 yf90Var, b96 b96Var) {
        JSONObject jSONObject = new JSONObject();
        wwg.Z(yf90Var, jSONObject, "name", b96Var.a);
        wwg.Z(yf90Var, jSONObject, "type", "boolean");
        a.g(yf90Var, jSONObject, "value", b96Var.b);
        return jSONObject;
    }

    @Override // defpackage.nyi
    public final /* bridge */ /* synthetic */ Object a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (b96) obj);
    }
}
