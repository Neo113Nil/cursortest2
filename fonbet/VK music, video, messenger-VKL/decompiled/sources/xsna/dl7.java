package xsna;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.stickers.bonus.StickersBonusHistoryRecord;
import com.vkontakte.android.R;
import xsna.el7;
import xsna.k1u0;
import xsna.ngv0;
import xsna.tlo0;

/* compiled from: BonusHistoryHolderDs.kt */
/* loaded from: classes5.dex */
public final class dl7 extends vfz<fl7> {
    public final VkRichCell l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dl7(ViewGroup viewGroup) {
        super(r0);
        VkRichCell vkRichCell = new VkRichCell(viewGroup.getContext(), null, 6, 0);
        vkRichCell.setId(View.generateViewId());
        vkRichCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        VkRichCell vkRichCell2 = (VkRichCell) this.itemView;
        vkRichCell2.setLeftMainPictureController(new el7.a());
        this.l = vkRichCell2;
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(fl7 fl7Var) {
        tlo0.a aVar = tlo0.Companion;
        StickersBonusHistoryRecord stickersBonusHistoryRecord = fl7Var.b;
        String str = stickersBonusHistoryRecord.f;
        int i = stickersBonusHistoryRecord.c;
        if (str == null) {
            str = "";
        }
        tlo0.h d = oq.d(aVar, str);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        vgv0 vgv0Var = new vgv0(d, (ngv0.a) null, (ngv0) null, 2, 6);
        String str2 = stickersBonusHistoryRecord.g;
        pgv0 pgv0Var = new pgv0(vgv0Var, null, new qgv0(new tlo0.h(str2 != null ? str2 : ""), (ngv0.a) null, (ngv0.a) null, 0, 14), null, null, null, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE);
        VkRichCell vkRichCell = this.l;
        vkRichCell.setMiddle(pgv0Var);
        ImageList imageList = stickersBonusHistoryRecord.h;
        vkRichCell.setLeft(new VkCell.Left.b(new VkCell.Left.Main.d(new el7.b(imageList != null ? imageList.Hb(VkCell.Left.Main.Size.Large.k(this.itemView.getContext())) : null), VkCell.Left.Main.Size.Large), null));
        int i2 = i == 1 ? R.attr.vk_ui_accent_green : R.attr.vk_ui_text_subhead;
        String string = this.itemView.getContext().getString(i == 1 ? R.string.stickers_bonus_history_positive_change : R.string.stickers_bonus_history_negative_change, Integer.valueOf(stickersBonusHistoryRecord.e));
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new ForegroundColorSpan(e3m.f(i2, this.itemView.getContext())), 0, string.length(), 33);
        tlo0.h hVar = new tlo0.h(spannableString);
        vkRichCell.setRight(new VkCell.Right.d(new VkCell.Right.a.e(hVar, hVar), new VkCell.Right.e.b((dko) new gko(R.drawable.vk_icon_sticker_energy_product_16), (k1u0) new k1u0.a(new x7g(i2)), (Size) null, (tlo0) null, false, (gzs) null, 60), (VkCell.Right.ExtraAction.a) null, (VkCell.Right.b) null, 28));
    }
}
