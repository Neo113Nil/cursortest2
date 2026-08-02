package xsna;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vkontakte.android.R;
import xsna.k1u0;
import xsna.ngv0;

/* compiled from: NameHistoryDetailsItem.kt */
/* loaded from: classes5.dex */
public final class tt50 extends we6 {
    public final CharSequence g;
    public final CharSequence h;
    public final int i;
    public final int j = -1017;

    /* compiled from: NameHistoryDetailsItem.kt */
    public static final class a extends vif0<tt50> {
        public final VkRichCell n;

        public a(VkRichCell vkRichCell, ViewGroup viewGroup) {
            super(vkRichCell, viewGroup);
            this.n = vkRichCell;
        }

        @Override // xsna.vif0
        public final void i6(tt50 tt50Var) {
            tt50 tt50Var2 = tt50Var;
            int i = tt50Var2.i;
            CharSequence charSequence = tt50Var2.g;
            vgv0 vgv0Var = charSequence != null ? new vgv0(u11.f(tlo0.Companion, charSequence), (ngv0.a) null, (ngv0) null, 0, 30) : null;
            CharSequence charSequence2 = tt50Var2.h;
            pgv0 v = ahn.v(vgv0Var, null, charSequence2 != null ? new qgv0(u11.f(tlo0.Companion, charSequence2), (ngv0.a) null, (ngv0.a) null, 0, 30) : null, null, null, null, null, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE);
            VkRichCell vkRichCell = this.n;
            vkRichCell.setMiddle(v);
            vkRichCell.setLeft(i != 0 ? VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.c(new gko(i), VkCell.Left.Main.Size.Small, new k1u0.a(new x7g(R.attr.vk_ui_icon_secondary)), 8)) : null);
        }
    }

    public tt50(String str, String str2, int i) {
        this.g = str;
        this.h = str2;
        this.i = i;
    }

    @Override // xsna.we6
    public final vif0 a(ViewGroup viewGroup) {
        VkRichCell vkRichCell = new VkRichCell(viewGroup.getContext(), null, 6, 0);
        vkRichCell.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        return new a(vkRichCell, viewGroup);
    }

    @Override // xsna.we6
    public final int h() {
        return this.j;
    }
}
