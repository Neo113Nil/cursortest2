package xsna;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.VkCell;
import com.vkontakte.android.R;
import xsna.k1u0;
import xsna.tlo0;
import xsna.u7b;

/* compiled from: ChannelPayoutMeWithoutVkPayItemViewHolder.kt */
/* loaded from: classes16.dex */
public final class w7b extends vfz<u7b.b> {
    public final VkCell l;

    public w7b(VkCell vkCell, com.vk.movika.sdk.base.data.a aVar) {
        super(vkCell);
        this.l = vkCell;
        vkCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        tlo0.f h = tq.h(tlo0.Companion, R.string.vkim_channels_payout_me_without_vk_pay);
        vkCell.setRight(new VkCell.Right.d(new VkCell.Right.a.e(h, h), (VkCell.Right.e) null, (VkCell.Right.ExtraAction.a) null, new VkCell.Right.b((izs) null, (tlo0.f) null, (k1u0.a) null, 7), 22));
        bwt0.i0(vkCell, new v7b(aVar, 0));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(u7b.b bVar) {
        this.l.setMiddle(new VkCell.Middle.b(new VkCell.Middle.e(oq.d(tlo0.Companion, bVar.b), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), (VkCell.Middle.d) null, (VkCell.Middle.c) null, (VkCell.Middle.Size) null, 14));
    }
}
