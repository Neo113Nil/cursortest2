package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class mql implements zsq0, nyi {
    public final JsonParserComponent a;

    public mql(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final lql a(yf90 yf90Var, JSONObject jSONObject) {
        Expression d = a.d(yf90Var, jSONObject, "constrained", wm11.a, b.f);
        JsonParserComponent jsonParserComponent = this.a;
        return new lql((t9l) wwg.M(yf90Var, jSONObject, "max_size", jsonParserComponent.l7), (t9l) wwg.M(yf90Var, jSONObject, "min_size", jsonParserComponent.l7), d);
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, lql lqlVar) {
        JSONObject jSONObject = new JSONObject();
        a.g(yf90Var, jSONObject, "constrained", lqlVar.a);
        t9l t9lVar = lqlVar.b;
        JsonParserComponent jsonParserComponent = this.a;
        wwg.b0(yf90Var, jSONObject, "max_size", t9lVar, jsonParserComponent.l7);
        wwg.b0(yf90Var, jSONObject, "min_size", lqlVar.c, jsonParserComponent.l7);
        wwg.Z(yf90Var, jSONObject, "type", "wrap_content");
        return jSONObject;
    }
}
