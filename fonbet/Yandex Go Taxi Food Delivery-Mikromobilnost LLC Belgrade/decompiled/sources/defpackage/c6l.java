package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class c6l implements zsq0, yey0 {
    public final JsonParserComponent a;

    public c6l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    public final a7l c(yf90 yf90Var, a7l a7lVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        exq exqVar = a7lVar != null ? a7lVar.a : null;
        JsonParserComponent jsonParserComponent = this.a;
        exq i2 = wcx.i(Q, jSONObject, "center_x", i, exqVar, jsonParserComponent.n6);
        exq i3 = wcx.i(Q, jSONObject, "center_y", i, a7lVar != null ? a7lVar.b : null, jsonParserComponent.n6);
        exq m = wcx.m(Q, jSONObject, i, a7lVar != null ? a7lVar.c : null, jsonParserComponent.F6, e6l.e);
        rms rmsVar = wm11.f;
        exq exqVar2 = a7lVar != null ? a7lVar.d : null;
        tls tlsVar = b.a;
        return new a7l(i2, i3, m, wcx.g(Q, jSONObject, rmsVar, i, exqVar2, e6l.d), wcx.i(Q, jSONObject, "radius", i, a7lVar != null ? a7lVar.e : null, jsonParserComponent.t6));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, a7l a7lVar) {
        JSONObject jSONObject = new JSONObject();
        exq exqVar = a7lVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wcx.u(yf90Var, jSONObject, "center_x", exqVar, jsonParserComponent.n6);
        wcx.u(yf90Var, jSONObject, "center_y", a7lVar.b, jsonParserComponent.n6);
        wcx.w(yf90Var, jSONObject, "color_map", a7lVar.c, jsonParserComponent.F6);
        exq exqVar2 = a7lVar.d;
        tls tlsVar = b.a;
        wcx.r(yf90Var, jSONObject, exqVar2);
        wcx.u(yf90Var, jSONObject, "radius", a7lVar.e, jsonParserComponent.t6);
        wwg.Z(yf90Var, jSONObject, "type", "radial_gradient");
        return jSONObject;
    }
}
