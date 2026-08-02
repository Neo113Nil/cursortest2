package yads;

import java.util.Iterator;
import xsna.epx;

/* loaded from: classes10.dex */
public final class n5 {
    public static final String a = "yandex_ad_info";

    public static String a(hf3 hf3Var) {
        Object obj;
        Iterator it = hf3Var.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((iq0) obj).a, a)) {
                break;
            }
        }
        iq0 iq0Var = (iq0) obj;
        if (iq0Var != null) {
            return iq0Var.b;
        }
        return null;
    }
}
