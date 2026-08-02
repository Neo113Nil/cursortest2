package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class pal implements zsq0, nyi {
    public final JsonParserComponent a;

    public pal(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        tms tmsVar = wm11.b;
        tls tlsVar = b.h;
        Expression d = a.d(yf90Var, jSONObject, "end", tmsVar, tlsVar);
        JsonParserComponent jsonParserComponent = this.a;
        DivEdgeInsets divEdgeInsets = (DivEdgeInsets) wwg.M(yf90Var, jSONObject, "margins", jsonParserComponent.g3);
        Expression e = a.e(yf90Var, jSONObject, "start", tmsVar, tlsVar, q5z.b, null);
        i3y i3yVar = jsonParserComponent.d3;
        return new fal(d, divEdgeInsets, e, (aok) wwg.M(yf90Var, jSONObject, "track_active_style", i3yVar), (aok) wwg.M(yf90Var, jSONObject, "track_inactive_style", i3yVar));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, fal falVar) {
        JSONObject jSONObject = new JSONObject();
        a.g(yf90Var, jSONObject, "end", falVar.a);
        DivEdgeInsets divEdgeInsets = falVar.b;
        JsonParserComponent jsonParserComponent = this.a;
        wwg.b0(yf90Var, jSONObject, "margins", divEdgeInsets, jsonParserComponent.g3);
        a.g(yf90Var, jSONObject, "start", falVar.c);
        wwg.b0(yf90Var, jSONObject, "track_active_style", falVar.d, jsonParserComponent.d3);
        wwg.b0(yf90Var, jSONObject, "track_inactive_style", falVar.e, jsonParserComponent.d3);
        return jSONObject;
    }
}
