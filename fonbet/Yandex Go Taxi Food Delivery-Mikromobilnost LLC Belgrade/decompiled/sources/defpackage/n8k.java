package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class n8k implements zsq0, nyi {
    public final JsonParserComponent a;

    public n8k(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final m8k a(yf90 yf90Var, JSONObject jSONObject) {
        return new m8k(a.a(yf90Var, jSONObject, "id", wm11.c), (l8k) wwg.E(yf90Var, jSONObject, "position", this.a.J0));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, m8k m8kVar) {
        JSONObject jSONObject = new JSONObject();
        a.g(yf90Var, jSONObject, "id", m8kVar.a);
        wwg.b0(yf90Var, jSONObject, "position", m8kVar.b, this.a.J0);
        wwg.Z(yf90Var, jSONObject, "type", "set_cursor_position");
        return jSONObject;
    }
}
