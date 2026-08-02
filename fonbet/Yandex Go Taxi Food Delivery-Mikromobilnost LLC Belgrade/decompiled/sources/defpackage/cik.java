package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class cik implements zsq0, nyi {
    public final JsonParserComponent a;

    public cik(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final bik a(yf90 yf90Var, JSONObject jSONObject) {
        return new bik(wwg.J(yf90Var, jSONObject, "items", this.a.d2, m991.a));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, bik bikVar) {
        JSONObject jSONObject = new JSONObject();
        wwg.c0(yf90Var, jSONObject, "items", bikVar.a, this.a.d2);
        wwg.Z(yf90Var, jSONObject, "type", "set");
        return jSONObject;
    }
}
