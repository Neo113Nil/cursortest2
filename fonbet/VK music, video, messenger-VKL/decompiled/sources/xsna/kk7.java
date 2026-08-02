package xsna;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.stickers.bonus.StickerStockItemDiscount;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vkontakte.android.R;
import xsna.k1u0;
import xsna.nl7;
import xsna.tlo0;

/* compiled from: BonusCatalogRewardHolderDs.kt */
/* loaded from: classes5.dex */
public final class kk7 extends qf6 {
    public final ViewGroup l;
    public final BonusCatalogFragment m;
    public final VkCell n;

    public kk7(ViewGroup viewGroup, BonusCatalogFragment bonusCatalogFragment) {
        super(viewGroup, R.layout.stickers_bonus_catalog_reward_item_ds, 1);
        this.l = viewGroup;
        this.m = bonusCatalogFragment;
        VkCell vkCell = (VkCell) this.itemView.findViewById(R.id.bonus_reward_cell);
        this.n = vkCell;
        vkCell.setLeftMainPictureController(new nl7.b(cn70.a() * 12.0f, cn70.a() * 0.33f));
        vkCell.setBackground(null);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(hfz hfzVar) {
        lk7 lk7Var = (lk7) hfzVar;
        StickerStockItemDiscount stickerStockItemDiscount = lk7Var.c;
        ImageList imageList = stickerStockItemDiscount.c;
        VkCell.Left.b bVar = new VkCell.Left.b(new VkCell.Left.Main.d(new nl7.a(imageList != null ? imageList.Hb(VkCell.Left.Main.Size.Medium.k(this.itemView.getContext())) : null, false), VkCell.Left.Main.Size.Medium), null);
        VkCell vkCell = this.n;
        vkCell.setLeft(bVar);
        tlo0.h d = oq.d(tlo0.Companion, stickerStockItemDiscount.b);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        VkCell.Middle.e eVar = new VkCell.Middle.e(d, 1, truncateAt, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50);
        String str = stickerStockItemDiscount.d;
        if (str == null) {
            str = "";
        }
        vkCell.setMiddle(new VkCell.Middle.b(eVar, new VkCell.Middle.d(new tlo0.h(str), (gzs) null, 1, truncateAt, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 50), (VkCell.Middle.c) null, (VkCell.Middle.Size) null, 12));
        vkCell.setRight(new VkCell.Right.d((VkCell.Right.a) null, (VkCell.Right.e) null, (VkCell.Right.ExtraAction.a) null, new VkCell.Right.b(new com.vk.libvideo.b(5, this, lk7Var), (tlo0.f) null, new k1u0.a(new x7g(R.attr.vk_ui_icon_tertiary)), 2), 23));
        f4m.a(this.l, new ks2(4, lk7Var, this));
        bwt0.i0(this.itemView, new com.vk.libvideo.design.view.video.a(2, this, lk7Var));
    }
}
