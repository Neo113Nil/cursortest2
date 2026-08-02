package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class kgk implements zsq0, nyi {
    public static jgk c(yf90 yf90Var, JSONObject jSONObject) {
        return new jgk(a.b(yf90Var, jSONObject, "radius", wm11.b, b.h, i991.a));
    }

    public static JSONObject d(yf90 yf90Var, jgk jgkVar) {
        JSONObject jSONObject = new JSONObject();
        a.g(yf90Var, jSONObject, "radius", jgkVar.a);
        wwg.Z(yf90Var, jSONObject, "type", "blur");
        return jSONObject;
    }

    @Override // defpackage.nyi
    public final /* bridge */ /* synthetic */ Object a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (jgk) obj);
    }
}
