package xsna;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PipDisplayLayoutProviderFilter.kt */
/* loaded from: classes11.dex */
public final class apa0 implements zen {
    @Override // xsna.zen
    public final boolean a(Set<? extends wen> set) {
        int i;
        Set<? extends wen> set2 = set;
        if ((set2 instanceof Collection) && set2.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it = set2.iterator();
            i = 0;
            while (it.hasNext()) {
                if ((((wen) it.next()) instanceof zoa0) && (i = i + 1) < 0) {
                    e43.s();
                    throw null;
                }
            }
        }
        return i == 1 && set.size() == 1;
    }
}
