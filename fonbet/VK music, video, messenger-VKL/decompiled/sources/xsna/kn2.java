package xsna;

import kotlin.jvm.internal.MutablePropertyReference0Impl;

/* compiled from: AnimationCommentHolder.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class kn2 extends MutablePropertyReference0Impl {
    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
    public final Object get() {
        in2 in2Var = (in2) this.receiver;
        int i = in2.Q;
        return Boolean.valueOf(in2Var.t);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
    public final void set(Object obj) {
        in2 in2Var = (in2) this.receiver;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = in2.Q;
        in2Var.t = booleanValue;
    }
}
