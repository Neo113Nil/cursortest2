package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class p4k implements zsq0, nyi {
    public static o4k c(yf90 yf90Var, JSONObject jSONObject) {
        tms tmsVar = wm11.b;
        tls tlsVar = b.h;
        kbs kbsVar = q5z.b;
        return new o4k(a.b(yf90Var, jSONObject, "index", tmsVar, tlsVar, kbsVar), a.b(yf90Var, jSONObject, "variable_name", wm11.c, q5z.c, kbsVar));
    }

    public static JSONObject d(yf90 yf90Var, o4k o4kVar) {
        JSONObject jSONObject = new JSONObject();
        a.g(yf90Var, jSONObject, "index", o4kVar.a);
        wwg.Z(yf90Var, jSONObject, "type", "array_remove_value");
        a.g(yf90Var, jSONObject, "variable_name", o4kVar.b);
        return jSONObject;
    }

    @Override // defpackage.nyi
    public final /* bridge */ /* synthetic */ Object a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (o4k) obj);
    }
}
