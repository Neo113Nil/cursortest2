package xsna;

import kotlin.jvm.internal.PropertyReference0Impl;

/* compiled from: GalleryFragmentImpl.kt */
/* loaded from: classes15.dex */
public final /* synthetic */ class v3t extends PropertyReference0Impl {
    public final /* synthetic */ int b = 1;

    public /* synthetic */ v3t(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.PropertyReference0Impl, xsna.rcy
    public final Object get() {
        switch (this.b) {
            case 0:
                return ((fm1) this.receiver).b();
            default:
                return Float.valueOf(((zzz) this.receiver).c());
        }
    }

    public v3t(Object obj) {
        super(obj, zzz.class, "currentAngle", "getCurrentAngle()F", 0);
    }
}
