package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivTooltip$Position;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.z2;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class mil implements zsq0, nyi {
    public final JsonParserComponent a;

    public mil(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.z1;
        i3y i3yVar2 = jsonParserComponent.X9;
        pdk pdkVar = (pdk) wwg.M(yf90Var, jSONObject, "animation_in", i3yVar);
        pdk pdkVar2 = (pdk) wwg.M(yf90Var, jSONObject, "animation_out", jsonParserComponent.z1);
        ums umsVar = wm11.c;
        abl0 abl0Var = q5z.c;
        kbs kbsVar = q5z.b;
        Expression e = a.e(yf90Var, jSONObject, "background_accessibility_description", umsVar, abl0Var, kbsVar, null);
        Object opt = jSONObject.opt("bring_to_top_id");
        Object obj = JSONObject.NULL;
        if (opt == obj) {
            opt = null;
        }
        if (opt == null) {
            opt = null;
        }
        String str = (String) opt;
        wms wmsVar = wm11.a;
        tls tlsVar = b.f;
        kvo kvoVar = z2.a;
        ?? e2 = a.e(yf90Var, jSONObject, "close_by_tap_outside", wmsVar, tlsVar, kbsVar, kvoVar);
        kvo kvoVar2 = e2 == 0 ? kvoVar : e2;
        m3k m3kVar = (m3k) wwg.E(yf90Var, jSONObject, "div", i3yVar2);
        tms tmsVar = wm11.b;
        tls tlsVar2 = b.h;
        yhl yhlVar = z2.e;
        kvo kvoVar3 = z2.b;
        ?? e3 = a.e(yf90Var, jSONObject, "duration", tmsVar, tlsVar2, yhlVar, kvoVar3);
        if (e3 != 0) {
            kvoVar3 = e3;
        }
        Object opt2 = jSONObject.opt("id");
        Object obj2 = opt2 != obj ? opt2 : null;
        if (obj2 == null) {
            throw fg90.h("id", jSONObject);
        }
        String str2 = (String) obj2;
        ril rilVar = (ril) wwg.M(yf90Var, jSONObject, "mode", jsonParserComponent.h9);
        if (rilVar == null) {
            rilVar = z2.c;
        }
        return new gil(pdkVar, pdkVar2, e, str, kvoVar2, m3kVar, kvoVar3, str2, rilVar, (x4l) wwg.M(yf90Var, jSONObject, "offset", jsonParserComponent.j6), a.b(yf90Var, jSONObject, "position", z2.d, DivTooltip$Position.FROM_STRING, kbsVar), (m3k) wwg.M(yf90Var, jSONObject, "substrate_div", i3yVar2), wwg.O(yf90Var, jSONObject, "tap_outside_actions", jsonParserComponent.t1));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, gil gilVar) {
        JSONObject jSONObject = new JSONObject();
        pdk pdkVar = gilVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wwg.b0(yf90Var, jSONObject, "animation_in", pdkVar, jsonParserComponent.z1);
        wwg.b0(yf90Var, jSONObject, "animation_out", gilVar.b, jsonParserComponent.z1);
        a.g(yf90Var, jSONObject, "background_accessibility_description", gilVar.c);
        wwg.Z(yf90Var, jSONObject, "bring_to_top_id", gilVar.d);
        a.g(yf90Var, jSONObject, "close_by_tap_outside", gilVar.e);
        wwg.b0(yf90Var, jSONObject, "div", gilVar.f, jsonParserComponent.X9);
        a.g(yf90Var, jSONObject, "duration", gilVar.g);
        wwg.Z(yf90Var, jSONObject, "id", gilVar.h);
        wwg.b0(yf90Var, jSONObject, "mode", gilVar.i, jsonParserComponent.h9);
        wwg.b0(yf90Var, jSONObject, "offset", gilVar.j, jsonParserComponent.j6);
        a.h(yf90Var, jSONObject, "position", gilVar.k, DivTooltip$Position.TO_STRING);
        wwg.b0(yf90Var, jSONObject, "substrate_div", gilVar.l, jsonParserComponent.X9);
        wwg.c0(yf90Var, jSONObject, "tap_outside_actions", gilVar.m, jsonParserComponent.t1);
        return jSONObject;
    }
}
