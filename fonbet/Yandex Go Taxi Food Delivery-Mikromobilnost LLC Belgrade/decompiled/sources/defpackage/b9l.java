package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b9l implements qfy0 {
    public final JsonParserComponent a;

    public b9l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final t8l a(yf90 yf90Var, e9l e9lVar, JSONObject jSONObject) {
        boolean z = e9lVar instanceof d9l;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            return new s8l(((n7l) jsonParserComponent.M6.getValue()).a(yf90Var, ((d9l) e9lVar).a, jSONObject));
        }
        if (e9lVar instanceof c9l) {
            return new r8l(((rik) jsonParserComponent.i2.getValue()).a(yf90Var, ((c9l) e9lVar).a(), jSONObject));
        }
        w511.b();
        return null;
    }
}
