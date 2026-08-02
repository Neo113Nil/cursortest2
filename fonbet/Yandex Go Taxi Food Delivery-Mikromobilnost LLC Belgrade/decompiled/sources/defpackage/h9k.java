package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class h9k implements zsq0, nyi {
    public final JsonParserComponent a;

    public h9k(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final g9k a(yf90 yf90Var, JSONObject jSONObject) {
        return new g9k((xll) wwg.E(yf90Var, jSONObject, "value", this.a.C9), a.b(yf90Var, jSONObject, "variable_name", wm11.c, q5z.c, q5z.b));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, g9k g9kVar) {
        JSONObject w = n.w(yf90Var, "type", "set_variable");
        wwg.b0(yf90Var, w, "value", g9kVar.a, this.a.C9);
        a.g(yf90Var, w, "variable_name", g9kVar.b);
        return w;
    }
}
