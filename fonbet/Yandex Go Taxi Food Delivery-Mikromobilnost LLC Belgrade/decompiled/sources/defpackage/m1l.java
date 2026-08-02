package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAnimationInterpolator;
import com.yandex.div2.g1;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class m1l implements qfy0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.yandex.div.json.expressions.Expression] */
    public static j1l b(yf90 yf90Var, n1l n1lVar, JSONObject jSONObject) {
        exq exqVar = n1lVar.a;
        qkj qkjVar = g1.f;
        tls tlsVar = DivAnimationInterpolator.FROM_STRING;
        kvo kvoVar = g1.a;
        ?? o = xcx.o(yf90Var, exqVar, jSONObject, "interpolator", qkjVar, tlsVar, kvoVar);
        if (o != 0) {
            kvoVar = o;
        }
        exq exqVar2 = n1lVar.b;
        sms smsVar = wm11.d;
        tls tlsVar2 = b.g;
        ivk ivkVar = g1.g;
        kvo kvoVar2 = g1.b;
        Expression n = xcx.n(yf90Var, exqVar2, jSONObject, "next_page_alpha", smsVar, tlsVar2, ivkVar, kvoVar2);
        if (n == null) {
            n = kvoVar2;
        }
        exq exqVar3 = n1lVar.c;
        ivk ivkVar2 = g1.h;
        kvo kvoVar3 = g1.c;
        Expression n2 = xcx.n(yf90Var, exqVar3, jSONObject, "next_page_scale", smsVar, tlsVar2, ivkVar2, kvoVar3);
        if (n2 == null) {
            n2 = kvoVar3;
        }
        exq exqVar4 = n1lVar.d;
        ivk ivkVar3 = g1.i;
        kvo kvoVar4 = g1.d;
        Expression n3 = xcx.n(yf90Var, exqVar4, jSONObject, "previous_page_alpha", smsVar, tlsVar2, ivkVar3, kvoVar4);
        if (n3 == null) {
            n3 = kvoVar4;
        }
        exq exqVar5 = n1lVar.e;
        ivk ivkVar4 = g1.j;
        kvo kvoVar5 = g1.e;
        ?? n4 = xcx.n(yf90Var, exqVar5, jSONObject, "previous_page_scale", smsVar, tlsVar2, ivkVar4, kvoVar5);
        return new j1l(kvoVar, n, n2, n3, n4 == 0 ? kvoVar5 : n4);
    }

    @Override // defpackage.qfy0
    public final /* bridge */ /* synthetic */ Object a(yf90 yf90Var, hex hexVar, JSONObject jSONObject) {
        return b(yf90Var, (n1l) hexVar, jSONObject);
    }
}
