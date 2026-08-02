package kotlin.jvm.internal;

import xsna.ccy;
import xsna.fpf0;
import xsna.rcy;

/* loaded from: classes11.dex */
public abstract class PropertyReference0 extends PropertyReference implements rcy {
    @Override // kotlin.jvm.internal.CallableReference
    public final ccy computeReflected() {
        fpf0.a.getClass();
        return this;
    }

    @Override // xsna.rcy
    /* renamed from: getGetter */
    public final rcy.a mo287getGetter() {
        ((rcy) getReflected()).mo287getGetter();
        return null;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        return get();
    }
}
