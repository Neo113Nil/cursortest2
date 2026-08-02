package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class f7l implements zsq0, nyi {
    public final JsonParserComponent a;

    public f7l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final e7l a(yf90 yf90Var, JSONObject jSONObject) {
        Expression b = a.b(yf90Var, jSONObject, "angle", wm11.d, b.g, q5z.b);
        JsonParserComponent jsonParserComponent = this.a;
        z3l z3lVar = (z3l) wwg.M(yf90Var, jSONObject, "pivot_x", jsonParserComponent.g6);
        if (z3lVar == null) {
            z3lVar = i7l.a;
        }
        z3l z3lVar2 = (z3l) wwg.M(yf90Var, jSONObject, "pivot_y", jsonParserComponent.g6);
        if (z3lVar2 == null) {
            z3lVar2 = i7l.b;
        }
        return new e7l(z3lVar, z3lVar2, b);
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, e7l e7lVar) {
        JSONObject jSONObject = new JSONObject();
        a.g(yf90Var, jSONObject, "angle", e7lVar.a);
        z3l z3lVar = e7lVar.b;
        JsonParserComponent jsonParserComponent = this.a;
        wwg.b0(yf90Var, jSONObject, "pivot_x", z3lVar, jsonParserComponent.g6);
        wwg.b0(yf90Var, jSONObject, "pivot_y", e7lVar.c, jsonParserComponent.g6);
        wwg.Z(yf90Var, jSONObject, "type", "rotation");
        return jSONObject;
    }
}
