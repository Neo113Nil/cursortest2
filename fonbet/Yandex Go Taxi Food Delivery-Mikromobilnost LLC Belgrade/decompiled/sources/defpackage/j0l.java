package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAnimationDirection;
import com.yandex.div2.DivAnimationInterpolator;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.e1;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class j0l implements zsq0, nyi {
    public final JsonParserComponent a;

    public j0l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v16, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final i0l a(yf90 yf90Var, JSONObject jSONObject) {
        JsonParserComponent jsonParserComponent = this.a;
        List O = wwg.O(yf90Var, jSONObject, "cancel_actions", jsonParserComponent.t1);
        qkj qkjVar = e1.e;
        tls tlsVar = DivAnimationDirection.FROM_STRING;
        kvo kvoVar = e1.a;
        kbs kbsVar = q5z.b;
        ?? e = a.e(yf90Var, jSONObject, "direction", qkjVar, tlsVar, kbsVar, kvoVar);
        kvo kvoVar2 = e == 0 ? kvoVar : e;
        tms tmsVar = wm11.b;
        tls tlsVar2 = b.h;
        Expression b = a.b(yf90Var, jSONObject, "duration", tmsVar, tlsVar2, e1.g);
        List O2 = wwg.O(yf90Var, jSONObject, "end_actions", jsonParserComponent.t1);
        sms smsVar = wm11.d;
        tls tlsVar3 = b.g;
        Expression b2 = a.b(yf90Var, jSONObject, "end_value", smsVar, tlsVar3, kbsVar);
        Object opt = jSONObject.opt("id");
        Object obj = JSONObject.NULL;
        if (opt == obj) {
            opt = null;
        }
        if (opt == null) {
            throw fg90.h("id", jSONObject);
        }
        String str = (String) opt;
        qkj qkjVar2 = e1.f;
        tls tlsVar4 = DivAnimationInterpolator.FROM_STRING;
        kvo kvoVar3 = e1.b;
        ?? e2 = a.e(yf90Var, jSONObject, "interpolator", qkjVar2, tlsVar4, kbsVar, kvoVar3);
        kvo kvoVar4 = e2 == 0 ? kvoVar3 : e2;
        pkk pkkVar = (pkk) wwg.M(yf90Var, jSONObject, "repeat_count", jsonParserComponent.E2);
        if (pkkVar == null) {
            pkkVar = e1.c;
        }
        pkk pkkVar2 = pkkVar;
        ivk ivkVar = e1.h;
        kvo kvoVar5 = e1.d;
        ?? e3 = a.e(yf90Var, jSONObject, "start_delay", tmsVar, tlsVar2, ivkVar, kvoVar5);
        kvo kvoVar6 = e3 == 0 ? kvoVar5 : e3;
        Expression e4 = a.e(yf90Var, jSONObject, "start_value", smsVar, tlsVar3, kbsVar, null);
        Object opt2 = jSONObject.opt("variable_name");
        Object obj2 = opt2 != obj ? opt2 : null;
        if (obj2 != null) {
            return new i0l(O, kvoVar2, b, O2, b2, str, kvoVar4, pkkVar2, kvoVar6, e4, (String) obj2);
        }
        throw fg90.h("variable_name", jSONObject);
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, i0l i0lVar) {
        JSONObject jSONObject = new JSONObject();
        List list = i0lVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wwg.c0(yf90Var, jSONObject, "cancel_actions", list, jsonParserComponent.t1);
        a.h(yf90Var, jSONObject, "direction", i0lVar.b, DivAnimationDirection.TO_STRING);
        a.g(yf90Var, jSONObject, "duration", i0lVar.c);
        wwg.c0(yf90Var, jSONObject, "end_actions", i0lVar.d, jsonParserComponent.t1);
        a.g(yf90Var, jSONObject, "end_value", i0lVar.e);
        wwg.Z(yf90Var, jSONObject, "id", i0lVar.f);
        a.h(yf90Var, jSONObject, "interpolator", i0lVar.g, DivAnimationInterpolator.TO_STRING);
        wwg.b0(yf90Var, jSONObject, "repeat_count", i0lVar.h, jsonParserComponent.E2);
        a.g(yf90Var, jSONObject, "start_delay", i0lVar.i);
        a.g(yf90Var, jSONObject, "start_value", i0lVar.j);
        wwg.Z(yf90Var, jSONObject, "type", "number_animator");
        wwg.Z(yf90Var, jSONObject, "variable_name", i0lVar.k);
        return jSONObject;
    }
}
