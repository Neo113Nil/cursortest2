package xsna;

import java.util.Comparator;
import java.util.LinkedHashMap;

/* compiled from: Comparisons.kt */
/* loaded from: classes7.dex */
public final class ari implements Comparator {
    public final /* synthetic */ int b;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                LinkedHashMap linkedHashMap = zpi.a;
                Long l = (Long) linkedHashMap.get((String) obj2);
                Long valueOf = Long.valueOf(l != null ? l.longValue() : 0L);
                Long l2 = (Long) linkedHashMap.get((String) obj);
                return jw5.b(valueOf, Long.valueOf(l2 != null ? l2.longValue() : 0L));
            default:
                return jw5.b(Long.valueOf(((jrp) obj).d), Long.valueOf(((jrp) obj2).d));
        }
    }
}
