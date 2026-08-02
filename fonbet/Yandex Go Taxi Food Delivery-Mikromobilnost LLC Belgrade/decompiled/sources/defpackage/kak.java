package defpackage;

import com.yandex.div2.DivActionTimer$Action;
import com.yandex.div2.m;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class kak implements qfy0 {
    @Override // defpackage.qfy0
    public final Object a(yf90 yf90Var, hex hexVar, JSONObject jSONObject) {
        lak lakVar = (lak) hexVar;
        return new hak(xcx.d(yf90Var, lakVar.a, jSONObject, "action", m.a, DivActionTimer$Action.FROM_STRING), xcx.c(yf90Var, lakVar.b, jSONObject, "id", wm11.c));
    }
}
