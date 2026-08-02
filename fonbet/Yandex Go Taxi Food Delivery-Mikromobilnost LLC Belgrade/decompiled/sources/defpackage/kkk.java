package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class kkk implements zsq0, nyi {
    public static jkk c(yf90 yf90Var, JSONObject jSONObject) {
        tms tmsVar = wm11.b;
        tls tlsVar = b.h;
        return new jkk(a.e(yf90Var, jSONObject, "bottom-left", tmsVar, tlsVar, gtq0.a, null), a.e(yf90Var, jSONObject, "bottom-right", tmsVar, tlsVar, gtq0.b, null), a.e(yf90Var, jSONObject, "top-left", tmsVar, tlsVar, gtq0.c, null), a.e(yf90Var, jSONObject, "top-right", tmsVar, tlsVar, gtq0.d, null));
    }

    public static JSONObject d(yf90 yf90Var, jkk jkkVar) {
        JSONObject jSONObject = new JSONObject();
        a.g(yf90Var, jSONObject, "bottom-left", jkkVar.a);
        a.g(yf90Var, jSONObject, "bottom-right", jkkVar.b);
        a.g(yf90Var, jSONObject, "top-left", jkkVar.c);
        a.g(yf90Var, jSONObject, "top-right", jkkVar.d);
        return jSONObject;
    }

    @Override // defpackage.nyi
    public final /* bridge */ /* synthetic */ Object a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (jkk) obj);
    }
}
