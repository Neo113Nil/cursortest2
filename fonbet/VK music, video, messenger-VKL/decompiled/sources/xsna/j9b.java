package xsna;

import android.graphics.RectF;
import com.vk.catalog2.common.ui.mvp.friend.FriendsCatalogFragment;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.o0r0;

/* compiled from: ChannelProfileInfoModel.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class j9b extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j9b(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
        this.b = 2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((i9b) this.receiver).k();
                break;
            case 1:
                FriendsCatalogFragment friendsCatalogFragment = (FriendsCatalogFragment) this.receiver;
                int i = FriendsCatalogFragment.V;
                friendsCatalogFragment.getClass();
                cn o = o25.a().o();
                xwk.e().m(friendsCatalogFragment.requireContext(), o.a, new o0r0.a(false, null, null, null, null, o.b, o.c, o.j, false, false, false, null, null, null, 65311));
                break;
            case 2:
                com.vk.newsfeed.posting.market_picker.presentation.base.view.e eVar = (com.vk.newsfeed.posting.market_picker.presentation.base.view.e) this.receiver;
                RectF rectF = com.vk.newsfeed.posting.market_picker.presentation.base.view.e.x;
                eVar.getClass();
                break;
            case 3:
                ((vm30) this.receiver).i();
                break;
            default:
                ((com.vk.registration.funnels.b) this.receiver).getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.CALLIN_NUMBERS_ARE_OVER, null, null, null, null, null, null, 254);
                break;
        }
        return s3q0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j9b(FriendsCatalogFragment friendsCatalogFragment) {
        super(0, friendsCatalogFragment, FriendsCatalogFragment.class, "onAvatarClickAction", "onAvatarClickAction()V", 0);
        this.b = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j9b(Object obj, int i) {
        super(0, obj, i9b.class, "openProfile", "openProfile()V", 0);
        this.b = i;
        switch (i) {
            case 3:
                super(0, obj, vm30.class, "hideFloatReactionsPicker", "hideFloatReactionsPicker()V", 0);
                break;
            case 4:
                super(0, obj, com.vk.registration.funnels.b.class, "onCallInNumbersAreOver", "onCallInNumbersAreOver()V", 0);
                break;
            default:
                break;
        }
    }
}
