package xsna;

import kotlin.jvm.internal.MutablePropertyReference0Impl;

/* compiled from: FaveBigSnippetHolder.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class qmq extends MutablePropertyReference0Impl {
    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
    public final Object get() {
        rmq rmqVar = (rmq) this.receiver;
        int i = rmq.V;
        return Boolean.valueOf(rmqVar.t);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
    public final void set(Object obj) {
        rmq rmqVar = (rmq) this.receiver;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = rmq.V;
        rmqVar.t = booleanValue;
    }
}
