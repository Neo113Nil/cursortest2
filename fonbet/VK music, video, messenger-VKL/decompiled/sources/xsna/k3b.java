package xsna;

import androidx.fragment.app.FragmentManager;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ChannelMessagesLinkLongClickHandler.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class k3b extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k3b(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        FragmentManager fragmentManager;
        switch (this.b) {
            case 0:
                d3b.a((d3b) this.receiver);
                return s3q0.a;
            case 1:
                ((i9b) this.receiver).k();
                return s3q0.a;
            case 2:
                gzs<s3q0> gzsVar = ((w8h) this.receiver).b;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 3:
                ((VideoPipStateHolder) this.receiver).getClass();
                VideoPipStateHolder.a();
                return s3q0.a;
            case 4:
                return Boolean.valueOf(((g950) this.receiver).b());
            case 5:
                ((vm30) this.receiver).i();
                return s3q0.a;
            case 6:
                ((com.vk.registration.funnels.b) this.receiver).getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.CALLIN_PHONE_NUMBER_CHANGED, null, null, null, null, null, null, 254);
                return s3q0.a;
            case 7:
                ((com.vk.core.compose.component.datetime.d) this.receiver).e(true);
                return s3q0.a;
            default:
                fragmentManager = ((mjw0) this.receiver).getFragmentManager();
                return fragmentManager;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3b(Object obj, int i) {
        super(0, obj, i9b.class, "openProfile", "openProfile()V", 0);
        this.b = i;
        switch (i) {
            case 3:
                super(0, obj, VideoPipStateHolder.class, "forceClosePip", "forceClosePip()V", 0);
                break;
            case 6:
                super(0, obj, com.vk.registration.funnels.b.class, "onCallInNumberChanged", "onCallInNumberChanged()V", 0);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3b(g950 g950Var) {
        super(0, g950Var, g950.class, "hasMusicSubscription", "hasMusicSubscription()Z", 0);
        this.b = 4;
    }
}
