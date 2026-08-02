package defpackage;

import com.yandex.div.state.db.StateEntry;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class ank implements c4x, hex {
    public final exq a;
    public final exq b;

    public ank(exq exqVar, exq exqVar2) {
        this.a = exqVar;
        this.b = exqVar2;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        ymk ymkVar = (ymk) ft6.b.Q2.getValue();
        lb7 lb7Var = ft6.a;
        ymkVar.getClass();
        JSONObject jSONObject = new JSONObject();
        wcx.u(lb7Var, jSONObject, "div", this.a, ymkVar.a.Y9);
        wcx.t(lb7Var, jSONObject, StateEntry.COLUMN_STATE_ID, this.b);
        return jSONObject;
    }
}
