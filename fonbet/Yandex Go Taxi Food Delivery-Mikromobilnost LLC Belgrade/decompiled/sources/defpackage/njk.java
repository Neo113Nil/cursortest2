package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivAnimationDirection;
import com.yandex.div2.DivAnimationInterpolator;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.q;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class njk implements zsq0, yey0 {
    public final JsonParserComponent a;

    public njk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    public final pjk c(yf90 yf90Var, pjk pjkVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        exq exqVar = pjkVar != null ? pjkVar.a : null;
        JsonParserComponent jsonParserComponent = this.a;
        exq k = wcx.k(Q, jSONObject, "cancel_actions", i, exqVar, jsonParserComponent.u1);
        qkj qkjVar = q.e;
        exq exqVar2 = pjkVar != null ? pjkVar.b : null;
        tls tlsVar = DivAnimationDirection.FROM_STRING;
        kbs kbsVar = q5z.b;
        exq j = wcx.j(Q, jSONObject, "direction", qkjVar, i, exqVar2, tlsVar, kbsVar);
        tms tmsVar = wm11.b;
        exq exqVar3 = pjkVar != null ? pjkVar.c : null;
        tls tlsVar2 = b.h;
        exq e = wcx.e(Q, jSONObject, "duration", tmsVar, i, exqVar3, tlsVar2, q.g);
        exq k2 = wcx.k(Q, jSONObject, "end_actions", i, pjkVar != null ? pjkVar.d : null, jsonParserComponent.u1);
        rms rmsVar = wm11.f;
        exq exqVar4 = pjkVar != null ? pjkVar.e : null;
        tls tlsVar3 = b.b;
        return new pjk(k, j, e, k2, wcx.e(Q, jSONObject, "end_value", rmsVar, i, exqVar4, tlsVar3, kbsVar), wcx.a(Q, jSONObject, "id", i, pjkVar != null ? pjkVar.f : null), wcx.j(Q, jSONObject, "interpolator", q.f, i, pjkVar != null ? pjkVar.g : null, DivAnimationInterpolator.FROM_STRING, kbsVar), wcx.i(Q, jSONObject, "repeat_count", i, pjkVar != null ? pjkVar.h : null, jsonParserComponent.F2), wcx.j(Q, jSONObject, "start_delay", tmsVar, i, pjkVar != null ? pjkVar.i : null, tlsVar2, q.h), wcx.j(Q, jSONObject, "start_value", rmsVar, i, pjkVar != null ? pjkVar.j : null, tlsVar3, kbsVar), wcx.a(Q, jSONObject, "variable_name", i, pjkVar != null ? pjkVar.k : null));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, pjk pjkVar) {
        JSONObject jSONObject = new JSONObject();
        exq exqVar = pjkVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wcx.w(yf90Var, jSONObject, "cancel_actions", exqVar, jsonParserComponent.u1);
        wcx.p(pjkVar.b, DivAnimationDirection.TO_STRING, yf90Var, "direction", jSONObject);
        wcx.q(yf90Var, jSONObject, "duration", pjkVar.c);
        wcx.w(yf90Var, jSONObject, "end_actions", pjkVar.d, jsonParserComponent.u1);
        exq exqVar2 = pjkVar.e;
        tls tlsVar = b.a;
        wcx.p(exqVar2, tlsVar, yf90Var, "end_value", jSONObject);
        wcx.t(yf90Var, jSONObject, "id", pjkVar.f);
        wcx.p(pjkVar.g, DivAnimationInterpolator.TO_STRING, yf90Var, "interpolator", jSONObject);
        wcx.u(yf90Var, jSONObject, "repeat_count", pjkVar.h, jsonParserComponent.F2);
        wcx.q(yf90Var, jSONObject, "start_delay", pjkVar.i);
        wcx.p(pjkVar.j, tlsVar, yf90Var, "start_value", jSONObject);
        wwg.Z(yf90Var, jSONObject, "type", "color_animator");
        wcx.t(yf90Var, jSONObject, "variable_name", pjkVar.k);
        return jSONObject;
    }
}
