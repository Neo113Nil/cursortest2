package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAnimationDirection;
import com.yandex.div2.DivAnimationInterpolator;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.h;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class a4k implements zsq0, nyi {
    public final JsonParserComponent a;

    public a4k(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final y3k a(yf90 yf90Var, JSONObject jSONObject) {
        String str = (String) wwg.F("animator_id", jSONObject);
        qkj qkjVar = h.a;
        tls tlsVar = DivAnimationDirection.FROM_STRING;
        kbs kbsVar = q5z.b;
        Expression e = a.e(yf90Var, jSONObject, "direction", qkjVar, tlsVar, kbsVar, null);
        tms tmsVar = wm11.b;
        tls tlsVar2 = b.h;
        Expression e2 = a.e(yf90Var, jSONObject, "duration", tmsVar, tlsVar2, h.c, null);
        JsonParserComponent jsonParserComponent = this.a;
        return new y3k(str, e, e2, (xll) wwg.M(yf90Var, jSONObject, "end_value", jsonParserComponent.C9), a.e(yf90Var, jSONObject, "interpolator", h.b, DivAnimationInterpolator.FROM_STRING, kbsVar, null), (pkk) wwg.M(yf90Var, jSONObject, "repeat_count", jsonParserComponent.E2), a.e(yf90Var, jSONObject, "start_delay", tmsVar, tlsVar2, h.d, null), (xll) wwg.M(yf90Var, jSONObject, "start_value", jsonParserComponent.C9));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, y3k y3kVar) {
        JSONObject jSONObject = new JSONObject();
        wwg.Z(yf90Var, jSONObject, "animator_id", y3kVar.a);
        a.h(yf90Var, jSONObject, "direction", y3kVar.b, DivAnimationDirection.TO_STRING);
        a.g(yf90Var, jSONObject, "duration", y3kVar.c);
        xll xllVar = y3kVar.d;
        JsonParserComponent jsonParserComponent = this.a;
        wwg.b0(yf90Var, jSONObject, "end_value", xllVar, jsonParserComponent.C9);
        a.h(yf90Var, jSONObject, "interpolator", y3kVar.e, DivAnimationInterpolator.TO_STRING);
        wwg.b0(yf90Var, jSONObject, "repeat_count", y3kVar.f, jsonParserComponent.E2);
        a.g(yf90Var, jSONObject, "start_delay", y3kVar.g);
        wwg.b0(yf90Var, jSONObject, "start_value", y3kVar.h, jsonParserComponent.C9);
        wwg.Z(yf90Var, jSONObject, "type", "animator_start");
        return jSONObject;
    }
}
