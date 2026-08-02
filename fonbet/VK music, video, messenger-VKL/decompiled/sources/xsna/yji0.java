package xsna;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: SenderDisplayLayoutProvidersFilter.kt */
/* loaded from: classes11.dex */
public final class yji0 implements zen {
    public final List<zen> a;

    /* JADX WARN: Multi-variable type inference failed */
    public yji0(List<? extends zen> list) {
        this.a = list;
    }

    @Override // xsna.zen
    public final boolean a(Set<? extends wen> set) {
        List<zen> list = this.a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((zen) it.next()).a(set)) {
                return true;
            }
        }
        return false;
    }
}
