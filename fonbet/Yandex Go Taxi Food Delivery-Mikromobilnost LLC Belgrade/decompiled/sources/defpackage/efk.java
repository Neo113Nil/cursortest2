package defpackage;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class efk implements c4x, hex {
    public final exq a;

    public efk(exq exqVar) {
        this.a = exqVar;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        cfk cfkVar = (cfk) ft6.b.M1.getValue();
        lb7 lb7Var = ft6.a;
        cfkVar.getClass();
        JSONObject jSONObject = new JSONObject();
        wcx.q(lb7Var, jSONObject, "ratio", this.a);
        return jSONObject;
    }
}
