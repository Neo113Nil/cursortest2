package kotlin.jvm.internal;

import xsna.ccy;
import xsna.fpf0;
import xsna.qcy;
import xsna.scy;

/* loaded from: classes11.dex */
public abstract class PropertyReference1 extends PropertyReference implements scy {
    public PropertyReference1() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    public ccy computeReflected() {
        fpf0.a.getClass();
        return this;
    }

    @Override // xsna.scy
    public Object getDelegate(Object obj) {
        return ((scy) getReflected()).getDelegate(obj);
    }

    public /* bridge */ /* synthetic */ qcy.a getGetter() {
        mo289getGetter();
        return null;
    }

    @Override // xsna.izs
    public Object invoke(Object obj) {
        return get(obj);
    }

    public PropertyReference1(Object obj) {
        super(obj);
    }

    @Override // xsna.scy
    /* renamed from: getGetter, reason: collision with other method in class */
    public scy.a mo289getGetter() {
        ((scy) getReflected()).mo289getGetter();
        return null;
    }

    public PropertyReference1(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
