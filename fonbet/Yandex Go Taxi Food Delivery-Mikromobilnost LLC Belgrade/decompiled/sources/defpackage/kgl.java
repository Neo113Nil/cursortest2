package defpackage;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class kgl implements c4x, hex {
    public final exq a;
    public final exq b;

    public kgl(exq exqVar, exq exqVar2) {
        this.a = exqVar;
        this.b = exqVar2;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        jgl jglVar = (jgl) ft6.b.x8.getValue();
        lb7 lb7Var = ft6.a;
        jglVar.getClass();
        JSONObject jSONObject = new JSONObject();
        wcx.q(lb7Var, jSONObject, "corner_radius", this.a);
        wcx.u(lb7Var, jSONObject, "stroke", this.b, jglVar.a.Z7);
        return jSONObject;
    }
}
