package xsna;

import androidx.fragment.app.FragmentManager;
import com.vk.catalog2.common.ui.mvp.friend.FriendsCatalogFragment;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.superapp.multiaccount.api.MultiAccountEntryPoint;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.vm30;

/* compiled from: ChannelProfileInfoModel.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class k9b extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k9b(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        FragmentManager fragmentManager;
        switch (this.b) {
            case 0:
                i9b.c((i9b) this.receiver);
                return s3q0.a;
            case 1:
                FriendsCatalogFragment friendsCatalogFragment = (FriendsCatalogFragment) this.receiver;
                if (((hlu0) friendsCatalogFragment.R.getValue()).a()) {
                    ((jlu0) friendsCatalogFragment.S.getValue()).e(friendsCatalogFragment, MultiAccountEntryPoint.LongTap.d);
                }
                return s3q0.a;
            case 2:
                com.vk.newsfeed.posting.market_picker.presentation.base.view.e eVar = (com.vk.newsfeed.posting.market_picker.presentation.base.view.e) this.receiver;
                bxt0.a(eVar.s, 50L).withStartAction(new hv1(eVar, 10)).withEndAction(new iv1(eVar, 6));
                return s3q0.a;
            case 3:
                vm30.a aVar = ((vm30) this.receiver).g0;
                if (aVar != null) {
                    aVar.b = true;
                }
                return s3q0.a;
            case 4:
                return Boolean.valueOf(((g950) this.receiver).c());
            case 5:
                ((com.vk.registration.funnels.b) this.receiver).getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.CONTINUE_VERIFICATION_TAP, null, null, null, null, null, null, 254);
                return s3q0.a;
            default:
                fragmentManager = ((mjw0) this.receiver).getFragmentManager();
                return fragmentManager;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9b(FriendsCatalogFragment friendsCatalogFragment) {
        super(0, friendsCatalogFragment, FriendsCatalogFragment.class, "onAvatarLongClickAction", "onAvatarLongClickAction()V", 0);
        this.b = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9b(Object obj, int i) {
        super(0, obj, i9b.class, "enableNotifications", "enableNotifications()V", 0);
        this.b = i;
        switch (i) {
            case 4:
                super(0, obj, g950.class, "hasMusicSubscriptionForOffline", "hasMusicSubscriptionForOffline()Z", 0);
                break;
            case 5:
                super(0, obj, com.vk.registration.funnels.b.class, "onVerificationContinueTap", "onVerificationContinueTap()V", 0);
                break;
            default:
                break;
        }
    }
}
