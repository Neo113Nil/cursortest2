package xsna;

import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: UserMetadata.java */
/* loaded from: classes.dex */
public final class alq0 {
    public final zh20 a;
    public final g6k b;
    public String c;
    public final a d = new a(false);
    public final a e = new a(true);
    public final slg0 f = new slg0();
    public final AtomicMarkableReference<String> g = new AtomicMarkableReference<>(null, false);

    /* compiled from: UserMetadata.java */
    public class a {
        public final AtomicMarkableReference<zhy> a;
        public final AtomicReference<Runnable> b = new AtomicReference<>(null);
        public final boolean c;

        public a(boolean z) {
            this.c = z;
            this.a = new AtomicMarkableReference<>(new zhy(z ? 8192 : 1024), false);
        }

        public final boolean a(String str, String str2) {
            synchronized (this) {
                try {
                    if (!this.a.getReference().b(str, str2)) {
                        return false;
                    }
                    AtomicMarkableReference<zhy> atomicMarkableReference = this.a;
                    atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
                    qp50 qp50Var = new qp50(this, 2);
                    AtomicReference<Runnable> atomicReference = this.b;
                    while (!atomicReference.compareAndSet(null, qp50Var)) {
                        if (atomicReference.get() != null) {
                            return true;
                        }
                    }
                    alq0.this.b.b.a(qp50Var);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public alq0(String str, sar sarVar, g6k g6kVar) {
        this.c = str;
        this.a = new zh20(sarVar);
        this.b = g6kVar;
    }
}
