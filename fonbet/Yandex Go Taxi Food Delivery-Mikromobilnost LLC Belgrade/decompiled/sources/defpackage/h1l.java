package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAnimationInterpolator;
import com.yandex.div2.f1;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class h1l implements qfy0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.yandex.div.json.expressions.Expression] */
    public static e1l b(yf90 yf90Var, i1l i1lVar, JSONObject jSONObject) {
        exq exqVar = i1lVar.a;
        qkj qkjVar = f1.g;
        tls tlsVar = DivAnimationInterpolator.FROM_STRING;
        kvo kvoVar = f1.a;
        ?? o = xcx.o(yf90Var, exqVar, jSONObject, "interpolator", qkjVar, tlsVar, kvoVar);
        if (o != 0) {
            kvoVar = o;
        }
        exq exqVar2 = i1lVar.b;
        sms smsVar = wm11.d;
        tls tlsVar2 = b.g;
        ivk ivkVar = f1.h;
        kvo kvoVar2 = f1.b;
        Expression n = xcx.n(yf90Var, exqVar2, jSONObject, "next_page_alpha", smsVar, tlsVar2, ivkVar, kvoVar2);
        if (n == null) {
            n = kvoVar2;
        }
        exq exqVar3 = i1lVar.c;
        ivk ivkVar2 = f1.i;
        kvo kvoVar3 = f1.c;
        Expression n2 = xcx.n(yf90Var, exqVar3, jSONObject, "next_page_scale", smsVar, tlsVar2, ivkVar2, kvoVar3);
        if (n2 == null) {
            n2 = kvoVar3;
        }
        exq exqVar4 = i1lVar.d;
        ivk ivkVar3 = f1.j;
        kvo kvoVar4 = f1.d;
        Expression n3 = xcx.n(yf90Var, exqVar4, jSONObject, "previous_page_alpha", smsVar, tlsVar2, ivkVar3, kvoVar4);
        if (n3 == null) {
            n3 = kvoVar4;
        }
        exq exqVar5 = i1lVar.e;
        ivk ivkVar4 = f1.k;
        kvo kvoVar5 = f1.e;
        Expression n4 = xcx.n(yf90Var, exqVar5, jSONObject, "previous_page_scale", smsVar, tlsVar2, ivkVar4, kvoVar5);
        if (n4 == null) {
            n4 = kvoVar5;
        }
        exq exqVar6 = i1lVar.f;
        wms wmsVar = wm11.a;
        tls tlsVar3 = b.f;
        kvo kvoVar6 = f1.f;
        ?? o2 = xcx.o(yf90Var, exqVar6, jSONObject, "reversed_stacking_order", wmsVar, tlsVar3, kvoVar6);
        return new e1l(kvoVar, n, n2, n3, n4, o2 == 0 ? kvoVar6 : o2);
    }

    @Override // defpackage.qfy0
    public final /* bridge */ /* synthetic */ Object a(yf90 yf90Var, hex hexVar, JSONObject jSONObject) {
        return b(yf90Var, (i1l) hexVar, jSONObject);
    }
}
