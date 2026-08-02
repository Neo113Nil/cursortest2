package defpackage;

import com.yandex.div.state.db.StateEntry;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class kbl implements zsq0, yey0 {
    public final JsonParserComponent a;

    public kbl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        JsonParserComponent jsonParserComponent = this.a;
        return new mbl(wcx.i(Q, jSONObject, "animation_in", i, null, jsonParserComponent.A1), wcx.i(Q, jSONObject, "animation_out", i, null, jsonParserComponent.A1), wcx.i(Q, jSONObject, "div", i, null, jsonParserComponent.Y9), wcx.a(Q, jSONObject, StateEntry.COLUMN_STATE_ID, i, null), wcx.k(Q, jSONObject, "swipe_out_actions", i, null, jsonParserComponent.u1));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, mbl mblVar) {
        JSONObject jSONObject = new JSONObject();
        exq exqVar = mblVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wcx.u(yf90Var, jSONObject, "animation_in", exqVar, jsonParserComponent.A1);
        wcx.u(yf90Var, jSONObject, "animation_out", mblVar.b, jsonParserComponent.A1);
        wcx.u(yf90Var, jSONObject, "div", mblVar.c, jsonParserComponent.Y9);
        wcx.t(yf90Var, jSONObject, StateEntry.COLUMN_STATE_ID, mblVar.d);
        wcx.w(yf90Var, jSONObject, "swipe_out_actions", mblVar.e, jsonParserComponent.u1);
        return jSONObject;
    }
}
