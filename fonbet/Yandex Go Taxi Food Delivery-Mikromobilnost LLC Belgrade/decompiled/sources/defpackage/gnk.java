package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class gnk implements qfy0 {
    public final JsonParserComponent a;

    public gnk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    public final Object a(yf90 yf90Var, hex hexVar, JSONObject jSONObject) {
        exq exqVar = ((ink) hexVar).a;
        JsonParserComponent jsonParserComponent = this.a;
        sqk sqkVar = (sqk) xcx.h(yf90Var, exqVar, jSONObject, "space_between_centers", jsonParserComponent.G3, jsonParserComponent.E3);
        if (sqkVar == null) {
            sqkVar = hnk.a;
        }
        return new dnk(sqkVar);
    }
}
