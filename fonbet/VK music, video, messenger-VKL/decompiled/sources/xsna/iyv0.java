package xsna;

import android.content.Context;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.im.ui.fragments.ImContactFragment;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vk.profile.user.api.data.CommunityProfileDeeplinkParams;
import com.vk.profile.user.api.data.UserProfileSkeletonParams;
import xsna.o0r0;

/* compiled from: VkUsersBridge.kt */
/* loaded from: classes11.dex */
public final class iyv0 extends lrl {
    public final j4h a;
    public final kwm0 b;
    public final ProfileFragmentProviderComponent c;

    public iyv0(j4h j4hVar, kwm0 kwm0Var, ProfileFragmentProviderComponent profileFragmentProviderComponent) {
        this.a = j4hVar;
        this.b = kwm0Var;
        this.c = profileFragmentProviderComponent;
    }

    @Override // xsna.o0r0
    public final zvm0 T() {
        return this.b;
    }

    @Override // xsna.o0r0
    public final e4h h0() {
        return this.a;
    }

    @Override // xsna.o0r0
    public final void m(Context context, UserId userId, o0r0.a aVar) {
        Peer a = com.vk.dto.common.a.a(userId);
        if (a instanceof Peer.Contact) {
            ImContactFragment.a aVar2 = new ImContactFragment.a(userId.b);
            aVar2.s(aVar.g());
            aVar2.k(context);
        } else {
            if (a instanceof Peer.Email) {
                return;
            }
            ProfileFragmentProviderComponent.Companion companion = ProfileFragmentProviderComponent.Companion;
            pwd0 H = this.c.ye(userId, null).M(new UserProfileSkeletonParams(aVar.e(), aVar.a(), aVar.m(), aVar.f())).G(aVar.i()).K(aVar.l()).y(aVar.c()).H(aVar.k());
            if (aVar.n()) {
                H.A();
            }
            if (aVar.h()) {
                H.z(new CommunityProfileDeeplinkParams(false, null, null, true, 6, null));
            }
            pwd0 D = H.D(aVar.d(), aVar.b(), aVar.j());
            D.s(aVar.g());
            D.k(context);
        }
    }
}
