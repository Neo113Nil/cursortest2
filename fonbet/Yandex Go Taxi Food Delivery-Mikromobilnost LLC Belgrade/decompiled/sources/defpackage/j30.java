package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes10.dex */
public final class j30 extends WeakReference {
    public final khx a;
    public final boolean b;
    public otj0 c;

    public j30(khx khxVar, b2o b2oVar, ReferenceQueue referenceQueue) {
        super(b2oVar, referenceQueue);
        z2a1.e(khxVar, "Argument must not be null");
        this.a = khxVar;
        boolean z = b2oVar.a;
        this.c = null;
        this.b = z;
    }
}
