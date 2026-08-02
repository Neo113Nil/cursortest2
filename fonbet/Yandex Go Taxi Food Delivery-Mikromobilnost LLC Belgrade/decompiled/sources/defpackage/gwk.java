package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class gwk implements zsq0, nyi {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        wms wmsVar = wm11.a;
        tls tlsVar = b.f;
        kvo kvoVar = iwk.a;
        kbs kbsVar = q5z.b;
        ?? e = a.e(yf90Var, jSONObject, "allow_empty", wmsVar, tlsVar, kbsVar, kvoVar);
        if (e != 0) {
            kvoVar = e;
        }
        Expression e2 = a.e(yf90Var, jSONObject, "label_id", wm11.c, q5z.c, kbsVar, null);
        Object opt = jSONObject.opt("variable");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        return new fwk(kvoVar, e2, (String) (opt != null ? opt : null));
    }

    @Override // defpackage.zsq0
    public final JSONObject b(yf90 yf90Var, Object obj) {
        fwk fwkVar = (fwk) obj;
        JSONObject jSONObject = new JSONObject();
        a.g(yf90Var, jSONObject, "allow_empty", fwkVar.a);
        a.g(yf90Var, jSONObject, "label_id", fwkVar.b);
        wwg.Z(yf90Var, jSONObject, "variable", fwkVar.c);
        return jSONObject;
    }
}
