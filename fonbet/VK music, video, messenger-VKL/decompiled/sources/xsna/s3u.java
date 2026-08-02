package xsna;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.Good;
import com.vk.dto.profile.Address;
import com.vkontakte.android.R;
import java.util.List;
import xsna.k1u0;
import xsna.tlo0;

/* compiled from: GoodAddressHolder.kt */
/* loaded from: classes18.dex */
public final class s3u extends vif0<Good> {
    public final m3a n;
    public final VkCell o;
    public Good p;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s3u(ViewGroup viewGroup, m3a m3aVar) {
        super(r0);
        VkCell vkCell = new VkCell(viewGroup.getContext(), null, 6, 0);
        vkCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.n = m3aVar;
        VkCell vkCell2 = (VkCell) this.itemView;
        this.o = vkCell2;
        vkCell2.setOnClickListener(new la(this, 6));
        vkCell2.setLeft(new VkCell.Left.b(new VkCell.Left.Main.c(R.drawable.vk_icon_place_outline_24, VkCell.Left.Main.Size.Small, new k1u0.a(new x7g(R.attr.vk_ui_icon_tertiary)), (tlo0.h) null, 8), null));
        vkCell2.setRight(new VkCell.Right.d((VkCell.Right.a) null, (VkCell.Right.e) null, (VkCell.Right.ExtraAction.a) (0 == true ? 1 : 0), new VkCell.Right.b((izs) null, (tlo0.f) null, (k1u0.a) null, 7), 23));
    }

    @Override // xsna.vif0
    public final void i6(Good good) {
        Address address;
        Good good2 = good;
        this.p = good2;
        List<Address> list = good2.X;
        if (list == null || (address = (Address) j5g.a0(list)) == null) {
            return;
        }
        int i = good2.Y - 1;
        this.o.setMiddle(new VkCell.Middle.b(new VkCell.Middle.e(oq.d(tlo0.Companion, address.f), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), i > 0 ? new VkCell.Middle.d(tlo0.a.a(R.plurals.address_more_plurals, i, Integer.valueOf(i)), (gzs) null, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62) : null, (VkCell.Middle.c) null, (VkCell.Middle.Size) null, 12));
    }
}
