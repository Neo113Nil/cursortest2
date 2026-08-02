package xsna;

import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CatalogGetClipsSearchRequestFactory.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class d6a extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d6a(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
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
            default:
                ((com.vk.registration.funnels.b) this.receiver).getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.MOBILEID_LIBVERIFY_STARTED, null, null, null, null, null, null, 254);
                break;
        }
        return s3q0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6a(Object obj) {
        super(0, obj, com.vk.registration.funnels.b.class, "onLibverifyMobileIdStarted", "onLibverifyMobileIdStarted()V", 0);
        this.b = 2;
    }
}
