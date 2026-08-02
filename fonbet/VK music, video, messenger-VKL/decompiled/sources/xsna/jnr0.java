package xsna;

import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: VerificationStat.kt */
/* loaded from: classes15.dex */
public final /* synthetic */ class jnr0 extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jnr0(Object obj, int i) {
        super(0, obj, com.vk.registration.funnels.b.class, "onLibverifyCallStarted", "onLibverifyCallStarted()V", 0);
        this.b = i;
        switch (i) {
            case 1:
                super(0, obj, com.vk.voip.ui.c.class, "showMaskChooser", "showMaskChooser()V", 0);
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
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.CALL_LIBVERIFY_STARTED, null, null, null, null, null, null, 254);
                break;
            default:
                ((com.vk.voip.ui.c) this.receiver).getClass();
                ysg0.b.a(new nij0());
                break;
        }
        return s3q0.a;
    }
}
