package xsna;

import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: OtpVerificationStat.kt */
/* loaded from: classes15.dex */
public final /* synthetic */ class r090 extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r090(Object obj, int i) {
        super(0, obj, com.vk.registration.funnels.b.class, "onInputCodeInteraction", "onInputCodeInteraction()V", 0);
        this.b = i;
        switch (i) {
            case 1:
                super(0, obj, com.vk.registration.funnels.b.class, "onPhoneRevalidationClosed", "onPhoneRevalidationClosed()V", 0);
                break;
            default:
                break;
        }
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((com.vk.registration.funnels.b) this.receiver).getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.INPUT_CODE_INTERACTION, null, null, null, null, null, null, 254);
                break;
            default:
                ((com.vk.registration.funnels.b) this.receiver).getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack2 = frf0.a;
                frf0.g(SchemeStatSak$EventScreen.VERIFICATION_ASK_NUMBER, null, null, null, 12);
                break;
        }
        return s3q0.a;
    }
}
