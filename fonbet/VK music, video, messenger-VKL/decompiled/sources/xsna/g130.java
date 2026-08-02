package xsna;

import android.view.ViewGroup;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.newsfeed.impl.postmodal.reactions.donut.ModalPostDonutFragment;
import com.vkontakte.android.R;
import java.util.Locale;
import xsna.gko;
import xsna.tlo0;

/* compiled from: ModalPostDonutSumViewHolder.kt */
/* loaded from: classes4.dex */
public final class g130 extends vif0<v6n0> {
    public final a130 n;
    public final VkGroupHeader o;

    public g130(ViewGroup viewGroup, ModalPostDonutFragment.b bVar) {
        super(new VkGroupHeader(viewGroup.getContext(), null, 6), viewGroup);
        this.n = bVar;
        this.o = (VkGroupHeader) this.itemView;
    }

    @Override // xsna.vif0
    public final void i6(v6n0 v6n0Var) {
        VkGroupHeader.Size size = VkGroupHeader.Size.Small;
        VkGroupHeader vkGroupHeader = this.o;
        vkGroupHeader.setSize(size);
        vkGroupHeader.setTitle(new VkGroupHeader.d(oq.d(tlo0.Companion, this.itemView.getContext().getString(R.string.modal_post_donut_sum, Integer.valueOf(v6n0Var.b)).toUpperCase(Locale.ROOT)), null, null, null, 0, 510));
        gko.b bVar = gko.Companion;
        tlo0.h hVar = new tlo0.h(this.itemView.getContext().getString(R.string.modal_post_donut_info_icon_description));
        vkGroupHeader.setRight(new VkGroupHeader.Right(null, new VkGroupHeader.Right.b(new gko(R.drawable.vk_icon_help_outline_24), new x7g(R.attr.vk_ui_icon_secondary), hVar, new gbj(this, 26)), null, 5));
    }
}
