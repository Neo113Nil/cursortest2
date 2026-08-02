package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class o3k implements zsq0, nyi {
    public static JSONObject c(yf90 yf90Var, n3k n3kVar) {
        JSONObject jSONObject = new JSONObject();
        a.g(yf90Var, jSONObject, "bottom", n3kVar.a);
        a.g(yf90Var, jSONObject, "left", n3kVar.b);
        a.g(yf90Var, jSONObject, "right", n3kVar.c);
        a.g(yf90Var, jSONObject, "top", n3kVar.d);
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        tms tmsVar = wm11.b;
        tls tlsVar = b.h;
        x8e x8eVar = r3k.e;
        kvo kvoVar = r3k.a;
        Expression e = a.e(yf90Var, jSONObject, "bottom", tmsVar, tlsVar, x8eVar, kvoVar);
        if (e == null) {
            e = kvoVar;
        }
        x8e x8eVar2 = r3k.f;
        kvo kvoVar2 = r3k.b;
        Expression e2 = a.e(yf90Var, jSONObject, "left", tmsVar, tlsVar, x8eVar2, kvoVar2);
        if (e2 == null) {
            e2 = kvoVar2;
        }
        x8e x8eVar3 = r3k.g;
        kvo kvoVar3 = r3k.c;
        ?? e3 = a.e(yf90Var, jSONObject, "right", tmsVar, tlsVar, x8eVar3, kvoVar3);
        kvo kvoVar4 = e3 == 0 ? kvoVar3 : e3;
        x8e x8eVar4 = r3k.h;
        kvo kvoVar5 = r3k.d;
        ?? e4 = a.e(yf90Var, jSONObject, "top", tmsVar, tlsVar, x8eVar4, kvoVar5);
        if (e4 != 0) {
            kvoVar5 = e4;
        }
        return new n3k(e, e2, kvoVar4, kvoVar5);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return c(yf90Var, (n3k) obj);
    }
}
