package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivAnimationInterpolator;
import com.yandex.div2.c0;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class jpk implements zsq0, yey0 {
    public static lpk c(yf90 yf90Var, lpk lpkVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        exq j = wcx.j(Q, jSONObject, CaretView.ALPHA_PROPERTY, wm11.d, i, lpkVar != null ? lpkVar.a : null, b.g, c0.f);
        tms tmsVar = wm11.b;
        exq exqVar = lpkVar != null ? lpkVar.b : null;
        tls tlsVar = b.h;
        return new lpk(j, wcx.j(Q, jSONObject, "duration", tmsVar, i, exqVar, tlsVar, c0.g), wcx.j(Q, jSONObject, "interpolator", c0.e, i, lpkVar != null ? lpkVar.c : null, DivAnimationInterpolator.FROM_STRING, q5z.b), wcx.j(Q, jSONObject, "start_delay", tmsVar, i, lpkVar != null ? lpkVar.d : null, tlsVar, c0.h));
    }

    public static JSONObject d(yf90 yf90Var, lpk lpkVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.q(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, lpkVar.a);
        wcx.q(yf90Var, jSONObject, "duration", lpkVar.b);
        wcx.p(lpkVar.c, DivAnimationInterpolator.TO_STRING, yf90Var, "interpolator", jSONObject);
        wcx.q(yf90Var, jSONObject, "start_delay", lpkVar.d);
        wwg.Z(yf90Var, jSONObject, "type", "fade");
        return jSONObject;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (lpk) obj);
    }
}
