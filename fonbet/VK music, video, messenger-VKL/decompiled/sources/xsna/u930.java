package xsna;

import android.view.ViewGroup;
import com.vkontakte.android.R;

/* compiled from: MoreSuggestsAdapterDelegate.kt */
/* loaded from: classes16.dex */
public final class u930 extends p1u0<v930> {
    public final com.vk.channels.impl.list.f a;

    public u930(com.vk.channels.impl.list.f fVar) {
        this.a = fVar;
    }

    @Override // xsna.p1u0
    public final vfz<? extends v930> b(ViewGroup viewGroup) {
        return new w930(bwt0.I(R.layout.im_channels_show_more_suggests_item, viewGroup, false), this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof v930;
    }
}
