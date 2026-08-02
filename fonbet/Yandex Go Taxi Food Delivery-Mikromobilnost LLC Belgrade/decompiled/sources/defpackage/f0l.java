package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class f0l implements zsq0, yey0 {
    public final JsonParserComponent a;

    public f0l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    public final h0l c(yf90 yf90Var, h0l h0lVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        return new h0l(wcx.e(Q, jSONObject, "image_url", wm11.e, i, h0lVar != null ? h0lVar.a : null, b.e, q5z.b), wcx.c(Q, jSONObject, "insets", i, h0lVar != null ? h0lVar.b : null, this.a.F));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, h0l h0lVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.p(h0lVar.a, b.c, yf90Var, "image_url", jSONObject);
        wcx.u(yf90Var, jSONObject, "insets", h0lVar.b, this.a.F);
        wwg.Z(yf90Var, jSONObject, "type", "nine_patch_image");
        return jSONObject;
    }
}
