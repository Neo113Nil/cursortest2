package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class o3l implements zsq0, nyi {
    public static n3l c(yf90 yf90Var, JSONObject jSONObject) {
        return new n3l(a.b(yf90Var, jSONObject, "value", wm11.d, b.g, q5z.b));
    }

    public static JSONObject d(yf90 yf90Var, n3l n3lVar) {
        JSONObject w = n.w(yf90Var, "type", "translation-percentage");
        a.g(yf90Var, w, "value", n3lVar.a);
        return w;
    }

    @Override // defpackage.nyi
    public final /* bridge */ /* synthetic */ Object a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (n3l) obj);
    }
}
