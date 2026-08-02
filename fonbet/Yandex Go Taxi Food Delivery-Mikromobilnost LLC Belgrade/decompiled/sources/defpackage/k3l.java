package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class k3l implements zsq0, nyi {
    public static JSONObject c(yf90 yf90Var, j3l j3lVar) {
        JSONObject w = n.w(yf90Var, "type", "percentage");
        a.g(yf90Var, w, "value", j3lVar.a);
        return w;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        return new j3l(a.b(yf90Var, jSONObject, "value", wm11.d, b.g, eja1.c));
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return c(yf90Var, (j3l) obj);
    }
}
