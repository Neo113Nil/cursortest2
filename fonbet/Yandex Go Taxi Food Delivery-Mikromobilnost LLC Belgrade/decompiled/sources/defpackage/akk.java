package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class akk implements zsq0, nyi {
    public final JsonParserComponent a;

    public akk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        JsonParserComponent jsonParserComponent = this.a;
        DivEdgeInsets divEdgeInsets = (DivEdgeInsets) wwg.M(yf90Var, jSONObject, "margins", jsonParserComponent.g3);
        wms wmsVar = wm11.a;
        tls tlsVar = b.f;
        kvo kvoVar = ckk.a;
        kbs kbsVar = q5z.b;
        Expression e = a.e(yf90Var, jSONObject, "show_at_end", wmsVar, tlsVar, kbsVar, kvoVar);
        if (e == null) {
            e = kvoVar;
        }
        kvo kvoVar2 = ckk.b;
        Expression e2 = a.e(yf90Var, jSONObject, "show_at_start", wmsVar, tlsVar, kbsVar, kvoVar2);
        if (e2 == null) {
            e2 = kvoVar2;
        }
        kvo kvoVar3 = ckk.c;
        Expression e3 = a.e(yf90Var, jSONObject, "show_between", wmsVar, tlsVar, kbsVar, kvoVar3);
        if (e3 == null) {
            e3 = kvoVar3;
        }
        return new vjk(divEdgeInsets, e, e2, e3, (aok) wwg.E(yf90Var, jSONObject, "style", jsonParserComponent.d3));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, vjk vjkVar) {
        JSONObject jSONObject = new JSONObject();
        DivEdgeInsets divEdgeInsets = vjkVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wwg.b0(yf90Var, jSONObject, "margins", divEdgeInsets, jsonParserComponent.g3);
        a.g(yf90Var, jSONObject, "show_at_end", vjkVar.b);
        a.g(yf90Var, jSONObject, "show_at_start", vjkVar.c);
        a.g(yf90Var, jSONObject, "show_between", vjkVar.d);
        wwg.b0(yf90Var, jSONObject, "style", vjkVar.e, jsonParserComponent.d3);
        return jSONObject;
    }
}
