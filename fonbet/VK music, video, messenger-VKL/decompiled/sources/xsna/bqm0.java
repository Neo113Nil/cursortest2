package xsna;

import java.util.Map;

/* compiled from: StringExt.kt */
/* loaded from: classes6.dex */
public final class bqm0 {
    public static final String a(String str, Map<String, String> map) {
        if (map.isEmpty()) {
            return str;
        }
        int L = drm0.L(str, '#', 0, 6);
        String substring = L >= 0 ? str.substring(0, L) : str;
        return fw3.c(substring, drm0.E(substring, '?') ? "&" : "?", j5g.g0(map.entrySet(), "&", null, null, 0, new ye40(19), 30), L >= 0 ? str.substring(L) : "");
    }
}
