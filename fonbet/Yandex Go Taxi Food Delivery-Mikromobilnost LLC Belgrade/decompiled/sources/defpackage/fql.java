package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class fql implements zsq0, yey0 {
    public final JsonParserComponent a;

    public fql(JsonParserComponent jsonParserComponent) {
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
        tms tmsVar = wm11.b;
        tls tlsVar2 = b.h;
        exq j2 = wcx.j(Q, jSONObject, "log_limit", tmsVar, i, null, tlsVar2, gql.e);
        abl0 abl0Var = q5z.c;
        exq h = wcx.h(Q, jSONObject, "payload", i, null, abl0Var);
        dxf0 dxf0Var = wm11.e;
        tls tlsVar3 = b.e;
        return new hql(i2, j, d, j2, h, wcx.j(Q, jSONObject, "referer", dxf0Var, i, null, tlsVar3, kbsVar), wcx.h(Q, jSONObject, "scope_id", i, null, abl0Var), wcx.i(Q, jSONObject, "typed", i, null, jsonParserComponent.l1), wcx.j(Q, jSONObject, "url", dxf0Var, i, null, tlsVar3, kbsVar), wcx.j(Q, jSONObject, "visibility_duration", tmsVar, i, null, tlsVar2, gql.f), wcx.j(Q, jSONObject, "visibility_percentage", tmsVar, i, null, tlsVar2, gql.g));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, hql hqlVar) {
        JSONObject jSONObject = new JSONObject();
        exq exqVar = hqlVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wcx.u(yf90Var, jSONObject, "download_callbacks", exqVar, jsonParserComponent.b3);
        wcx.q(yf90Var, jSONObject, "is_enabled", hqlVar.b);
        wcx.q(yf90Var, jSONObject, "log_id", hqlVar.c);
        wcx.q(yf90Var, jSONObject, "log_limit", hqlVar.d);
        wcx.t(yf90Var, jSONObject, "payload", hqlVar.e);
        exq exqVar2 = hqlVar.f;
        tls tlsVar = b.c;
        wcx.p(exqVar2, tlsVar, yf90Var, "referer", jSONObject);
        wcx.t(yf90Var, jSONObject, "scope_id", hqlVar.g);
        wcx.u(yf90Var, jSONObject, "typed", hqlVar.h, jsonParserComponent.l1);
        wcx.p(hqlVar.i, tlsVar, yf90Var, "url", jSONObject);
        wcx.q(yf90Var, jSONObject, "visibility_duration", hqlVar.j);
        wcx.q(yf90Var, jSONObject, "visibility_percentage", hqlVar.k);
        return jSONObject;
    }
}
