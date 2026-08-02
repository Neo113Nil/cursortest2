package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class mek implements qfy0 {
    public final JsonParserComponent a;

    public mek(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    public final Object a(yf90 yf90Var, hex hexVar, JSONObject jSONObject) {
        exq exqVar = ((nek) hexVar).a;
        JsonParserComponent jsonParserComponent = this.a;
        return new jek(xcx.g(yf90Var, exqVar, jSONObject, "items", jsonParserComponent.K1, jsonParserComponent.I1, gwk0.a));
    }
}
