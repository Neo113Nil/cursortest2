package com.yandex.div2;

import com.yandex.div2.DivSlideTransition;
import defpackage.d290;
import defpackage.exq;
import defpackage.hex;
import defpackage.kbs;
import defpackage.q5z;
import defpackage.qkj;
import defpackage.tls;
import defpackage.tms;
import defpackage.udq0;
import defpackage.wcx;
import defpackage.wm11;
import defpackage.wwg;
import defpackage.yey0;
import defpackage.yf90;
import defpackage.zsq0;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class a2 implements zsq0, yey0 {
    public final JsonParserComponent a;

    public a2(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    public final d2 c(yf90 yf90Var, d2 d2Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        exq i2 = wcx.i(Q, jSONObject, "distance", i, d2Var != null ? d2Var.a : null, this.a.V2);
        tms tmsVar = wm11.b;
        exq exqVar = d2Var != null ? d2Var.b : null;
        tls tlsVar = com.yandex.div.internal.parser.b.h;
        exq j = wcx.j(Q, jSONObject, "duration", tmsVar, i, exqVar, tlsVar, c2.g);
        qkj qkjVar = c2.e;
        exq exqVar2 = d2Var != null ? d2Var.c : null;
        tls tlsVar2 = DivSlideTransition.Edge.FROM_STRING;
        kbs kbsVar = q5z.b;
        return new d2(i2, j, wcx.j(Q, jSONObject, "edge", qkjVar, i, exqVar2, tlsVar2, kbsVar), wcx.j(Q, jSONObject, "interpolator", c2.f, i, d2Var != null ? d2Var.d : null, DivAnimationInterpolator.FROM_STRING, kbsVar), wcx.j(Q, jSONObject, "start_delay", tmsVar, i, d2Var != null ? d2Var.e : null, tlsVar, c2.h));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, d2 d2Var) {
        JSONObject jSONObject = new JSONObject();
        wcx.u(yf90Var, jSONObject, "distance", d2Var.a, this.a.V2);
        wcx.q(yf90Var, jSONObject, "duration", d2Var.b);
        wcx.p(d2Var.c, DivSlideTransition.Edge.TO_STRING, yf90Var, "edge", jSONObject);
        wcx.p(d2Var.d, DivAnimationInterpolator.TO_STRING, yf90Var, "interpolator", jSONObject);
        wcx.q(yf90Var, jSONObject, "start_delay", d2Var.e);
        wwg.Z(yf90Var, jSONObject, "type", "slide");
        return jSONObject;
    }
}
