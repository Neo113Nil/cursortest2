package xsna;

import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: ClipsWrapperFragment.kt */
/* loaded from: classes17.dex */
public final /* synthetic */ class qrf extends AdaptedFunctionReference implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qrf(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) this.receiver;
                int i = ClipsWrapperFragment.Q0;
                clipsWrapperFragment.ho();
                return s3q0.a;
            default:
                return Boolean.valueOf(((nda) this.receiver).c(false));
        }
    }
}
