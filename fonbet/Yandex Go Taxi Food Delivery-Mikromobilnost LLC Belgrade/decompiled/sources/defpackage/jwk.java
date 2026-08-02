package defpackage;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class jwk implements c4x, hex {
    public final exq a;
    public final exq b;
    public final exq c;

    static {
        new kvo(Boolean.FALSE);
    }

    public jwk(exq exqVar, exq exqVar2, exq exqVar3) {
        this.a = exqVar;
        this.b = exqVar2;
        this.c = exqVar3;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        hwk hwkVar = (hwk) ft6.b.H4.getValue();
        lb7 lb7Var = ft6.a;
        hwkVar.getClass();
        JSONObject jSONObject = new JSONObject();
        wcx.q(lb7Var, jSONObject, "allow_empty", this.a);
        wcx.q(lb7Var, jSONObject, "label_id", this.b);
        wcx.t(lb7Var, jSONObject, "variable", this.c);
        return jSONObject;
    }
}
