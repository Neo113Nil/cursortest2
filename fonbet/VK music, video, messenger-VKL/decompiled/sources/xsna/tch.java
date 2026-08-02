package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.VkMiniInfoCell;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.profile.Address;
import com.vkontakte.android.R;

/* compiled from: CommunityPlaceItem.kt */
/* loaded from: classes5.dex */
public final class tch extends we6 {
    public final uch g;
    public final wzs<Address, Boolean, s3q0> h;
    public final int i = -209;

    /* compiled from: CommunityPlaceItem.kt */
    public static final class a extends vif0<tch> {
        public final VkMiniInfoCell n;
        public final VkText o;

        public a(ViewGroup viewGroup) {
            super(viewGroup, R.layout.item_community_place, 0);
            this.n = (VkMiniInfoCell) this.itemView.findViewById(R.id.place_info);
            this.o = (VkText) this.itemView.findViewById(R.id.all_places_button);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x00a1  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0076  */
        @Override // xsna.vif0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void i6(tch tchVar) {
            View.OnClickListener schVar;
            VkText vkText;
            tch tchVar2 = tchVar;
            uch uchVar = tchVar2.g;
            String str = uchVar.c;
            int i = uchVar.i;
            if (str != null) {
                Address address = uchVar.d;
                if (address != null) {
                    schVar = new amg(1, tchVar2, address);
                } else if (myc0.f(uchVar.e) && uchVar.f != -9000.0d) {
                    schVar = new sch(0, tchVar2, new Address(uchVar.h, uchVar.e, uchVar.f, uchVar.g));
                }
                View view = this.itemView;
                bwt0.h0(schVar, view);
                view.setForeground(schVar == null ? e3m.e(R.attr.selectableItemBackground, view.getContext()) : null);
                VkMiniInfoCell.Mode mode = VkMiniInfoCell.Mode.BaseAccent;
                VkMiniInfoCell vkMiniInfoCell = this.n;
                vkMiniInfoCell.setMode(mode);
                vkMiniInfoCell.setBackground(null);
                vkMiniInfoCell.setIcon(new VkMiniInfoCell.d(new gko(R.drawable.vk_icon_place_outline_20), null, 6));
                String str2 = uchVar.b;
                vkMiniInfoCell.setMiddle(str2 == null ? new VkMiniInfoCell.e(oq.d(tlo0.Companion, str2), false, false, false, false, null, 62) : null);
                int i2 = (schVar != null || i <= 1) ? 8 : 0;
                vkText = this.o;
                vkText.setVisibility(i2);
                if (vkText.getVisibility() == 0) {
                    vkText.setOnClickListener(null);
                    return;
                } else {
                    bwt0.h0(schVar, vkText);
                    vkText.setText(vkText.getContext().getString(R.string.community_all_addresses_count, Integer.valueOf(i)));
                    return;
                }
            }
            schVar = null;
            View view2 = this.itemView;
            bwt0.h0(schVar, view2);
            view2.setForeground(schVar == null ? e3m.e(R.attr.selectableItemBackground, view2.getContext()) : null);
            VkMiniInfoCell.Mode mode2 = VkMiniInfoCell.Mode.BaseAccent;
            VkMiniInfoCell vkMiniInfoCell2 = this.n;
            vkMiniInfoCell2.setMode(mode2);
            vkMiniInfoCell2.setBackground(null);
            vkMiniInfoCell2.setIcon(new VkMiniInfoCell.d(new gko(R.drawable.vk_icon_place_outline_20), null, 6));
            String str22 = uchVar.b;
            vkMiniInfoCell2.setMiddle(str22 == null ? new VkMiniInfoCell.e(oq.d(tlo0.Companion, str22), false, false, false, false, null, 62) : null);
            if (schVar != null) {
            }
            vkText = this.o;
            vkText.setVisibility(i2);
            if (vkText.getVisibility() == 0) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public tch(uch uchVar, wzs<? super Address, ? super Boolean, s3q0> wzsVar) {
        this.g = uchVar;
        this.h = wzsVar;
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
