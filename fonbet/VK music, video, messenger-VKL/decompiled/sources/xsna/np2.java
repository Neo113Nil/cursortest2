package xsna;

import com.vk.newsfeed.impl.explore.ExploreFragment;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AnimationHolder.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class np2 extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b = 0;

    public /* synthetic */ np2(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                break;
            case 1:
                ExploreFragment exploreFragment = (ExploreFragment) this.receiver;
                int i = ExploreFragment.h0;
                exploreFragment.io();
                break;
            default:
                ((com.vk.registration.funnels.b) this.receiver).getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.SMS_CODE_DETECTED, null, null, null, null, null, null, 254);
                break;
        }
        return s3q0.a;
    }

    public np2(ExploreFragment exploreFragment) {
        super(0, exploreFragment, ExploreFragment.class, "onUserAvatarClick", "onUserAvatarClick()V", 0);
    }

    public np2(Object obj) {
        super(0, obj, com.vk.registration.funnels.b.class, "onSmsCodeDetected", "onSmsCodeDetected()V", 0);
    }
}
