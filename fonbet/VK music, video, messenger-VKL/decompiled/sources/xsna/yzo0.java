package xsna;

import android.view.ViewGroup;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vkontakte.android.R;

/* compiled from: TitleVh.kt */
/* loaded from: classes18.dex */
public final class yzo0 extends o2s<ozo0> {
    public final VkGroupHeader l;

    public yzo0(ViewGroup viewGroup) {
        super(R.layout.vkim_folders_show_list_title_vh, viewGroup);
        VkGroupHeader vkGroupHeader = (VkGroupHeader) this.itemView.findViewById(R.id.vkim_group_header);
        this.l = vkGroupHeader;
        vkGroupHeader.setShowTopDivider(true);
    }

    @Override // xsna.vfz
    public final void W5(Object obj) {
        this.l.setTitle(new VkGroupHeader.d(tq.h(tlo0.Companion, ((ozo0) obj).b), null, null, null, 0, 510));
    }
}
