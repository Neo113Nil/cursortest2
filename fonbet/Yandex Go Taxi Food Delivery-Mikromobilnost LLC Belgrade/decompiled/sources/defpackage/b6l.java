package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div2.JsonParserComponent;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class b6l implements zsq0, nyi {
    public final JsonParserComponent a;

    public b6l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final k5l a(yf90 yf90Var, JSONObject jSONObject) {
        JsonParserComponent jsonParserComponent = this.a;
        n5l n5lVar = (n5l) wwg.M(yf90Var, jSONObject, "center_x", jsonParserComponent.m6);
        if (n5lVar == null) {
            n5lVar = e6l.a;
        }
        n5l n5lVar2 = (n5l) wwg.M(yf90Var, jSONObject, "center_y", jsonParserComponent.m6);
        if (n5lVar2 == null) {
            n5lVar2 = e6l.b;
        }
        List P = wwg.P(yf90Var, jSONObject, "color_map", jsonParserComponent.E6, e6l.e);
        rms rmsVar = wm11.f;
        tls tlsVar = b.a;
        pvo f = a.f(yf90Var, jSONObject, "colors", rmsVar, e6l.d);
        h6l h6lVar = (h6l) wwg.M(yf90Var, jSONObject, "radius", jsonParserComponent.s6);
        if (h6lVar == null) {
            h6lVar = e6l.c;
        }
        return new k5l(n5lVar, n5lVar2, P, f, h6lVar);
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, k5l k5lVar) {
        JSONObject jSONObject = new JSONObject();
        n5l n5lVar = k5lVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wwg.b0(yf90Var, jSONObject, "center_x", n5lVar, jsonParserComponent.m6);
        wwg.b0(yf90Var, jSONObject, "center_y", k5lVar.b, jsonParserComponent.m6);
        wwg.c0(yf90Var, jSONObject, "color_map", k5lVar.c, jsonParserComponent.E6);
        pvo pvoVar = k5lVar.d;
        tls tlsVar = b.a;
        a.i(yf90Var, jSONObject, pvoVar);
        wwg.b0(yf90Var, jSONObject, "radius", k5lVar.e, jsonParserComponent.s6);
        wwg.Z(yf90Var, jSONObject, "type", "radial_gradient");
        return jSONObject;
    }
}
