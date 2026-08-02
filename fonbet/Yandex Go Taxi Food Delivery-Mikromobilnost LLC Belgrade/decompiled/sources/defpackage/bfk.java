package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class bfk implements zsq0, nyi {
    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        return new afk(a.b(yf90Var, jSONObject, "ratio", wm11.d, b.g, udq0.a));
    }

    @Override // defpackage.zsq0
    public final JSONObject b(yf90 yf90Var, Object obj) {
        JSONObject jSONObject = new JSONObject();
        a.g(yf90Var, jSONObject, "ratio", ((afk) obj).a);
        return jSONObject;
    }
}
