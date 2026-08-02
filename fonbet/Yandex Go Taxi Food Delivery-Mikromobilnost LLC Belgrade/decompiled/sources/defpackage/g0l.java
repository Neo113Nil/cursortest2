package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class g0l implements qfy0 {
    public final JsonParserComponent a;

    public g0l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final d0l a(yf90 yf90Var, h0l h0lVar, JSONObject jSONObject) {
        Expression d = xcx.d(yf90Var, h0lVar.a, jSONObject, "image_url", wm11.e, b.e);
        exq exqVar = h0lVar.b;
        JsonParserComponent jsonParserComponent = this.a;
        return new d0l(d, (n3k) xcx.b(yf90Var, exqVar, jSONObject, "insets", jsonParserComponent.G, jsonParserComponent.E));
    }
}
