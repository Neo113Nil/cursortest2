package defpackage;

import android.graphics.Color;
import android.view.MotionEvent;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;

/* loaded from: classes6.dex */
public abstract class fob1 {
    public static final jbv a(rbv rbvVar, rbv rbvVar2) {
        return new jbv(new hux(rbvVar, rbvVar2));
    }

    public static final jbv b(ThemedParameter themedParameter) {
        String str = (String) themedParameter.getDark();
        String str2 = (String) themedParameter.getLight();
        uiy0 uiy0Var = new uiy0(20);
        return a((rbv) uiy0Var.invoke(str2), (rbv) uiy0Var.invoke(str));
    }

    public static final rbv c(String str, String str2, tls tlsVar) {
        rbv rbvVar;
        if (str != null && str2 != null) {
            return a((rbv) tlsVar.invoke(str), (rbv) tlsVar.invoke(str2));
        }
        if (str != null && (rbvVar = (rbv) tlsVar.invoke(str)) != null) {
            return rbvVar;
        }
        if (str2 != null) {
            return (rbv) tlsVar.invoke(str2);
        }
        return null;
    }

    public static boolean d(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }

    public static final Integer e(String str) {
        Integer num;
        try {
            num = Integer.valueOf(Color.parseColor(cvu0.x(str, ShimmerDivHandler.NUMBER_SING, false) ? str : ShimmerDivHandler.NUMBER_SING.concat(str)));
        } catch (Exception unused) {
            num = null;
        }
        if (str.length() <= 7 || num == null) {
            return num;
        }
        return Integer.valueOf(Color.argb(Color.blue(num.intValue()), Color.alpha(num.intValue()), Color.red(num.intValue()), Color.green(num.intValue())));
    }
}
