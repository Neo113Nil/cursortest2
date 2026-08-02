package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.masks.Mask;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.k1u0;
import xsna.lz5;
import xsna.tlo0;

/* compiled from: ClipDialogHelper.kt */
/* loaded from: classes17.dex */
public final class lqc extends s770 {
    public final /* synthetic */ boolean c;

    public lqc(boolean z) {
        this.c = z;
    }

    @Override // xsna.s770
    public final void m(hkp hkpVar, Object obj, int i) {
        Mask mask = (Mask) obj;
        VkCell vkCell = (VkCell) hkpVar.f(R.id.clips_modal_bottom_sheet_cell);
        Context context = vkCell.getContext();
        tlo0.a aVar = tlo0.Companion;
        String str = mask.g;
        if (str == null) {
            str = "";
        }
        tlo0.h d = oq.d(aVar, str);
        SpannableStringBuilder h = fz5.h(mask, context);
        vkCell.setMiddle(new VkCell.Middle.b(new VkCell.Middle.e(d, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), myc0.f(h) ? new VkCell.Middle.d(new tlo0.h(h), (gzs) null, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62) : null, (VkCell.Middle.c) null, (VkCell.Middle.Size) null, 12));
        int i2 = mask.u ? R.drawable.vk_icon_stars_outline_28 : R.drawable.vk_icon_masks_outline_28;
        e3m.a aVar2 = e3m.a;
        Drawable a = m33.a(i2, context);
        if (a != null) {
            a.setTint(e3m.f(R.attr.vk_ui_icon_secondary, context));
        } else {
            a = null;
        }
        hny hnyVar = new hny(context);
        hnyVar.a(e3m.a(R.dimen.clips_additions_bottomsheet_preview_corner_radius, context), R.color.vk_gray_850);
        hnyVar.b(a);
        vkCell.setLeftMainPictureController(new mz5(hnyVar));
        vkCell.setLeft(new VkCell.Left.b(new VkCell.Left.Main.d(new lz5.a(mask.l), VkCell.Left.Main.Size.Medium), null));
    }

    @Override // xsna.s770
    public final hkp p(View view) {
        VkCell vkCell = (VkCell) view.findViewById(R.id.clips_modal_bottom_sheet_cell);
        if (this.c) {
            vkCell.setRight(new VkCell.Right.d((VkCell.Right.a) null, (VkCell.Right.e) null, (VkCell.Right.ExtraAction.a) null, new VkCell.Right.b((izs) null, (tlo0.f) null, (k1u0.a) null, 7), 23));
        } else {
            vkCell.setFocusable(false);
            vkCell.setClickable(false);
        }
        hkp hkpVar = new hkp(7);
        hkpVar.e(vkCell);
        return hkpVar;
    }
}
