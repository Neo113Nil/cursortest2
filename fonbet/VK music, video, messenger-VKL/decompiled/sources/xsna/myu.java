package xsna;

import com.vk.core.view.components.group.header.VkGroupHeader;
import xsna.b7c0;

/* compiled from: HeaderViewHolder.kt */
/* loaded from: classes16.dex */
public final class myu extends vfz<b7c0.c> {
    public final VkGroupHeader l;

    public myu(VkGroupHeader vkGroupHeader) {
        super(vkGroupHeader);
        this.l = vkGroupHeader;
    }

    @Override // xsna.vfz
    public final void W5(b7c0.c cVar) {
        VkGroupHeader.d dVar = new VkGroupHeader.d(tq.h(tlo0.Companion, cVar.b), null, null, null, 0, 510);
        VkGroupHeader vkGroupHeader = this.l;
        vkGroupHeader.setTitle(dVar);
        vkGroupHeader.setSize(VkGroupHeader.Size.Small);
    }
}
