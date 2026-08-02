package defpackage;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class i6k implements qfy0 {
    public final JsonParserComponent a;

    public i6k(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final f6k a(yf90 yf90Var, j6k j6kVar, JSONObject jSONObject) {
        exq exqVar = j6kVar.a;
        ums umsVar = wm11.c;
        Expression c = xcx.c(yf90Var, exqVar, jSONObject, "key", umsVar);
        exq exqVar2 = j6kVar.b;
        JsonParserComponent jsonParserComponent = this.a;
        return new f6k(c, (xll) xcx.h(yf90Var, exqVar2, jSONObject, "value", jsonParserComponent.E9, jsonParserComponent.C9), xcx.c(yf90Var, j6kVar.c, jSONObject, "variable_name", umsVar));
    }
}
