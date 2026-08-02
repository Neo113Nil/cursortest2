package xsna;

import com.vk.core.fragments.FragmentImpl;
import kotlin.jvm.internal.PropertyReference0Impl;

/* compiled from: BaseCameraEditorPresenter.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class i86 extends PropertyReference0Impl {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i86(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, i);
        this.b = i2;
    }

    @Override // kotlin.jvm.internal.PropertyReference0Impl, xsna.rcy
    public final Object get() {
        switch (this.b) {
            case 0:
                return ((v76) this.receiver).getAnimationStickerManager();
            default:
                return Boolean.valueOf(lbs.q((FragmentImpl) this.receiver));
        }
    }
}
