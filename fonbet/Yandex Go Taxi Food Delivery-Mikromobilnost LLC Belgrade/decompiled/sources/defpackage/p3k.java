package defpackage;

import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class p3k implements zsq0, yey0 {
    public static JSONObject c(yf90 yf90Var, s3k s3kVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.q(yf90Var, jSONObject, "bottom", s3kVar.a);
        wcx.q(yf90Var, jSONObject, "left", s3kVar.b);
        wcx.q(yf90Var, jSONObject, "right", s3kVar.c);
        wcx.q(yf90Var, jSONObject, "top", s3kVar.d);
        return jSONObject;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        tms tmsVar = wm11.b;
        tls tlsVar = b.h;
        return new s3k(wcx.j(Q, jSONObject, "bottom", tmsVar, i, null, tlsVar, r3k.e), wcx.j(Q, jSONObject, "left", tmsVar, i, null, tlsVar, r3k.f), wcx.j(Q, jSONObject, "right", tmsVar, i, null, tlsVar, r3k.g), wcx.j(Q, jSONObject, "top", tmsVar, i, null, tlsVar, r3k.h));
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return c(yf90Var, (s3k) obj);
    }
}
