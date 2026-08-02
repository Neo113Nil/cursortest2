package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.j1;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class d4l implements qfy0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.yandex.div.json.expressions.Expression] */
    public static a4l b(yf90 yf90Var, e4l e4lVar, JSONObject jSONObject) {
        exq exqVar = e4lVar.a;
        qkj qkjVar = j1.b;
        tls tlsVar = DivSizeUnit.FROM_STRING;
        kvo kvoVar = j1.a;
        ?? o = xcx.o(yf90Var, exqVar, jSONObject, "unit", qkjVar, tlsVar, kvoVar);
        if (o != 0) {
            kvoVar = o;
        }
        return new a4l(kvoVar, xcx.d(yf90Var, e4lVar.b, jSONObject, "value", wm11.b, b.h));
    }

    @Override // defpackage.qfy0
    public final /* bridge */ /* synthetic */ Object a(yf90 yf90Var, hex hexVar, JSONObject jSONObject) {
        return b(yf90Var, (e4l) hexVar, jSONObject);
    }
}
