package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivActionScrollBy$Overflow;
import com.yandex.div2.j;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class o7k implements qfy0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.yandex.div.json.expressions.Expression] */
    public static l7k b(yf90 yf90Var, p7k p7kVar, JSONObject jSONObject) {
        exq exqVar = p7kVar.a;
        wms wmsVar = wm11.a;
        tls tlsVar = b.f;
        kvo kvoVar = j.a;
        ?? o = xcx.o(yf90Var, exqVar, jSONObject, "animated", wmsVar, tlsVar, kvoVar);
        if (o != 0) {
            kvoVar = o;
        }
        Expression c = xcx.c(yf90Var, p7kVar.b, jSONObject, "id", wm11.c);
        exq exqVar2 = p7kVar.c;
        tms tmsVar = wm11.b;
        tls tlsVar2 = b.h;
        kvo kvoVar2 = j.b;
        Expression o2 = xcx.o(yf90Var, exqVar2, jSONObject, "item_count", tmsVar, tlsVar2, kvoVar2);
        if (o2 == null) {
            o2 = kvoVar2;
        }
        exq exqVar3 = p7kVar.d;
        kvo kvoVar3 = j.c;
        Expression o3 = xcx.o(yf90Var, exqVar3, jSONObject, "offset", tmsVar, tlsVar2, kvoVar3);
        if (o3 == null) {
            o3 = kvoVar3;
        }
        exq exqVar4 = p7kVar.e;
        qkj qkjVar = j.e;
        tls tlsVar3 = DivActionScrollBy$Overflow.FROM_STRING;
        kvo kvoVar4 = j.d;
        ?? o4 = xcx.o(yf90Var, exqVar4, jSONObject, "overflow", qkjVar, tlsVar3, kvoVar4);
        return new l7k(kvoVar, c, o2, o3, o4 == 0 ? kvoVar4 : o4);
    }

    @Override // defpackage.qfy0
    public final /* bridge */ /* synthetic */ Object a(yf90 yf90Var, hex hexVar, JSONObject jSONObject) {
        return b(yf90Var, (p7k) hexVar, jSONObject);
    }
}
