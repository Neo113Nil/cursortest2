package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class onk implements zsq0, nyi {
    public final JsonParserComponent a;

    public onk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        tms tmsVar = wm11.b;
        tls tlsVar = b.h;
        tlk tlkVar = qnk.e;
        kvo kvoVar = qnk.a;
        ?? e = a.e(yf90Var, jSONObject, "disappear_duration", tmsVar, tlsVar, tlkVar, kvoVar);
        kvo kvoVar2 = e == 0 ? kvoVar : e;
        JsonParserComponent jsonParserComponent = this.a;
        tnk tnkVar = (tnk) wwg.M(yf90Var, jSONObject, "download_callbacks", jsonParserComponent.a3);
        wms wmsVar = wm11.a;
        tls tlsVar2 = b.f;
        kvo kvoVar3 = qnk.b;
        kbs kbsVar = q5z.b;
        ?? e2 = a.e(yf90Var, jSONObject, "is_enabled", wmsVar, tlsVar2, kbsVar, kvoVar3);
        kvo kvoVar4 = e2 == 0 ? kvoVar3 : e2;
        Expression b = a.b(yf90Var, jSONObject, "log_id", wm11.c, q5z.c, kbsVar);
        tlk tlkVar2 = qnk.f;
        kvo kvoVar5 = qnk.c;
        ?? e3 = a.e(yf90Var, jSONObject, "log_limit", tmsVar, tlsVar, tlkVar2, kvoVar5);
        kvo kvoVar6 = e3 == 0 ? kvoVar5 : e3;
        Object opt = jSONObject.opt("payload");
        Object obj = JSONObject.NULL;
        if (opt == obj) {
            opt = null;
        }
        if (opt == null) {
            opt = null;
        }
        JSONObject jSONObject2 = (JSONObject) opt;
        dxf0 dxf0Var = wm11.e;
        tls tlsVar3 = b.e;
        Expression e4 = a.e(yf90Var, jSONObject, "referer", dxf0Var, tlsVar3, kbsVar, null);
        Object opt2 = jSONObject.opt("scope_id");
        if (opt2 == obj) {
            opt2 = null;
        }
        String str = (String) (opt2 != null ? opt2 : null);
        jbk jbkVar = (jbk) wwg.M(yf90Var, jSONObject, "typed", jsonParserComponent.k1);
        Expression e5 = a.e(yf90Var, jSONObject, "url", dxf0Var, tlsVar3, kbsVar, null);
        tlk tlkVar3 = qnk.g;
        kvo kvoVar7 = qnk.d;
        ?? e6 = a.e(yf90Var, jSONObject, "visibility_percentage", tmsVar, tlsVar, tlkVar3, kvoVar7);
        return new nnk(jbkVar, tnkVar, kvoVar2, kvoVar4, b, kvoVar6, e4, e5, e6 == 0 ? kvoVar7 : e6, str, jSONObject2);
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, nnk nnkVar) {
        JSONObject jSONObject = new JSONObject();
        a.g(yf90Var, jSONObject, "disappear_duration", nnkVar.a);
        tnk tnkVar = nnkVar.b;
        JsonParserComponent jsonParserComponent = this.a;
        wwg.b0(yf90Var, jSONObject, "download_callbacks", tnkVar, jsonParserComponent.a3);
        a.g(yf90Var, jSONObject, "is_enabled", nnkVar.c);
        a.g(yf90Var, jSONObject, "log_id", nnkVar.d);
        a.g(yf90Var, jSONObject, "log_limit", nnkVar.e);
        wwg.Z(yf90Var, jSONObject, "payload", nnkVar.f);
        Expression expression = nnkVar.g;
        tls tlsVar = b.c;
        a.h(yf90Var, jSONObject, "referer", expression, tlsVar);
        wwg.Z(yf90Var, jSONObject, "scope_id", nnkVar.h);
        wwg.b0(yf90Var, jSONObject, "typed", nnkVar.i, jsonParserComponent.k1);
        a.h(yf90Var, jSONObject, "url", nnkVar.j, tlsVar);
        a.g(yf90Var, jSONObject, "visibility_percentage", nnkVar.k);
        return jSONObject;
    }
}
