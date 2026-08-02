package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivActionSetStoredValue$Scope;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.k;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class c9k implements zsq0, nyi {
    public final JsonParserComponent a;

    public c9k(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final b9k a(yf90 yf90Var, JSONObject jSONObject) {
        tms tmsVar = wm11.b;
        tls tlsVar = b.h;
        kbs kbsVar = q5z.b;
        return new b9k(a.b(yf90Var, jSONObject, "lifetime", tmsVar, tlsVar, kbsVar), a.b(yf90Var, jSONObject, "name", wm11.c, q5z.c, kbsVar), a.e(yf90Var, jSONObject, "scope", k.a, DivActionSetStoredValue$Scope.FROM_STRING, kbsVar, null), (xll) wwg.E(yf90Var, jSONObject, "value", this.a.C9));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, b9k b9kVar) {
        JSONObject jSONObject = new JSONObject();
        a.g(yf90Var, jSONObject, "lifetime", b9kVar.a);
        a.g(yf90Var, jSONObject, "name", b9kVar.b);
        a.h(yf90Var, jSONObject, "scope", b9kVar.c, DivActionSetStoredValue$Scope.TO_STRING);
        wwg.Z(yf90Var, jSONObject, "type", "set_stored_value");
        wwg.b0(yf90Var, jSONObject, "value", b9kVar.d, this.a.C9);
        return jSONObject;
    }
}
