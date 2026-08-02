package yads;

import java.lang.ref.WeakReference;
import xsna.p7f0;
import xsna.qcy;

/* loaded from: classes10.dex */
public final class mn2 implements p7f0 {
    public WeakReference a;

    public mn2(Object obj) {
        this.a = new WeakReference(obj);
    }

    @Override // xsna.i7f0
    public final Object getValue(Object obj, qcy qcyVar) {
        return this.a.get();
    }

    @Override // xsna.p7f0
    public final void setValue(Object obj, qcy qcyVar, Object obj2) {
        this.a = new WeakReference(obj2);
    }
}
