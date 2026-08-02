package kotlin.jvm.internal;

import xsna.ccy;
import xsna.fpf0;
import xsna.ocy;

/* loaded from: classes8.dex */
public abstract class MutablePropertyReference2 extends MutablePropertyReference implements ocy {
    @Override // kotlin.jvm.internal.CallableReference
    public final ccy computeReflected() {
        fpf0.a.getClass();
        return this;
    }

    @Override // xsna.tcy
    public final void getGetter() {
        ((ocy) getReflected()).getGetter();
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        ((MutablePropertyReference2Impl) this).getGetter();
        throw null;
    }
}
