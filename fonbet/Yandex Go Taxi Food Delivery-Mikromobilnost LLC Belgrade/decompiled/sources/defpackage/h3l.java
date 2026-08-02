package defpackage;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class h3l implements c4x, hex {
    public final exq a;
    public final exq b;

    public h3l(exq exqVar, exq exqVar2) {
        this.a = exqVar;
        this.b = exqVar2;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        b3l b3lVar = (b3l) ft6.b.Q5.getValue();
        lb7 lb7Var = ft6.a;
        b3lVar.getClass();
        JSONObject jSONObject = new JSONObject();
        wcx.t(lb7Var, jSONObject, "id", this.a);
        wcx.w(lb7Var, jSONObject, "items", this.b, b3lVar.a.Y9);
        return jSONObject;
    }
}
