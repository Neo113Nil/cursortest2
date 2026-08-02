package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class fnk implements zsq0, yey0 {
    public final JsonParserComponent a;

    public fnk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        return new ink(wcx.i(udq0.Q(yf90Var), jSONObject, "space_between_centers", yf90Var.i(), null, this.a.F3));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, ink inkVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.u(yf90Var, jSONObject, "space_between_centers", inkVar.a, this.a.F3);
        wwg.Z(yf90Var, jSONObject, "type", "default");
        return jSONObject;
    }
}
