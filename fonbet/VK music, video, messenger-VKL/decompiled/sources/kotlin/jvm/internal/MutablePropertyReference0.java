package kotlin.jvm.internal;

import xsna.ccy;
import xsna.fpf0;
import xsna.lcy;
import xsna.mcy;
import xsna.qcy;
import xsna.rcy;

/* loaded from: classes11.dex */
public abstract class MutablePropertyReference0 extends MutablePropertyReference implements mcy {
    public MutablePropertyReference0() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    public ccy computeReflected() {
        fpf0.a.getClass();
        return this;
    }

    @Override // xsna.rcy
    public Object getDelegate() {
        return ((mcy) getReflected()).getDelegate();
    }

    public /* bridge */ /* synthetic */ qcy.a getGetter() {
        mo287getGetter();
        return null;
    }

    public /* bridge */ /* synthetic */ lcy getSetter() {
        mo288getSetter();
        return null;
    }

    @Override // xsna.gzs
    public Object invoke() {
        return get();
    }

    public MutablePropertyReference0(Object obj) {
        super(obj);
    }

    @Override // xsna.rcy
    /* renamed from: getGetter, reason: collision with other method in class */
    public rcy.a mo287getGetter() {
        ((mcy) getReflected()).mo287getGetter();
        return null;
    }

    @Override // xsna.mcy
    /* renamed from: getSetter, reason: collision with other method in class */
    public mcy.a mo288getSetter() {
        ((mcy) getReflected()).mo288getSetter();
        return null;
    }

    public MutablePropertyReference0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
