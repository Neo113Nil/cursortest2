package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class kek implements zsq0, nyi {
    public final JsonParserComponent a;

    public kek(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final jek a(yf90 yf90Var, JSONObject jSONObject) {
        return new jek(wwg.J(yf90Var, jSONObject, "items", this.a.I1, gwk0.a));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, jek jekVar) {
        JSONObject jSONObject = new JSONObject();
        wwg.c0(yf90Var, jSONObject, "items", jekVar.a, this.a.I1);
        wwg.Z(yf90Var, jSONObject, "type", "set");
        return jSONObject;
    }
}
