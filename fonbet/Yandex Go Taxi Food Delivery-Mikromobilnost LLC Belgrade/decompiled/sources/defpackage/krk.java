package defpackage;

import com.yandex.div2.DivEvaluableType;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class krk implements zsq0, nyi {
    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        return new jrk((String) wwg.F("name", jSONObject), (DivEvaluableType) wwg.G(jSONObject, "type", DivEvaluableType.FROM_STRING));
    }

    @Override // defpackage.zsq0
    public final JSONObject b(yf90 yf90Var, Object obj) {
        jrk jrkVar = (jrk) obj;
        JSONObject jSONObject = new JSONObject();
        wwg.Z(yf90Var, jSONObject, "name", jrkVar.a);
        wwg.a0(yf90Var, jSONObject, "type", jrkVar.b, DivEvaluableType.TO_STRING);
        return jSONObject;
    }
}
