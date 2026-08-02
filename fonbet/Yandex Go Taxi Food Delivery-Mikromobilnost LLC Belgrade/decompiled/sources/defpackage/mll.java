package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivTrigger$Mode;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.a3;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class mll implements zsq0, nyi {
    public final JsonParserComponent a;

    public mll(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        List J = wwg.J(yf90Var, jSONObject, "actions", this.a.t1, a3.c);
        wms wmsVar = wm11.a;
        tls tlsVar = b.f;
        kbs kbsVar = q5z.b;
        Expression b = a.b(yf90Var, jSONObject, "condition", wmsVar, tlsVar, kbsVar);
        qkj qkjVar = a3.b;
        tls tlsVar2 = DivTrigger$Mode.FROM_STRING;
        kvo kvoVar = a3.a;
        ?? e = a.e(yf90Var, jSONObject, "mode", qkjVar, tlsVar2, kbsVar, kvoVar);
        if (e != 0) {
            kvoVar = e;
        }
        return new lll(J, b, kvoVar);
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, lll lllVar) {
        JSONObject jSONObject = new JSONObject();
        wwg.c0(yf90Var, jSONObject, "actions", lllVar.a, this.a.t1);
        a.g(yf90Var, jSONObject, "condition", lllVar.b);
        a.h(yf90Var, jSONObject, "mode", lllVar.c, DivTrigger$Mode.TO_STRING);
        return jSONObject;
    }
}
