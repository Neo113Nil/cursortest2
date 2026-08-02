package defpackage;

import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class czk implements c4x, hex {
    public final exq a;
    public final exq b;

    public czk(exq exqVar, exq exqVar2) {
        this.a = exqVar;
        this.b = exqVar2;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        xyk xykVar = (xyk) ft6.b.e5.getValue();
        lb7 lb7Var = ft6.a;
        xykVar.getClass();
        JSONObject jSONObject = new JSONObject();
        wcx.p(this.a, b.a, lb7Var, "color", jSONObject);
        wcx.q(lb7Var, jSONObject, "position", this.b);
        return jSONObject;
    }
}
