package xsna;

import android.view.ViewGroup;
import com.vk.core.view.components.cell.VkMiniInfoCell;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: StatusInfoItem.kt */
/* loaded from: classes5.dex */
public final class tzk0 extends we6 {
    public final CharSequence g;
    public final int h = -53;
    public int i = 5;

    /* compiled from: StatusInfoItem.kt */
    public static final class a extends vif0<tzk0> {
        @Override // xsna.vif0
        public final void i6(tzk0 tzk0Var) {
            VkMiniInfoCell vkMiniInfoCell = (VkMiniInfoCell) this.itemView;
            vkMiniInfoCell.setMode(VkMiniInfoCell.Mode.BaseAccent);
            tlo0.a aVar = tlo0.Companion;
            CharSequence charSequence = tzk0Var.g;
            vkMiniInfoCell.setMiddle(new VkMiniInfoCell.e(u11.f(aVar, charSequence), true, false, false, false, null, 60));
            vkMiniInfoCell.setIcon(new VkMiniInfoCell.d(new gko(R.drawable.vk_icon_article_outline_20), null, 6));
            vkMiniInfoCell.setContentDescription(this.itemView.getContext().getString(R.string.user_short_info_accessibility, charSequence));
        }
    }

    public tzk0(CharSequence charSequence) {
        this.g = charSequence;
    }

    @Override // xsna.we6
    public final vif0<tzk0> a(ViewGroup viewGroup) {
        VkMiniInfoCell vkMiniInfoCell = new VkMiniInfoCell(viewGroup.getContext(), null, 6);
        vkMiniInfoCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new a(vkMiniInfoCell, viewGroup);
    }

    @Override // xsna.we6
    public final int g() {
        return this.i;
    }

    @Override // xsna.we6
    public final int h() {
        return this.h;
    }

    @Override // xsna.we6
    public final void j(int i) {
        this.i = i;
    }
}
