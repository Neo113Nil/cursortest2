package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAnimationDirection;
import com.yandex.div2.DivAnimationInterpolator;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.e1;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class l0l implements qfy0 {
    public final JsonParserComponent a;

    public l0l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final i0l a(yf90 yf90Var, m0l m0lVar, JSONObject jSONObject) {
        exq exqVar = m0lVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.v1;
        i3y i3yVar2 = jsonParserComponent.t1;
        List s = xcx.s(yf90Var, exqVar, jSONObject, "cancel_actions", i3yVar, i3yVar2);
        exq exqVar2 = m0lVar.b;
        qkj qkjVar = e1.e;
        tls tlsVar = DivAnimationDirection.FROM_STRING;
        kvo kvoVar = e1.a;
        ?? o = xcx.o(yf90Var, exqVar2, jSONObject, "direction", qkjVar, tlsVar, kvoVar);
        kvo kvoVar2 = o == 0 ? kvoVar : o;
        exq exqVar3 = m0lVar.c;
        tms tmsVar = wm11.b;
        tls tlsVar2 = b.h;
        Expression e = xcx.e(yf90Var, exqVar3, jSONObject, "duration", tmsVar, tlsVar2, e1.g);
        List s2 = xcx.s(yf90Var, m0lVar.d, jSONObject, "end_actions", jsonParserComponent.v1, i3yVar2);
        exq exqVar4 = m0lVar.e;
        sms smsVar = wm11.d;
        tls tlsVar3 = b.g;
        Expression d = xcx.d(yf90Var, exqVar4, jSONObject, "end_value", smsVar, tlsVar3);
        exq exqVar5 = m0lVar.f;
        abl0 abl0Var = q5z.c;
        kbs kbsVar = q5z.b;
        String str = (String) xcx.a(exqVar5, jSONObject, "id", abl0Var, kbsVar);
        exq exqVar6 = m0lVar.g;
        qkj qkjVar2 = e1.f;
        tls tlsVar4 = DivAnimationInterpolator.FROM_STRING;
        kvo kvoVar3 = e1.b;
        ?? o2 = xcx.o(yf90Var, exqVar6, jSONObject, "interpolator", qkjVar2, tlsVar4, kvoVar3);
        kvo kvoVar4 = o2 == 0 ? kvoVar3 : o2;
        pkk pkkVar = (pkk) xcx.h(yf90Var, m0lVar.h, jSONObject, "repeat_count", jsonParserComponent.G2, jsonParserComponent.E2);
        if (pkkVar == null) {
            pkkVar = e1.c;
        }
        pkk pkkVar2 = pkkVar;
        exq exqVar7 = m0lVar.i;
        ivk ivkVar = e1.h;
        kvo kvoVar5 = e1.d;
        ?? n = xcx.n(yf90Var, exqVar7, jSONObject, "start_delay", tmsVar, tlsVar2, ivkVar, kvoVar5);
        if (n != 0) {
            kvoVar5 = n;
        }
        return new i0l(s, kvoVar2, e, s2, d, str, kvoVar4, pkkVar2, kvoVar5, xcx.l(yf90Var, m0lVar.j, jSONObject, "start_value", smsVar, tlsVar3), (String) xcx.a(m0lVar.k, jSONObject, "variable_name", abl0Var, kbsVar));
    }
}
