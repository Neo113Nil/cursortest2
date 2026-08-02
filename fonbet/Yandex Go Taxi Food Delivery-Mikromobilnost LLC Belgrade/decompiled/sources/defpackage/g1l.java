package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivAnimationInterpolator;
import com.yandex.div2.f1;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class g1l implements zsq0, yey0 {
    public static i1l c(yf90 yf90Var, i1l i1lVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        qkj qkjVar = f1.g;
        exq exqVar = i1lVar != null ? i1lVar.a : null;
        tls tlsVar = DivAnimationInterpolator.FROM_STRING;
        kbs kbsVar = q5z.b;
        exq j = wcx.j(Q, jSONObject, "interpolator", qkjVar, i, exqVar, tlsVar, kbsVar);
        sms smsVar = wm11.d;
        exq exqVar2 = i1lVar != null ? i1lVar.b : null;
        tls tlsVar2 = b.g;
        return new i1l(j, wcx.j(Q, jSONObject, "next_page_alpha", smsVar, i, exqVar2, tlsVar2, f1.h), wcx.j(Q, jSONObject, "next_page_scale", smsVar, i, i1lVar != null ? i1lVar.c : null, tlsVar2, f1.i), wcx.j(Q, jSONObject, "previous_page_alpha", smsVar, i, i1lVar != null ? i1lVar.d : null, tlsVar2, f1.j), wcx.j(Q, jSONObject, "previous_page_scale", smsVar, i, i1lVar != null ? i1lVar.e : null, tlsVar2, f1.k), wcx.j(Q, jSONObject, "reversed_stacking_order", wm11.a, i, i1lVar != null ? i1lVar.f : null, b.f, kbsVar));
    }

    public static JSONObject d(yf90 yf90Var, i1l i1lVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.p(i1lVar.a, DivAnimationInterpolator.TO_STRING, yf90Var, "interpolator", jSONObject);
        wcx.q(yf90Var, jSONObject, "next_page_alpha", i1lVar.b);
        wcx.q(yf90Var, jSONObject, "next_page_scale", i1lVar.c);
        wcx.q(yf90Var, jSONObject, "previous_page_alpha", i1lVar.d);
        wcx.q(yf90Var, jSONObject, "previous_page_scale", i1lVar.e);
        wcx.q(yf90Var, jSONObject, "reversed_stacking_order", i1lVar.f);
        wwg.Z(yf90Var, jSONObject, "type", "overlap");
        return jSONObject;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (i1l) obj);
    }
}
