package xsna;

import java.util.Iterator;

/* compiled from: ViewModel.jvm.kt */
/* loaded from: classes.dex */
public abstract class nyt0 {
    public final syt0 a = new syt0();

    public final void e(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        syt0 syt0Var = this.a;
        if (syt0Var != null) {
            if (syt0Var.d) {
                syt0.a(autoCloseable);
                return;
            }
            synchronized (syt0Var.a) {
                autoCloseable2 = (AutoCloseable) syt0Var.b.put(str, autoCloseable);
            }
            syt0.a(autoCloseable2);
        }
    }

    public final void f() {
        syt0 syt0Var = this.a;
        if (syt0Var != null && !syt0Var.d) {
            syt0Var.d = true;
            synchronized (syt0Var.a) {
                try {
                    Iterator it = syt0Var.b.values().iterator();
                    while (it.hasNext()) {
                        syt0.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = syt0Var.c.iterator();
                    while (it2.hasNext()) {
                        syt0.a((AutoCloseable) it2.next());
                    }
                    syt0Var.c.clear();
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        h();
    }

    public final <T extends AutoCloseable> T g(String str) {
        T t;
        syt0 syt0Var = this.a;
        if (syt0Var == null) {
            return null;
        }
        synchronized (syt0Var.a) {
            t = (T) syt0Var.b.get(str);
        }
        return t;
    }

    public void h() {
    }
}
