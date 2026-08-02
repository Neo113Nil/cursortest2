package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class di21 implements zsq0, nyi {
    public static ci21 c(yf90 yf90Var, JSONObject jSONObject) {
        return new ci21(a.b(yf90Var, jSONObject, "value", wm11.e, b.e, q5z.b));
    }

    public static JSONObject d(yf90 yf90Var, ci21 ci21Var) {
        JSONObject w = n.w(yf90Var, "type", "url");
        a.h(yf90Var, w, "value", ci21Var.a, b.c);
        return w;
    }

    @Override // defpackage.nyi
    public final /* bridge */ /* synthetic */ Object a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (ci21) obj);
    }
}
