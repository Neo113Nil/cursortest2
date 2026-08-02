package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class n6k implements qfy0 {
    public final JsonParserComponent a;

    public n6k(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final k6k a(yf90 yf90Var, o6k o6kVar, JSONObject jSONObject) {
        exq exqVar = o6kVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.v1;
        i3y i3yVar2 = jsonParserComponent.t1;
        return new k6k(xcx.s(yf90Var, exqVar, jSONObject, "on_fail_actions", i3yVar, i3yVar2), xcx.s(yf90Var, o6kVar.b, jSONObject, "on_success_actions", jsonParserComponent.v1, i3yVar2), xcx.d(yf90Var, o6kVar.c, jSONObject, "url", wm11.e, b.e));
    }
}
