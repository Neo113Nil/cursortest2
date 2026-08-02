package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class i8k implements qfy0 {
    public final JsonParserComponent a;

    public i8k(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final f8k a(yf90 yf90Var, k8k k8kVar, JSONObject jSONObject) {
        exq exqVar = k8kVar.a;
        wms wmsVar = wm11.a;
        tls tlsVar = b.f;
        kvo kvoVar = j8k.a;
        ?? o = xcx.o(yf90Var, exqVar, jSONObject, "animated", wmsVar, tlsVar, kvoVar);
        if (o != 0) {
            kvoVar = o;
        }
        exq exqVar2 = k8kVar.b;
        JsonParserComponent jsonParserComponent = this.a;
        return new f8k(kvoVar, (v7k) xcx.b(yf90Var, exqVar2, jSONObject, "destination", jsonParserComponent.C0, jsonParserComponent.A0), xcx.c(yf90Var, k8kVar.c, jSONObject, "id", wm11.c));
    }
}
