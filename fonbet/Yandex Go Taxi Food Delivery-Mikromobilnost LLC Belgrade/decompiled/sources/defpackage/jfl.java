package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class jfl implements zsq0, yey0 {
    public final JsonParserComponent a;

    public jfl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        JsonParserComponent jsonParserComponent = this.a;
        return new rhl(wcx.k(Q, jSONObject, "actions", i, null, jsonParserComponent.u1), wcx.k(Q, jSONObject, "images", i, null, jsonParserComponent.R8), wcx.k(Q, jSONObject, "ranges", i, null, jsonParserComponent.O8), wcx.d(Q, jSONObject, "text", wm11.c, i, null));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, rhl rhlVar) {
        JSONObject jSONObject = new JSONObject();
        exq exqVar = rhlVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wcx.w(yf90Var, jSONObject, "actions", exqVar, jsonParserComponent.u1);
        wcx.w(yf90Var, jSONObject, "images", rhlVar.b, jsonParserComponent.R8);
        wcx.w(yf90Var, jSONObject, "ranges", rhlVar.c, jsonParserComponent.O8);
        wcx.q(yf90Var, jSONObject, "text", rhlVar.d);
        return jSONObject;
    }
}
