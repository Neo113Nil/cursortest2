package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes8.dex */
public final class ep41 implements eq60, bp41 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.bp41
    public final void c(zo41 zo41Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((bp41) it.next()).c(zo41Var);
        }
    }

    @Override // defpackage.eq60
    public final void e(Object obj) {
        this.a.add((bp41) obj);
    }

    @Override // defpackage.eq60
    public final void f(Object obj) {
        this.a.remove((bp41) obj);
    }
}
