package defpackage;

import com.yandex.div.internal.parser.a;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class c8l implements zsq0, nyi {
    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        return new w7l(a.c(yf90Var, jSONObject, "text"), a.b(yf90Var, jSONObject, "value", wm11.c, q5z.c, q5z.b));
    }

    @Override // defpackage.zsq0
    public final JSONObject b(yf90 yf90Var, Object obj) {
        w7l w7lVar = (w7l) obj;
        JSONObject jSONObject = new JSONObject();
        a.g(yf90Var, jSONObject, "text", w7lVar.a);
        a.g(yf90Var, jSONObject, "value", w7lVar.b);
        return jSONObject;
    }
}
