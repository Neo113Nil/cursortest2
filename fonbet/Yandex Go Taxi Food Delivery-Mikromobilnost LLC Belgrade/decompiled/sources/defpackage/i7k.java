package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class i7k implements zsq0, nyi {
    public final JsonParserComponent a;

    public i7k(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        JsonParserComponent jsonParserComponent = this.a;
        return new t3k((v3k) wwg.M(yf90Var, jSONObject, "action", jsonParserComponent.t1), wwg.O(yf90Var, jSONObject, "actions", jsonParserComponent.t1), a.b(yf90Var, jSONObject, "text", wm11.c, q5z.c, q5z.b));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, t3k t3kVar) {
        JSONObject jSONObject = new JSONObject();
        v3k v3kVar = t3kVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wwg.b0(yf90Var, jSONObject, "action", v3kVar, jsonParserComponent.t1);
        wwg.c0(yf90Var, jSONObject, "actions", t3kVar.b, jsonParserComponent.t1);
        a.g(yf90Var, jSONObject, "text", t3kVar.c);
        return jSONObject;
    }
}
