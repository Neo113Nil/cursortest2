package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class dik implements zsq0, yey0 {
    public final JsonParserComponent a;

    public dik(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    public final fik c(yf90 yf90Var, fik fikVar, JSONObject jSONObject) {
        return new fik(wcx.f(udq0.Q(yf90Var), jSONObject, "items", yf90Var.i(), fikVar != null ? fikVar.a : null, this.a.e2, m991.a));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, fik fikVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.w(yf90Var, jSONObject, "items", fikVar.a, this.a.e2);
        wwg.Z(yf90Var, jSONObject, "type", "set");
        return jSONObject;
    }
}
