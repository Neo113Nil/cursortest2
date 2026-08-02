package defpackage;

import com.yandex.div2.JsonParserComponent;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class ejk implements zsq0, yey0 {
    public final JsonParserComponent a;

    public ejk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        return new jjk(wcx.d(Q, jSONObject, Constants.KEY_DATA, wm11.g, i, null), wcx.h(Q, jSONObject, "data_element_name", i, null, q5z.c), wcx.f(Q, jSONObject, "prototypes", i, null, this.a.q2, u991.a));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, jjk jjkVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.q(yf90Var, jSONObject, Constants.KEY_DATA, jjkVar.a);
        wcx.t(yf90Var, jSONObject, "data_element_name", jjkVar.b);
        wcx.w(yf90Var, jSONObject, "prototypes", jjkVar.c, this.a.q2);
        return jSONObject;
    }
}
