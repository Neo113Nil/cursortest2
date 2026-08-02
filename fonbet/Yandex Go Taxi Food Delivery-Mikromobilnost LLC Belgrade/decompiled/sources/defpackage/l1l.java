package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivAnimationInterpolator;
import com.yandex.div2.g1;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class l1l implements zsq0, yey0 {
    public static n1l c(yf90 yf90Var, n1l n1lVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        exq j = wcx.j(Q, jSONObject, "interpolator", g1.f, i, n1lVar != null ? n1lVar.a : null, DivAnimationInterpolator.FROM_STRING, q5z.b);
        sms smsVar = wm11.d;
        exq exqVar = n1lVar != null ? n1lVar.b : null;
        tls tlsVar = b.g;
        return new n1l(j, wcx.j(Q, jSONObject, "next_page_alpha", smsVar, i, exqVar, tlsVar, g1.g), wcx.j(Q, jSONObject, "next_page_scale", smsVar, i, n1lVar != null ? n1lVar.c : null, tlsVar, g1.h), wcx.j(Q, jSONObject, "previous_page_alpha", smsVar, i, n1lVar != null ? n1lVar.d : null, tlsVar, g1.i), wcx.j(Q, jSONObject, "previous_page_scale", smsVar, i, n1lVar != null ? n1lVar.e : null, tlsVar, g1.j));
    }

    public static JSONObject d(yf90 yf90Var, n1l n1lVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.p(n1lVar.a, DivAnimationInterpolator.TO_STRING, yf90Var, "interpolator", jSONObject);
        wcx.q(yf90Var, jSONObject, "next_page_alpha", n1lVar.b);
        wcx.q(yf90Var, jSONObject, "next_page_scale", n1lVar.c);
        wcx.q(yf90Var, jSONObject, "previous_page_alpha", n1lVar.d);
        wcx.q(yf90Var, jSONObject, "previous_page_scale", n1lVar.e);
        wwg.Z(yf90Var, jSONObject, "type", "slide");
        return jSONObject;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (n1l) obj);
    }
}
