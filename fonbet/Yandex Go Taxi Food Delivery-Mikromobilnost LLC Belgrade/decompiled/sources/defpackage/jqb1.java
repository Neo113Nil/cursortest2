package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class jqb1 {
    public final HashSet a = new HashSet();

    public final synchronized void a(Object obj) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((nvt0) it.next()).a(obj);
        }
    }
}
