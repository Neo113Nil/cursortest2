package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.util.Size;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vkontakte.android.R;
import xsna.k1u0;
import xsna.tlo0;

/* compiled from: VkVideoBottomPromoView.kt */
/* loaded from: classes3.dex */
public final class hzv0 {
    public static void a(FrameLayout frameLayout, h0w0 h0w0Var, wzs wzsVar, gzs gzsVar) {
        dhr0 dhr0Var = dhr0.a;
        Context context = frameLayout.getContext();
        dhr0Var.getClass();
        VkCell vkCell = new VkCell(dhr0.t(context), null, 6, 0);
        vkCell.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        vkCell.setMiddle(VkCell.Middle.a.a(VkCell.Middle.Companion, new VkCell.Middle.e(oq.d(tlo0.Companion, h0w0Var.d().a), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), null, null, 14));
        vkCell.setRight(VkCell.Right.c.a(VkCell.Right.Companion, new VkCell.Right.a.b(h0w0Var.d().e ? new tlo0.h(h0w0Var.d().c) : new tlo0.h(h0w0Var.d().b), new q2m0(9, wzsVar, h0w0Var), VkButton.Appearance.Accent, null, null, null, null, null, IronSourceError.ERROR_INIT_ALREADY_FINISHED), new VkCell.Right.e.b((dko) new gko(R.drawable.vk_icon_cancel_outline_24), (k1u0) new k1u0.a(new x7g(R.attr.vk_ui_icon_primary)), (Size) null, (tlo0) null, false, gzsVar, 28), null, null, 28));
        frameLayout.addView(vkCell);
    }
}
