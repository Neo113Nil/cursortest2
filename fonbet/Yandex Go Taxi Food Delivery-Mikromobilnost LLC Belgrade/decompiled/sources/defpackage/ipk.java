package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAnimationInterpolator;
import com.yandex.div2.c0;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ipk implements zsq0, nyi {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.yandex.div.json.expressions.Expression] */
    public static hpk c(yf90 yf90Var, JSONObject jSONObject) {
        sms smsVar = wm11.d;
        tls tlsVar = b.g;
        tlk tlkVar = c0.f;
        kvo kvoVar = c0.a;
        ?? e = a.e(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, smsVar, tlsVar, tlkVar, kvoVar);
        if (e != 0) {
            kvoVar = e;
        }
        tms tmsVar = wm11.b;
        tls tlsVar2 = b.h;
        tlk tlkVar2 = c0.g;
        kvo kvoVar2 = c0.b;
        Expression e2 = a.e(yf90Var, jSONObject, "duration", tmsVar, tlsVar2, tlkVar2, kvoVar2);
        if (e2 == null) {
            e2 = kvoVar2;
        }
        qkj qkjVar = c0.e;
        tls tlsVar3 = DivAnimationInterpolator.FROM_STRING;
        kvo kvoVar3 = c0.c;
        Expression e3 = a.e(yf90Var, jSONObject, "interpolator", qkjVar, tlsVar3, q5z.b, kvoVar3);
        if (e3 == null) {
            e3 = kvoVar3;
        }
        tlk tlkVar3 = c0.h;
        kvo kvoVar4 = c0.d;
        ?? e4 = a.e(yf90Var, jSONObject, "start_delay", tmsVar, tlsVar2, tlkVar3, kvoVar4);
        if (e4 != 0) {
            kvoVar4 = e4;
        }
        return new hpk(kvoVar, e2, e3, kvoVar4);
    }

    public static JSONObject d(yf90 yf90Var, hpk hpkVar) {
        JSONObject jSONObject = new JSONObject();
        a.g(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, hpkVar.a);
        a.g(yf90Var, jSONObject, "duration", hpkVar.b);
        a.h(yf90Var, jSONObject, "interpolator", hpkVar.c, DivAnimationInterpolator.TO_STRING);
        a.g(yf90Var, jSONObject, "start_delay", hpkVar.d);
        wwg.Z(yf90Var, jSONObject, "type", "fade");
        return jSONObject;
    }

    @Override // defpackage.nyi
    public final /* bridge */ /* synthetic */ Object a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (hpk) obj);
    }
}
