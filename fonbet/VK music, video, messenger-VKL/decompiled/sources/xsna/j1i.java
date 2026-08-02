package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;

/* compiled from: CommunityServiceAddressPresenter.kt */
/* loaded from: classes5.dex */
public final class j1i extends vqg {
    public final UserId i;
    public final long j;

    public j1i(UserId userId, long j, CommunityAddressesFragment communityAddressesFragment) {
        super(fkq0.e(userId), communityAddressesFragment);
        this.i = userId;
        this.j = j;
    }

    @Override // xsna.vqg
    public final void c(boolean z) {
        this.g = new ae10(this.i, this.j, this);
        if (!vqg.a() || z) {
            b();
        }
    }
}
