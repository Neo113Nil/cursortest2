package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.e0;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class ark implements qfy0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.yandex.div.json.expressions.Expression] */
    public static xqk b(yf90 yf90Var, brk brkVar, JSONObject jSONObject) {
        exq exqVar = brkVar.a;
        qkj qkjVar = e0.b;
        tls tlsVar = DivSizeUnit.FROM_STRING;
        kvo kvoVar = e0.a;
        ?? o = xcx.o(yf90Var, exqVar, jSONObject, "unit", qkjVar, tlsVar, kvoVar);
        if (o != 0) {
            kvoVar = o;
        }
        return new xqk(kvoVar, xcx.d(yf90Var, brkVar.b, jSONObject, "value", wm11.b, b.h));
    }

    @Override // defpackage.qfy0
    public final /* bridge */ /* synthetic */ Object a(yf90 yf90Var, hex hexVar, JSONObject jSONObject) {
        return b(yf90Var, (brk) hexVar, jSONObject);
    }
}
