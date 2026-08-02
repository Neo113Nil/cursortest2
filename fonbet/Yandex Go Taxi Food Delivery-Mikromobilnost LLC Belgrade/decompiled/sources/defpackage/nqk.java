package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class nqk implements zsq0, nyi {
    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        ums umsVar = wm11.c;
        z3k z3kVar = pqk.b;
        abl0 abl0Var = q5z.c;
        Expression b = a.b(yf90Var, jSONObject, "key", umsVar, abl0Var, z3kVar);
        z3k z3kVar2 = pqk.c;
        lvo lvoVar = pqk.a;
        Expression e = a.e(yf90Var, jSONObject, "placeholder", umsVar, abl0Var, z3kVar2, lvoVar);
        if (e == null) {
            e = lvoVar;
        }
        return new hqk(b, e, a.e(yf90Var, jSONObject, "regex", umsVar, abl0Var, q5z.b, null));
    }

    @Override // defpackage.zsq0
    public final JSONObject b(yf90 yf90Var, Object obj) {
        hqk hqkVar = (hqk) obj;
        JSONObject jSONObject = new JSONObject();
        a.g(yf90Var, jSONObject, "key", hqkVar.a);
        a.g(yf90Var, jSONObject, "placeholder", hqkVar.b);
        a.g(yf90Var, jSONObject, "regex", hqkVar.c);
        return jSONObject;
    }
}
