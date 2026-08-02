package xsna;

import android.view.ViewGroup;
import com.vk.core.view.components.cell.VkMiniInfoCell;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;

/* compiled from: CommunityAddContactsItem.kt */
/* loaded from: classes5.dex */
public final class ypg extends we6 {
    public final int g;
    public final UserId h;
    public final ExtendedCommunityProfile.c i;
    public final String j;
    public final String k;
    public final String l;
    public final s3h m;
    public final int n = -243;

    /* compiled from: CommunityAddContactsItem.kt */
    public final class a extends vif0<ypg> {
        public final VkMiniInfoCell n;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(ViewGroup viewGroup) {
            super(r0, viewGroup);
            VkMiniInfoCell vkMiniInfoCell = new VkMiniInfoCell(viewGroup.getContext(), null, 6);
            vkMiniInfoCell.setId(R.id.vk_community_add_contacts_info_item);
            vkMiniInfoCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            vkMiniInfoCell.setBackgroundColor(krv0.m(R.attr.vk_ui_background_content, vkMiniInfoCell.getContext()));
            VkMiniInfoCell vkMiniInfoCell2 = (VkMiniInfoCell) this.itemView;
            this.n = vkMiniInfoCell2;
            vkMiniInfoCell2.setMode(VkMiniInfoCell.Mode.Link);
            vkMiniInfoCell2.setDecorator(new xpg(true));
        }

        @Override // xsna.vif0
        public final void i6(ypg ypgVar) {
            ypg ypgVar2 = ypgVar;
            if (ypgVar2 == null) {
                return;
            }
            f4m.y(ypgVar2.g, this.itemView);
            jjc.g(this.itemView, new com.vk.movika.sdk.base.observable.p(ypgVar2, 28));
            VkMiniInfoCell.d dVar = new VkMiniInfoCell.d(new gko(R.drawable.vk_icon_write_square_outline_28), null, 6);
            VkMiniInfoCell vkMiniInfoCell = this.n;
            vkMiniInfoCell.setIcon(dVar);
            vkMiniInfoCell.setMiddle(new VkMiniInfoCell.e(tq.h(tlo0.Companion, R.string.community_add_contacts_header_item), false, false, false, false, null, 62));
        }
    }

    public ypg(int i, UserId userId, ExtendedCommunityProfile.c cVar, String str, String str2, String str3, s3h s3hVar) {
        this.g = i;
        this.h = userId;
        this.i = cVar;
        this.j = str;
        this.k = str2;
        this.l = str3;
        this.m = s3hVar;
    }

    @Override // xsna.we6
    public final vif0<? extends we6> a(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    @Override // xsna.we6
    public final int h() {
        return this.n;
    }
}
