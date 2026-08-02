package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class g6k implements zsq0, nyi {
    public final JsonParserComponent a;

    public g6k(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final f6k a(yf90 yf90Var, JSONObject jSONObject) {
        ums umsVar = wm11.c;
        return new f6k(a.a(yf90Var, jSONObject, "key", umsVar), (xll) wwg.M(yf90Var, jSONObject, "value", this.a.C9), a.b(yf90Var, jSONObject, "variable_name", umsVar, q5z.c, q5z.b));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, f6k f6kVar) {
        JSONObject jSONObject = new JSONObject();
        a.g(yf90Var, jSONObject, "key", f6kVar.a);
        wwg.Z(yf90Var, jSONObject, "type", "dict_set_value");
        wwg.b0(yf90Var, jSONObject, "value", f6kVar.b, this.a.C9);
        a.g(yf90Var, jSONObject, "variable_name", f6kVar.c);
        return jSONObject;
    }
}
