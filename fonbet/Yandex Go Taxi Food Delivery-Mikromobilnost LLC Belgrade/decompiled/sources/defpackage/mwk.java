package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.expression.BduiExpressionResolverImpl;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class mwk implements zsq0, yey0 {
    public static pwk c(yf90 yf90Var, pwk pwkVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        wms wmsVar = wm11.a;
        exq exqVar = pwkVar != null ? pwkVar.a : null;
        tls tlsVar = b.f;
        kbs kbsVar = q5z.b;
        return new pwk(wcx.j(Q, jSONObject, "allow_empty", wmsVar, i, exqVar, tlsVar, kbsVar), wcx.e(Q, jSONObject, "condition", wmsVar, i, pwkVar != null ? pwkVar.b : null, tlsVar, kbsVar), wcx.d(Q, jSONObject, "label_id", wm11.c, i, pwkVar != null ? pwkVar.c : null), wcx.a(Q, jSONObject, "variable", i, pwkVar != null ? pwkVar.d : null));
    }

    public static JSONObject d(yf90 yf90Var, pwk pwkVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.q(yf90Var, jSONObject, "allow_empty", pwkVar.a);
        wcx.q(yf90Var, jSONObject, "condition", pwkVar.b);
        wcx.q(yf90Var, jSONObject, "label_id", pwkVar.c);
        wwg.Z(yf90Var, jSONObject, "type", BduiExpressionResolverImpl.EXPRESSION_KEY);
        wcx.t(yf90Var, jSONObject, "variable", pwkVar.d);
        return jSONObject;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (pwk) obj);
    }
}
