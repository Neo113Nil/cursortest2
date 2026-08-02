package xsna;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.id.UserId;
import xsna.u7b;

/* compiled from: ChannelPayoutVkPayReceiverItemViewHolder.kt */
/* loaded from: classes16.dex */
public final class i8b extends vfz<u7b.c> {
    public final VkCell l;
    public UserId m;

    public i8b(VkCell vkCell, com.vk.movika.sdk.base.data.a aVar) {
        super(vkCell);
        this.l = vkCell;
        vkCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        bwt0.i0(vkCell, new d05(7, this, aVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(u7b.c cVar) {
        u7b.c cVar2 = cVar;
        this.m = cVar2.b;
        VkCell.Middle.d dVar = null;
        VkCell.Middle.c cVar3 = null;
        Object[] objArr = 0 == true ? 1 : 0;
        VkCell.Middle.b bVar = new VkCell.Middle.b(new VkCell.Middle.e(oq.d(tlo0.Companion, cVar2.c), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), dVar, cVar3, (VkCell.Middle.Size) objArr, 14);
        VkCell vkCell = this.l;
        vkCell.setMiddle(bVar);
        vkCell.setRight(new VkCell.Right.d((VkCell.Right.a) null, (VkCell.Right.e) (0 == true ? 1 : 0), new VkCell.Right.ExtraAction.a(6, null, cVar2.d), (VkCell.Right.b) null, 27));
    }
}
