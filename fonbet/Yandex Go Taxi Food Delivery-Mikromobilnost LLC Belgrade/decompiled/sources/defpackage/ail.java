package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class ail implements zsq0, yey0 {
    public final JsonParserComponent a;

    public ail(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        tms tmsVar = wm11.b;
        tls tlsVar = b.h;
        exq j = wcx.j(Q, jSONObject, "duration", tmsVar, i, null, tlsVar, bil.b);
        JsonParserComponent jsonParserComponent = this.a;
        return new cil(j, wcx.k(Q, jSONObject, "end_actions", i, null, jsonParserComponent.u1), wcx.a(Q, jSONObject, "id", i, null), wcx.k(Q, jSONObject, "tick_actions", i, null, jsonParserComponent.u1), wcx.j(Q, jSONObject, "tick_interval", tmsVar, i, null, tlsVar, bil.c), wcx.h(Q, jSONObject, "value_variable", i, null, q5z.c));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, cil cilVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.q(yf90Var, jSONObject, "duration", cilVar.a);
        exq exqVar = cilVar.b;
        JsonParserComponent jsonParserComponent = this.a;
        wcx.w(yf90Var, jSONObject, "end_actions", exqVar, jsonParserComponent.u1);
        wcx.t(yf90Var, jSONObject, "id", cilVar.c);
        wcx.w(yf90Var, jSONObject, "tick_actions", cilVar.d, jsonParserComponent.u1);
        wcx.q(yf90Var, jSONObject, "tick_interval", cilVar.e);
        wcx.t(yf90Var, jSONObject, "value_variable", cilVar.f);
        return jSONObject;
    }
}
