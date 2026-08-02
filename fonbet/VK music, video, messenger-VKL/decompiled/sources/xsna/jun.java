package xsna;

import kotlin.jvm.internal.MutablePropertyReference0Impl;

/* compiled from: DocumentThumbnailHolder.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class jun extends MutablePropertyReference0Impl {
    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
    public final Object get() {
        iun iunVar = (iun) this.receiver;
        int i = iun.K;
        return Boolean.valueOf(iunVar.t);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
    public final void set(Object obj) {
        iun iunVar = (iun) this.receiver;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = iun.K;
        iunVar.t = booleanValue;
    }
}
