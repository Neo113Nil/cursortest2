package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class m6k implements zsq0, yey0 {
    public final JsonParserComponent a;

    public m6k(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    public final o6k c(yf90 yf90Var, o6k o6kVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        exq exqVar = o6kVar != null ? o6kVar.a : null;
        JsonParserComponent jsonParserComponent = this.a;
        return new o6k(wcx.k(Q, jSONObject, "on_fail_actions", i, exqVar, jsonParserComponent.u1), wcx.k(Q, jSONObject, "on_success_actions", i, o6kVar != null ? o6kVar.b : null, jsonParserComponent.u1), wcx.e(Q, jSONObject, "url", wm11.e, i, o6kVar != null ? o6kVar.c : null, b.e, q5z.b));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, o6k o6kVar) {
        JSONObject jSONObject = new JSONObject();
        exq exqVar = o6kVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wcx.w(yf90Var, jSONObject, "on_fail_actions", exqVar, jsonParserComponent.u1);
        wcx.w(yf90Var, jSONObject, "on_success_actions", o6kVar.b, jsonParserComponent.u1);
        wwg.Z(yf90Var, jSONObject, "type", "download");
        wcx.p(o6kVar.c, b.c, yf90Var, "url", jSONObject);
        return jSONObject;
    }
}
