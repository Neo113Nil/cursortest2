package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class h7l implements qfy0 {
    public final JsonParserComponent a;

    public h7l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final e7l a(yf90 yf90Var, j7l j7lVar, JSONObject jSONObject) {
        Expression d = xcx.d(yf90Var, j7lVar.a, jSONObject, "angle", wm11.d, b.g);
        exq exqVar = j7lVar.b;
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.i6;
        i3y i3yVar2 = jsonParserComponent.g6;
        z3l z3lVar = (z3l) xcx.h(yf90Var, exqVar, jSONObject, "pivot_x", i3yVar, i3yVar2);
        if (z3lVar == null) {
            z3lVar = i7l.a;
        }
        z3l z3lVar2 = (z3l) xcx.h(yf90Var, j7lVar.c, jSONObject, "pivot_y", jsonParserComponent.i6, i3yVar2);
        if (z3lVar2 == null) {
            z3lVar2 = i7l.b;
        }
        return new e7l(z3lVar, z3lVar2, d);
    }
}
