package xsna;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.VkCell;
import com.vkontakte.android.R;
import xsna.tlo0;
import xsna.u7b;

/* compiled from: ChannelPayoutBankCardItemViewHolder.kt */
/* loaded from: classes16.dex */
public final class p7b extends vfz<u7b.a> {
    public final VkCell l;

    public p7b(VkCell vkCell) {
        super(vkCell);
        this.l = vkCell;
        vkCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        vkCell.setLeft(new VkCell.Left.b(new VkCell.Left.Main.c(R.drawable.vk_icon_payment_card_outline_28, VkCell.Left.Main.Size.Medium, (k1u0) null, (tlo0.h) null, 12), null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(u7b.a aVar) {
        VkCell.Middle.d dVar = null;
        VkCell.Middle.c cVar = null;
        Object[] objArr = 0 == true ? 1 : 0;
        this.l.setMiddle(new VkCell.Middle.b(new VkCell.Middle.e(oq.d(tlo0.Companion, aVar.b), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), dVar, cVar, (VkCell.Middle.Size) objArr, 14));
    }
}
