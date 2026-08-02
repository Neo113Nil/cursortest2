package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class nwk implements qfy0 {
    public static kwk b(yf90 yf90Var, pwk pwkVar, JSONObject jSONObject) {
        exq exqVar = pwkVar.a;
        wms wmsVar = wm11.a;
        tls tlsVar = b.f;
        kvo kvoVar = owk.a;
        Expression o = xcx.o(yf90Var, exqVar, jSONObject, "allow_empty", wmsVar, tlsVar, kvoVar);
        if (o == null) {
            o = kvoVar;
        }
        return new kwk(o, xcx.d(yf90Var, pwkVar.b, jSONObject, "condition", wmsVar, tlsVar), xcx.c(yf90Var, pwkVar.c, jSONObject, "label_id", wm11.c), (String) xcx.a(pwkVar.d, jSONObject, "variable", q5z.c, q5z.b));
    }

    @Override // defpackage.qfy0
    public final /* bridge */ /* synthetic */ Object a(yf90 yf90Var, hex hexVar, JSONObject jSONObject) {
        return b(yf90Var, (pwk) hexVar, jSONObject);
    }
}
