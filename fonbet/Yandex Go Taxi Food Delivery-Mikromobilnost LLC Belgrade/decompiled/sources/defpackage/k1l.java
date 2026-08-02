package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAnimationInterpolator;
import com.yandex.div2.g1;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class k1l implements zsq0, nyi {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.yandex.div.json.expressions.Expression] */
    public static j1l c(yf90 yf90Var, JSONObject jSONObject) {
        qkj qkjVar = g1.f;
        tls tlsVar = DivAnimationInterpolator.FROM_STRING;
        kvo kvoVar = g1.a;
        ?? e = a.e(yf90Var, jSONObject, "interpolator", qkjVar, tlsVar, q5z.b, kvoVar);
        kvo kvoVar2 = e == 0 ? kvoVar : e;
        sms smsVar = wm11.d;
        tls tlsVar2 = b.g;
        ivk ivkVar = g1.g;
        kvo kvoVar3 = g1.b;
        Expression e2 = a.e(yf90Var, jSONObject, "next_page_alpha", smsVar, tlsVar2, ivkVar, kvoVar3);
        if (e2 == null) {
            e2 = kvoVar3;
        }
        ivk ivkVar2 = g1.h;
        kvo kvoVar4 = g1.c;
        Expression e3 = a.e(yf90Var, jSONObject, "next_page_scale", smsVar, tlsVar2, ivkVar2, kvoVar4);
        if (e3 == null) {
            e3 = kvoVar4;
        }
        ivk ivkVar3 = g1.i;
        kvo kvoVar5 = g1.d;
        Expression e4 = a.e(yf90Var, jSONObject, "previous_page_alpha", smsVar, tlsVar2, ivkVar3, kvoVar5);
        if (e4 == null) {
            e4 = kvoVar5;
        }
        ivk ivkVar4 = g1.j;
        kvo kvoVar6 = g1.e;
        ?? e5 = a.e(yf90Var, jSONObject, "previous_page_scale", smsVar, tlsVar2, ivkVar4, kvoVar6);
        return new j1l(kvoVar2, e2, e3, e4, e5 == 0 ? kvoVar6 : e5);
    }

    public static JSONObject d(yf90 yf90Var, j1l j1lVar) {
        JSONObject jSONObject = new JSONObject();
        a.h(yf90Var, jSONObject, "interpolator", j1lVar.a, DivAnimationInterpolator.TO_STRING);
        a.g(yf90Var, jSONObject, "next_page_alpha", j1lVar.b);
        a.g(yf90Var, jSONObject, "next_page_scale", j1lVar.c);
        a.g(yf90Var, jSONObject, "previous_page_alpha", j1lVar.d);
        a.g(yf90Var, jSONObject, "previous_page_scale", j1lVar.e);
        wwg.Z(yf90Var, jSONObject, "type", "slide");
        return jSONObject;
    }

    @Override // defpackage.nyi
    public final /* bridge */ /* synthetic */ Object a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (j1l) obj);
    }
}
