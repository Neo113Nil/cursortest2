package xsna;

import kotlin.jvm.internal.MutablePropertyReference0Impl;

/* compiled from: GifHolder.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class ryt extends MutablePropertyReference0Impl {
    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
    public final Object get() {
        pyt pytVar = (pyt) this.receiver;
        int i = pyt.Q;
        return Boolean.valueOf(pytVar.t);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
    public final void set(Object obj) {
        pyt pytVar = (pyt) this.receiver;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = pyt.Q;
        pytVar.t = booleanValue;
    }
}
