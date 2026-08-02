package xsna;

import android.os.Bundle;
import com.vk.channels.impl.list.ChannelsListFragment;
import com.vkontakte.android.R;

/* compiled from: ChannelsOnboardingBannerComponent.kt */
/* loaded from: classes4.dex */
public final class lhb extends yj50<mhb, rhb, phb, qhb, Object, nhb, ohb> {
    public final ChannelsListFragment n;
    public final tyx o;
    public final boolean p;

    public lhb(ChannelsListFragment channelsListFragment, tyx tyxVar) {
        super(channelsListFragment, channelsListFragment, phb.class, false);
        this.n = channelsListFragment;
        this.o = tyxVar;
        this.p = o25.c(o25.a());
    }

    @Override // xsna.yj50
    public final mhb a(Bundle bundle) {
        return new mhb(rhb.a);
    }

    @Override // xsna.yj50
    public final ohb b() {
        return new ohb(this.n.requireContext(), this.o);
    }

    @Override // xsna.yj50
    public final qhb d() {
        return new qhb(this.p ? R.layout.vkim_communities_in_vkme_onboarding_bar : R.layout.vkim_channel_onboarding_bar, null);
    }
}
