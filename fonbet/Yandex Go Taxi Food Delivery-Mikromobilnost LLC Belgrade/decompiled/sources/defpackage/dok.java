package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class dok implements qfy0 {
    public final JsonParserComponent a;

    public dok(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final znk a(yf90 yf90Var, eok eokVar, JSONObject jSONObject) {
        if (eokVar instanceof eok) {
            return new znk(((x8l) this.a.h7.getValue()).a(yf90Var, eokVar.a, jSONObject));
        }
        w511.b();
        return null;
    }
}
