package xsna;

import com.vk.log.L;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: CollectionTargets.kt */
/* loaded from: classes.dex */
public final class y4g extends u000 {
    public final z100 a;
    public final CopyOnWriteArraySet b = new CopyOnWriteArraySet();
    public final a c = new a();

    /* compiled from: CollectionTargets.kt */
    public static final class a {
        public long a;
    }

    public y4g(z100 z100Var) {
        this.a = z100Var;
    }

    @Override // xsna.u000
    public final void b(L.LogType logType, String str, String str2, boolean z) {
        ThreadGroup threadGroup;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((u000) it.next()).b(logType, str, str2, z);
        }
        if (this.a.b) {
            x4g x4gVar = new x4g(this, z, 0);
            a aVar = this.c;
            long j = aVar.a;
            aVar.a = 1 + j;
            if (((int) (j % 10)) == 0) {
                int activeCount = Thread.activeCount();
                x4gVar.invoke("Threads dump: already created " + activeCount + " threads");
                if (activeCount <= 80 || (threadGroup = Thread.currentThread().getThreadGroup()) == null) {
                    return;
                }
                threadGroup.list();
            }
        }
    }

    @Override // xsna.u000
    public final void c() {
        CopyOnWriteArraySet copyOnWriteArraySet = this.b;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((u000) it.next()).c();
        }
        copyOnWriteArraySet.clear();
    }
}
