package defpackage;

import com.yandex.div2.DivEvaluableType;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class mrk implements c4x, hex {
    public final exq a;
    public final exq b;

    public mrk(exq exqVar, exq exqVar2) {
        this.a = exqVar;
        this.b = exqVar2;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        lrk lrkVar = (lrk) ft6.b.R3.getValue();
        lb7 lb7Var = ft6.a;
        lrkVar.getClass();
        JSONObject jSONObject = new JSONObject();
        wcx.t(lb7Var, jSONObject, "name", this.a);
        wcx.s(this.b, DivEvaluableType.TO_STRING, lb7Var, "type", jSONObject);
        return jSONObject;
    }
}
