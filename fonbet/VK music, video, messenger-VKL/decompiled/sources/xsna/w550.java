package xsna;

import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: MusicSmartPlaylistVh.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class w550 extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w550(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                break;
            case 1:
                ((b7o0) this.receiver).a();
                break;
            case 2:
                ((com.vk.registration.funnels.b) this.receiver).getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.OTP_MESSENGER_LIBVERIFY_STARTED, null, null, null, null, null, null, 254);
                break;
            default:
                ((com.vk.voip.ui.c) this.receiver).getClass();
                ysg0.b.a(new rjj0());
                break;
        }
        return s3q0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w550(Object obj, int i) {
        super(0, obj, com.vk.registration.funnels.b.class, "onLibverifyMessengerRouteStarted", "onLibverifyMessengerRouteStarted()V", 0);
        this.b = i;
        switch (i) {
            case 3:
                super(0, obj, com.vk.voip.ui.c.class, "showVirtualBackgroundChooser", "showVirtualBackgroundChooser()V", 0);
                break;
            default:
                break;
        }
    }
}
