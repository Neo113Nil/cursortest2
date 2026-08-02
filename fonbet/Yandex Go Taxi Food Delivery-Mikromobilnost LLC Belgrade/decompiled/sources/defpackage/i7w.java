package defpackage;

import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class i7w implements zsq0, yey0 {
    public static k7w c(yf90 yf90Var, k7w k7wVar, JSONObject jSONObject) {
        return new k7w(wcx.e(udq0.Q(yf90Var), jSONObject, "value", wm11.b, yf90Var.i(), k7wVar != null ? k7wVar.a : null, b.h, q5z.b));
    }

    public static JSONObject d(yf90 yf90Var, k7w k7wVar) {
        JSONObject w = n.w(yf90Var, "type", "integer");
        wcx.q(yf90Var, w, "value", k7wVar.a);
        return w;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (k7w) obj);
    }
}
