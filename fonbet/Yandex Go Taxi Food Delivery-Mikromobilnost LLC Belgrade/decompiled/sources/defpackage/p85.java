package defpackage;

import java.lang.ref.WeakReference;

/* loaded from: classes12.dex */
public abstract class p85 {
    public WeakReference a;

    public final Object a() {
        Object obj;
        synchronized (this) {
            WeakReference weakReference = this.a;
            obj = weakReference != null ? weakReference.get() : null;
        }
        return obj;
    }

    public final Object b() {
        Object obj;
        synchronized (this) {
            WeakReference weakReference = this.a;
            obj = weakReference != null ? weakReference.get() : null;
            if (obj == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return obj;
    }

    public final void c(Object obj) {
        synchronized (this) {
            try {
                if (obj != null) {
                    this.a = new WeakReference(obj);
                } else {
                    WeakReference weakReference = this.a;
                    if (weakReference != null) {
                        weakReference.clear();
                    }
                    this.a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
