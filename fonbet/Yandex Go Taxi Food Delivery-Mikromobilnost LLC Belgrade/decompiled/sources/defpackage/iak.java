package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div2.DivActionTimer$Action;
import com.yandex.div2.m;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class iak implements zsq0, nyi {
    public static hak c(yf90 yf90Var, JSONObject jSONObject) {
        qkj qkjVar = m.a;
        tls tlsVar = DivActionTimer$Action.FROM_STRING;
        kbs kbsVar = q5z.b;
        return new hak(a.b(yf90Var, jSONObject, "action", qkjVar, tlsVar, kbsVar), a.b(yf90Var, jSONObject, "id", wm11.c, q5z.c, kbsVar));
    }

    public static JSONObject d(yf90 yf90Var, hak hakVar) {
        JSONObject jSONObject = new JSONObject();
        a.h(yf90Var, jSONObject, "action", hakVar.a, DivActionTimer$Action.TO_STRING);
        a.g(yf90Var, jSONObject, "id", hakVar.b);
        wwg.Z(yf90Var, jSONObject, "type", "timer");
        return jSONObject;
    }

    @Override // defpackage.nyi
    public final /* bridge */ /* synthetic */ Object a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (hak) obj);
    }
}
