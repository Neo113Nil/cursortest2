package xsna;

import kotlin.jvm.internal.MutablePropertyReference0Impl;

/* compiled from: SinglePhotoHolder.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class evj0 extends MutablePropertyReference0Impl {
    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
    public final Object get() {
        cvj0 cvj0Var = (cvj0) this.receiver;
        int i = cvj0.n0;
        return Boolean.valueOf(cvj0Var.t);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
    public final void set(Object obj) {
        cvj0 cvj0Var = (cvj0) this.receiver;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = cvj0.n0;
        cvj0Var.t = booleanValue;
    }
}
