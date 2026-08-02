package xsna;

import kotlin.jvm.internal.MutablePropertyReference0Impl;

/* compiled from: AnimationHolder.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class op2 extends MutablePropertyReference0Impl {
    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
    public final Object get() {
        pp2 pp2Var = (pp2) this.receiver;
        int i = pp2.S;
        return Boolean.valueOf(pp2Var.t);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
    public final void set(Object obj) {
        pp2 pp2Var = (pp2) this.receiver;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = pp2.S;
        pp2Var.t = booleanValue;
    }
}
