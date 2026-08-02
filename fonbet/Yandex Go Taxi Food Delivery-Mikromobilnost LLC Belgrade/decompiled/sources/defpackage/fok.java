package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.b0;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class fok implements zsq0, nyi {
    public static JSONObject c(yf90 yf90Var, DivEdgeInsets divEdgeInsets) {
        JSONObject jSONObject = new JSONObject();
        a.g(yf90Var, jSONObject, "bottom", divEdgeInsets.a);
        a.g(yf90Var, jSONObject, "end", divEdgeInsets.b);
        a.g(yf90Var, jSONObject, "left", divEdgeInsets.c);
        a.g(yf90Var, jSONObject, "right", divEdgeInsets.d);
        a.g(yf90Var, jSONObject, "start", divEdgeInsets.e);
        a.g(yf90Var, jSONObject, "top", divEdgeInsets.f);
        a.h(yf90Var, jSONObject, "unit", divEdgeInsets.g, DivSizeUnit.TO_STRING);
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r3v9, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        tms tmsVar = wm11.b;
        tls tlsVar = b.h;
        tlk tlkVar = b0.g;
        kvo kvoVar = b0.a;
        ?? e = a.e(yf90Var, jSONObject, "bottom", tmsVar, tlsVar, tlkVar, kvoVar);
        kvo kvoVar2 = e == 0 ? kvoVar : e;
        Expression e2 = a.e(yf90Var, jSONObject, "end", tmsVar, tlsVar, b0.h, null);
        tlk tlkVar2 = b0.i;
        kvo kvoVar3 = b0.b;
        ?? e3 = a.e(yf90Var, jSONObject, "left", tmsVar, tlsVar, tlkVar2, kvoVar3);
        kvo kvoVar4 = e3 == 0 ? kvoVar3 : e3;
        tlk tlkVar3 = b0.j;
        kvo kvoVar5 = b0.c;
        ?? e4 = a.e(yf90Var, jSONObject, "right", tmsVar, tlsVar, tlkVar3, kvoVar5);
        kvo kvoVar6 = e4 == 0 ? kvoVar5 : e4;
        Expression e5 = a.e(yf90Var, jSONObject, "start", tmsVar, tlsVar, b0.k, null);
        tlk tlkVar4 = b0.l;
        kvo kvoVar7 = b0.d;
        ?? e6 = a.e(yf90Var, jSONObject, "top", tmsVar, tlsVar, tlkVar4, kvoVar7);
        kvo kvoVar8 = e6 == 0 ? kvoVar7 : e6;
        qkj qkjVar = b0.f;
        tls tlsVar2 = DivSizeUnit.FROM_STRING;
        kvo kvoVar9 = b0.e;
        ?? e7 = a.e(yf90Var, jSONObject, "unit", qkjVar, tlsVar2, q5z.b, kvoVar9);
        return new DivEdgeInsets(kvoVar2, e2, kvoVar4, kvoVar6, e5, kvoVar8, e7 == 0 ? kvoVar9 : e7);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return c(yf90Var, (DivEdgeInsets) obj);
    }
}
