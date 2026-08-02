package xsna;

import android.view.ViewGroup;
import com.vkontakte.android.R;

/* compiled from: RecommendedChannelHeaderItemAdapterDelegate.kt */
/* loaded from: classes16.dex */
public final class gcf0 extends p1u0<fcf0> {
    public final com.vk.channels.impl.list.f a;

    public gcf0(com.vk.channels.impl.list.f fVar) {
        this.a = fVar;
    }

    @Override // xsna.p1u0
    public final vfz<? extends fcf0> b(ViewGroup viewGroup) {
        return new icf0(bwt0.I(R.layout.im_channels_recommendations_header_item, viewGroup, false), this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof fcf0;
    }
}
