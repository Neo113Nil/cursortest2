package defpackage;

import com.yandex.div.state.db.StateEntry;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class jbl implements zsq0, nyi {
    public final JsonParserComponent a;

    public jbl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        JsonParserComponent jsonParserComponent = this.a;
        pdk pdkVar = (pdk) wwg.M(yf90Var, jSONObject, "animation_in", jsonParserComponent.z1);
        pdk pdkVar2 = (pdk) wwg.M(yf90Var, jSONObject, "animation_out", jsonParserComponent.z1);
        m3k m3kVar = (m3k) wwg.M(yf90Var, jSONObject, "div", jsonParserComponent.X9);
        Object opt = jSONObject.opt(StateEntry.COLUMN_STATE_ID);
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        if (opt != null) {
            return new cbl(pdkVar, pdkVar2, m3kVar, (String) opt, wwg.O(yf90Var, jSONObject, "swipe_out_actions", jsonParserComponent.t1));
        }
        throw fg90.h(StateEntry.COLUMN_STATE_ID, jSONObject);
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, cbl cblVar) {
        JSONObject jSONObject = new JSONObject();
        pdk pdkVar = cblVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wwg.b0(yf90Var, jSONObject, "animation_in", pdkVar, jsonParserComponent.z1);
        wwg.b0(yf90Var, jSONObject, "animation_out", cblVar.b, jsonParserComponent.z1);
        wwg.b0(yf90Var, jSONObject, "div", cblVar.c, jsonParserComponent.X9);
        wwg.Z(yf90Var, jSONObject, StateEntry.COLUMN_STATE_ID, cblVar.d);
        wwg.c0(yf90Var, jSONObject, "swipe_out_actions", cblVar.e, jsonParserComponent.t1);
        return jSONObject;
    }
}
