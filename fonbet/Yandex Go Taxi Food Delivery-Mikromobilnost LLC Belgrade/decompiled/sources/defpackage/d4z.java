package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* loaded from: classes10.dex */
public abstract class d4z {
    public static final qwd a = new qwd(new o3z(3));

    public static rx60 a(fid fidVar) {
        bts btsVar = (bts) fidVar;
        rx60 rx60Var = (rx60) btsVar.m(a);
        if (rx60Var == null) {
            btsVar.e0(1208426157);
            rx60Var = wwg.r((View) btsVar.m(AndroidCompositionLocals_androidKt.f));
            btsVar.t(false);
        } else {
            btsVar.e0(1208423708);
            btsVar.t(false);
        }
        if (rx60Var != null) {
            btsVar.e0(1208423789);
            btsVar.t(false);
            return rx60Var;
        }
        btsVar.e0(1208428160);
        Object obj = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
        while (true) {
            if (!(obj instanceof ContextWrapper)) {
                obj = null;
                break;
            }
            if (obj instanceof rx60) {
                break;
            }
            obj = ((ContextWrapper) obj).getBaseContext();
        }
        rx60 rx60Var2 = (rx60) obj;
        btsVar.t(false);
        return rx60Var2;
    }
}
