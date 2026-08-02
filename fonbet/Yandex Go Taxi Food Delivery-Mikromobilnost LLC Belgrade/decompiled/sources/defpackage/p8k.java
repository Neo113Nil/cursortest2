package defpackage;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class p8k implements qfy0 {
    public final JsonParserComponent a;

    public p8k(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final m8k a(yf90 yf90Var, t8k t8kVar, JSONObject jSONObject) {
        Expression c = xcx.c(yf90Var, t8kVar.a, jSONObject, "id", wm11.c);
        exq exqVar = t8kVar.b;
        JsonParserComponent jsonParserComponent = this.a;
        return new m8k(c, (l8k) xcx.b(yf90Var, exqVar, jSONObject, "position", jsonParserComponent.L0, jsonParserComponent.J0));
    }
}
