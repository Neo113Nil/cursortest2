package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class j7k implements zsq0, yey0 {
    public final JsonParserComponent a;

    public j7k(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        JsonParserComponent jsonParserComponent = this.a;
        return new eak(wcx.i(Q, jSONObject, "action", i, null, jsonParserComponent.u1), wcx.k(Q, jSONObject, "actions", i, null, jsonParserComponent.u1), wcx.d(Q, jSONObject, "text", wm11.c, i, null));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, eak eakVar) {
        JSONObject jSONObject = new JSONObject();
        exq exqVar = eakVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wcx.u(yf90Var, jSONObject, "action", exqVar, jsonParserComponent.u1);
        wcx.w(yf90Var, jSONObject, "actions", eakVar.b, jsonParserComponent.u1);
        wcx.q(yf90Var, jSONObject, "text", eakVar.c);
        return jSONObject;
    }
}
