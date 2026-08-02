package defpackage;

import com.yandex.div.internal.parser.a;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class f2x implements zsq0, nyi {
    public static JSONObject c(yf90 yf90Var, e2x e2xVar) {
        JSONObject w = n.w(yf90Var, "type", "item_id");
        a.g(yf90Var, w, "value", e2xVar.a);
        return w;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        return new e2x(a.a(yf90Var, jSONObject, "value", wm11.c));
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return c(yf90Var, (e2x) obj);
    }
}
