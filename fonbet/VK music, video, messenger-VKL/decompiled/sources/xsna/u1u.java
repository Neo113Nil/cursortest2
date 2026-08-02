package xsna;

import com.vk.story.viewer.api.di.StoryViewerComponent;
import kotlin.jvm.internal.PropertyReference0Impl;

/* compiled from: GlobalSearchAllCatalogRootVh.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class u1u extends PropertyReference0Impl {
    public final /* synthetic */ int b = 1;

    public /* synthetic */ u1u(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.PropertyReference0Impl, xsna.rcy
    public final Object get() {
        switch (this.b) {
            case 0:
                return ((StoryViewerComponent) this.receiver).tb();
            default:
                return Float.valueOf(((zzz) this.receiver).c());
        }
    }

    public u1u(Object obj) {
        super(obj, zzz.class, "currentAngle", "getCurrentAngle()F", 0);
    }
}
