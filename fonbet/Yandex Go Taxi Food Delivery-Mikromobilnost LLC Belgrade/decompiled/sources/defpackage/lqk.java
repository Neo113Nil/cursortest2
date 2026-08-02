package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class lqk implements qfy0 {
    public final JsonParserComponent a;

    public lqk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final iqk a(yf90 yf90Var, rqk rqkVar, JSONObject jSONObject) {
        exq exqVar = rqkVar.a;
        wms wmsVar = wm11.a;
        tls tlsVar = b.f;
        kvo kvoVar = mqk.a;
        ?? o = xcx.o(yf90Var, exqVar, jSONObject, "always_visible", wmsVar, tlsVar, kvoVar);
        kvo kvoVar2 = o == 0 ? kvoVar : o;
        Expression c = xcx.c(yf90Var, rqkVar.b, jSONObject, "pattern", wm11.c);
        exq exqVar2 = rqkVar.c;
        JsonParserComponent jsonParserComponent = this.a;
        return new iqk(kvoVar2, c, xcx.g(yf90Var, exqVar2, jSONObject, "pattern_elements", jsonParserComponent.D3, jsonParserComponent.B3, mqk.b), (String) xcx.a(rqkVar.d, jSONObject, "raw_text_variable", q5z.c, q5z.b));
    }
}
