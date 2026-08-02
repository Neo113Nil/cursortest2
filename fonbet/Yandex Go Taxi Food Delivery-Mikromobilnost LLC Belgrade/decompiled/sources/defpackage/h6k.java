package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class h6k implements zsq0, yey0 {
    public final JsonParserComponent a;

    public h6k(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    public final j6k c(yf90 yf90Var, j6k j6kVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        ums umsVar = wm11.c;
        return new j6k(wcx.d(Q, jSONObject, "key", umsVar, i, j6kVar != null ? j6kVar.a : null), wcx.i(Q, jSONObject, "value", i, j6kVar != null ? j6kVar.b : null, this.a.D9), wcx.d(Q, jSONObject, "variable_name", umsVar, i, j6kVar != null ? j6kVar.c : null));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, j6k j6kVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.q(yf90Var, jSONObject, "key", j6kVar.a);
        wwg.Z(yf90Var, jSONObject, "type", "dict_set_value");
        wcx.u(yf90Var, jSONObject, "value", j6kVar.b, this.a.D9);
        wcx.q(yf90Var, jSONObject, "variable_name", j6kVar.c);
        return jSONObject;
    }
}
