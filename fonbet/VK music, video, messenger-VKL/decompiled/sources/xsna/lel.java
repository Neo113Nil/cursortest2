package xsna;

import java.util.Comparator;
import xsna.tbn;

/* compiled from: DefaultEntryEvictionComparatorSupplier.java */
/* loaded from: classes12.dex */
public final class lel implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        long timestamp = ((tbn.a) obj).getTimestamp();
        long timestamp2 = ((tbn.a) obj2).getTimestamp();
        if (timestamp < timestamp2) {
            return -1;
        }
        return timestamp2 == timestamp ? 0 : 1;
    }
}
