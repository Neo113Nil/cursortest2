package xsna;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.vk.newsfeed.impl.newsfeed_post.presentation.fragment.PostFragment;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.voip.VoipCallActivity;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.t4c0;
import xsna.xn60;

/* compiled from: DocumentThumbnailHolder.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class kun extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kun(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (Boolean) ((mcy) this.receiver).get();
            case 1:
                kvt kvtVar = (kvt) this.receiver;
                zrp zrpVar = kvt.o;
                kvtVar.h();
                return s3q0.a;
            case 2:
                ((com.vk.registration.funnels.b) this.receiver).getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.CALLIN_NUMBERS_ARE_OVER, null, null, null, null, null, null, 254);
                return s3q0.a;
            case 3:
                com.vk.registration.funnels.b bVar = (com.vk.registration.funnels.b) this.receiver;
                bVar.getClass();
                com.vk.registration.funnels.b.z(bVar, SchemeStatSak$EventScreen.ALERT_UNLINK_PHONE_NUMBER, null, null, null, 30);
                return s3q0.a;
            case 4:
                PostFragment postFragment = (PostFragment) this.receiver;
                int i = PostFragment.S0;
                postFragment.Bo().c().b(new t4c0.e(xn60.d.a.b));
                return s3q0.a;
            case 5:
                VoipCallActivity voipCallActivity = (VoipCallActivity) this.receiver;
                voipCallActivity.v.getClass();
                List O0 = j5g.O0(voipCallActivity.getSupportFragmentManager().c.f());
                FragmentManager supportFragmentManager = voipCallActivity.getSupportFragmentManager();
                androidx.fragment.app.a b = tk5.b(supportFragmentManager, supportFragmentManager);
                Iterator it = O0.iterator();
                while (it.hasNext()) {
                    b.q((Fragment) it.next());
                }
                b.m();
                voipCallActivity.W1();
                return s3q0.a;
            default:
                return (Boolean) ((mcy) this.receiver).get();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kun(Object obj, int i) {
        super(0, obj, com.vk.registration.funnels.b.class, "onCallInNumbersAreOver", "onCallInNumbersAreOver()V", 0);
        this.b = i;
        switch (i) {
            case 3:
                super(0, obj, com.vk.registration.funnels.b.class, "onProceedToAlertUnlinkPhoneOpened", "onProceedToAlertUnlinkPhoneOpened()V", 0);
                break;
            default:
                break;
        }
    }
}
