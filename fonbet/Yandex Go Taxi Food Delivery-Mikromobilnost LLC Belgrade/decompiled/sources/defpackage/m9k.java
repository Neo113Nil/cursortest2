package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class m9k implements zsq0, nyi {
    public static l9k c(yf90 yf90Var, JSONObject jSONObject) {
        return new l9k(a.a(yf90Var, jSONObject, "id", wm11.c), a.e(yf90Var, jSONObject, "multiple", wm11.a, b.f, q5z.b, null));
    }

    public static JSONObject d(yf90 yf90Var, l9k l9kVar) {
        JSONObject jSONObject = new JSONObject();
        a.g(yf90Var, jSONObject, "id", l9kVar.a);
        a.g(yf90Var, jSONObject, "multiple", l9kVar.b);
        wwg.Z(yf90Var, jSONObject, "type", "show_tooltip");
        return jSONObject;
    }

    @Override // defpackage.nyi
    public final /* bridge */ /* synthetic */ Object a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (l9k) obj);
    }
}
