package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class m4k implements qfy0 {
    public final JsonParserComponent a;

    public m4k(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final j4k a(yf90 yf90Var, n4k n4kVar, JSONObject jSONObject) {
        Expression l = xcx.l(yf90Var, n4kVar.a, jSONObject, "index", wm11.b, b.h);
        exq exqVar = n4kVar.b;
        JsonParserComponent jsonParserComponent = this.a;
        return new j4k(l, (xll) xcx.b(yf90Var, exqVar, jSONObject, "value", jsonParserComponent.E9, jsonParserComponent.C9), xcx.c(yf90Var, n4kVar.c, jSONObject, "variable_name", wm11.c));
    }
}
