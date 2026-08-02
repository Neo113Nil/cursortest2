package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ozk implements zsq0, nyi {
    public final JsonParserComponent a;

    public ozk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final nzk a(yf90 yf90Var, JSONObject jSONObject) {
        JsonParserComponent jsonParserComponent = this.a;
        return new nzk((t9l) wwg.M(yf90Var, jSONObject, "max_size", jsonParserComponent.l7), (t9l) wwg.M(yf90Var, jSONObject, "min_size", jsonParserComponent.l7), a.e(yf90Var, jSONObject, "weight", wm11.d, b.g, jx81.b, null));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, nzk nzkVar) {
        JSONObject jSONObject = new JSONObject();
        t9l t9lVar = nzkVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wwg.b0(yf90Var, jSONObject, "max_size", t9lVar, jsonParserComponent.l7);
        wwg.b0(yf90Var, jSONObject, "min_size", nzkVar.b, jsonParserComponent.l7);
        wwg.Z(yf90Var, jSONObject, "type", "match_parent");
        a.g(yf90Var, jSONObject, "weight", nzkVar.c);
        return jSONObject;
    }
}
