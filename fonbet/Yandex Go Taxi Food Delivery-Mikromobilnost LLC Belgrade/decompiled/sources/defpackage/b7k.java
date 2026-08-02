package defpackage;

import com.yandex.div.internal.parser.a;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class b7k implements zsq0, nyi {
    public static a7k c(yf90 yf90Var, JSONObject jSONObject) {
        return new a7k(a.a(yf90Var, jSONObject, "id", wm11.c));
    }

    public static JSONObject d(yf90 yf90Var, a7k a7kVar) {
        JSONObject jSONObject = new JSONObject();
        a.g(yf90Var, jSONObject, "id", a7kVar.a);
        wwg.Z(yf90Var, jSONObject, "type", "hide_tooltip");
        return jSONObject;
    }

    @Override // defpackage.nyi
    public final /* bridge */ /* synthetic */ Object a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (a7k) obj);
    }
}
