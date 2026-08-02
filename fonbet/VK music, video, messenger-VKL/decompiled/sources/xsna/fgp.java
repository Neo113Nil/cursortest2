package xsna;

import android.view.View;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vkontakte.android.R;

/* compiled from: EmptyListItemViewHolder.kt */
/* loaded from: classes16.dex */
public final class fgp extends vfz<cgp> {
    public final VkPlaceholder l;

    public fgp(View view) {
        super(view);
        this.l = (VkPlaceholder) view.findViewById(R.id.vkim_channel_empty_list);
    }

    @Override // xsna.vfz
    public final void W5(cgp cgpVar) {
        VkPlaceholder.c.b bVar = new VkPlaceholder.c.b(new gko(R.drawable.vk_icon_message_missing_outline_56), new x7g(R.attr.vk_ui_icon_secondary), null, 12);
        VkPlaceholder vkPlaceholder = this.l;
        vkPlaceholder.setTop(bVar);
        vkPlaceholder.setMiddle(new VkPlaceholder.b(null, new VkPlaceholder.b.C0859b(14, tq.h(tlo0.Companion, R.string.vkim_channels_no_channels_teaser)), 1));
    }
}
