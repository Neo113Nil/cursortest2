package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class h7w implements zsq0, nyi {
    public static g7w c(yf90 yf90Var, JSONObject jSONObject) {
        return new g7w(a.b(yf90Var, jSONObject, "value", wm11.b, b.h, q5z.b));
    }

    public static JSONObject d(yf90 yf90Var, g7w g7wVar) {
        JSONObject w = n.w(yf90Var, "type", "integer");
        a.g(yf90Var, w, "value", g7wVar.a);
        return w;
    }

    @Override // defpackage.nyi
    public final /* bridge */ /* synthetic */ Object a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (g7w) obj);
    }
}
