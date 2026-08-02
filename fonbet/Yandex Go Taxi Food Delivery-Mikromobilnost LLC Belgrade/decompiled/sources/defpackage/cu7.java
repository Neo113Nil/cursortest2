package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public final class cu7 extends WeakReference {
    public final int a;

    public cu7(Object obj, ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        this.a = System.identityHashCode(obj);
    }

    public final boolean equals(Object obj) {
        T t = get();
        return t != 0 ? (obj instanceof cu7) && ((cu7) obj).get() == t : obj == this;
    }

    public final int hashCode() {
        return this.a;
    }
}
