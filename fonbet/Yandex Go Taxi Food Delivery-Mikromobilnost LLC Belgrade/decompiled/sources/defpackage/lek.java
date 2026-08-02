package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class lek implements zsq0, yey0 {
    public final JsonParserComponent a;

    public lek(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    public final nek c(yf90 yf90Var, nek nekVar, JSONObject jSONObject) {
        return new nek(wcx.f(udq0.Q(yf90Var), jSONObject, "items", yf90Var.i(), nekVar != null ? nekVar.a : null, this.a.J1, gwk0.a));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, nek nekVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.w(yf90Var, jSONObject, "items", nekVar.a, this.a.J1);
        wwg.Z(yf90Var, jSONObject, "type", "set");
        return jSONObject;
    }
}
