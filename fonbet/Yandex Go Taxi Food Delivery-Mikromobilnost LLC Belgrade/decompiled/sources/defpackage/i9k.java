package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class i9k implements zsq0, yey0 {
    public final JsonParserComponent a;

    public i9k(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    public final k9k c(yf90 yf90Var, k9k k9kVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        return new k9k(wcx.c(Q, jSONObject, "value", i, k9kVar != null ? k9kVar.a : null, this.a.D9), wcx.d(Q, jSONObject, "variable_name", wm11.c, i, k9kVar != null ? k9kVar.b : null));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, k9k k9kVar) {
        JSONObject w = n.w(yf90Var, "type", "set_variable");
        wcx.u(yf90Var, w, "value", k9kVar.a, this.a.D9);
        wcx.q(yf90Var, w, "variable_name", k9kVar.b);
        return w;
    }
}
