package xsna;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: AboutVideoDescriptionHelper.kt */
/* loaded from: classes2.dex */
public final class q6 {
    public static final bpn0 b = new bpn0(new o6(0));
    public final r6 a;

    public q6(r6 r6Var) {
        this.a = r6Var;
    }

    public static long a(String str) {
        List c0 = drm0.c0(str, new String[]{StringUtils.PROCESS_POSTFIX_DELIMITER}, 0, 6);
        ArrayList arrayList = new ArrayList();
        Iterator it = c0.iterator();
        while (it.hasNext()) {
            Long n = arm0.n((String) it.next());
            if (n != null) {
                arrayList.add(n);
            }
        }
        List y0 = j5g.y0(arrayList);
        Long l = (Long) j5g.b0(0, y0);
        long longValue = l != null ? l.longValue() : 0L;
        Long l2 = (Long) j5g.b0(1, y0);
        long longValue2 = l2 != null ? l2.longValue() : 0L;
        Long l3 = (Long) j5g.b0(2, y0);
        long j = 60;
        return ((l3 != null ? l3.longValue() : 0L) * j * j) + (longValue2 * j) + longValue;
    }
}
