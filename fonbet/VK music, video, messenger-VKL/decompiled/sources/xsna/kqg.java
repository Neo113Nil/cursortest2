package xsna;

import android.view.ViewGroup;
import com.vk.core.view.components.cell.VkMiniInfoCell;
import com.vkontakte.android.R;

/* compiled from: CommunityAddDescriptionItem.kt */
/* loaded from: classes5.dex */
public final class kqg extends we6 {
    public final int g;
    public final com.vk.movika.sdk.base.ui.i h;
    public final int i = -242;

    /* compiled from: CommunityAddDescriptionItem.kt */
    public final class a extends vif0<kqg> {
        public final VkMiniInfoCell n;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(ViewGroup viewGroup) {
            super(r0, viewGroup);
            VkMiniInfoCell vkMiniInfoCell = new VkMiniInfoCell(viewGroup.getContext(), null, 6);
            vkMiniInfoCell.setId(R.id.vk_community_add_description_info_item);
            vkMiniInfoCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            vkMiniInfoCell.setBackgroundColor(krv0.m(R.attr.vk_ui_background_content, vkMiniInfoCell.getContext()));
            VkMiniInfoCell vkMiniInfoCell2 = (VkMiniInfoCell) this.itemView;
            this.n = vkMiniInfoCell2;
            vkMiniInfoCell2.setMode(VkMiniInfoCell.Mode.Link);
            vkMiniInfoCell2.setDecorator(new jqg(true));
        }

        @Override // xsna.vif0
        public final void i6(kqg kqgVar) {
            kqg kqgVar2 = kqgVar;
            int i = kqgVar2 != null ? kqgVar2.g : 0;
            VkMiniInfoCell vkMiniInfoCell = this.n;
            f4m.y(i, vkMiniInfoCell);
            jjc.f(kqgVar2 != null ? new i1(kqgVar2, 5) : null, vkMiniInfoCell);
            vkMiniInfoCell.setIcon(new VkMiniInfoCell.d(new gko(R.drawable.vk_icon_write_square_outline_28), null, 6));
            vkMiniInfoCell.setMiddle(new VkMiniInfoCell.e(tq.h(tlo0.Companion, R.string.community_add_description_header_item), false, false, false, false, null, 62));
        }
    }

    public kqg(int i, com.vk.movika.sdk.base.ui.i iVar) {
        this.g = i;
        this.h = iVar;
    }

    @Override // xsna.we6
    public final vif0<? extends we6> a(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    @Override // xsna.we6
    public final int h() {
        return this.i;
    }
}
