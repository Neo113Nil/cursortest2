package defpackage;

import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class nol implements zsq0, yey0 {
    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        tms tmsVar = wm11.b;
        tls tlsVar = b.h;
        return new ool(wcx.e(Q, jSONObject, "height", tmsVar, i, null, tlsVar, ma91.a), wcx.e(Q, jSONObject, "width", tmsVar, i, null, tlsVar, ma91.b));
    }

    @Override // defpackage.zsq0
    public final JSONObject b(yf90 yf90Var, Object obj) {
        ool oolVar = (ool) obj;
        JSONObject jSONObject = new JSONObject();
        wcx.q(yf90Var, jSONObject, "height", oolVar.a);
        wwg.Z(yf90Var, jSONObject, "type", "resolution");
        wcx.q(yf90Var, jSONObject, "width", oolVar.b);
        return jSONObject;
    }
}
