package xsna;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes13.dex */
public final class d701 extends PhantomReference {
    public final Set a;
    public final b201 b;

    public /* synthetic */ d701(qhc qhcVar, ReferenceQueue referenceQueue, Set set) {
        super(qhcVar, referenceQueue);
        this.a = set;
        this.b = b201.b;
    }
}
