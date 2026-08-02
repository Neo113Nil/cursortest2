package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.JsonParserComponent;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class n8l implements zsq0, nyi {
    public final JsonParserComponent a;

    public n8l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        sms smsVar = wm11.d;
        tls tlsVar = b.g;
        i8l i8lVar = p8l.d;
        kvo kvoVar = p8l.a;
        ?? e = a.e(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, smsVar, tlsVar, i8lVar, kvoVar);
        if (e != 0) {
            kvoVar = e;
        }
        tms tmsVar = wm11.b;
        tls tlsVar2 = b.h;
        i8l i8lVar2 = p8l.e;
        kvo kvoVar2 = p8l.b;
        Expression e2 = a.e(yf90Var, jSONObject, "blur", tmsVar, tlsVar2, i8lVar2, kvoVar2);
        if (e2 == null) {
            e2 = kvoVar2;
        }
        rms rmsVar = wm11.f;
        tls tlsVar3 = b.b;
        kvo kvoVar3 = p8l.c;
        ?? e3 = a.e(yf90Var, jSONObject, "color", rmsVar, tlsVar3, q5z.b, kvoVar3);
        if (e3 != 0) {
            kvoVar3 = e3;
        }
        return new m8l(kvoVar, e2, kvoVar3, (x4l) wwg.E(yf90Var, jSONObject, "offset", this.a.j6));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, m8l m8lVar) {
        JSONObject jSONObject = new JSONObject();
        a.g(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, m8lVar.a);
        a.g(yf90Var, jSONObject, "blur", m8lVar.b);
        a.h(yf90Var, jSONObject, "color", m8lVar.c, b.a);
        wwg.b0(yf90Var, jSONObject, "offset", m8lVar.d, this.a.j6);
        return jSONObject;
    }
}
