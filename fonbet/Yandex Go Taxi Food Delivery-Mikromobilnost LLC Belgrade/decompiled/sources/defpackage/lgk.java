package defpackage;

import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class lgk implements zsq0, yey0 {
    public static ngk c(yf90 yf90Var, ngk ngkVar, JSONObject jSONObject) {
        return new ngk(wcx.e(udq0.Q(yf90Var), jSONObject, "radius", wm11.b, yf90Var.i(), ngkVar != null ? ngkVar.a : null, b.h, i991.a));
    }

    public static JSONObject d(yf90 yf90Var, ngk ngkVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.q(yf90Var, jSONObject, "radius", ngkVar.a);
        wwg.Z(yf90Var, jSONObject, "type", "blur");
        return jSONObject;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (ngk) obj);
    }
}
