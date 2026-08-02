package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class jgl implements zsq0, yey0 {
    public final JsonParserComponent a;

    public jgl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        return new kgl(wcx.j(Q, jSONObject, "corner_radius", wm11.b, i, null, b.h, ha91.a), wcx.i(Q, jSONObject, "stroke", i, null, this.a.Z7));
    }

    @Override // defpackage.zsq0
    public final JSONObject b(yf90 yf90Var, Object obj) {
        kgl kglVar = (kgl) obj;
        JSONObject jSONObject = new JSONObject();
        wcx.q(yf90Var, jSONObject, "corner_radius", kglVar.a);
        wcx.u(yf90Var, jSONObject, "stroke", kglVar.b, this.a.Z7);
        return jSONObject;
    }
}
