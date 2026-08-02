package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class mol implements zsq0, nyi {
    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        tms tmsVar = wm11.b;
        tls tlsVar = b.h;
        return new hol(a.b(yf90Var, jSONObject, "height", tmsVar, tlsVar, ma91.a), a.b(yf90Var, jSONObject, "width", tmsVar, tlsVar, ma91.b));
    }

    @Override // defpackage.zsq0
    public final JSONObject b(yf90 yf90Var, Object obj) {
        hol holVar = (hol) obj;
        JSONObject jSONObject = new JSONObject();
        a.g(yf90Var, jSONObject, "height", holVar.a);
        wwg.Z(yf90Var, jSONObject, "type", "resolution");
        a.g(yf90Var, jSONObject, "width", holVar.b);
        return jSONObject;
    }
}
