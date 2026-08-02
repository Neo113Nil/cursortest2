package xsna;

import android.text.TextUtils;
import android.util.Size;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.VkCell;
import com.vkontakte.android.R;
import xsna.r2s;
import xsna.tlo0;
import xsna.xzr;

/* compiled from: FolderRecommendationListItemVh.kt */
/* loaded from: classes18.dex */
public final class yzr extends o2s<xzr> {
    public final xzr.a l;
    public final VkCell m;

    public yzr(ViewGroup viewGroup, r2s.a aVar) {
        super(R.layout.vkim_folder_cell_item, viewGroup);
        this.l = aVar;
        VkCell vkCell = (VkCell) this.itemView.findViewById(R.id.vkim_cell);
        this.m = vkCell;
        vkCell.setLeft(VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.c(R.drawable.vk_icon_folder_outline_24, VkCell.Left.Main.Size.Medium, (k1u0) null, (tlo0.h) null, 12)));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(Object obj) {
        xzr xzrVar = (xzr) obj;
        VkCell.Middle.b a = VkCell.Middle.a.a(VkCell.Middle.Companion, new VkCell.Middle.e(u11.f(tlo0.Companion, xzrVar.getName()), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), null, null, 14);
        VkCell vkCell = this.m;
        vkCell.setMiddle(a);
        vkCell.setRight(VkCell.Right.c.a(VkCell.Right.Companion, null, new VkCell.Right.e.b((dko) new gko(R.drawable.vk_icon_add_outline_28), (k1u0) null, (Size) null, (tlo0) null, false, (gzs) new ge0(8, this, xzrVar), 30), null, null, 29));
    }
}
