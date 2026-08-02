package defpackage;

import com.yandex.div.internal.parser.a;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class ahj implements zsq0, nyi {
    public static JSONObject c(yf90 yf90Var, zgj zgjVar) {
        JSONObject w = n.w(yf90Var, "type", "dict");
        a.g(yf90Var, w, "value", zgjVar.a);
        return w;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        return new zgj(a.a(yf90Var, jSONObject, "value", wm11.h));
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return c(yf90Var, (zgj) obj);
    }
}
