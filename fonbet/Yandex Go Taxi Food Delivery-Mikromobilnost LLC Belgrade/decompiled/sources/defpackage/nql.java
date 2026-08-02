package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class nql implements zsq0, yey0 {
    public final JsonParserComponent a;

    public nql(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    public final pql c(yf90 yf90Var, pql pqlVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        exq j = wcx.j(Q, jSONObject, "constrained", wm11.a, i, pqlVar != null ? pqlVar.a : null, b.f, q5z.b);
        exq exqVar = pqlVar != null ? pqlVar.b : null;
        JsonParserComponent jsonParserComponent = this.a;
        return new pql(j, wcx.i(Q, jSONObject, "max_size", i, exqVar, jsonParserComponent.m7), wcx.i(Q, jSONObject, "min_size", i, pqlVar != null ? pqlVar.c : null, jsonParserComponent.m7));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, pql pqlVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.q(yf90Var, jSONObject, "constrained", pqlVar.a);
        exq exqVar = pqlVar.b;
        JsonParserComponent jsonParserComponent = this.a;
        wcx.u(yf90Var, jSONObject, "max_size", exqVar, jsonParserComponent.m7);
        wcx.u(yf90Var, jSONObject, "min_size", pqlVar.c, jsonParserComponent.m7);
        wwg.Z(yf90Var, jSONObject, "type", "wrap_content");
        return jSONObject;
    }
}
