package xsna;

import kotlin.jvm.internal.MutablePropertyReference0Impl;

/* compiled from: BigSnippetHolder.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class f27 extends MutablePropertyReference0Impl {
    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
    public final Object get() {
        g27 g27Var = (g27) this.receiver;
        int i = g27.i0;
        return Boolean.valueOf(g27Var.t);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
    public final void set(Object obj) {
        g27 g27Var = (g27) this.receiver;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = g27.i0;
        g27Var.t = booleanValue;
    }
}
