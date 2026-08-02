package com.yandex.div2;

import com.yandex.div2.DivSeparator;
import defpackage.d290;
import defpackage.hex;
import defpackage.kbs;
import defpackage.q5z;
import defpackage.rms;
import defpackage.tls;
import defpackage.udq0;
import defpackage.wcx;
import defpackage.wm11;
import defpackage.yey0;
import defpackage.yf90;
import defpackage.zsq0;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class q1 implements zsq0, yey0 {
    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        rms rmsVar = wm11.f;
        tls tlsVar = com.yandex.div.internal.parser.b.b;
        kbs kbsVar = q5z.b;
        return new w1(wcx.j(Q, jSONObject, "color", rmsVar, i, null, tlsVar, kbsVar), wcx.j(Q, jSONObject, "orientation", s1.c, i, null, DivSeparator.DelimiterStyle.Orientation.FROM_STRING, kbsVar));
    }

    @Override // defpackage.zsq0
    public final JSONObject b(yf90 yf90Var, Object obj) {
        w1 w1Var = (w1) obj;
        JSONObject jSONObject = new JSONObject();
        wcx.p(w1Var.a, com.yandex.div.internal.parser.b.a, yf90Var, "color", jSONObject);
        wcx.p(w1Var.b, DivSeparator.DelimiterStyle.Orientation.TO_STRING, yf90Var, "orientation", jSONObject);
        return jSONObject;
    }
}
