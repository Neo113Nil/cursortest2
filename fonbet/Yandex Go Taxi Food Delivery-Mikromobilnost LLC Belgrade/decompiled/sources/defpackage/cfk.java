package defpackage;

import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class cfk implements zsq0, yey0 {
    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        return new efk(wcx.e(udq0.Q(yf90Var), jSONObject, "ratio", wm11.d, yf90Var.i(), null, b.g, udq0.a));
    }

    @Override // defpackage.zsq0
    public final JSONObject b(yf90 yf90Var, Object obj) {
        JSONObject jSONObject = new JSONObject();
        wcx.q(yf90Var, jSONObject, "ratio", ((efk) obj).a);
        return jSONObject;
    }
}
