package defpackage;

import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class hwk implements zsq0, yey0 {
    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        wms wmsVar = wm11.a;
        tls tlsVar = b.f;
        kbs kbsVar = q5z.b;
        exq j = wcx.j(Q, jSONObject, "allow_empty", wmsVar, i, null, tlsVar, kbsVar);
        ums umsVar = wm11.c;
        abl0 abl0Var = q5z.c;
        return new jwk(j, wcx.j(Q, jSONObject, "label_id", umsVar, i, null, abl0Var, kbsVar), wcx.h(Q, jSONObject, "variable", i, null, abl0Var));
    }

    @Override // defpackage.zsq0
    public final JSONObject b(yf90 yf90Var, Object obj) {
        jwk jwkVar = (jwk) obj;
        JSONObject jSONObject = new JSONObject();
        wcx.q(yf90Var, jSONObject, "allow_empty", jwkVar.a);
        wcx.q(yf90Var, jSONObject, "label_id", jwkVar.b);
        wcx.t(yf90Var, jSONObject, "variable", jwkVar.c);
        return jSONObject;
    }
}
