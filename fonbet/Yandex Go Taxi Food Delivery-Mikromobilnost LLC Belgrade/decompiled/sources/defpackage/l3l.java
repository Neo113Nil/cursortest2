package defpackage;

import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class l3l implements zsq0, yey0 {
    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        return new m3l(wcx.e(udq0.Q(yf90Var), jSONObject, "value", wm11.d, yf90Var.i(), null, b.g, eja1.c));
    }

    @Override // defpackage.zsq0
    public final JSONObject b(yf90 yf90Var, Object obj) {
        JSONObject w = n.w(yf90Var, "type", "percentage");
        wcx.q(yf90Var, w, "value", ((m3l) obj).a);
        return w;
    }
}
