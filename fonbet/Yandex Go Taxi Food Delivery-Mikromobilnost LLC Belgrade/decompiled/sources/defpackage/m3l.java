package defpackage;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class m3l implements c4x, hex {
    public final exq a;

    public m3l(exq exqVar) {
        this.a = exqVar;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        l3l l3lVar = (l3l) ft6.b.S5.getValue();
        lb7 lb7Var = ft6.a;
        l3lVar.getClass();
        JSONObject jSONObject = new JSONObject();
        wwg.Z(lb7Var, jSONObject, "type", "percentage");
        wcx.q(lb7Var, jSONObject, "value", this.a);
        return jSONObject;
    }
}
