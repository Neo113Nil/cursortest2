package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivActionScrollBy$Overflow;
import com.yandex.div2.j;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class n7k implements zsq0, yey0 {
    public static p7k c(yf90 yf90Var, p7k p7kVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        wms wmsVar = wm11.a;
        exq exqVar = p7kVar != null ? p7kVar.a : null;
        tls tlsVar = b.f;
        kbs kbsVar = q5z.b;
        exq j = wcx.j(Q, jSONObject, "animated", wmsVar, i, exqVar, tlsVar, kbsVar);
        exq d = wcx.d(Q, jSONObject, "id", wm11.c, i, p7kVar != null ? p7kVar.b : null);
        tms tmsVar = wm11.b;
        exq exqVar2 = p7kVar != null ? p7kVar.c : null;
        tls tlsVar2 = b.h;
        return new p7k(j, d, wcx.j(Q, jSONObject, "item_count", tmsVar, i, exqVar2, tlsVar2, kbsVar), wcx.j(Q, jSONObject, "offset", tmsVar, i, p7kVar != null ? p7kVar.d : null, tlsVar2, kbsVar), wcx.j(Q, jSONObject, "overflow", j.e, i, p7kVar != null ? p7kVar.e : null, DivActionScrollBy$Overflow.FROM_STRING, kbsVar));
    }

    public static JSONObject d(yf90 yf90Var, p7k p7kVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.q(yf90Var, jSONObject, "animated", p7kVar.a);
        wcx.q(yf90Var, jSONObject, "id", p7kVar.b);
        wcx.q(yf90Var, jSONObject, "item_count", p7kVar.c);
        wcx.q(yf90Var, jSONObject, "offset", p7kVar.d);
        wcx.p(p7kVar.e, DivActionScrollBy$Overflow.TO_STRING, yf90Var, "overflow", jSONObject);
        wwg.Z(yf90Var, jSONObject, "type", "scroll_by");
        return jSONObject;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (p7k) obj);
    }
}
