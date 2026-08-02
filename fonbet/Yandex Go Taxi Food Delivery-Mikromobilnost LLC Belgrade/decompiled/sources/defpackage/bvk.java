package defpackage;

import com.yandex.div.internal.parser.a;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class bvk implements zsq0, nyi {
    public static JSONObject c(yf90 yf90Var, avk avkVar) {
        JSONObject jSONObject = new JSONObject();
        a.g(yf90Var, jSONObject, "pattern", avkVar.a);
        wwg.Z(yf90Var, jSONObject, "type", "regex");
        return jSONObject;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        return new avk(a.a(yf90Var, jSONObject, "pattern", wm11.c));
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return c(yf90Var, (avk) obj);
    }
}
