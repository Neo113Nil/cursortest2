package defpackage;

import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class p3l implements zsq0, yey0 {
    public static r3l c(yf90 yf90Var, r3l r3lVar, JSONObject jSONObject) {
        return new r3l(wcx.e(udq0.Q(yf90Var), jSONObject, "value", wm11.d, yf90Var.i(), r3lVar != null ? r3lVar.a : null, b.g, q5z.b));
    }

    public static JSONObject d(yf90 yf90Var, r3l r3lVar) {
        JSONObject w = n.w(yf90Var, "type", "translation-percentage");
        wcx.q(yf90Var, w, "value", r3lVar.a);
        return w;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (r3l) obj);
    }
}
