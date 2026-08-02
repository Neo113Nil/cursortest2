package defpackage;

import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionReason;
import com.yandex.div2.DivEvaluableType;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class ork implements zsq0, yey0 {
    public final JsonParserComponent a;

    public ork(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        exq o;
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        try {
            o = new cxq(i, wwg.I(Q, jSONObject, "arguments", this.a.R3));
        } catch (ParsingException e) {
            if (e.getReason() != ParsingExceptionReason.MISSING_VALUE) {
                throw e;
            }
            o = wcx.o(i, wcx.n(Q, jSONObject, "arguments"), null);
            if (o == null) {
                throw e;
            }
        }
        return new prk(o, wcx.a(Q, jSONObject, "body", i, null), wcx.b(Q, jSONObject, "name", i, null, q5z.c, ba91.a), wcx.b(Q, jSONObject, "return_type", i, null, DivEvaluableType.FROM_STRING, q5z.b));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, prk prkVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.w(yf90Var, jSONObject, "arguments", prkVar.a, this.a.R3);
        wcx.t(yf90Var, jSONObject, "body", prkVar.b);
        wcx.t(yf90Var, jSONObject, "name", prkVar.c);
        wcx.s(prkVar.d, DivEvaluableType.TO_STRING, yf90Var, "return_type", jSONObject);
        return jSONObject;
    }
}
