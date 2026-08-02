package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class nhc implements zsq0, nyi {
    public static mhc c(yf90 yf90Var, JSONObject jSONObject) {
        return new mhc(a.b(yf90Var, jSONObject, "value", wm11.f, b.b, q5z.b));
    }

    public static JSONObject d(yf90 yf90Var, mhc mhcVar) {
        JSONObject w = n.w(yf90Var, "type", "color");
        a.h(yf90Var, w, "value", mhcVar.a, b.a);
        return w;
    }

    @Override // defpackage.nyi
    public final /* bridge */ /* synthetic */ Object a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (mhc) obj);
    }
}
