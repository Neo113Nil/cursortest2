package defpackage;

import com.yandex.div.internal.parser.a;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class mqu0 implements zsq0, nyi {
    public static JSONObject c(yf90 yf90Var, lqu0 lqu0Var) {
        JSONObject w = n.w(yf90Var, "type", "string");
        a.g(yf90Var, w, "value", lqu0Var.a);
        return w;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        return new lqu0(a.a(yf90Var, jSONObject, "value", wm11.c));
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return c(yf90Var, (lqu0) obj);
    }
}
