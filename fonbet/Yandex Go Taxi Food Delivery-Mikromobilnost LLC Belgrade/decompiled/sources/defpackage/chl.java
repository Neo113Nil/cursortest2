package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class chl implements qfy0 {
    public final JsonParserComponent a;

    public chl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ygl a(yf90 yf90Var, ehl ehlVar, JSONObject jSONObject) {
        Expression d = xcx.d(yf90Var, ehlVar.a, jSONObject, "color", wm11.f, b.b);
        exq exqVar = ehlVar.b;
        sms smsVar = wm11.d;
        tls tlsVar = b.g;
        zgl zglVar = dhl.e;
        kvo kvoVar = dhl.a;
        ?? n = xcx.n(yf90Var, exqVar, jSONObject, "density", smsVar, tlsVar, zglVar, kvoVar);
        if (n != 0) {
            kvoVar = n;
        }
        exq exqVar2 = ehlVar.c;
        wms wmsVar = wm11.a;
        tls tlsVar2 = b.f;
        kvo kvoVar2 = dhl.b;
        Expression o = xcx.o(yf90Var, exqVar2, jSONObject, "is_animated", wmsVar, tlsVar2, kvoVar2);
        if (o == null) {
            o = kvoVar2;
        }
        exq exqVar3 = ehlVar.d;
        kvo kvoVar3 = dhl.c;
        ?? o2 = xcx.o(yf90Var, exqVar3, jSONObject, "is_enabled", wmsVar, tlsVar2, kvoVar3);
        if (o2 != 0) {
            kvoVar3 = o2;
        }
        exq exqVar4 = ehlVar.e;
        JsonParserComponent jsonParserComponent = this.a;
        sqk sqkVar = (sqk) xcx.h(yf90Var, exqVar4, jSONObject, "particle_size", jsonParserComponent.G3, jsonParserComponent.E3);
        if (sqkVar == null) {
            sqkVar = dhl.d;
        }
        return new ygl(d, kvoVar, o, kvoVar3, sqkVar);
    }
}
