package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivTrigger$Mode;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.a3;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class nll implements zsq0, yey0 {
    public final JsonParserComponent a;

    public nll(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        exq f = wcx.f(Q, jSONObject, "actions", i, null, this.a.u1, a3.c);
        wms wmsVar = wm11.a;
        tls tlsVar = b.f;
        kbs kbsVar = q5z.b;
        return new oll(f, wcx.e(Q, jSONObject, "condition", wmsVar, i, null, tlsVar, kbsVar), wcx.j(Q, jSONObject, "mode", a3.b, i, null, DivTrigger$Mode.FROM_STRING, kbsVar));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, oll ollVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.w(yf90Var, jSONObject, "actions", ollVar.a, this.a.u1);
        wcx.q(yf90Var, jSONObject, "condition", ollVar.b);
        wcx.p(ollVar.c, DivTrigger$Mode.TO_STRING, yf90Var, "mode", jSONObject);
        return jSONObject;
    }
}
