package defpackage;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class ool implements c4x, hex {
    public final exq a;
    public final exq b;

    public ool(exq exqVar, exq exqVar2) {
        this.a = exqVar;
        this.b = exqVar2;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        nol nolVar = (nol) ft6.b.M9.getValue();
        lb7 lb7Var = ft6.a;
        nolVar.getClass();
        JSONObject jSONObject = new JSONObject();
        wcx.q(lb7Var, jSONObject, "height", this.a);
        wwg.Z(lb7Var, jSONObject, "type", "resolution");
        wcx.q(lb7Var, jSONObject, "width", this.b);
        return jSONObject;
    }
}
