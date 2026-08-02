package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.a0;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class lnk implements zsq0, yey0 {
    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        qkj qkjVar = a0.b;
        tls tlsVar = DivSizeUnit.FROM_STRING;
        kbs kbsVar = q5z.b;
        return new mnk(wcx.j(Q, jSONObject, "unit", qkjVar, i, null, tlsVar, kbsVar), wcx.e(Q, jSONObject, "value", wm11.d, i, null, b.g, kbsVar));
    }

    @Override // defpackage.zsq0
    public final JSONObject b(yf90 yf90Var, Object obj) {
        mnk mnkVar = (mnk) obj;
        JSONObject jSONObject = new JSONObject();
        wcx.p(mnkVar.a, DivSizeUnit.TO_STRING, yf90Var, "unit", jSONObject);
        wcx.q(yf90Var, jSONObject, "value", mnkVar.b);
        return jSONObject;
    }
}
