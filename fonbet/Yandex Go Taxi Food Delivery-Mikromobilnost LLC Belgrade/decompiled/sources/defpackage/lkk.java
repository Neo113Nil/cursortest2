package defpackage;

import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class lkk implements zsq0, yey0 {
    public static JSONObject c(yf90 yf90Var, mkk mkkVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.q(yf90Var, jSONObject, "bottom-left", mkkVar.a);
        wcx.q(yf90Var, jSONObject, "bottom-right", mkkVar.b);
        wcx.q(yf90Var, jSONObject, "top-left", mkkVar.c);
        wcx.q(yf90Var, jSONObject, "top-right", mkkVar.d);
        return jSONObject;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        tms tmsVar = wm11.b;
        tls tlsVar = b.h;
        return new mkk(wcx.j(Q, jSONObject, "bottom-left", tmsVar, i, null, tlsVar, gtq0.a), wcx.j(Q, jSONObject, "bottom-right", tmsVar, i, null, tlsVar, gtq0.b), wcx.j(Q, jSONObject, "top-left", tmsVar, i, null, tlsVar, gtq0.c), wcx.j(Q, jSONObject, "top-right", tmsVar, i, null, tlsVar, gtq0.d));
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return c(yf90Var, (mkk) obj);
    }
}
