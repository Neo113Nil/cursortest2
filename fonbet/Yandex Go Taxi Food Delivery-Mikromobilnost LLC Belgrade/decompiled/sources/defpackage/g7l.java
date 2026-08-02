package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class g7l implements zsq0, yey0 {
    public final JsonParserComponent a;

    public g7l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    public final j7l c(yf90 yf90Var, j7l j7lVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        exq e = wcx.e(Q, jSONObject, "angle", wm11.d, i, j7lVar != null ? j7lVar.a : null, b.g, q5z.b);
        exq exqVar = j7lVar != null ? j7lVar.b : null;
        JsonParserComponent jsonParserComponent = this.a;
        return new j7l(e, wcx.i(Q, jSONObject, "pivot_x", i, exqVar, jsonParserComponent.h6), wcx.i(Q, jSONObject, "pivot_y", i, j7lVar != null ? j7lVar.c : null, jsonParserComponent.h6));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, j7l j7lVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.q(yf90Var, jSONObject, "angle", j7lVar.a);
        exq exqVar = j7lVar.b;
        JsonParserComponent jsonParserComponent = this.a;
        wcx.u(yf90Var, jSONObject, "pivot_x", exqVar, jsonParserComponent.h6);
        wcx.u(yf90Var, jSONObject, "pivot_y", j7lVar.c, jsonParserComponent.h6);
        wwg.Z(yf90Var, jSONObject, "type", "rotation");
        return jSONObject;
    }
}
