package kotlin.jvm.internal;

import xsna.ccy;
import xsna.fpf0;
import xsna.ncy;
import xsna.scy;

/* loaded from: classes11.dex */
public abstract class MutablePropertyReference1 extends MutablePropertyReference implements ncy {
    @Override // kotlin.jvm.internal.CallableReference
    public final ccy computeReflected() {
        fpf0.a.getClass();
        return this;
    }

    @Override // xsna.scy
    public final Object getDelegate(Object obj) {
        return ((ncy) getReflected()).getDelegate(obj);
    }

    @Override // xsna.scy
    /* renamed from: getGetter */
    public final scy.a mo289getGetter() {
        ((ncy) getReflected()).mo289getGetter();
        return null;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        return get(obj);
    }
}
