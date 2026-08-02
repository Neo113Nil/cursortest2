package xsna;

import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.newsfeed.FaveTag;
import com.vkontakte.android.R;
import xsna.gsq;
import xsna.k1u0;
import xsna.tlo0;

/* compiled from: FaveTagHolder.kt */
/* loaded from: classes4.dex */
public final class dsq extends vif0<FaveTag> {
    public final izs<FaveTag, s3q0> n;
    public final izs<FaveTag, s3q0> o;
    public final VkCell p;

    public dsq(ViewGroup viewGroup, gsq.b bVar, gsq.d dVar) {
        super(viewGroup, R.layout.fave_tag_holder, 0);
        this.n = bVar;
        this.o = dVar;
        View view = this.itemView;
        VkCell vkCell = (VkCell) view;
        this.p = vkCell;
        bwt0.i0(view, new gmj(this, 10));
        vkCell.setLeft(VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.c(R.drawable.vk_icon_reorder_24, VkCell.Left.Main.Size.Medium, new k1u0.a(new x7g(R.attr.vk_ui_accent_gray)), (tlo0.h) null, 8)));
        vkCell.setRight(VkCell.Right.c.a(VkCell.Right.Companion, null, new VkCell.Right.e.b((dko) new gko(R.drawable.vk_icon_cancel_outline_28), (k1u0) new k1u0.a(new x7g(R.attr.vk_ui_accent_gray)), (Size) null, (tlo0) null, false, (gzs) new mag(this, 20), 28), null, null, 29));
    }

    @Override // xsna.vif0
    public final void i6(FaveTag faveTag) {
        FaveTag faveTag2 = faveTag;
        VkCell.Middle.b bVar = null;
        if (faveTag2 != null) {
            VkCell.Middle.a aVar = VkCell.Middle.Companion;
            tlo0.a aVar2 = tlo0.Companion;
            ucp ucpVar = ucp.a;
            bVar = VkCell.Middle.a.a(aVar, new VkCell.Middle.e(u11.f(aVar2, ucp.i(faveTag2.c)), 1, TextUtils.TruncateAt.END, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), null, null, 14);
        }
        this.p.setMiddle(bVar);
    }
}
