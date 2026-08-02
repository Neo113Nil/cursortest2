package xsna;

import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.registration.funnels.TrackingElement;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import java.util.Collections;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class uqf0 implements gzs {
    public final /* synthetic */ boolean b;

    public /* synthetic */ uqf0(boolean z) {
        this.b = z;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        SchemeStatSak$EventScreen schemeStatSak$EventScreen = SchemeStatSak$EventScreen.CAPTCHA;
        TrackingElement.Registration registration = TrackingElement.Registration.CAPTCHA;
        final boolean z = this.b;
        frf0.g(schemeStatSak$EventScreen, null, com.vk.registration.funnels.a.c(Collections.singletonList(new Pair(registration, new gzs() { // from class: xsna.yqf0
            @Override // xsna.gzs
            public final Object invoke() {
                return com.vk.registration.funnels.a.e(Boolean.valueOf(z));
            }
        }))), null, 8);
        return s3q0.a;
    }
}
