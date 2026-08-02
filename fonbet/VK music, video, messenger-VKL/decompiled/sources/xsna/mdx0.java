package xsna;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: WeakRefDiContextStorage.kt */
/* loaded from: classes.dex */
public final class mdx0 {
    public final mkb a;
    public final WeakHashMap<Object, a> b = new WeakHashMap<>();
    public final ReferenceQueue<Object> c = new ReferenceQueue<>();

    /* compiled from: WeakRefDiContextStorage.kt */
    public static final class a extends WeakReference<Object> {
        public final k7m a;
        public boolean b;

        public a(Object obj, ReferenceQueue referenceQueue, k7m k7mVar) {
            super(obj, referenceQueue);
            this.a = k7mVar;
        }
    }

    public mdx0(mkb mkbVar) {
        this.a = mkbVar;
    }

    public final l7m a(Object obj) {
        k7m k7mVar;
        synchronized (wrk.b) {
            while (true) {
                try {
                    Reference<? extends Object> poll = this.c.poll();
                    if (poll == null) {
                        break;
                    }
                    a aVar = (a) poll;
                    if (!aVar.b) {
                        aVar.a.clear();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            WeakHashMap<Object, a> weakHashMap = this.b;
            a aVar2 = weakHashMap.get(obj);
            if (aVar2 == null) {
                aVar2 = new a(obj, this.c, new k7m((fmg0) this.a.a));
                weakHashMap.put(obj, aVar2);
            }
            k7mVar = aVar2.a;
        }
        return k7mVar;
    }
}
