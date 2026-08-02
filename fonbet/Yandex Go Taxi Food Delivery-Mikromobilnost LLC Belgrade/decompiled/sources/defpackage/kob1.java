package defpackage;

import android.content.Context;
import android.util.TypedValue;
import com.ybsdk.core.design.theme.ThemedParams;
import java.util.Arrays;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class kob1 {
    public static final void a(sls slsVar, sls slsVar2, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1414719711);
        int i2 = (btsVar.e(slsVar) ? 4 : 2) | i | (btsVar.e(slsVar2) ? 32 : 16);
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            cx20.a(null, null, null, null, null, false, false, wwg.S(49067465, true, new wu40(8, slsVar2), btsVar), wwg.S(-1359381615, true, new v1c(i3, slsVar, slsVar2), btsVar), btsVar, 113246208, HProv.PP_VERSION_TIMESTAMP);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s0v(slsVar, slsVar2, i, 25);
        }
    }

    public static final int b(int i, Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.data;
    }

    public static final String c(int i) {
        return String.format("#%06x", Arrays.copyOf(new Object[]{Integer.valueOf(i & 16777215)}, 1));
    }

    public static Object d(ThemedParams themedParams, Context context) {
        Object dark;
        return (!lob1.f(context) || (dark = themedParams.getDark()) == null) ? themedParams.getLight() : dark;
    }
}
