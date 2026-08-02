package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class a3l implements zsq0, nyi {
    public final JsonParserComponent a;

    public a3l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        return new w2l((String) wwg.F("id", jSONObject), wwg.O(yf90Var, jSONObject, "items", this.a.X9));
    }

    @Override // defpackage.zsq0
    public final JSONObject b(yf90 yf90Var, Object obj) {
        w2l w2lVar = (w2l) obj;
        JSONObject jSONObject = new JSONObject();
        wwg.Z(yf90Var, jSONObject, "id", w2lVar.a);
        wwg.c0(yf90Var, jSONObject, "items", w2lVar.b, this.a.X9);
        return jSONObject;
    }
}
