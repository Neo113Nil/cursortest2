package xsna;

import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: StorageTaskManager.java */
/* loaded from: classes13.dex */
public final class yhl0 {
    public static final yhl0 c = new yhl0();
    public final HashMap a = new HashMap();
    public final Object b = new Object();

    public final void a(xhl0<?> xhl0Var) {
        synchronized (this.b) {
            try {
                String mhl0Var = xhl0Var.c().toString();
                WeakReference weakReference = (WeakReference) this.a.get(mhl0Var);
                xhl0<?> xhl0Var2 = weakReference != null ? (xhl0) weakReference.get() : null;
                if (xhl0Var2 == null || xhl0Var2 == xhl0Var) {
                    this.a.remove(mhl0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
