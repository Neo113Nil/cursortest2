package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class ael implements zsq0, nyi {
    public final JsonParserComponent a;

    public ael(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        JsonParserComponent jsonParserComponent = this.a;
        sqk sqkVar = (sqk) wwg.M(yf90Var, jSONObject, "height", jsonParserComponent.E3);
        if (sqkVar == null) {
            sqkVar = cel.a;
        }
        Expression b = a.b(yf90Var, jSONObject, "image_url", wm11.e, b.e, q5z.b);
        sqk sqkVar2 = (sqk) wwg.M(yf90Var, jSONObject, "width", jsonParserComponent.E3);
        if (sqkVar2 == null) {
            sqkVar2 = cel.b;
        }
        return new ldl(sqkVar, b, sqkVar2);
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, ldl ldlVar) {
        JSONObject jSONObject = new JSONObject();
        sqk sqkVar = ldlVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wwg.b0(yf90Var, jSONObject, "height", sqkVar, jsonParserComponent.E3);
        a.h(yf90Var, jSONObject, "image_url", ldlVar.b, b.c);
        wwg.b0(yf90Var, jSONObject, "width", ldlVar.c, jsonParserComponent.E3);
        return jSONObject;
    }
}
