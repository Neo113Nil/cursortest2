package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class a0l implements zsq0, yey0 {
    public final JsonParserComponent a;

    public a0l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    public final c0l c(yf90 yf90Var, c0l c0lVar, JSONObject jSONObject) {
        return new c0l(wcx.c(udq0.Q(yf90Var), jSONObject, "neighbour_page_width", yf90Var.i(), c0lVar != null ? c0lVar.a : null, this.a.F3));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, c0l c0lVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.u(yf90Var, jSONObject, "neighbour_page_width", c0lVar.a, this.a.F3);
        wwg.Z(yf90Var, jSONObject, "type", "fixed");
        return jSONObject;
    }
}
