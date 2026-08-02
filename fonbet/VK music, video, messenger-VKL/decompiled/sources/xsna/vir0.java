package xsna;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import xsna.uir0;

/* compiled from: ValidateSessionBehaviorResolver.kt */
/* loaded from: classes15.dex */
public final class vir0 {
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r4.isEmpty() != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static uir0 a(String str) {
        List list;
        Long n;
        if (str != null && !drm0.N(str)) {
            list = drm0.c0(str, new String[]{StringUtils.COMMA}, 0, 6);
        }
        list = null;
        if (list != null) {
            String str2 = (String) list.get(0);
            if (epx.f(str2, "1")) {
                return uir0.b.a;
            }
            if (epx.f(str2, "2")) {
                long j = 1000;
                if (list.size() > 1 && (n = arm0.n((String) list.get(1))) != null) {
                    j = n.longValue();
                }
                return new uir0.a(j);
            }
        }
        return null;
    }
}
