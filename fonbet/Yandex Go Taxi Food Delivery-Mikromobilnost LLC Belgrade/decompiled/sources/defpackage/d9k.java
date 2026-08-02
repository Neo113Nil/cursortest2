package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivActionSetStoredValue$Scope;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.k;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class d9k implements zsq0, yey0 {
    public final JsonParserComponent a;

    public d9k(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    public final f9k c(yf90 yf90Var, f9k f9kVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        tms tmsVar = wm11.b;
        exq exqVar = f9kVar != null ? f9kVar.a : null;
        tls tlsVar = b.h;
        kbs kbsVar = q5z.b;
        return new f9k(wcx.e(Q, jSONObject, "lifetime", tmsVar, i, exqVar, tlsVar, kbsVar), wcx.d(Q, jSONObject, "name", wm11.c, i, f9kVar != null ? f9kVar.b : null), wcx.j(Q, jSONObject, "scope", k.a, i, f9kVar != null ? f9kVar.c : null, DivActionSetStoredValue$Scope.FROM_STRING, kbsVar), wcx.c(Q, jSONObject, "value", i, f9kVar != null ? f9kVar.d : null, this.a.D9));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, f9k f9kVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.q(yf90Var, jSONObject, "lifetime", f9kVar.a);
        wcx.q(yf90Var, jSONObject, "name", f9kVar.b);
        wcx.p(f9kVar.c, DivActionSetStoredValue$Scope.TO_STRING, yf90Var, "scope", jSONObject);
        wwg.Z(yf90Var, jSONObject, "type", "set_stored_value");
        wcx.u(yf90Var, jSONObject, "value", f9kVar.d, this.a.D9);
        return jSONObject;
    }
}
