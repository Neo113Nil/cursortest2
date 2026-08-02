package defpackage;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div.state.db.StateEntry;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class cdk implements qfy0 {
    public final JsonParserComponent a;

    public cdk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final zck a(yf90 yf90Var, ddk ddkVar, JSONObject jSONObject) {
        exq exqVar = ddkVar.a;
        ums umsVar = wm11.c;
        Expression f = xcx.f(yf90Var, exqVar, jSONObject, StateEntry.COLUMN_PATH, h991.a);
        exq exqVar2 = ddkVar.b;
        JsonParserComponent jsonParserComponent = this.a;
        return new zck(f, (xll) xcx.b(yf90Var, exqVar2, jSONObject, "value", jsonParserComponent.E9, jsonParserComponent.C9), xcx.c(yf90Var, ddkVar.c, jSONObject, "variable_name", umsVar));
    }
}
