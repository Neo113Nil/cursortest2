package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.j1;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class c4l implements zsq0, yey0 {
    public static e4l c(yf90 yf90Var, e4l e4lVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        qkj qkjVar = j1.b;
        exq exqVar = e4lVar != null ? e4lVar.a : null;
        tls tlsVar = DivSizeUnit.FROM_STRING;
        kbs kbsVar = q5z.b;
        return new e4l(wcx.j(Q, jSONObject, "unit", qkjVar, i, exqVar, tlsVar, kbsVar), wcx.e(Q, jSONObject, "value", wm11.b, i, e4lVar != null ? e4lVar.b : null, b.h, kbsVar));
    }

    public static JSONObject d(yf90 yf90Var, e4l e4lVar) {
        JSONObject w = n.w(yf90Var, "type", "pivot-fixed");
        wcx.p(e4lVar.a, DivSizeUnit.TO_STRING, yf90Var, "unit", w);
        wcx.q(yf90Var, w, "value", e4lVar.b);
        return w;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (e4l) obj);
    }
}
