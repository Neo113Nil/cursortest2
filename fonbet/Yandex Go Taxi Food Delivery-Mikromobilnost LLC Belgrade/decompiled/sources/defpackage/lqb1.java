package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes11.dex */
public final class lqb1 extends WeakReference {
    public final int a;

    public lqb1(Throwable th, ReferenceQueue referenceQueue) {
        super(th, referenceQueue);
        this.a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == lqb1.class) {
            if (this == obj) {
                return true;
            }
            lqb1 lqb1Var = (lqb1) obj;
            if (this.a == lqb1Var.a && get() == lqb1Var.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }
}
