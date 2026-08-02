package defpackage;

import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class brv implements zsq0, yey0 {
    public static drv c(yf90 yf90Var, drv drvVar, JSONObject jSONObject) {
        return new drv(wcx.e(udq0.Q(yf90Var), jSONObject, "value", wm11.b, yf90Var.i(), drvVar != null ? drvVar.a : null, b.h, cj91.a));
    }

    public static JSONObject d(yf90 yf90Var, drv drvVar) {
        JSONObject w = n.w(yf90Var, "type", "index");
        wcx.q(yf90Var, w, "value", drvVar.a);
        return w;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (drv) obj);
    }
}
