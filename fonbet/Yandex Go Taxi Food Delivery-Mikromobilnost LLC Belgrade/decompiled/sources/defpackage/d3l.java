package defpackage;

import com.yandex.div2.DivPatch$Mode;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.i1;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class d3l implements zsq0, yey0 {
    public final JsonParserComponent a;

    public d3l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.Q5;
        i3y i3yVar2 = jsonParserComponent.u1;
        return new i3l(wcx.f(Q, jSONObject, "changes", i, null, i3yVar, i1.c), wcx.j(Q, jSONObject, "mode", i1.b, i, null, DivPatch$Mode.FROM_STRING, q5z.b), wcx.k(Q, jSONObject, "on_applied_actions", i, null, i3yVar2), wcx.k(Q, jSONObject, "on_failed_actions", i, null, i3yVar2));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, i3l i3lVar) {
        JSONObject jSONObject = new JSONObject();
        exq exqVar = i3lVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wcx.w(yf90Var, jSONObject, "changes", exqVar, jsonParserComponent.Q5);
        wcx.p(i3lVar.b, DivPatch$Mode.TO_STRING, yf90Var, "mode", jSONObject);
        exq exqVar2 = i3lVar.c;
        i3y i3yVar = jsonParserComponent.u1;
        wcx.w(yf90Var, jSONObject, "on_applied_actions", exqVar2, i3yVar);
        wcx.w(yf90Var, jSONObject, "on_failed_actions", i3lVar.d, i3yVar);
        return jSONObject;
    }
}
