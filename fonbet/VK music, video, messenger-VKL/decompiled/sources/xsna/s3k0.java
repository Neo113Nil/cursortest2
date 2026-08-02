package xsna;

import kotlin.jvm.internal.MutablePropertyReference0Impl;

/* compiled from: SmallSnippetHolder.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class s3k0 extends MutablePropertyReference0Impl {
    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
    public final Object get() {
        t3k0 t3k0Var = (t3k0) this.receiver;
        int i = t3k0.U;
        return Boolean.valueOf(t3k0Var.t);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
    public final void set(Object obj) {
        t3k0 t3k0Var = (t3k0) this.receiver;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = t3k0.U;
        t3k0Var.t = booleanValue;
    }
}
