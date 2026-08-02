package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class enk implements zsq0, nyi {
    public final JsonParserComponent a;

    public enk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final dnk a(yf90 yf90Var, JSONObject jSONObject) {
        sqk sqkVar = (sqk) wwg.M(yf90Var, jSONObject, "space_between_centers", this.a.E3);
        if (sqkVar == null) {
            sqkVar = hnk.a;
        }
        return new dnk(sqkVar);
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, dnk dnkVar) {
        JSONObject jSONObject = new JSONObject();
        wwg.b0(yf90Var, jSONObject, "space_between_centers", dnkVar.a, this.a.E3);
        wwg.Z(yf90Var, jSONObject, "type", "default");
        return jSONObject;
    }
}
