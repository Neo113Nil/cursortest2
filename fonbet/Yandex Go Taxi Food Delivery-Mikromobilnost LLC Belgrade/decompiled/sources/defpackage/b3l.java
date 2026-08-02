package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class b3l implements zsq0, yey0 {
    public final JsonParserComponent a;

    public b3l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        return new h3l(wcx.a(Q, jSONObject, "id", i, null), wcx.k(Q, jSONObject, "items", i, null, this.a.Y9));
    }

    @Override // defpackage.zsq0
    public final JSONObject b(yf90 yf90Var, Object obj) {
        h3l h3lVar = (h3l) obj;
        JSONObject jSONObject = new JSONObject();
        wcx.t(yf90Var, jSONObject, "id", h3lVar.a);
        wcx.w(yf90Var, jSONObject, "items", h3lVar.b, this.a.Y9);
        return jSONObject;
    }
}
