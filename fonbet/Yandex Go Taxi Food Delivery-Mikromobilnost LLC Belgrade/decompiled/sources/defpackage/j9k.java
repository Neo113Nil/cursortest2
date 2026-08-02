package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class j9k implements qfy0 {
    public final JsonParserComponent a;

    public j9k(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final g9k a(yf90 yf90Var, k9k k9kVar, JSONObject jSONObject) {
        exq exqVar = k9kVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        return new g9k((xll) xcx.b(yf90Var, exqVar, jSONObject, "value", jsonParserComponent.E9, jsonParserComponent.C9), xcx.c(yf90Var, k9kVar.b, jSONObject, "variable_name", wm11.c));
    }
}
