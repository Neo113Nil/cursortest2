package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div2.JsonParserComponent;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class ifl implements zsq0, nyi {
    public final JsonParserComponent a;

    public ifl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        JsonParserComponent jsonParserComponent = this.a;
        return new afl(a.b(yf90Var, jSONObject, "text", wm11.c, q5z.c, q5z.b), wwg.O(yf90Var, jSONObject, "actions", jsonParserComponent.t1), wwg.O(yf90Var, jSONObject, "images", jsonParserComponent.Q8), wwg.O(yf90Var, jSONObject, "ranges", jsonParserComponent.N8));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, afl aflVar) {
        JSONObject jSONObject = new JSONObject();
        List list = aflVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wwg.c0(yf90Var, jSONObject, "actions", list, jsonParserComponent.t1);
        wwg.c0(yf90Var, jSONObject, "images", aflVar.b, jsonParserComponent.Q8);
        wwg.c0(yf90Var, jSONObject, "ranges", aflVar.c, jsonParserComponent.N8);
        a.g(yf90Var, jSONObject, "text", aflVar.d);
        return jSONObject;
    }
}
