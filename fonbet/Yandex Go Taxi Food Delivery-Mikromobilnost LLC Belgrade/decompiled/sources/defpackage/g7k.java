package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivAction$Target;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.i;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class g7k implements zsq0, yey0 {
    public final JsonParserComponent a;

    public g7k(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        JsonParserComponent jsonParserComponent = this.a;
        exq i2 = wcx.i(Q, jSONObject, "download_callbacks", i, null, jsonParserComponent.b3);
        wms wmsVar = wm11.a;
        tls tlsVar = b.f;
        kbs kbsVar = q5z.b;
        exq j = wcx.j(Q, jSONObject, "is_enabled", wmsVar, i, null, tlsVar, kbsVar);
        exq d = wcx.d(Q, jSONObject, "log_id", wm11.c, i, null);
        dxf0 dxf0Var = wm11.e;
        tls tlsVar2 = b.e;
        exq j2 = wcx.j(Q, jSONObject, "log_url", dxf0Var, i, null, tlsVar2, kbsVar);
        exq k = wcx.k(Q, jSONObject, "menu_items", i, null, jsonParserComponent.x1);
        abl0 abl0Var = q5z.c;
        return new fak(i2, j, d, j2, k, wcx.h(Q, jSONObject, "payload", i, null, abl0Var), wcx.j(Q, jSONObject, "referer", dxf0Var, i, null, tlsVar2, kbsVar), wcx.h(Q, jSONObject, "scope_id", i, null, abl0Var), wcx.j(Q, jSONObject, "target", i.b, i, null, DivAction$Target.FROM_STRING, kbsVar), wcx.i(Q, jSONObject, "typed", i, null, jsonParserComponent.l1), wcx.j(Q, jSONObject, "url", dxf0Var, i, null, tlsVar2, kbsVar));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, fak fakVar) {
        JSONObject jSONObject = new JSONObject();
        exq exqVar = fakVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wcx.u(yf90Var, jSONObject, "download_callbacks", exqVar, jsonParserComponent.b3);
        wcx.q(yf90Var, jSONObject, "is_enabled", fakVar.b);
        wcx.q(yf90Var, jSONObject, "log_id", fakVar.c);
        exq exqVar2 = fakVar.d;
        tls tlsVar = b.c;
        wcx.p(exqVar2, tlsVar, yf90Var, "log_url", jSONObject);
        wcx.w(yf90Var, jSONObject, "menu_items", fakVar.e, jsonParserComponent.x1);
        wcx.t(yf90Var, jSONObject, "payload", fakVar.f);
        wcx.p(fakVar.g, tlsVar, yf90Var, "referer", jSONObject);
        wcx.t(yf90Var, jSONObject, "scope_id", fakVar.h);
        wcx.p(fakVar.i, DivAction$Target.TO_STRING, yf90Var, "target", jSONObject);
        wcx.u(yf90Var, jSONObject, "typed", fakVar.j, jsonParserComponent.l1);
        wcx.p(fakVar.k, tlsVar, yf90Var, "url", jSONObject);
        return jSONObject;
    }
}
