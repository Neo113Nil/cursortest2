package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class dqk implements zsq0, nyi {
    public static cqk c(yf90 yf90Var, JSONObject jSONObject) {
        return new cqk(a.b(yf90Var, jSONObject, "value", wm11.b, b.h, x991.a));
    }

    public static JSONObject d(yf90 yf90Var, cqk cqkVar) {
        JSONObject w = n.w(yf90Var, "type", "fixed");
        a.g(yf90Var, w, "value", cqkVar.a);
        return w;
    }

    @Override // defpackage.nyi
    public final /* bridge */ /* synthetic */ Object a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (cqk) obj);
    }
}
