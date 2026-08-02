package xsna;

import com.vk.profile.design.view.fab.ProfileFabView;
import java.util.Collection;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: OneByOneGroupedPollStateMapper.kt */
/* loaded from: classes6.dex */
public final /* synthetic */ class ki80 extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ki80(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(!((Collection) this.receiver).isEmpty());
            default:
                ProfileFabView profileFabView = (ProfileFabView) this.receiver;
                int i = ProfileFabView.r;
                profileFabView.getOnGrowthTrapButtonClick().invoke();
                return s3q0.a;
        }
    }
}
