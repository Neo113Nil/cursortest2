package defpackage;

import com.yandex.div2.DivEvaluableType;
import com.yandex.div2.JsonParserComponent;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class nrk implements zsq0, nyi {
    public final JsonParserComponent a;

    public nrk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        List I = wwg.I(yf90Var, jSONObject, "arguments", this.a.Q3);
        Object opt = jSONObject.opt("body");
        Object obj = JSONObject.NULL;
        if (opt == obj) {
            opt = null;
        }
        if (opt == null) {
            throw fg90.h("body", jSONObject);
        }
        String str = (String) opt;
        Object opt2 = jSONObject.opt("name");
        Object obj2 = opt2 != obj ? opt2 : null;
        if (obj2 == null) {
            throw fg90.h("name", jSONObject);
        }
        try {
            if (Pattern.matches("^[a-zA-Z_][a-zA-Z0-9_]*$", (String) obj2)) {
                return new irk(I, str, (String) obj2, (DivEvaluableType) wwg.G(jSONObject, "return_type", DivEvaluableType.FROM_STRING));
            }
            throw fg90.f(jSONObject, "name", obj2);
        } catch (ClassCastException unused) {
            throw fg90.m(jSONObject, "name", obj2);
        }
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, irk irkVar) {
        JSONObject jSONObject = new JSONObject();
        wwg.c0(yf90Var, jSONObject, "arguments", irkVar.a, this.a.Q3);
        wwg.Z(yf90Var, jSONObject, "body", irkVar.b);
        wwg.Z(yf90Var, jSONObject, "name", irkVar.c);
        wwg.a0(yf90Var, jSONObject, "return_type", irkVar.d, DivEvaluableType.TO_STRING);
        return jSONObject;
    }
}
