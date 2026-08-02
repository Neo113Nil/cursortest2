package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.h2;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class dcl implements zsq0, yey0 {
    public final JsonParserComponent a;

    public dcl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        rms rmsVar = wm11.f;
        tls tlsVar = b.b;
        kbs kbsVar = q5z.b;
        return new xcl(wcx.e(Q, jSONObject, "color", rmsVar, i, null, tlsVar, kbsVar), wcx.i(Q, jSONObject, "style", i, null, this.a.W7), wcx.j(Q, jSONObject, "unit", h2.d, i, null, DivSizeUnit.FROM_STRING, kbsVar), wcx.j(Q, jSONObject, "width", wm11.d, i, null, b.g, h2.e));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, xcl xclVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.p(xclVar.a, b.a, yf90Var, "color", jSONObject);
        wcx.u(yf90Var, jSONObject, "style", xclVar.b, this.a.W7);
        wcx.p(xclVar.c, DivSizeUnit.TO_STRING, yf90Var, "unit", jSONObject);
        wcx.q(yf90Var, jSONObject, "width", xclVar.d);
        return jSONObject;
    }
}
