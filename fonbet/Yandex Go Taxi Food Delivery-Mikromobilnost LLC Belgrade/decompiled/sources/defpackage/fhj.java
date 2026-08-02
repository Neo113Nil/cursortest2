package defpackage;

import com.yandex.div.internal.parser.a;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class fhj implements zsq0, nyi {
    public static ehj c(yf90 yf90Var, JSONObject jSONObject) {
        return new ehj(a.b(yf90Var, jSONObject, "value", wm11.h, q5z.c, q5z.b), (String) wwg.F("name", jSONObject));
    }

    public static JSONObject d(yf90 yf90Var, ehj ehjVar) {
        JSONObject jSONObject = new JSONObject();
        wwg.Z(yf90Var, jSONObject, "name", ehjVar.a);
        wwg.Z(yf90Var, jSONObject, "type", "dict");
        a.g(yf90Var, jSONObject, "value", ehjVar.b);
        return jSONObject;
    }

    @Override // defpackage.nyi
    public final /* bridge */ /* synthetic */ Object a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (ehj) obj);
    }
}
