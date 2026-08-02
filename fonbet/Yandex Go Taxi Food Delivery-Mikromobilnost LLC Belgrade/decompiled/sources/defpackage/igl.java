package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class igl implements zsq0, nyi {
    public final JsonParserComponent a;

    public igl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        return new hgl(a.e(yf90Var, jSONObject, "corner_radius", wm11.b, b.h, ha91.a, null), (bcl) wwg.M(yf90Var, jSONObject, "stroke", this.a.Y7));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, hgl hglVar) {
        JSONObject jSONObject = new JSONObject();
        a.g(yf90Var, jSONObject, "corner_radius", hglVar.a);
        wwg.b0(yf90Var, jSONObject, "stroke", hglVar.b, this.a.Y7);
        return jSONObject;
    }
}
