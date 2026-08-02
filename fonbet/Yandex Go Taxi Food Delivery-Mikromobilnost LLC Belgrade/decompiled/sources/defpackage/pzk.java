package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class pzk implements zsq0, yey0 {
    public final JsonParserComponent a;

    public pzk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    public final rzk c(yf90 yf90Var, rzk rzkVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        exq exqVar = rzkVar != null ? rzkVar.a : null;
        JsonParserComponent jsonParserComponent = this.a;
        return new rzk(wcx.i(Q, jSONObject, "max_size", i, exqVar, jsonParserComponent.m7), wcx.i(Q, jSONObject, "min_size", i, rzkVar != null ? rzkVar.b : null, jsonParserComponent.m7), wcx.j(Q, jSONObject, "weight", wm11.d, i, rzkVar != null ? rzkVar.c : null, b.g, jx81.b));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, rzk rzkVar) {
        JSONObject jSONObject = new JSONObject();
        exq exqVar = rzkVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wcx.u(yf90Var, jSONObject, "max_size", exqVar, jsonParserComponent.m7);
        wcx.u(yf90Var, jSONObject, "min_size", rzkVar.b, jsonParserComponent.m7);
        wwg.Z(yf90Var, jSONObject, "type", "match_parent");
        wcx.q(yf90Var, jSONObject, "weight", rzkVar.c);
        return jSONObject;
    }
}
