package xsna;

import com.vk.core.view.components.button.VkButton;
import com.vk.dto.gift.GiftItem;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.profile.user.impl.ui.f;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.List;

/* compiled from: UserProfileContentGiftsFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class gnq0 extends wmq0<mzt, s3q0> {
    public final String m;

    public gnq0(dvq0 dvq0Var, r0e0 r0e0Var, boolean z) {
        super(dvq0Var, r0e0Var, z);
        this.m = "gifts";
    }

    @Override // xsna.wmq0
    public final void A(mzt mztVar, CommunityProfileContentItem.State state, CommunityProfileContentItem.State state2) {
        mzt mztVar2 = mztVar;
        if (state == null) {
            state = mztVar2.p;
        }
        CommunityProfileContentItem.State state3 = state;
        if (state2 == null) {
            state2 = mztVar2.r;
        }
        z(mzt.i(mztVar2, null, false, 0, state3, state2, 703));
    }

    public final void C(mzt mztVar, boolean z) {
        List<GiftItem> list;
        int i = 0;
        if (!z && (list = mztVar.j) != null) {
            i = list.size();
        }
        p(rsg0.w0(new szt(this.c.a(), i, 20)), new l1r(this, mztVar, z, 3), new ckh(this, mztVar, z, 2));
    }

    @Override // xsna.wmq0, xsna.rgq0
    public final void b(CommunityProfileContentItem communityProfileContentItem) {
        mzt mztVar = (mzt) communityProfileContentItem;
        if (mztVar.k) {
            wmq0.B(this, mztVar, null, CommunityProfileContentItem.State.LOADING, 2);
            C(mztVar, false);
        }
    }

    @Override // xsna.wmq0, xsna.rgq0
    public final void f(CommunityProfileContentItem communityProfileContentItem, ExtendedUserProfile extendedUserProfile) {
        if (extendedUserProfile != null) {
            fpq0 fpq0Var = this.g;
            if (fpq0Var == null) {
                fpq0Var = null;
            }
            fpq0Var.B(new f.e.m0(extendedUserProfile));
        }
    }

    @Override // xsna.wmq0, xsna.rgq0
    public final void n(CommunityProfileContentItem communityProfileContentItem, ExtendedUserProfile extendedUserProfile) {
        if (extendedUserProfile != null) {
            fpq0 fpq0Var = this.g;
            if (fpq0Var == null) {
                fpq0Var = null;
            }
            fpq0Var.B(new f.e.y0(extendedUserProfile));
        }
    }

    @Override // xsna.wmq0
    public final CommunityProfileContentItem q(CommunityProfileContentItem communityProfileContentItem) {
        return mzt.i((mzt) communityProfileContentItem, null, false, 0, CommunityProfileContentItem.State.RELOAD, CommunityProfileContentItem.State.INITIAL, 688);
    }

    @Override // xsna.wmq0
    public final mzt s(ExtendedUserProfile.m mVar, boolean z, boolean z2) {
        String str = mVar.a;
        String str2 = this.m;
        if (!str.equals(str2)) {
            throw new IllegalArgumentException(("Provide " + mVar + " expected name was " + str2).toString());
        }
        CommunityProfileContentItem.b bVar = new CommunityProfileContentItem.b(R.string.profile_content_gifts_empty_own, Integer.valueOf(R.string.profile_content_gifts_empty_send), null, null, new CommunityProfileContentItem.a(VkButton.Size.Small, VkButton.Mode.Primary, VkButton.Appearance.Accent, false), 12);
        CommunityProfileContentItem.c cVar = new CommunityProfileContentItem.c(R.string.profile_content_gifts_error);
        CommunityProfileContentItem.State state = z ? CommunityProfileContentItem.State.RELOAD : CommunityProfileContentItem.State.INITIAL;
        com.vk.profile.core.tabs.state.a aVar = mVar.c ? new com.vk.profile.core.tabs.state.a(R.string.profile_gifts_fab_send_gift, 0, null) : null;
        com.vk.profile.core.tabs.state.b bVar2 = mVar.d ? new com.vk.profile.core.tabs.state.b(R.string.profile_gifts_fab_go_to_section) : null;
        return new mzt(null, false, 0, null, bVar, cVar, state, (aVar == null && bVar2 == null) ? null : new CommunityProfileContentItem.d(aVar, bVar2, 4), CommunityProfileContentItem.State.INITIAL, mVar.b);
    }

    @Override // xsna.wmq0
    public final String v() {
        return this.m;
    }

    @Override // xsna.wmq0
    public final /* bridge */ /* synthetic */ void w(CommunityProfileContentItem communityProfileContentItem) {
        C((mzt) communityProfileContentItem, true);
    }
}
