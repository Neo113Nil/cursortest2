package defpackage;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class nqu0 implements zsq0, yey0 {
    public static JSONObject c(yf90 yf90Var, pqu0 pqu0Var) {
        JSONObject w = n.w(yf90Var, "type", "string");
        wcx.q(yf90Var, w, "value", pqu0Var.a);
        return w;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        return new pqu0(wcx.d(udq0.Q(yf90Var), jSONObject, "value", wm11.c, yf90Var.i(), null));
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return c(yf90Var, (pqu0) obj);
    }
}
