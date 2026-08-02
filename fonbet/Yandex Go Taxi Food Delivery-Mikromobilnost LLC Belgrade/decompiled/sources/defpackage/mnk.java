package defpackage;

import com.yandex.div2.DivSizeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class mnk implements c4x, hex {
    public final exq a;
    public final exq b;

    static {
        new kvo(DivSizeUnit.DP);
    }

    public mnk(exq exqVar, exq exqVar2) {
        this.a = exqVar;
        this.b = exqVar2;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        lnk lnkVar = (lnk) ft6.b.V2.getValue();
        lb7 lb7Var = ft6.a;
        lnkVar.getClass();
        JSONObject jSONObject = new JSONObject();
        wcx.p(this.a, DivSizeUnit.TO_STRING, lb7Var, "unit", jSONObject);
        wcx.q(lb7Var, jSONObject, "value", this.b);
        return jSONObject;
    }
}
