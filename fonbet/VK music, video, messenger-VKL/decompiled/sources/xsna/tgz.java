package xsna;

import com.vk.log.L;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: ListWithPrimaryDisplayLayoutProvidersFilter.kt */
/* loaded from: classes11.dex */
public final class tgz implements zen {
    @Override // xsna.zen
    public final boolean a(Set<? extends wen> set) {
        int i;
        int i2;
        Set<? extends wen> set2 = set;
        boolean z = set2 instanceof Collection;
        if (z && set2.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it = set2.iterator();
            i = 0;
            while (it.hasNext()) {
                if ((((wen) it.next()) instanceof y9d0) && (i = i + 1) < 0) {
                    e43.s();
                    throw null;
                }
            }
        }
        if (z && set2.isEmpty()) {
            i2 = 0;
        } else {
            Iterator<T> it2 = set2.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                if ((((wen) it2.next()) instanceof jez) && (i2 = i2 + 1) < 0) {
                    e43.s();
                    throw null;
                }
            }
        }
        if (i2 > 1) {
            L.l("more than one list provider, check for leaks");
        }
        return i == 1 && i2 == 1 && set.size() == 2;
    }
}
