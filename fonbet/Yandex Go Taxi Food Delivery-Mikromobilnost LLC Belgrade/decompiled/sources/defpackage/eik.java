package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class eik implements qfy0 {
    public final JsonParserComponent a;

    public eik(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    public final Object a(yf90 yf90Var, hex hexVar, JSONObject jSONObject) {
        exq exqVar = ((fik) hexVar).a;
        JsonParserComponent jsonParserComponent = this.a;
        return new bik(xcx.g(yf90Var, exqVar, jSONObject, "items", jsonParserComponent.f2, jsonParserComponent.d2, m991.a));
    }
}
