package xsna;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: WorkTimer.java */
/* loaded from: classes12.dex */
public final class gyx0 {
    public final rll a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final Object d = new Object();

    /* compiled from: WorkTimer.java */
    public interface a {
        void b(@NonNull svx0 svx0Var);
    }

    /* compiled from: WorkTimer.java */
    public static class b implements Runnable {
        public final gyx0 b;
        public final svx0 c;

        public b(@NonNull gyx0 gyx0Var, @NonNull svx0 svx0Var) {
            this.b = gyx0Var;
            this.c = svx0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this.b.d) {
                try {
                    if (((b) this.b.b.remove(this.c)) != null) {
                        a aVar = (a) this.b.c.remove(this.c);
                        if (aVar != null) {
                            aVar.b(this.c);
                        }
                    } else {
                        m100 c = m100.c();
                        Objects.toString(this.c);
                        c.getClass();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    static {
        m100.d("WorkTimer");
    }

    public gyx0(@NonNull rll rllVar) {
        this.a = rllVar;
    }

    public final void a(@NonNull svx0 svx0Var) {
        synchronized (this.d) {
            try {
                if (((b) this.b.remove(svx0Var)) != null) {
                    m100 c = m100.c();
                    Objects.toString(svx0Var);
                    c.getClass();
                    this.c.remove(svx0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
