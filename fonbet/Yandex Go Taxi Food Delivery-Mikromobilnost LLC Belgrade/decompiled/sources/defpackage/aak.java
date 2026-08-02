package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivActionSubmit$Request$Method;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.l;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class aak implements zsq0, yey0 {
    public final JsonParserComponent a;

    public aak(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        exq k = wcx.k(Q, jSONObject, "headers", i, null, this.a.f1);
        qkj qkjVar = l.b;
        tls tlsVar = DivActionSubmit$Request$Method.FROM_STRING;
        kbs kbsVar = q5z.b;
        return new cak(k, wcx.j(Q, jSONObject, "method", qkjVar, i, null, tlsVar, kbsVar), wcx.e(Q, jSONObject, "url", wm11.e, i, null, b.e, kbsVar));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, cak cakVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.w(yf90Var, jSONObject, "headers", cakVar.a, this.a.f1);
        wcx.p(cakVar.b, DivActionSubmit$Request$Method.TO_STRING, yf90Var, "method", jSONObject);
        wcx.p(cakVar.c, b.c, yf90Var, "url", jSONObject);
        return jSONObject;
    }
}
