package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class e0l implements zsq0, nyi {
    public final JsonParserComponent a;

    public e0l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final d0l a(yf90 yf90Var, JSONObject jSONObject) {
        return new d0l(a.b(yf90Var, jSONObject, "image_url", wm11.e, b.e, q5z.b), (n3k) wwg.E(yf90Var, jSONObject, "insets", this.a.E));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, d0l d0lVar) {
        JSONObject jSONObject = new JSONObject();
        a.h(yf90Var, jSONObject, "image_url", d0lVar.a, b.c);
        wwg.b0(yf90Var, jSONObject, "insets", d0lVar.b, this.a.E);
        wwg.Z(yf90Var, jSONObject, "type", "nine_patch_image");
        return jSONObject;
    }
}
