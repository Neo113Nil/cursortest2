package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class ihl implements qfy0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.yandex.div.json.expressions.Expression] */
    public static fhl b(yf90 yf90Var, khl khlVar, JSONObject jSONObject) {
        Expression d = xcx.d(yf90Var, khlVar.a, jSONObject, "color", wm11.f, b.b);
        exq exqVar = khlVar.b;
        wms wmsVar = wm11.a;
        tls tlsVar = b.f;
        kvo kvoVar = jhl.a;
        ?? o = xcx.o(yf90Var, exqVar, jSONObject, "is_enabled", wmsVar, tlsVar, kvoVar);
        if (o != 0) {
            kvoVar = o;
        }
        return new fhl(d, kvoVar);
    }

    @Override // defpackage.qfy0
    public final /* bridge */ /* synthetic */ Object a(yf90 yf90Var, hex hexVar, JSONObject jSONObject) {
        return b(yf90Var, (khl) hexVar, jSONObject);
    }
}
