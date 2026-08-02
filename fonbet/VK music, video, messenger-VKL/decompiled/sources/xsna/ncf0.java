package xsna;

import android.view.ViewGroup;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vkontakte.android.R;

/* compiled from: RecommendedChannelItemAdapterDelegate.kt */
/* loaded from: classes16.dex */
public final class ncf0 extends p1u0<mcf0> {
    public final com.vk.channels.impl.list.f a;
    public final com.vk.im.ui.formatters.spans.dialogitem.a b;

    public ncf0(com.vk.channels.impl.list.f fVar, com.vk.im.ui.formatters.spans.dialogitem.a aVar) {
        this.a = fVar;
        this.b = aVar;
    }

    @Override // xsna.p1u0
    public final vfz<? extends mcf0> b(ViewGroup viewGroup) {
        return new ocf0((VkRichCell) bwt0.I(R.layout.vkapp_suggested_channels_list_item, viewGroup, false), this.a, this.b);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof mcf0;
    }
}
