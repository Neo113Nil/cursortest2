package xsna;

import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;
import xsna.oj00;

/* compiled from: CommunityAddressesFragment.kt */
/* loaded from: classes5.dex */
public final class jrg implements oj00.a {
    public final /* synthetic */ CommunityAddressesFragment a;

    public jrg(CommunityAddressesFragment communityAddressesFragment) {
        this.a = communityAddressesFragment;
    }

    @Override // xsna.oj00.a
    public final void onCancel() {
        CommunityAddressesFragment communityAddressesFragment = this.a;
        communityAddressesFragment.z0 = false;
        communityAddressesFragment.y0 = 0;
    }

    @Override // xsna.oj00.a
    public final void onFinish() {
        this.a.z0 = false;
    }
}
