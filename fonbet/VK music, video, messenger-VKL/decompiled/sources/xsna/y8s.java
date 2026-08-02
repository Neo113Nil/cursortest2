package xsna;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import one.video.player.FormatSupport;

/* compiled from: FormatSupportMapper.kt */
/* loaded from: classes8.dex */
public final class y8s {
    public static final HashMap a;
    public static final LinkedHashMap b;

    static {
        HashMap i = pn00.i(new Pair(4, FormatSupport.FORMAT_HANDLED), new Pair(3, FormatSupport.FORMAT_EXCEEDS_CAPABILITIES), new Pair(2, FormatSupport.FORMAT_UNSUPPORTED_DRM), new Pair(1, FormatSupport.FORMAT_UNSUPPORTED_SUBTYPE), new Pair(0, FormatSupport.FORMAT_UNSUPPORTED_TYPE));
        a = i;
        Set<Map.Entry> entrySet = i.entrySet();
        int e = on00.e(c5g.u(entrySet, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (Map.Entry entry : entrySet) {
            linkedHashMap.put((FormatSupport) entry.getValue(), y2r0.C(((Number) entry.getKey()).intValue()));
        }
        b = linkedHashMap;
    }
}
