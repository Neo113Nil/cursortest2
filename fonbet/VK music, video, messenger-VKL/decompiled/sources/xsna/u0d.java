package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.dto.hints.HintId;
import com.vk.log.L;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.search.fragment.DiscoverSearchFragment;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ClipItemFeature.kt */
/* loaded from: classes17.dex */
public final /* synthetic */ class u0d extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0d(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                break;
            case 1:
                DiscoverSearchFragment discoverSearchFragment = (DiscoverSearchFragment) this.receiver;
                int i = DiscoverSearchFragment.s0;
                hg1.a(discoverSearchFragment.io().c().subscribe(new gf0(new j9k(discoverSearchFragment, 4), 20), new y00(new ym1(L.a, 5), 18)), discoverSearchFragment);
                break;
            case 2:
                mxt mxtVar = (mxt) this.receiver;
                FragmentActivity fragmentActivity = (FragmentActivity) mxtVar.c.invoke();
                if (fragmentActivity != null) {
                    mxtVar.c(fragmentActivity);
                }
                break;
            case 3:
                ((ze00) this.receiver).getClass();
                com.vk.voip.ui.c.b.getClass();
                break;
            case 4:
                sal0 sal0Var = (sal0) this.receiver;
                int i2 = sal0.i;
                sal0Var.getClass();
                pla.e().b().b(HintId.VMOJI_KEYBOARD_AVATAR_SUGGESTION.getId());
                break;
            default:
                ((com.vk.registration.funnels.b) this.receiver).getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.RESEND_SMS_CODE_FAILED, null, null, null, null, null, null, 254);
                break;
        }
        return s3q0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0d(Object obj, int i) {
        super(0, obj, DiscoverSearchFragment.class, "showMarketParamsDialogSheet", "showMarketParamsDialogSheet()V", 0);
        this.b = i;
        switch (i) {
            case 2:
                super(0, obj, mxt.class, "onPermissionGranted", "onPermissionGranted()V", 0);
                break;
            case 5:
                super(0, obj, com.vk.registration.funnels.b.class, "onResendSmsFailed", "onResendSmsFailed()V", 0);
                break;
            default:
                break;
        }
    }
}
