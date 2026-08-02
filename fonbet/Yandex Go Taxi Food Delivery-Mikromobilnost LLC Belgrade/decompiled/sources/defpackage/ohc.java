package defpackage;

import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class ohc implements zsq0, yey0 {
    public static qhc c(yf90 yf90Var, qhc qhcVar, JSONObject jSONObject) {
        return new qhc(wcx.e(udq0.Q(yf90Var), jSONObject, "value", wm11.f, yf90Var.i(), qhcVar != null ? qhcVar.a : null, b.b, q5z.b));
    }

    public static JSONObject d(yf90 yf90Var, qhc qhcVar) {
        JSONObject w = n.w(yf90Var, "type", "color");
        wcx.p(qhcVar.a, b.a, yf90Var, "value", w);
        return w;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (qhc) obj);
    }
}
