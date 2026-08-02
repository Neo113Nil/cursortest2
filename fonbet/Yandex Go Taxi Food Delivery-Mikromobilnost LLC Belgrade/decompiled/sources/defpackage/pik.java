package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class pik implements zsq0, nyi {
    public final JsonParserComponent a;

    public pik(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final oik a(yf90 yf90Var, JSONObject jSONObject) {
        Expression d = a.d(yf90Var, jSONObject, "background_color", wm11.f, b.b);
        JsonParserComponent jsonParserComponent = this.a;
        sqk sqkVar = (sqk) wwg.M(yf90Var, jSONObject, "radius", jsonParserComponent.E3);
        if (sqkVar == null) {
            sqkVar = sik.a;
        }
        return new oik(d, sqkVar, (bcl) wwg.M(yf90Var, jSONObject, "stroke", jsonParserComponent.Y7));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, oik oikVar) {
        JSONObject jSONObject = new JSONObject();
        a.h(yf90Var, jSONObject, "background_color", oikVar.a, b.a);
        sqk sqkVar = oikVar.b;
        JsonParserComponent jsonParserComponent = this.a;
        wwg.b0(yf90Var, jSONObject, "radius", sqkVar, jsonParserComponent.E3);
        wwg.b0(yf90Var, jSONObject, "stroke", oikVar.c, jsonParserComponent.Y7);
        wwg.Z(yf90Var, jSONObject, "type", "circle");
        return jSONObject;
    }
}
