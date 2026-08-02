package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.h2;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ccl implements zsq0, nyi {
    public final JsonParserComponent a;

    public ccl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        rms rmsVar = wm11.f;
        tls tlsVar = b.b;
        kbs kbsVar = q5z.b;
        Expression b = a.b(yf90Var, jSONObject, "color", rmsVar, tlsVar, kbsVar);
        gcl gclVar = (gcl) wwg.M(yf90Var, jSONObject, "style", this.a.V7);
        if (gclVar == null) {
            gclVar = h2.a;
        }
        qkj qkjVar = h2.d;
        tls tlsVar2 = DivSizeUnit.FROM_STRING;
        kvo kvoVar = h2.b;
        ?? e = a.e(yf90Var, jSONObject, "unit", qkjVar, tlsVar2, kbsVar, kvoVar);
        if (e != 0) {
            kvoVar = e;
        }
        sms smsVar = wm11.d;
        tls tlsVar3 = b.g;
        i8l i8lVar = h2.e;
        kvo kvoVar2 = h2.c;
        ?? e2 = a.e(yf90Var, jSONObject, "width", smsVar, tlsVar3, i8lVar, kvoVar2);
        if (e2 != 0) {
            kvoVar2 = e2;
        }
        return new bcl(b, gclVar, kvoVar, kvoVar2);
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, bcl bclVar) {
        JSONObject jSONObject = new JSONObject();
        a.h(yf90Var, jSONObject, "color", bclVar.a, b.a);
        wwg.b0(yf90Var, jSONObject, "style", bclVar.b, this.a.V7);
        a.h(yf90Var, jSONObject, "unit", bclVar.c, DivSizeUnit.TO_STRING);
        a.g(yf90Var, jSONObject, "width", bclVar.d);
        return jSONObject;
    }
}
