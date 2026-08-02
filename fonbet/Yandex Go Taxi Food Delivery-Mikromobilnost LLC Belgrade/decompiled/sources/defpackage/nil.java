package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivTooltip$Position;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.z2;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class nil implements zsq0, yey0 {
    public final JsonParserComponent a;

    public nil(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.A1;
        i3y i3yVar2 = jsonParserComponent.Y9;
        exq i2 = wcx.i(Q, jSONObject, "animation_in", i, null, i3yVar);
        exq i3 = wcx.i(Q, jSONObject, "animation_out", i, null, jsonParserComponent.A1);
        ums umsVar = wm11.c;
        abl0 abl0Var = q5z.c;
        kbs kbsVar = q5z.b;
        return new ijl(i2, i3, wcx.j(Q, jSONObject, "background_accessibility_description", umsVar, i, null, abl0Var, kbsVar), wcx.h(Q, jSONObject, "bring_to_top_id", i, null, abl0Var), wcx.j(Q, jSONObject, "close_by_tap_outside", wm11.a, i, null, b.f, kbsVar), wcx.c(Q, jSONObject, "div", i, null, i3yVar2), wcx.j(Q, jSONObject, "duration", wm11.b, i, null, b.h, z2.e), wcx.a(Q, jSONObject, "id", i, null), wcx.i(Q, jSONObject, "mode", i, null, jsonParserComponent.i9), wcx.i(Q, jSONObject, "offset", i, null, jsonParserComponent.k6), wcx.e(Q, jSONObject, "position", z2.d, i, null, DivTooltip$Position.FROM_STRING, kbsVar), wcx.i(Q, jSONObject, "substrate_div", i, null, i3yVar2), wcx.k(Q, jSONObject, "tap_outside_actions", i, null, jsonParserComponent.u1));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, ijl ijlVar) {
        JSONObject jSONObject = new JSONObject();
        exq exqVar = ijlVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wcx.u(yf90Var, jSONObject, "animation_in", exqVar, jsonParserComponent.A1);
        wcx.u(yf90Var, jSONObject, "animation_out", ijlVar.b, jsonParserComponent.A1);
        wcx.q(yf90Var, jSONObject, "background_accessibility_description", ijlVar.c);
        wcx.t(yf90Var, jSONObject, "bring_to_top_id", ijlVar.d);
        wcx.q(yf90Var, jSONObject, "close_by_tap_outside", ijlVar.e);
        exq exqVar2 = ijlVar.f;
        i3y i3yVar = jsonParserComponent.Y9;
        wcx.u(yf90Var, jSONObject, "div", exqVar2, i3yVar);
        wcx.q(yf90Var, jSONObject, "duration", ijlVar.g);
        wcx.t(yf90Var, jSONObject, "id", ijlVar.h);
        wcx.u(yf90Var, jSONObject, "mode", ijlVar.i, jsonParserComponent.i9);
        wcx.u(yf90Var, jSONObject, "offset", ijlVar.j, jsonParserComponent.k6);
        wcx.p(ijlVar.k, DivTooltip$Position.TO_STRING, yf90Var, "position", jSONObject);
        wcx.u(yf90Var, jSONObject, "substrate_div", ijlVar.l, i3yVar);
        wcx.w(yf90Var, jSONObject, "tap_outside_actions", ijlVar.m, jsonParserComponent.u1);
        return jSONObject;
    }
}
