package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div2.JsonParserComponent;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class l6k implements zsq0, nyi {
    public final JsonParserComponent a;

    public l6k(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final k6k a(yf90 yf90Var, JSONObject jSONObject) {
        JsonParserComponent jsonParserComponent = this.a;
        return new k6k(wwg.O(yf90Var, jSONObject, "on_fail_actions", jsonParserComponent.t1), wwg.O(yf90Var, jSONObject, "on_success_actions", jsonParserComponent.t1), a.b(yf90Var, jSONObject, "url", wm11.e, b.e, q5z.b));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, k6k k6kVar) {
        JSONObject jSONObject = new JSONObject();
        List list = k6kVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wwg.c0(yf90Var, jSONObject, "on_fail_actions", list, jsonParserComponent.t1);
        wwg.c0(yf90Var, jSONObject, "on_success_actions", k6kVar.b, jsonParserComponent.t1);
        wwg.Z(yf90Var, jSONObject, "type", "download");
        a.h(yf90Var, jSONObject, "url", k6kVar.c, b.c);
        return jSONObject;
    }
}
