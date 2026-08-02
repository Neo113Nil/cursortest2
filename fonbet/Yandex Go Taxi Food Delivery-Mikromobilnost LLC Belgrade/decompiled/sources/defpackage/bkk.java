package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class bkk implements zsq0, yey0 {
    public final JsonParserComponent a;

    public bkk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        JsonParserComponent jsonParserComponent = this.a;
        exq i2 = wcx.i(Q, jSONObject, "margins", i, null, jsonParserComponent.h3);
        wms wmsVar = wm11.a;
        tls tlsVar = b.f;
        kbs kbsVar = q5z.b;
        return new dkk(i2, wcx.j(Q, jSONObject, "show_at_end", wmsVar, i, null, tlsVar, kbsVar), wcx.j(Q, jSONObject, "show_at_start", wmsVar, i, null, tlsVar, kbsVar), wcx.j(Q, jSONObject, "show_between", wmsVar, i, null, tlsVar, kbsVar), wcx.c(Q, jSONObject, "style", i, null, jsonParserComponent.e3));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, dkk dkkVar) {
        JSONObject jSONObject = new JSONObject();
        exq exqVar = dkkVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wcx.u(yf90Var, jSONObject, "margins", exqVar, jsonParserComponent.h3);
        wcx.q(yf90Var, jSONObject, "show_at_end", dkkVar.b);
        wcx.q(yf90Var, jSONObject, "show_at_start", dkkVar.c);
        wcx.q(yf90Var, jSONObject, "show_between", dkkVar.d);
        wcx.u(yf90Var, jSONObject, "style", dkkVar.e, jsonParserComponent.e3);
        return jSONObject;
    }
}
