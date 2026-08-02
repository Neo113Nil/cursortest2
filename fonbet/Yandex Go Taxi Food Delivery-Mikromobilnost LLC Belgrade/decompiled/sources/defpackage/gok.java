package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.b0;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class gok implements zsq0, yey0 {
    public static JSONObject c(yf90 yf90Var, hok hokVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.q(yf90Var, jSONObject, "bottom", hokVar.a);
        wcx.q(yf90Var, jSONObject, "end", hokVar.b);
        wcx.q(yf90Var, jSONObject, "left", hokVar.c);
        wcx.q(yf90Var, jSONObject, "right", hokVar.d);
        wcx.q(yf90Var, jSONObject, "start", hokVar.e);
        wcx.q(yf90Var, jSONObject, "top", hokVar.f);
        wcx.p(hokVar.g, DivSizeUnit.TO_STRING, yf90Var, "unit", jSONObject);
        return jSONObject;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        tms tmsVar = wm11.b;
        tls tlsVar = b.h;
        return new hok(wcx.j(Q, jSONObject, "bottom", tmsVar, i, null, tlsVar, b0.g), wcx.j(Q, jSONObject, "end", tmsVar, i, null, tlsVar, b0.h), wcx.j(Q, jSONObject, "left", tmsVar, i, null, tlsVar, b0.i), wcx.j(Q, jSONObject, "right", tmsVar, i, null, tlsVar, b0.j), wcx.j(Q, jSONObject, "start", tmsVar, i, null, tlsVar, b0.k), wcx.j(Q, jSONObject, "top", tmsVar, i, null, tlsVar, b0.l), wcx.j(Q, jSONObject, "unit", b0.f, i, null, DivSizeUnit.FROM_STRING, q5z.b));
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return c(yf90Var, (hok) obj);
    }
}
