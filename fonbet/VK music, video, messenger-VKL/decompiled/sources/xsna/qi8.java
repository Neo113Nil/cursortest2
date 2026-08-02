package xsna;

import android.view.ViewGroup;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vkontakte.android.R;
import xsna.nj8;
import xsna.tlo0;

/* compiled from: BroadcastSettingsHeaderViewHolder.kt */
/* loaded from: classes3.dex */
public final class qi8 extends mj8 {
    public final VkGroupHeader m;

    public qi8(ViewGroup viewGroup) {
        super(viewGroup, R.layout.live_broadcast_settings_header_item, 0);
        VkGroupHeader vkGroupHeader = (VkGroupHeader) this.itemView;
        vkGroupHeader.setSize(VkGroupHeader.Size.Medium);
        this.m = vkGroupHeader;
    }

    @Override // xsna.mj8
    /* renamed from: j6, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void h6(nj8.d dVar) {
        VkGroupHeader.d dVar2 = new VkGroupHeader.d(tq.h(tlo0.Companion, dVar.b), null, null, null, 0, 510);
        VkGroupHeader vkGroupHeader = this.m;
        vkGroupHeader.setTitle(dVar2);
        Integer num = dVar.c;
        vkGroupHeader.setSubtitle(num != null ? new VkGroupHeader.c(new tlo0.f(num.intValue()), null, null) : null);
    }
}
