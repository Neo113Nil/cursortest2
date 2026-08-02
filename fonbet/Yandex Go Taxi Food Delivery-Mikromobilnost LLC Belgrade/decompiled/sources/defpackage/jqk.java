package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.JsonParserComponent;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class jqk implements zsq0, nyi {
    public final JsonParserComponent a;

    public jqk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final iqk a(yf90 yf90Var, JSONObject jSONObject) {
        wms wmsVar = wm11.a;
        tls tlsVar = b.f;
        kvo kvoVar = mqk.a;
        kbs kbsVar = q5z.b;
        ?? e = a.e(yf90Var, jSONObject, "always_visible", wmsVar, tlsVar, kbsVar, kvoVar);
        if (e != 0) {
            kvoVar = e;
        }
        Expression b = a.b(yf90Var, jSONObject, "pattern", wm11.c, q5z.c, kbsVar);
        List J = wwg.J(yf90Var, jSONObject, "pattern_elements", this.a.B3, mqk.b);
        Object opt = jSONObject.opt("raw_text_variable");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        if (opt != null) {
            return new iqk(kvoVar, b, J, (String) opt);
        }
        throw fg90.h("raw_text_variable", jSONObject);
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, iqk iqkVar) {
        JSONObject jSONObject = new JSONObject();
        a.g(yf90Var, jSONObject, "always_visible", iqkVar.a);
        a.g(yf90Var, jSONObject, "pattern", iqkVar.b);
        wwg.c0(yf90Var, jSONObject, "pattern_elements", iqkVar.c, this.a.B3);
        wwg.Z(yf90Var, jSONObject, "raw_text_variable", iqkVar.d);
        wwg.Z(yf90Var, jSONObject, "type", "fixed_length");
        return jSONObject;
    }
}
