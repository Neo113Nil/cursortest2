package xsna;

import com.vk.im.design.view.pagination.pin.ImMultiPinView;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ImMultiPinView.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class t9w extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t9w(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
        this.b = 0;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ImMultiPinView.a((ImMultiPinView) this.receiver);
                return s3q0.a;
            case 1:
                ((com.vk.registration.funnels.b) this.receiver).getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.OTP_MESSENGER_LIBVERIFY_STARTED, null, null, null, null, null, null, 254);
                return s3q0.a;
            default:
                return Boolean.valueOf(((de60) this.receiver).c());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t9w(Object obj, int i) {
        super(0, obj, com.vk.registration.funnels.b.class, "onLibverifyMessengerRouteStarted", "onLibverifyMessengerRouteStarted()V", 0);
        this.b = i;
        switch (i) {
            case 2:
                super(0, obj, de60.class, "isOptionalAdsInitialized", "isOptionalAdsInitialized()Z", 0);
                break;
            default:
                break;
        }
    }
}
