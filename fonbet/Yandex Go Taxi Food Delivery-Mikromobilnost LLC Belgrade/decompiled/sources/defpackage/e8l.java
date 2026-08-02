package defpackage;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class e8l implements c4x, hex {
    public final exq a;
    public final exq b;

    public e8l(exq exqVar, exq exqVar2) {
        this.a = exqVar;
        this.b = exqVar2;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        d8l d8lVar = (d8l) ft6.b.U6.getValue();
        lb7 lb7Var = ft6.a;
        d8lVar.getClass();
        JSONObject jSONObject = new JSONObject();
        wcx.q(lb7Var, jSONObject, "text", this.a);
        wcx.q(lb7Var, jSONObject, "value", this.b);
        return jSONObject;
    }
}
