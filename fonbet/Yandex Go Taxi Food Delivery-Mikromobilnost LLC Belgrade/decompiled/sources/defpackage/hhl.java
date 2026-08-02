package defpackage;

import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class hhl implements zsq0, yey0 {
    public static khl c(yf90 yf90Var, khl khlVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        rms rmsVar = wm11.f;
        exq exqVar = khlVar != null ? khlVar.a : null;
        tls tlsVar = b.b;
        kbs kbsVar = q5z.b;
        return new khl(wcx.e(Q, jSONObject, "color", rmsVar, i, exqVar, tlsVar, kbsVar), wcx.j(Q, jSONObject, "is_enabled", wm11.a, i, khlVar != null ? khlVar.b : null, b.f, kbsVar));
    }

    public static JSONObject d(yf90 yf90Var, khl khlVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.p(khlVar.a, b.a, yf90Var, "color", jSONObject);
        wcx.q(yf90Var, jSONObject, "is_enabled", khlVar.b);
        wwg.Z(yf90Var, jSONObject, "type", "solid");
        return jSONObject;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (khl) obj);
    }
}
