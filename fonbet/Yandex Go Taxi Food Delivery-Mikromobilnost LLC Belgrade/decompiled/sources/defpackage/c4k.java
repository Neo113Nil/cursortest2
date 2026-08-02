package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAnimationDirection;
import com.yandex.div2.DivAnimationInterpolator;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.h;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class c4k implements qfy0 {
    public final JsonParserComponent a;

    public c4k(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final y3k a(yf90 yf90Var, d4k d4kVar, JSONObject jSONObject) {
        String str = (String) xcx.a(d4kVar.a, jSONObject, "animator_id", q5z.c, q5z.b);
        Expression l = xcx.l(yf90Var, d4kVar.b, jSONObject, "direction", h.a, DivAnimationDirection.FROM_STRING);
        exq exqVar = d4kVar.c;
        tms tmsVar = wm11.b;
        tls tlsVar = b.h;
        Expression m = xcx.m(yf90Var, exqVar, jSONObject, "duration", tmsVar, tlsVar, h.c);
        exq exqVar2 = d4kVar.d;
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.E9;
        i3y i3yVar2 = jsonParserComponent.C9;
        return new y3k(str, l, m, (xll) xcx.h(yf90Var, exqVar2, jSONObject, "end_value", i3yVar, i3yVar2), xcx.l(yf90Var, d4kVar.e, jSONObject, "interpolator", h.b, DivAnimationInterpolator.FROM_STRING), (pkk) xcx.h(yf90Var, d4kVar.f, jSONObject, "repeat_count", jsonParserComponent.G2, jsonParserComponent.E2), xcx.m(yf90Var, d4kVar.g, jSONObject, "start_delay", tmsVar, tlsVar, h.d), (xll) xcx.h(yf90Var, d4kVar.h, jSONObject, "start_value", jsonParserComponent.E9, i3yVar2));
    }
}
