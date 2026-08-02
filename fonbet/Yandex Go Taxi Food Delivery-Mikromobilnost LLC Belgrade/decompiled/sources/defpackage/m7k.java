package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivActionScrollBy$Overflow;
import com.yandex.div2.j;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class m7k implements zsq0, nyi {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.yandex.div.json.expressions.Expression] */
    public static l7k c(yf90 yf90Var, JSONObject jSONObject) {
        wms wmsVar = wm11.a;
        tls tlsVar = b.f;
        kvo kvoVar = j.a;
        kbs kbsVar = q5z.b;
        ?? e = a.e(yf90Var, jSONObject, "animated", wmsVar, tlsVar, kbsVar, kvoVar);
        kvo kvoVar2 = e == 0 ? kvoVar : e;
        Expression b = a.b(yf90Var, jSONObject, "id", wm11.c, q5z.c, kbsVar);
        tms tmsVar = wm11.b;
        tls tlsVar2 = b.h;
        kvo kvoVar3 = j.b;
        Expression e2 = a.e(yf90Var, jSONObject, "item_count", tmsVar, tlsVar2, kbsVar, kvoVar3);
        if (e2 == null) {
            e2 = kvoVar3;
        }
        kvo kvoVar4 = j.c;
        Expression e3 = a.e(yf90Var, jSONObject, "offset", tmsVar, tlsVar2, kbsVar, kvoVar4);
        if (e3 == null) {
            e3 = kvoVar4;
        }
        qkj qkjVar = j.e;
        tls tlsVar3 = DivActionScrollBy$Overflow.FROM_STRING;
        kvo kvoVar5 = j.d;
        ?? e4 = a.e(yf90Var, jSONObject, "overflow", qkjVar, tlsVar3, kbsVar, kvoVar5);
        return new l7k(kvoVar2, b, e2, e3, e4 == 0 ? kvoVar5 : e4);
    }

    public static JSONObject d(yf90 yf90Var, l7k l7kVar) {
        JSONObject jSONObject = new JSONObject();
        a.g(yf90Var, jSONObject, "animated", l7kVar.a);
        a.g(yf90Var, jSONObject, "id", l7kVar.b);
        a.g(yf90Var, jSONObject, "item_count", l7kVar.c);
        a.g(yf90Var, jSONObject, "offset", l7kVar.d);
        a.h(yf90Var, jSONObject, "overflow", l7kVar.e, DivActionScrollBy$Overflow.TO_STRING);
        wwg.Z(yf90Var, jSONObject, "type", "scroll_by");
        return jSONObject;
    }

    @Override // defpackage.nyi
    public final /* bridge */ /* synthetic */ Object a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (l7k) obj);
    }
}
