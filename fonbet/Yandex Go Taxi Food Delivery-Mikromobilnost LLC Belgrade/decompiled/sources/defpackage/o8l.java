package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.JsonParserComponent;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class o8l implements zsq0, yey0 {
    public final JsonParserComponent a;

    public o8l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        return new q8l(wcx.j(Q, jSONObject, CaretView.ALPHA_PROPERTY, wm11.d, i, null, b.g, p8l.d), wcx.j(Q, jSONObject, "blur", wm11.b, i, null, b.h, p8l.e), wcx.j(Q, jSONObject, "color", wm11.f, i, null, b.b, q5z.b), wcx.c(Q, jSONObject, "offset", i, null, this.a.k6));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, q8l q8lVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.q(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, q8lVar.a);
        wcx.q(yf90Var, jSONObject, "blur", q8lVar.b);
        wcx.p(q8lVar.c, b.a, yf90Var, "color", jSONObject);
        wcx.u(yf90Var, jSONObject, "offset", q8lVar.d, this.a.k6);
        return jSONObject;
    }
}
