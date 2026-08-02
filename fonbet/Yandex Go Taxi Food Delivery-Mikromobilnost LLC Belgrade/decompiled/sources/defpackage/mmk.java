package defpackage;

import com.yandex.div.state.db.StateEntry;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class mmk implements c4x {
    public final m3k a;
    public final long b;

    public mmk(m3k m3kVar, long j) {
        this.a = m3kVar;
        this.b = j;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        xmk xmkVar = (xmk) ft6.b.P2.getValue();
        lb7 lb7Var = ft6.a;
        xmkVar.getClass();
        JSONObject jSONObject = new JSONObject();
        wwg.b0(lb7Var, jSONObject, "div", this.a, xmkVar.a.X9);
        wwg.Z(lb7Var, jSONObject, StateEntry.COLUMN_STATE_ID, Long.valueOf(this.b));
        return jSONObject;
    }
}
