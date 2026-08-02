package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class o8k implements zsq0, yey0 {
    public final JsonParserComponent a;

    public o8k(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    public final t8k c(yf90 yf90Var, t8k t8kVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        return new t8k(wcx.d(Q, jSONObject, "id", wm11.c, i, t8kVar != null ? t8kVar.a : null), wcx.c(Q, jSONObject, "position", i, t8kVar != null ? t8kVar.b : null, this.a.K0));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, t8k t8kVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.q(yf90Var, jSONObject, "id", t8kVar.a);
        wcx.u(yf90Var, jSONObject, "position", t8kVar.b, this.a.K0);
        wwg.Z(yf90Var, jSONObject, "type", "set_cursor_position");
        return jSONObject;
    }
}
