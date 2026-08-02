package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivActionSetStoredValue$Scope;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.k;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class e9k implements qfy0 {
    public final JsonParserComponent a;

    public e9k(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final b9k a(yf90 yf90Var, f9k f9kVar, JSONObject jSONObject) {
        Expression d = xcx.d(yf90Var, f9kVar.a, jSONObject, "lifetime", wm11.b, b.h);
        Expression c = xcx.c(yf90Var, f9kVar.b, jSONObject, "name", wm11.c);
        Expression l = xcx.l(yf90Var, f9kVar.c, jSONObject, "scope", k.a, DivActionSetStoredValue$Scope.FROM_STRING);
        exq exqVar = f9kVar.d;
        JsonParserComponent jsonParserComponent = this.a;
        return new b9k(d, c, l, (xll) xcx.b(yf90Var, exqVar, jSONObject, "value", jsonParserComponent.E9, jsonParserComponent.C9));
    }
}
