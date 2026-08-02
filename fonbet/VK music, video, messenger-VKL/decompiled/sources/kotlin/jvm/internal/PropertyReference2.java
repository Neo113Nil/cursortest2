package kotlin.jvm.internal;

import xsna.ccy;
import xsna.fpf0;
import xsna.tcy;

/* loaded from: classes11.dex */
public abstract class PropertyReference2 extends PropertyReference implements tcy {
    @Override // kotlin.jvm.internal.CallableReference
    public final ccy computeReflected() {
        fpf0.a.getClass();
        return this;
    }

    @Override // xsna.tcy
    public final void getGetter() {
        ((tcy) getReflected()).getGetter();
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        ((PropertyReference2Impl) this).getGetter();
        throw null;
    }
}
