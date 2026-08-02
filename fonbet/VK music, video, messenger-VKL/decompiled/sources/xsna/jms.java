package xsna;

import com.vk.ml.api.tf.TensorflowFacade;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import kotlin.jvm.internal.PropertyReference0Impl;

/* compiled from: FriendsCatalogRootVh.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class jms extends PropertyReference0Impl {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jms(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, i);
        this.b = i2;
    }

    @Override // kotlin.jvm.internal.PropertyReference0Impl, xsna.rcy
    public final Object get() {
        switch (this.b) {
            case 0:
                return ((StoryViewerComponent) this.receiver).tb();
            default:
                return Boolean.valueOf(((TensorflowFacade) this.receiver).d());
        }
    }
}
