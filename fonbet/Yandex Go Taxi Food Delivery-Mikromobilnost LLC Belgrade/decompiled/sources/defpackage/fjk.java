package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class fjk implements zsq0, nyi {
    public final JsonParserComponent a;

    public fjk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        m3k m3kVar = (m3k) wwg.E(yf90Var, jSONObject, "div", this.a.X9);
        ums umsVar = wm11.c;
        abl0 abl0Var = q5z.c;
        kbs kbsVar = q5z.b;
        Expression e = a.e(yf90Var, jSONObject, "id", umsVar, abl0Var, kbsVar, null);
        wms wmsVar = wm11.a;
        tls tlsVar = b.f;
        kvo kvoVar = hjk.a;
        ?? e2 = a.e(yf90Var, jSONObject, "selector", wmsVar, tlsVar, kbsVar, kvoVar);
        if (e2 != 0) {
            kvoVar = e2;
        }
        return new cjk(m3kVar, e, kvoVar);
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, cjk cjkVar) {
        JSONObject jSONObject = new JSONObject();
        wwg.b0(yf90Var, jSONObject, "div", cjkVar.a, this.a.X9);
        a.g(yf90Var, jSONObject, "id", cjkVar.b);
        a.g(yf90Var, jSONObject, "selector", cjkVar.c);
        return jSONObject;
    }
}
