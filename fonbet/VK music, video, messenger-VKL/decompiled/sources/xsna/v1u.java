package xsna;

import com.vk.story.api.di.StoriesComponent;
import kotlin.jvm.internal.PropertyReference0Impl;

/* compiled from: GlobalSearchAllCatalogRootVh.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class v1u extends PropertyReference0Impl {
    public final /* synthetic */ int b = 1;

    public /* synthetic */ v1u(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.PropertyReference0Impl, xsna.rcy
    public final Object get() {
        switch (this.b) {
            case 0:
                return ((StoriesComponent) this.receiver).Pa();
            default:
                return Float.valueOf(((zzz) this.receiver).c());
        }
    }

    public v1u(Object obj) {
        super(obj, zzz.class, "currentAngle", "getCurrentAngle()F", 0);
    }
}
