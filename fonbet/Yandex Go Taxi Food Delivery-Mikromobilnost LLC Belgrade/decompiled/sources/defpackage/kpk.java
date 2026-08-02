package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAnimationInterpolator;
import com.yandex.div2.c0;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class kpk implements qfy0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.yandex.div.json.expressions.Expression] */
    public static hpk b(yf90 yf90Var, lpk lpkVar, JSONObject jSONObject) {
        exq exqVar = lpkVar.a;
        sms smsVar = wm11.d;
        tls tlsVar = b.g;
        tlk tlkVar = c0.f;
        kvo kvoVar = c0.a;
        ?? n = xcx.n(yf90Var, exqVar, jSONObject, CaretView.ALPHA_PROPERTY, smsVar, tlsVar, tlkVar, kvoVar);
        if (n != 0) {
            kvoVar = n;
        }
        exq exqVar2 = lpkVar.b;
        tms tmsVar = wm11.b;
        tls tlsVar2 = b.h;
        tlk tlkVar2 = c0.g;
        kvo kvoVar2 = c0.b;
        Expression n2 = xcx.n(yf90Var, exqVar2, jSONObject, "duration", tmsVar, tlsVar2, tlkVar2, kvoVar2);
        if (n2 == null) {
            n2 = kvoVar2;
        }
        exq exqVar3 = lpkVar.c;
        qkj qkjVar = c0.e;
        tls tlsVar3 = DivAnimationInterpolator.FROM_STRING;
        kvo kvoVar3 = c0.c;
        Expression o = xcx.o(yf90Var, exqVar3, jSONObject, "interpolator", qkjVar, tlsVar3, kvoVar3);
        if (o == null) {
            o = kvoVar3;
        }
        exq exqVar4 = lpkVar.d;
        tlk tlkVar3 = c0.h;
        kvo kvoVar4 = c0.d;
        Expression n3 = xcx.n(yf90Var, exqVar4, jSONObject, "start_delay", tmsVar, tlsVar2, tlkVar3, kvoVar4);
        if (n3 == null) {
            n3 = kvoVar4;
        }
        return new hpk(kvoVar, n2, o, n3);
    }

    @Override // defpackage.qfy0
    public final /* bridge */ /* synthetic */ Object a(yf90 yf90Var, hex hexVar, JSONObject jSONObject) {
        return b(yf90Var, (lpk) hexVar, jSONObject);
    }
}
