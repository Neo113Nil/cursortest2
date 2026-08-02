package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAction$Target;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.i;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f7k implements zsq0, nyi {
    public final JsonParserComponent a;

    public f7k(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final v3k a(yf90 yf90Var, JSONObject jSONObject) {
        JsonParserComponent jsonParserComponent = this.a;
        tnk tnkVar = (tnk) wwg.M(yf90Var, jSONObject, "download_callbacks", jsonParserComponent.a3);
        wms wmsVar = wm11.a;
        tls tlsVar = b.f;
        kvo kvoVar = i.a;
        kbs kbsVar = q5z.b;
        ?? e = a.e(yf90Var, jSONObject, "is_enabled", wmsVar, tlsVar, kbsVar, kvoVar);
        kvo kvoVar2 = e == 0 ? kvoVar : e;
        Expression b = a.b(yf90Var, jSONObject, "log_id", wm11.c, q5z.c, kbsVar);
        dxf0 dxf0Var = wm11.e;
        tls tlsVar2 = b.e;
        Expression e2 = a.e(yf90Var, jSONObject, "log_url", dxf0Var, tlsVar2, kbsVar, null);
        List O = wwg.O(yf90Var, jSONObject, "menu_items", jsonParserComponent.w1);
        Object opt = jSONObject.opt("payload");
        Object obj = JSONObject.NULL;
        if (opt == obj) {
            opt = null;
        }
        if (opt == null) {
            opt = null;
        }
        JSONObject jSONObject2 = (JSONObject) opt;
        Expression e3 = a.e(yf90Var, jSONObject, "referer", dxf0Var, tlsVar2, kbsVar, null);
        Object opt2 = jSONObject.opt("scope_id");
        if (opt2 == obj) {
            opt2 = null;
        }
        return new v3k(tnkVar, kvoVar2, b, e2, O, jSONObject2, e3, (String) (opt2 != null ? opt2 : null), a.e(yf90Var, jSONObject, "target", i.b, DivAction$Target.FROM_STRING, kbsVar, null), (jbk) wwg.M(yf90Var, jSONObject, "typed", jsonParserComponent.k1), a.e(yf90Var, jSONObject, "url", dxf0Var, tlsVar2, kbsVar, null));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, v3k v3kVar) {
        JSONObject jSONObject = new JSONObject();
        tnk tnkVar = v3kVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wwg.b0(yf90Var, jSONObject, "download_callbacks", tnkVar, jsonParserComponent.a3);
        a.g(yf90Var, jSONObject, "is_enabled", v3kVar.b);
        a.g(yf90Var, jSONObject, "log_id", v3kVar.c);
        Expression expression = v3kVar.d;
        tls tlsVar = b.c;
        a.h(yf90Var, jSONObject, "log_url", expression, tlsVar);
        wwg.c0(yf90Var, jSONObject, "menu_items", v3kVar.e, jsonParserComponent.w1);
        wwg.Z(yf90Var, jSONObject, "payload", v3kVar.f);
        a.h(yf90Var, jSONObject, "referer", v3kVar.g, tlsVar);
        wwg.Z(yf90Var, jSONObject, "scope_id", v3kVar.h);
        a.h(yf90Var, jSONObject, "target", v3kVar.i, DivAction$Target.TO_STRING);
        wwg.b0(yf90Var, jSONObject, "typed", v3kVar.j, jsonParserComponent.k1);
        a.h(yf90Var, jSONObject, "url", v3kVar.k, tlsVar);
        return jSONObject;
    }
}
