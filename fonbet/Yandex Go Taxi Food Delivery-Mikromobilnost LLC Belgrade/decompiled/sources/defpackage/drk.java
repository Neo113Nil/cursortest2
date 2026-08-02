package defpackage;

import com.yandex.div2.JsonParserComponent;
import io.appmetrica.analytics.impl.C0553n3;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class drk implements zsq0, yey0 {
    public final JsonParserComponent a;

    public drk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.P1;
        i3y i3yVar2 = jsonParserComponent.u1;
        return new frk(wcx.k(Q, jSONObject, C0553n3.g, i, null, i3yVar), wcx.i(Q, jSONObject, "border", i, null, jsonParserComponent.V1), wcx.i(Q, jSONObject, "next_focus_ids", i, null, jsonParserComponent.O3), wcx.k(Q, jSONObject, "on_blur", i, null, i3yVar2), wcx.k(Q, jSONObject, "on_focus", i, null, i3yVar2));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, frk frkVar) {
        JSONObject jSONObject = new JSONObject();
        exq exqVar = frkVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wcx.w(yf90Var, jSONObject, C0553n3.g, exqVar, jsonParserComponent.P1);
        wcx.u(yf90Var, jSONObject, "border", frkVar.b, jsonParserComponent.V1);
        wcx.u(yf90Var, jSONObject, "next_focus_ids", frkVar.c, jsonParserComponent.O3);
        exq exqVar2 = frkVar.d;
        i3y i3yVar = jsonParserComponent.u1;
        wcx.w(yf90Var, jSONObject, "on_blur", exqVar2, i3yVar);
        wcx.w(yf90Var, jSONObject, "on_focus", frkVar.e, i3yVar);
        return jSONObject;
    }
}
