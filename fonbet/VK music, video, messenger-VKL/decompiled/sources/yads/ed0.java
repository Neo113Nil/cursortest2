package yads;

import java.util.Collection;
import java.util.HashSet;

/* loaded from: classes10.dex */
public final class ed0 implements tc0 {
    public final HashSet a = new HashSet();
    public zc0 b;

    public final void a(Exception exc, boolean z) {
        this.b = null;
        s51 a = s51.a((Collection) this.a);
        this.a.clear();
        p51 listIterator = a.listIterator(0);
        while (listIterator.hasNext()) {
            zc0 zc0Var = (zc0) listIterator.next();
            zc0Var.getClass();
            zc0Var.a(z ? 1 : 3, exc);
        }
    }
}
