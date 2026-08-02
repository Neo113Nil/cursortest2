package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class oql implements qfy0 {
    public final JsonParserComponent a;

    public oql(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final lql a(yf90 yf90Var, pql pqlVar, JSONObject jSONObject) {
        Expression l = xcx.l(yf90Var, pqlVar.a, jSONObject, "constrained", wm11.a, b.f);
        exq exqVar = pqlVar.b;
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.n7;
        i3y i3yVar2 = jsonParserComponent.l7;
        return new lql((t9l) xcx.h(yf90Var, exqVar, jSONObject, "max_size", i3yVar, i3yVar2), (t9l) xcx.h(yf90Var, pqlVar.c, jSONObject, "min_size", jsonParserComponent.n7, i3yVar2), l);
    }
}
