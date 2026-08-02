package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class k4k implements zsq0, nyi {
    public final JsonParserComponent a;

    public k4k(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final j4k a(yf90 yf90Var, JSONObject jSONObject) {
        return new j4k(a.d(yf90Var, jSONObject, "index", wm11.b, b.h), (xll) wwg.E(yf90Var, jSONObject, "value", this.a.C9), a.b(yf90Var, jSONObject, "variable_name", wm11.c, q5z.c, q5z.b));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, j4k j4kVar) {
        JSONObject jSONObject = new JSONObject();
        a.g(yf90Var, jSONObject, "index", j4kVar.a);
        wwg.Z(yf90Var, jSONObject, "type", "array_insert_value");
        wwg.b0(yf90Var, jSONObject, "value", j4kVar.b, this.a.C9);
        a.g(yf90Var, jSONObject, "variable_name", j4kVar.c);
        return jSONObject;
    }
}
