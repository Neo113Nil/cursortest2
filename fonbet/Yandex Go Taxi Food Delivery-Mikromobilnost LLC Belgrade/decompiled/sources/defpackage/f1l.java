package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAnimationInterpolator;
import com.yandex.div2.f1;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class f1l implements zsq0, nyi {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.yandex.div.json.expressions.Expression] */
    public static e1l c(yf90 yf90Var, JSONObject jSONObject) {
        qkj qkjVar = f1.g;
        tls tlsVar = DivAnimationInterpolator.FROM_STRING;
        kvo kvoVar = f1.a;
        kbs kbsVar = q5z.b;
        ?? e = a.e(yf90Var, jSONObject, "interpolator", qkjVar, tlsVar, kbsVar, kvoVar);
        kvo kvoVar2 = e == 0 ? kvoVar : e;
        sms smsVar = wm11.d;
        tls tlsVar2 = b.g;
        ivk ivkVar = f1.h;
        kvo kvoVar3 = f1.b;
        Expression e2 = a.e(yf90Var, jSONObject, "next_page_alpha", smsVar, tlsVar2, ivkVar, kvoVar3);
        if (e2 == null) {
            e2 = kvoVar3;
        }
        ivk ivkVar2 = f1.i;
        kvo kvoVar4 = f1.c;
        Expression e3 = a.e(yf90Var, jSONObject, "next_page_scale", smsVar, tlsVar2, ivkVar2, kvoVar4);
        if (e3 == null) {
            e3 = kvoVar4;
        }
        ivk ivkVar3 = f1.j;
        kvo kvoVar5 = f1.d;
        Expression e4 = a.e(yf90Var, jSONObject, "previous_page_alpha", smsVar, tlsVar2, ivkVar3, kvoVar5);
        if (e4 == null) {
            e4 = kvoVar5;
        }
        ivk ivkVar4 = f1.k;
        kvo kvoVar6 = f1.e;
        Expression e5 = a.e(yf90Var, jSONObject, "previous_page_scale", smsVar, tlsVar2, ivkVar4, kvoVar6);
        if (e5 == null) {
            e5 = kvoVar6;
        }
        wms wmsVar = wm11.a;
        tls tlsVar3 = b.f;
        kvo kvoVar7 = f1.f;
        ?? e6 = a.e(yf90Var, jSONObject, "reversed_stacking_order", wmsVar, tlsVar3, kbsVar, kvoVar7);
        return new e1l(kvoVar2, e2, e3, e4, e5, e6 == 0 ? kvoVar7 : e6);
    }

    public static JSONObject d(yf90 yf90Var, e1l e1lVar) {
        JSONObject jSONObject = new JSONObject();
        a.h(yf90Var, jSONObject, "interpolator", e1lVar.a, DivAnimationInterpolator.TO_STRING);
        a.g(yf90Var, jSONObject, "next_page_alpha", e1lVar.b);
        a.g(yf90Var, jSONObject, "next_page_scale", e1lVar.c);
        a.g(yf90Var, jSONObject, "previous_page_alpha", e1lVar.d);
        a.g(yf90Var, jSONObject, "previous_page_scale", e1lVar.e);
        a.g(yf90Var, jSONObject, "reversed_stacking_order", e1lVar.f);
        wwg.Z(yf90Var, jSONObject, "type", "overlap");
        return jSONObject;
    }

    @Override // defpackage.nyi
    public final /* bridge */ /* synthetic */ Object a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (e1l) obj);
    }
}
