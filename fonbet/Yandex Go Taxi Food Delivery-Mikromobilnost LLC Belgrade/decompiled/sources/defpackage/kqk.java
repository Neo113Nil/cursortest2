package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class kqk implements zsq0, yey0 {
    public final JsonParserComponent a;

    public kqk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    public final rqk c(yf90 yf90Var, rqk rqkVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        return new rqk(wcx.j(Q, jSONObject, "always_visible", wm11.a, i, rqkVar != null ? rqkVar.a : null, b.f, q5z.b), wcx.d(Q, jSONObject, "pattern", wm11.c, i, rqkVar != null ? rqkVar.b : null), wcx.f(Q, jSONObject, "pattern_elements", i, rqkVar != null ? rqkVar.c : null, this.a.C3, mqk.b), wcx.a(Q, jSONObject, "raw_text_variable", i, rqkVar != null ? rqkVar.d : null));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, rqk rqkVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.q(yf90Var, jSONObject, "always_visible", rqkVar.a);
        wcx.q(yf90Var, jSONObject, "pattern", rqkVar.b);
        wcx.w(yf90Var, jSONObject, "pattern_elements", rqkVar.c, this.a.C3);
        wcx.t(yf90Var, jSONObject, "raw_text_variable", rqkVar.d);
        wwg.Z(yf90Var, jSONObject, "type", "fixed_length");
        return jSONObject;
    }
}
