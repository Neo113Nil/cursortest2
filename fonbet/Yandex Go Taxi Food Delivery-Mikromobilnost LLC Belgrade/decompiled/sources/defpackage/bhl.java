package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class bhl implements zsq0, yey0 {
    public final JsonParserComponent a;

    public bhl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    public final ehl c(yf90 yf90Var, ehl ehlVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        rms rmsVar = wm11.f;
        exq exqVar = ehlVar != null ? ehlVar.a : null;
        tls tlsVar = b.b;
        kbs kbsVar = q5z.b;
        exq e = wcx.e(Q, jSONObject, "color", rmsVar, i, exqVar, tlsVar, kbsVar);
        exq j = wcx.j(Q, jSONObject, "density", wm11.d, i, ehlVar != null ? ehlVar.b : null, b.g, dhl.e);
        wms wmsVar = wm11.a;
        exq exqVar2 = ehlVar != null ? ehlVar.c : null;
        tls tlsVar2 = b.f;
        return new ehl(e, j, wcx.j(Q, jSONObject, "is_animated", wmsVar, i, exqVar2, tlsVar2, kbsVar), wcx.j(Q, jSONObject, "is_enabled", wmsVar, i, ehlVar != null ? ehlVar.d : null, tlsVar2, kbsVar), wcx.i(Q, jSONObject, "particle_size", i, ehlVar != null ? ehlVar.e : null, this.a.F3));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, ehl ehlVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.p(ehlVar.a, b.a, yf90Var, "color", jSONObject);
        wcx.q(yf90Var, jSONObject, "density", ehlVar.b);
        wcx.q(yf90Var, jSONObject, "is_animated", ehlVar.c);
        wcx.q(yf90Var, jSONObject, "is_enabled", ehlVar.d);
        wcx.u(yf90Var, jSONObject, "particle_size", ehlVar.e, this.a.F3);
        wwg.Z(yf90Var, jSONObject, "type", "particles");
        return jSONObject;
    }
}
