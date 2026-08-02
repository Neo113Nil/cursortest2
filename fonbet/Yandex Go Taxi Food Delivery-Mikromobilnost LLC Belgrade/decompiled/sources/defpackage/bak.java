package defpackage;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class bak implements c4x, hex {
    public final exq a;
    public final exq b;

    public bak(exq exqVar, exq exqVar2) {
        this.a = exqVar;
        this.b = exqVar2;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        y9k y9kVar = (y9k) ft6.b.f1.getValue();
        lb7 lb7Var = ft6.a;
        y9kVar.getClass();
        JSONObject jSONObject = new JSONObject();
        wcx.q(lb7Var, jSONObject, "name", this.a);
        wcx.q(lb7Var, jSONObject, "value", this.b);
        return jSONObject;
    }
}
