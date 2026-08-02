package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class h8k implements zsq0, yey0 {
    public final JsonParserComponent a;

    public h8k(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    public final k8k c(yf90 yf90Var, k8k k8kVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        return new k8k(wcx.j(Q, jSONObject, "animated", wm11.a, i, k8kVar != null ? k8kVar.a : null, b.f, q5z.b), wcx.c(Q, jSONObject, "destination", i, k8kVar != null ? k8kVar.b : null, this.a.B0), wcx.d(Q, jSONObject, "id", wm11.c, i, k8kVar != null ? k8kVar.c : null));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, k8k k8kVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.q(yf90Var, jSONObject, "animated", k8kVar.a);
        wcx.u(yf90Var, jSONObject, "destination", k8kVar.b, this.a.B0);
        wcx.q(yf90Var, jSONObject, "id", k8kVar.c);
        wwg.Z(yf90Var, jSONObject, "type", "scroll_to");
        return jSONObject;
    }
}
