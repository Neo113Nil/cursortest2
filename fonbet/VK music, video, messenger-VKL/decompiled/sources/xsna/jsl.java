package xsna;

import android.content.IntentFilter;
import com.vk.profile.design.view.fab.ProfileFabView;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: DeferredSubmitAdapter.kt */
/* loaded from: classes6.dex */
public final /* synthetic */ class jsl extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jsl(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((ksl) this.receiver).Q0();
                return s3q0.a;
            case 1:
                ((com.vk.registration.funnels.b) this.receiver).getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.SELECT_AUTH_BY_PASSWORD, null, null, null, null, null, null, 254);
                return s3q0.a;
            case 2:
                cp70 cp70Var = (cp70) this.receiver;
                IntentFilter intentFilter = cp70.N;
                cp70Var.P0();
                return s3q0.a;
            case 3:
                ProfileFabView.H((ProfileFabView) this.receiver);
                return s3q0.a;
            case 4:
                return (Boolean) ((mcy) this.receiver).get();
            default:
                ((rkq0) this.receiver).g();
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jsl(Object obj, int i) {
        super(0, obj, com.vk.registration.funnels.b.class, "onSelectAuthByPassword", "onSelectAuthByPassword()V", 0);
        this.b = i;
        switch (i) {
            case 2:
                super(0, obj, cp70.class, "fetchNextCodeState", "fetchNextCodeState()V", 0);
                break;
            case 3:
                super(0, obj, ProfileFabView.class, "onLeftButtonClick", "onLeftButtonClick()V", 0);
                break;
            default:
                break;
        }
    }
}
