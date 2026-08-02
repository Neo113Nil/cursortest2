package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.state.db.StateEntry;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class adk implements zsq0, nyi {
    public final JsonParserComponent a;

    public adk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final zck a(yf90 yf90Var, JSONObject jSONObject) {
        ums umsVar = wm11.c;
        abl0 abl0Var = q5z.c;
        return new zck(a.b(yf90Var, jSONObject, StateEntry.COLUMN_PATH, umsVar, abl0Var, h991.a), (xll) wwg.E(yf90Var, jSONObject, "value", this.a.C9), a.b(yf90Var, jSONObject, "variable_name", umsVar, abl0Var, q5z.b));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, zck zckVar) {
        JSONObject jSONObject = new JSONObject();
        a.g(yf90Var, jSONObject, StateEntry.COLUMN_PATH, zckVar.a);
        wwg.Z(yf90Var, jSONObject, "type", "update_structure");
        wwg.b0(yf90Var, jSONObject, "value", zckVar.b, this.a.C9);
        a.g(yf90Var, jSONObject, "variable_name", zckVar.c);
        return jSONObject;
    }
}
