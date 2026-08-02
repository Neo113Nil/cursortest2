package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class b0l implements qfy0 {
    public final JsonParserComponent a;

    public b0l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final yzk a(yf90 yf90Var, c0l c0lVar, JSONObject jSONObject) {
        exq exqVar = c0lVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        return new yzk((sqk) xcx.b(yf90Var, exqVar, jSONObject, "neighbour_page_width", jsonParserComponent.G3, jsonParserComponent.E3));
    }
}
