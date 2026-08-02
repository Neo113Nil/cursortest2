package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class g8k implements zsq0, nyi {
    public final JsonParserComponent a;

    public g8k(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final f8k a(yf90 yf90Var, JSONObject jSONObject) {
        wms wmsVar = wm11.a;
        tls tlsVar = b.f;
        kvo kvoVar = j8k.a;
        kbs kbsVar = q5z.b;
        ?? e = a.e(yf90Var, jSONObject, "animated", wmsVar, tlsVar, kbsVar, kvoVar);
        if (e != 0) {
            kvoVar = e;
        }
        return new f8k(kvoVar, (v7k) wwg.E(yf90Var, jSONObject, "destination", this.a.A0), a.b(yf90Var, jSONObject, "id", wm11.c, q5z.c, kbsVar));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, f8k f8kVar) {
        JSONObject jSONObject = new JSONObject();
        a.g(yf90Var, jSONObject, "animated", f8kVar.a);
        wwg.b0(yf90Var, jSONObject, "destination", f8kVar.b, this.a.A0);
        a.g(yf90Var, jSONObject, "id", f8kVar.c);
        wwg.Z(yf90Var, jSONObject, "type", "scroll_to");
        return jSONObject;
    }
}
