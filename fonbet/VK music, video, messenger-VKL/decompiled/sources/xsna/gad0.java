package xsna;

import kotlin.jvm.internal.MutablePropertyReference0Impl;

/* compiled from: PrimaryPhotoAlbumHolder.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class gad0 extends MutablePropertyReference0Impl {
    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
    public final Object get() {
        had0 had0Var = (had0) this.receiver;
        int i = had0.M;
        return Boolean.valueOf(had0Var.t);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
    public final void set(Object obj) {
        had0 had0Var = (had0) this.receiver;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = had0.M;
        had0Var.t = booleanValue;
    }
}
