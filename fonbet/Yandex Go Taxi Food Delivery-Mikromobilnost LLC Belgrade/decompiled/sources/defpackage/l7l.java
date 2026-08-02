package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class l7l implements zsq0, nyi {
    public final JsonParserComponent a;

    public l7l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final k7l a(yf90 yf90Var, JSONObject jSONObject) {
        Expression d = a.d(yf90Var, jSONObject, "background_color", wm11.f, b.b);
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.E3;
        i3y i3yVar2 = jsonParserComponent.E3;
        sqk sqkVar = (sqk) wwg.M(yf90Var, jSONObject, "corner_radius", i3yVar);
        if (sqkVar == null) {
            sqkVar = o7l.a;
        }
        sqk sqkVar2 = (sqk) wwg.M(yf90Var, jSONObject, "item_height", i3yVar2);
        if (sqkVar2 == null) {
            sqkVar2 = o7l.b;
        }
        sqk sqkVar3 = (sqk) wwg.M(yf90Var, jSONObject, "item_width", i3yVar2);
        if (sqkVar3 == null) {
            sqkVar3 = o7l.c;
        }
        return new k7l(d, sqkVar, sqkVar2, sqkVar3, (bcl) wwg.M(yf90Var, jSONObject, "stroke", jsonParserComponent.Y7));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, k7l k7lVar) {
        JSONObject jSONObject = new JSONObject();
        a.h(yf90Var, jSONObject, "background_color", k7lVar.a, b.a);
        sqk sqkVar = k7lVar.b;
        JsonParserComponent jsonParserComponent = this.a;
        wwg.b0(yf90Var, jSONObject, "corner_radius", sqkVar, jsonParserComponent.E3);
        wwg.b0(yf90Var, jSONObject, "item_height", k7lVar.c, jsonParserComponent.E3);
        wwg.b0(yf90Var, jSONObject, "item_width", k7lVar.d, jsonParserComponent.E3);
        wwg.b0(yf90Var, jSONObject, "stroke", k7lVar.e, jsonParserComponent.Y7);
        wwg.Z(yf90Var, jSONObject, "type", "rounded_rectangle");
        return jSONObject;
    }
}
