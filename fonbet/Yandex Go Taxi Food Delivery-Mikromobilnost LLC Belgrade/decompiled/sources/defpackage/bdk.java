package defpackage;

import com.yandex.div.state.db.StateEntry;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class bdk implements zsq0, yey0 {
    public final JsonParserComponent a;

    public bdk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    public final ddk c(yf90 yf90Var, ddk ddkVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        ums umsVar = wm11.c;
        return new ddk(wcx.e(Q, jSONObject, StateEntry.COLUMN_PATH, umsVar, i, ddkVar != null ? ddkVar.a : null, q5z.c, h991.a), wcx.c(Q, jSONObject, "value", i, ddkVar != null ? ddkVar.b : null, this.a.D9), wcx.d(Q, jSONObject, "variable_name", umsVar, i, ddkVar != null ? ddkVar.c : null));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, ddk ddkVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.q(yf90Var, jSONObject, StateEntry.COLUMN_PATH, ddkVar.a);
        wwg.Z(yf90Var, jSONObject, "type", "update_structure");
        wcx.u(yf90Var, jSONObject, "value", ddkVar.b, this.a.D9);
        wcx.q(yf90Var, jSONObject, "variable_name", ddkVar.c);
        return jSONObject;
    }
}
