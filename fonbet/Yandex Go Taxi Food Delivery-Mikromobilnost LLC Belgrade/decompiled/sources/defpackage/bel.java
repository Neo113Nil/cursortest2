package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class bel implements zsq0, yey0 {
    public final JsonParserComponent a;

    public bel(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        JsonParserComponent jsonParserComponent = this.a;
        return new eel(wcx.i(Q, jSONObject, "height", i, null, jsonParserComponent.F3), wcx.e(Q, jSONObject, "image_url", wm11.e, i, null, b.e, q5z.b), wcx.i(Q, jSONObject, "width", i, null, jsonParserComponent.F3));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, eel eelVar) {
        JSONObject jSONObject = new JSONObject();
        exq exqVar = eelVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wcx.u(yf90Var, jSONObject, "height", exqVar, jsonParserComponent.F3);
        wcx.p(eelVar.b, b.c, yf90Var, "image_url", jSONObject);
        wcx.u(yf90Var, jSONObject, "width", eelVar.c, jsonParserComponent.F3);
        return jSONObject;
    }
}
