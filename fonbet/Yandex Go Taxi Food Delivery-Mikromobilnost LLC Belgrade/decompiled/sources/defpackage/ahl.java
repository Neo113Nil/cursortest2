package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class ahl implements zsq0, nyi {
    public final JsonParserComponent a;

    public ahl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ygl a(yf90 yf90Var, JSONObject jSONObject) {
        rms rmsVar = wm11.f;
        tls tlsVar = b.b;
        kbs kbsVar = q5z.b;
        Expression b = a.b(yf90Var, jSONObject, "color", rmsVar, tlsVar, kbsVar);
        sms smsVar = wm11.d;
        tls tlsVar2 = b.g;
        zgl zglVar = dhl.e;
        kvo kvoVar = dhl.a;
        ?? e = a.e(yf90Var, jSONObject, "density", smsVar, tlsVar2, zglVar, kvoVar);
        kvo kvoVar2 = e == 0 ? kvoVar : e;
        wms wmsVar = wm11.a;
        tls tlsVar3 = b.f;
        kvo kvoVar3 = dhl.b;
        Expression e2 = a.e(yf90Var, jSONObject, "is_animated", wmsVar, tlsVar3, kbsVar, kvoVar3);
        if (e2 == null) {
            e2 = kvoVar3;
        }
        kvo kvoVar4 = dhl.c;
        Expression e3 = a.e(yf90Var, jSONObject, "is_enabled", wmsVar, tlsVar3, kbsVar, kvoVar4);
        if (e3 == null) {
            e3 = kvoVar4;
        }
        sqk sqkVar = (sqk) wwg.M(yf90Var, jSONObject, "particle_size", this.a.E3);
        if (sqkVar == null) {
            sqkVar = dhl.d;
        }
        return new ygl(b, kvoVar2, e2, e3, sqkVar);
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, ygl yglVar) {
        JSONObject jSONObject = new JSONObject();
        a.h(yf90Var, jSONObject, "color", yglVar.a, b.a);
        a.g(yf90Var, jSONObject, "density", yglVar.b);
        a.g(yf90Var, jSONObject, "is_animated", yglVar.c);
        a.g(yf90Var, jSONObject, "is_enabled", yglVar.d);
        wwg.b0(yf90Var, jSONObject, "particle_size", yglVar.e, this.a.E3);
        wwg.Z(yf90Var, jSONObject, "type", "particles");
        return jSONObject;
    }
}
