package xsna;

import android.view.View;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vkontakte.android.R;

/* compiled from: SimpleHeaderViewHolder.kt */
/* loaded from: classes16.dex */
public final class wqj0 extends vfz<vqj0> {
    public final VkGroupHeader l;

    public wqj0(View view) {
        super(view);
        this.l = (VkGroupHeader) view.findViewById(R.id.suggested_channels_header);
    }

    @Override // xsna.vfz
    public final void W5(vqj0 vqj0Var) {
        VkGroupHeader.d dVar = new VkGroupHeader.d(vqj0Var.b, null, null, null, 0, null, 510);
        VkGroupHeader vkGroupHeader = this.l;
        vkGroupHeader.setTitle(dVar);
        vkGroupHeader.setSize(VkGroupHeader.Size.Small);
    }
}
