package xsna;

import android.os.Handler;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes.dex */
public final class saz0 implements Closeable {
    public static final saz0 f = new saz0(o8z0.g, 1000);
    public final Handler b;
    public final int c;
    public final WeakHashMap d = new WeakHashMap();
    public final qaz0 e = new Runnable() { // from class: xsna.qaz0
        @Override // java.lang.Runnable
        public final void run() {
            saz0 saz0Var = saz0.this;
            synchronized (saz0Var) {
                try {
                    ArrayList arrayList = new ArrayList(saz0Var.d.keySet());
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((Runnable) obj).run();
                    }
                    if (saz0Var.d.keySet().size() > 0) {
                        saz0Var.b.postDelayed(saz0Var.e, saz0Var.c);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };

    /* JADX WARN: Type inference failed for: r2v1, types: [xsna.qaz0] */
    public saz0(Handler handler, int i) {
        this.b = handler;
        this.c = i;
    }

    public static saz0 b(int i) {
        return new saz0(o8z0.g, i);
    }

    public final void c(Runnable runnable) {
        synchronized (this) {
            int size = this.d.size();
            if (this.d.put(runnable, Boolean.TRUE) == null && size == 0) {
                this.b.postDelayed(this.e, this.c);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.clear();
        this.b.removeCallbacks(this.e);
    }

    public final void h(Runnable runnable) {
        synchronized (this) {
            try {
                this.d.remove(runnable);
                if (this.d.size() == 0) {
                    this.b.removeCallbacks(this.e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
