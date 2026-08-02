package xsna;

import android.view.ViewGroup;
import com.vk.channels.impl.list.item.SuggestHeaderItem;
import com.vkontakte.android.R;

/* compiled from: SuggestHeaderAdapterDelegate.kt */
/* loaded from: classes16.dex */
public final class a3n0 extends p1u0<SuggestHeaderItem> {
    public final com.vk.channels.impl.list.f a;

    public a3n0(com.vk.channels.impl.list.f fVar) {
        this.a = fVar;
    }

    @Override // xsna.p1u0
    public final vfz<? extends SuggestHeaderItem> b(ViewGroup viewGroup) {
        return new c3n0(bwt0.I(R.layout.vkapp_channels_simple_header_item, viewGroup, false), this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof SuggestHeaderItem;
    }
}
