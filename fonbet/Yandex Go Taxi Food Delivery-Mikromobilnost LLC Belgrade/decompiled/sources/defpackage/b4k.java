package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivAnimationDirection;
import com.yandex.div2.DivAnimationInterpolator;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.h;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class b4k implements zsq0, yey0 {
    public final JsonParserComponent a;

    public b4k(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    public final d4k c(yf90 yf90Var, d4k d4kVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        exq a = wcx.a(Q, jSONObject, "animator_id", i, d4kVar != null ? d4kVar.a : null);
        qkj qkjVar = h.a;
        exq exqVar = d4kVar != null ? d4kVar.b : null;
        tls tlsVar = DivAnimationDirection.FROM_STRING;
        kbs kbsVar = q5z.b;
        exq j = wcx.j(Q, jSONObject, "direction", qkjVar, i, exqVar, tlsVar, kbsVar);
        tms tmsVar = wm11.b;
        exq exqVar2 = d4kVar != null ? d4kVar.c : null;
        tls tlsVar2 = b.h;
        exq j2 = wcx.j(Q, jSONObject, "duration", tmsVar, i, exqVar2, tlsVar2, h.c);
        exq exqVar3 = d4kVar != null ? d4kVar.d : null;
        JsonParserComponent jsonParserComponent = this.a;
        return new d4k(a, j, j2, wcx.i(Q, jSONObject, "end_value", i, exqVar3, jsonParserComponent.D9), wcx.j(Q, jSONObject, "interpolator", h.b, i, d4kVar != null ? d4kVar.e : null, DivAnimationInterpolator.FROM_STRING, kbsVar), wcx.i(Q, jSONObject, "repeat_count", i, d4kVar != null ? d4kVar.f : null, jsonParserComponent.F2), wcx.j(Q, jSONObject, "start_delay", tmsVar, i, d4kVar != null ? d4kVar.g : null, tlsVar2, h.d), wcx.i(Q, jSONObject, "start_value", i, d4kVar != null ? d4kVar.h : null, jsonParserComponent.D9));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, d4k d4kVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.t(yf90Var, jSONObject, "animator_id", d4kVar.a);
        wcx.p(d4kVar.b, DivAnimationDirection.TO_STRING, yf90Var, "direction", jSONObject);
        wcx.q(yf90Var, jSONObject, "duration", d4kVar.c);
        exq exqVar = d4kVar.d;
        JsonParserComponent jsonParserComponent = this.a;
        wcx.u(yf90Var, jSONObject, "end_value", exqVar, jsonParserComponent.D9);
        wcx.p(d4kVar.e, DivAnimationInterpolator.TO_STRING, yf90Var, "interpolator", jSONObject);
        wcx.u(yf90Var, jSONObject, "repeat_count", d4kVar.f, jsonParserComponent.F2);
        wcx.q(yf90Var, jSONObject, "start_delay", d4kVar.g);
        wcx.u(yf90Var, jSONObject, "start_value", d4kVar.h, jsonParserComponent.D9);
        wwg.Z(yf90Var, jSONObject, "type", "animator_start");
        return jSONObject;
    }
}
