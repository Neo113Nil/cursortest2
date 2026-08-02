package defpackage;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class gpk implements c4x, hex {
    public final exq a;
    public final exq b;

    public gpk(exq exqVar, exq exqVar2) {
        this.a = exqVar;
        this.b = exqVar2;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        fpk fpkVar = (fpk) ft6.b.k3.getValue();
        lb7 lb7Var = ft6.a;
        fpkVar.getClass();
        JSONObject jSONObject = new JSONObject();
        wcx.t(lb7Var, jSONObject, "id", this.a);
        wcx.t(lb7Var, jSONObject, "params", this.b);
        return jSONObject;
    }
}
