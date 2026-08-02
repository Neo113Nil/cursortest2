package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivAnimationDirection;
import com.yandex.div2.DivAnimationInterpolator;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.e1;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class k0l implements zsq0, yey0 {
    public final JsonParserComponent a;

    public k0l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    public final m0l c(yf90 yf90Var, m0l m0lVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        exq exqVar = m0lVar != null ? m0lVar.a : null;
        JsonParserComponent jsonParserComponent = this.a;
        exq k = wcx.k(Q, jSONObject, "cancel_actions", i, exqVar, jsonParserComponent.u1);
        qkj qkjVar = e1.e;
        exq exqVar2 = m0lVar != null ? m0lVar.b : null;
        tls tlsVar = DivAnimationDirection.FROM_STRING;
        kbs kbsVar = q5z.b;
        exq j = wcx.j(Q, jSONObject, "direction", qkjVar, i, exqVar2, tlsVar, kbsVar);
        tms tmsVar = wm11.b;
        exq exqVar3 = m0lVar != null ? m0lVar.c : null;
        tls tlsVar2 = b.h;
        exq e = wcx.e(Q, jSONObject, "duration", tmsVar, i, exqVar3, tlsVar2, e1.g);
        exq k2 = wcx.k(Q, jSONObject, "end_actions", i, m0lVar != null ? m0lVar.d : null, jsonParserComponent.u1);
        sms smsVar = wm11.d;
        exq exqVar4 = m0lVar != null ? m0lVar.e : null;
        tls tlsVar3 = b.g;
        return new m0l(k, j, e, k2, wcx.e(Q, jSONObject, "end_value", smsVar, i, exqVar4, tlsVar3, kbsVar), wcx.a(Q, jSONObject, "id", i, m0lVar != null ? m0lVar.f : null), wcx.j(Q, jSONObject, "interpolator", e1.f, i, m0lVar != null ? m0lVar.g : null, DivAnimationInterpolator.FROM_STRING, kbsVar), wcx.i(Q, jSONObject, "repeat_count", i, m0lVar != null ? m0lVar.h : null, jsonParserComponent.F2), wcx.j(Q, jSONObject, "start_delay", tmsVar, i, m0lVar != null ? m0lVar.i : null, tlsVar2, e1.h), wcx.j(Q, jSONObject, "start_value", smsVar, i, m0lVar != null ? m0lVar.j : null, tlsVar3, kbsVar), wcx.a(Q, jSONObject, "variable_name", i, m0lVar != null ? m0lVar.k : null));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, m0l m0lVar) {
        JSONObject jSONObject = new JSONObject();
        exq exqVar = m0lVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wcx.w(yf90Var, jSONObject, "cancel_actions", exqVar, jsonParserComponent.u1);
        wcx.p(m0lVar.b, DivAnimationDirection.TO_STRING, yf90Var, "direction", jSONObject);
        wcx.q(yf90Var, jSONObject, "duration", m0lVar.c);
        wcx.w(yf90Var, jSONObject, "end_actions", m0lVar.d, jsonParserComponent.u1);
        wcx.q(yf90Var, jSONObject, "end_value", m0lVar.e);
        wcx.t(yf90Var, jSONObject, "id", m0lVar.f);
        wcx.p(m0lVar.g, DivAnimationInterpolator.TO_STRING, yf90Var, "interpolator", jSONObject);
        wcx.u(yf90Var, jSONObject, "repeat_count", m0lVar.h, jsonParserComponent.F2);
        wcx.q(yf90Var, jSONObject, "start_delay", m0lVar.i);
        wcx.q(yf90Var, jSONObject, "start_value", m0lVar.j);
        wwg.Z(yf90Var, jSONObject, "type", "number_animator");
        wcx.t(yf90Var, jSONObject, "variable_name", m0lVar.k);
        return jSONObject;
    }
}
