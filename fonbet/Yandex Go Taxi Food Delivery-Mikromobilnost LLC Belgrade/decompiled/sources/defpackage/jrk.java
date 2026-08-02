package defpackage;

import com.yandex.div2.DivEvaluableType;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class jrk implements c4x {
    public final String a;
    public final DivEvaluableType b;
    public Integer c;

    public jrk(String str, DivEvaluableType divEvaluableType) {
        this.a = str;
        this.b = divEvaluableType;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        krk krkVar = (krk) ft6.b.Q3.getValue();
        lb7 lb7Var = ft6.a;
        krkVar.getClass();
        JSONObject jSONObject = new JSONObject();
        wwg.Z(lb7Var, jSONObject, "name", this.a);
        wwg.a0(lb7Var, jSONObject, "type", this.b, DivEvaluableType.TO_STRING);
        return jSONObject;
    }
}
