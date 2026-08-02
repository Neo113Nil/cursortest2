package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class arv implements zsq0, nyi {
    public static zqv c(yf90 yf90Var, JSONObject jSONObject) {
        return new zqv(a.b(yf90Var, jSONObject, "value", wm11.b, b.h, cj91.a));
    }

    public static JSONObject d(yf90 yf90Var, zqv zqvVar) {
        JSONObject w = n.w(yf90Var, "type", "index");
        a.g(yf90Var, w, "value", zqvVar.a);
        return w;
    }

    @Override // defpackage.nyi
    public final /* bridge */ /* synthetic */ Object a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (zqv) obj);
    }
}
