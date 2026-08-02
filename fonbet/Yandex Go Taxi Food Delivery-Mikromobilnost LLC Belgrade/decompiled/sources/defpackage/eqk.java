package defpackage;

import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class eqk implements zsq0, yey0 {
    public static gqk c(yf90 yf90Var, gqk gqkVar, JSONObject jSONObject) {
        return new gqk(wcx.e(udq0.Q(yf90Var), jSONObject, "value", wm11.b, yf90Var.i(), gqkVar != null ? gqkVar.a : null, b.h, x991.a));
    }

    public static JSONObject d(yf90 yf90Var, gqk gqkVar) {
        JSONObject w = n.w(yf90Var, "type", "fixed");
        wcx.q(yf90Var, w, "value", gqkVar.a);
        return w;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (gqk) obj);
    }
}
