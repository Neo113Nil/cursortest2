package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivLayoutProvider;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.b0;
import com.yandex.div2.x1;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class dfk implements qfy0 {
    public final /* synthetic */ int a;

    public /* synthetic */ dfk(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v11, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v14, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v21, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v9, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.qfy0
    public final Object a(yf90 yf90Var, hex hexVar, JSONObject jSONObject) {
        kvo kvoVar;
        kvo kvoVar2;
        switch (this.a) {
            case 0:
                return new afk(xcx.e(yf90Var, ((efk) hexVar).a, jSONObject, "ratio", wm11.d, b.g, udq0.a));
            case 1:
                mkk mkkVar = (mkk) hexVar;
                exq exqVar = mkkVar.a;
                tms tmsVar = wm11.b;
                tls tlsVar = b.h;
                return new jkk(xcx.m(yf90Var, exqVar, jSONObject, "bottom-left", tmsVar, tlsVar, gtq0.a), xcx.m(yf90Var, mkkVar.b, jSONObject, "bottom-right", tmsVar, tlsVar, gtq0.b), xcx.m(yf90Var, mkkVar.c, jSONObject, "top-left", tmsVar, tlsVar, gtq0.c), xcx.m(yf90Var, mkkVar.d, jSONObject, "top-right", tmsVar, tlsVar, gtq0.d));
            case 2:
                hok hokVar = (hok) hexVar;
                exq exqVar2 = hokVar.a;
                tms tmsVar2 = wm11.b;
                tls tlsVar2 = b.h;
                tlk tlkVar = b0.g;
                kvo kvoVar3 = b0.a;
                ?? n = xcx.n(yf90Var, exqVar2, jSONObject, "bottom", tmsVar2, tlsVar2, tlkVar, kvoVar3);
                kvo kvoVar4 = n == 0 ? kvoVar3 : n;
                Expression m = xcx.m(yf90Var, hokVar.b, jSONObject, "end", tmsVar2, tlsVar2, b0.h);
                exq exqVar3 = hokVar.c;
                tlk tlkVar2 = b0.i;
                kvo kvoVar5 = b0.b;
                ?? n2 = xcx.n(yf90Var, exqVar3, jSONObject, "left", tmsVar2, tlsVar2, tlkVar2, kvoVar5);
                kvo kvoVar6 = n2 == 0 ? kvoVar5 : n2;
                exq exqVar4 = hokVar.d;
                tlk tlkVar3 = b0.j;
                kvo kvoVar7 = b0.c;
                ?? n3 = xcx.n(yf90Var, exqVar4, jSONObject, "right", tmsVar2, tlsVar2, tlkVar3, kvoVar7);
                kvo kvoVar8 = n3 == 0 ? kvoVar7 : n3;
                Expression m2 = xcx.m(yf90Var, hokVar.e, jSONObject, "start", tmsVar2, tlsVar2, b0.k);
                exq exqVar5 = hokVar.f;
                tlk tlkVar4 = b0.l;
                kvo kvoVar9 = b0.d;
                ?? n4 = xcx.n(yf90Var, exqVar5, jSONObject, "top", tmsVar2, tlsVar2, tlkVar4, kvoVar9);
                if (n4 != 0) {
                    kvoVar9 = n4;
                }
                exq exqVar6 = hokVar.g;
                qkj qkjVar = b0.f;
                tls tlsVar3 = DivSizeUnit.FROM_STRING;
                kvo kvoVar10 = b0.e;
                ?? o = xcx.o(yf90Var, exqVar6, jSONObject, "unit", qkjVar, tlsVar3, kvoVar10);
                if (o == 0) {
                    kvo kvoVar11 = kvoVar9;
                    kvoVar2 = kvoVar10;
                    kvoVar = kvoVar11;
                } else {
                    kvoVar = kvoVar9;
                    kvoVar2 = o;
                }
                return new DivEdgeInsets(kvoVar4, m, kvoVar6, kvoVar8, m2, kvoVar, kvoVar2);
            case 3:
                gpk gpkVar = (gpk) hexVar;
                exq exqVar7 = gpkVar.a;
                abl0 abl0Var = q5z.c;
                return new bpk((String) xcx.a(exqVar7, jSONObject, "id", abl0Var, q5z.b), (JSONObject) xcx.i(gpkVar.b, abl0Var, yf90Var, "params", jSONObject));
            case 4:
                qyk qykVar = (qyk) hexVar;
                exq exqVar8 = qykVar.a;
                abl0 abl0Var2 = q5z.c;
                return new DivLayoutProvider((String) xcx.i(exqVar8, abl0Var2, yf90Var, "height_variable_name", jSONObject), (String) xcx.i(qykVar.b, abl0Var2, yf90Var, "width_variable_name", jSONObject));
            case 5:
                return new j3l(xcx.e(yf90Var, ((m3l) hexVar).a, jSONObject, "value", wm11.d, b.g, eja1.c));
            default:
                w9l w9lVar = (w9l) hexVar;
                exq exqVar9 = w9lVar.a;
                qkj qkjVar2 = x1.b;
                tls tlsVar4 = DivSizeUnit.FROM_STRING;
                kvo kvoVar12 = x1.a;
                ?? o2 = xcx.o(yf90Var, exqVar9, jSONObject, "unit", qkjVar2, tlsVar4, kvoVar12);
                return new t9l(o2 == 0 ? kvoVar12 : o2, xcx.e(yf90Var, w9lVar.b, jSONObject, "value", wm11.b, b.h, x1.c));
        }
    }
}
