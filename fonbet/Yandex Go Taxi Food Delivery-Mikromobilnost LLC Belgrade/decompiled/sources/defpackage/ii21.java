package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class ii21 implements zsq0, nyi {
    public static hi21 c(yf90 yf90Var, JSONObject jSONObject) {
        return new hi21(a.b(yf90Var, jSONObject, "value", wm11.e, b.e, q5z.b), (String) wwg.F("name", jSONObject));
    }

    public static JSONObject d(yf90 yf90Var, hi21 hi21Var) {
        JSONObject jSONObject = new JSONObject();
        wwg.Z(yf90Var, jSONObject, "name", hi21Var.a);
        wwg.Z(yf90Var, jSONObject, "type", "url");
        a.h(yf90Var, jSONObject, "value", hi21Var.b, b.c);
        return jSONObject;
    }

    @Override // defpackage.nyi
    public final /* bridge */ /* synthetic */ Object a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (hi21) obj);
    }
}
