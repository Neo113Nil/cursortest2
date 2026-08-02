package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.a0;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class knk implements zsq0, nyi {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        qkj qkjVar = a0.b;
        tls tlsVar = DivSizeUnit.FROM_STRING;
        kvo kvoVar = a0.a;
        kbs kbsVar = q5z.b;
        ?? e = a.e(yf90Var, jSONObject, "unit", qkjVar, tlsVar, kbsVar, kvoVar);
        if (e != 0) {
            kvoVar = e;
        }
        return new jnk(kvoVar, a.b(yf90Var, jSONObject, "value", wm11.d, b.g, kbsVar));
    }

    @Override // defpackage.zsq0
    public final JSONObject b(yf90 yf90Var, Object obj) {
        jnk jnkVar = (jnk) obj;
        JSONObject jSONObject = new JSONObject();
        a.h(yf90Var, jSONObject, "unit", jnkVar.a, DivSizeUnit.TO_STRING);
        a.g(yf90Var, jSONObject, "value", jnkVar.b);
        return jSONObject;
    }
}
