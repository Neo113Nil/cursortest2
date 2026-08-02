package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class ghl implements zsq0, nyi {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [com.yandex.div.json.expressions.Expression] */
    public static fhl c(yf90 yf90Var, JSONObject jSONObject) {
        rms rmsVar = wm11.f;
        tls tlsVar = b.b;
        kbs kbsVar = q5z.b;
        Expression b = a.b(yf90Var, jSONObject, "color", rmsVar, tlsVar, kbsVar);
        wms wmsVar = wm11.a;
        tls tlsVar2 = b.f;
        kvo kvoVar = jhl.a;
        ?? e = a.e(yf90Var, jSONObject, "is_enabled", wmsVar, tlsVar2, kbsVar, kvoVar);
        if (e != 0) {
            kvoVar = e;
        }
        return new fhl(b, kvoVar);
    }

    public static JSONObject d(yf90 yf90Var, fhl fhlVar) {
        JSONObject jSONObject = new JSONObject();
        a.h(yf90Var, jSONObject, "color", fhlVar.a, b.a);
        a.g(yf90Var, jSONObject, "is_enabled", fhlVar.b);
        wwg.Z(yf90Var, jSONObject, "type", "solid");
        return jSONObject;
    }

    @Override // defpackage.nyi
    public final /* bridge */ /* synthetic */ Object a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (fhl) obj);
    }
}
