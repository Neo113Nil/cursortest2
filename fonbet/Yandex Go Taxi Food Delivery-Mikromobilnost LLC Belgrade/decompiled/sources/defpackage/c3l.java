package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div2.DivPatch$Mode;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.i1;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class c3l implements zsq0, nyi {
    public final JsonParserComponent a;

    public c3l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final y2l a(yf90 yf90Var, JSONObject jSONObject) {
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.P5;
        i3y i3yVar2 = jsonParserComponent.t1;
        List J = wwg.J(yf90Var, jSONObject, "changes", i3yVar, i1.c);
        qkj qkjVar = i1.b;
        tls tlsVar = DivPatch$Mode.FROM_STRING;
        kvo kvoVar = i1.a;
        ?? e = a.e(yf90Var, jSONObject, "mode", qkjVar, tlsVar, q5z.b, kvoVar);
        if (e != 0) {
            kvoVar = e;
        }
        return new y2l(kvoVar, J, wwg.O(yf90Var, jSONObject, "on_applied_actions", i3yVar2), wwg.O(yf90Var, jSONObject, "on_failed_actions", i3yVar2));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, y2l y2lVar) {
        JSONObject jSONObject = new JSONObject();
        List list = y2lVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wwg.c0(yf90Var, jSONObject, "changes", list, jsonParserComponent.P5);
        a.h(yf90Var, jSONObject, "mode", y2lVar.b, DivPatch$Mode.TO_STRING);
        wwg.c0(yf90Var, jSONObject, "on_applied_actions", y2lVar.c, jsonParserComponent.t1);
        wwg.c0(yf90Var, jSONObject, "on_failed_actions", y2lVar.d, jsonParserComponent.t1);
        return jSONObject;
    }
}
