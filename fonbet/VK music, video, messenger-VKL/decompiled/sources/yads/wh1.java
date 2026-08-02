package yads;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import xsna.drm0;
import xsna.j5g;

/* loaded from: classes10.dex */
public abstract class wh1 {
    public static final List a(sh1 sh1Var, String str) {
        String c = ((uh1) sh1Var).c(str);
        if (c != null) {
            return drm0.c0(c, new String[]{StringUtils.COMMA}, 0, 6);
        }
        return null;
    }

    public static final void a(sh1 sh1Var, String str, List list) {
        String str2 = null;
        if (list != null) {
            List list2 = !list.isEmpty() ? list : null;
            if (list2 != null) {
                str2 = j5g.g0(list2, StringUtils.COMMA, null, null, 0, null, 62);
            }
        }
        ((uh1) sh1Var).a(str, str2);
    }
}
