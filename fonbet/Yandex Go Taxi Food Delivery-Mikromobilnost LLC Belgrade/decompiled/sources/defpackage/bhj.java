package defpackage;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class bhj implements zsq0, yey0 {
    public static JSONObject c(yf90 yf90Var, dhj dhjVar) {
        JSONObject w = n.w(yf90Var, "type", "dict");
        wcx.q(yf90Var, w, "value", dhjVar.a);
        return w;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        return new dhj(wcx.d(udq0.Q(yf90Var), jSONObject, "value", wm11.h, yf90Var.i(), null));
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return c(yf90Var, (dhj) obj);
    }
}
