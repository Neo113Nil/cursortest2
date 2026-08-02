package xsna;

import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.Good;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.market.VariantGroup;
import com.vkontakte.android.R;
import java.util.List;
import xsna.k1u0;
import xsna.tlo0;

/* compiled from: MarketEditAlbumGoodVh.kt */
/* loaded from: classes18.dex */
public final class sx00 extends vif0<Good> {
    public final izs<Good, s3q0> n;
    public final VkCell o;
    public Good p;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public sx00(ViewGroup viewGroup, izs<? super Good, s3q0> izsVar) {
        super(r0);
        VkCell vkCell = new VkCell(viewGroup.getContext(), null, 6, 0);
        vkCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        vkCell.setLeftMainPictureController(new xw00());
        int b0 = dhr0.b0(R.attr.selectableItemBackground);
        qcy<Object>[] qcyVarArr = bwt0.a;
        dhr0.h0(b0, vkCell);
        this.n = izsVar;
        View view = this.itemView;
        this.o = (VkCell) view;
        view.setOnClickListener(new ybq(this, 1));
    }

    @Override // xsna.vif0
    public final void i6(Good good) {
        q6(good, false, true);
    }

    public final void q6(Good good, boolean z, boolean z2) {
        tlo0 a;
        this.p = good;
        if (z2) {
            a = oq.d(tlo0.Companion, good.h.e);
        } else {
            int size = good.u.size();
            tlo0.a aVar = tlo0.Companion;
            Object[] objArr = {Integer.valueOf(size)};
            aVar.getClass();
            a = tlo0.a.a(R.plurals.goods_count, size, objArr);
        }
        tlo0 tlo0Var = a;
        VkCell vkCell = this.o;
        vkCell.setSelected(z);
        VkCell.Left.a aVar2 = VkCell.Left.Companion;
        Image image = good.n;
        ImageSize imageSize = (ImageSize) ixj0.c(image != null ? image.b : null, cn70.b(72), cn70.b(72));
        String str = imageSize != null ? imageSize.d.d : null;
        if (str == null) {
            str = "";
        }
        vkCell.setLeft(VkCell.Left.a.a(aVar2, new VkCell.Left.Main.d(new yw00(str, z), VkCell.Left.Main.Size.Large)));
        VkCell.Middle.e eVar = new VkCell.Middle.e(oq.d(tlo0.Companion, good.d), 2, TextUtils.TruncateAt.END, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50);
        VkCell.Middle.d dVar = new VkCell.Middle.d(tlo0Var, (gzs) null, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62);
        Good good2 = this.p;
        if (good2 == null) {
            good2 = null;
        }
        List<VariantGroup> list = good2.z;
        String g0 = list != null ? j5g.g0(list, " · ", null, null, 0, new gt(28), 30) : null;
        vkCell.setMiddle(new VkCell.Middle.b(eVar, dVar, g0 != null ? new VkCell.Middle.c(new tlo0.h(g0), null, 0, 14) : null, (VkCell.Middle.Size) null, 8));
        vkCell.setRight(z2 ? null : new VkCell.Right.d((VkCell.Right.a) null, new VkCell.Right.e.b((dko) new gko(R.drawable.vk_icon_chevron_right_24), (k1u0) new k1u0.a(new x7g(R.attr.vk_ui_icon_secondary)), (Size) null, (tlo0) null, false, (gzs) null, 60), (VkCell.Right.ExtraAction.a) null, (VkCell.Right.b) null, 29));
    }
}
