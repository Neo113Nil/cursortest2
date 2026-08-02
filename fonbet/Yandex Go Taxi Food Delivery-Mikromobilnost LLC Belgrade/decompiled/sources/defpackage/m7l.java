package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class m7l implements zsq0, yey0 {
    public final JsonParserComponent a;

    public m7l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    public final p7l c(yf90 yf90Var, p7l p7lVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        exq j = wcx.j(Q, jSONObject, "background_color", wm11.f, i, p7lVar != null ? p7lVar.a : null, b.b, q5z.b);
        exq exqVar = p7lVar != null ? p7lVar.b : null;
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.F3;
        i3y i3yVar2 = jsonParserComponent.F3;
        return new p7l(j, wcx.i(Q, jSONObject, "corner_radius", i, exqVar, i3yVar), wcx.i(Q, jSONObject, "item_height", i, p7lVar != null ? p7lVar.c : null, i3yVar2), wcx.i(Q, jSONObject, "item_width", i, p7lVar != null ? p7lVar.d : null, i3yVar2), wcx.i(Q, jSONObject, "stroke", i, p7lVar != null ? p7lVar.e : null, jsonParserComponent.Z7));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, p7l p7lVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.p(p7lVar.a, b.a, yf90Var, "background_color", jSONObject);
        exq exqVar = p7lVar.b;
        JsonParserComponent jsonParserComponent = this.a;
        wcx.u(yf90Var, jSONObject, "corner_radius", exqVar, jsonParserComponent.F3);
        exq exqVar2 = p7lVar.c;
        i3y i3yVar = jsonParserComponent.F3;
        wcx.u(yf90Var, jSONObject, "item_height", exqVar2, i3yVar);
        wcx.u(yf90Var, jSONObject, "item_width", p7lVar.d, i3yVar);
        wcx.u(yf90Var, jSONObject, "stroke", p7lVar.e, jsonParserComponent.Z7);
        wwg.Z(yf90Var, jSONObject, "type", "rounded_rectangle");
        return jSONObject;
    }
}
