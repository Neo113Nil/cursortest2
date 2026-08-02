package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class m7w implements zsq0, nyi {
    public static l7w c(yf90 yf90Var, JSONObject jSONObject) {
        return new l7w(a.b(yf90Var, jSONObject, "value", wm11.b, b.h, q5z.b), (String) wwg.F("name", jSONObject));
    }

    public static JSONObject d(yf90 yf90Var, l7w l7wVar) {
        JSONObject jSONObject = new JSONObject();
        wwg.Z(yf90Var, jSONObject, "name", l7wVar.a);
        wwg.Z(yf90Var, jSONObject, "type", "integer");
        a.g(yf90Var, jSONObject, "value", l7wVar.b);
        return jSONObject;
    }

    @Override // defpackage.nyi
    public final /* bridge */ /* synthetic */ Object a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (l7w) obj);
    }
}
