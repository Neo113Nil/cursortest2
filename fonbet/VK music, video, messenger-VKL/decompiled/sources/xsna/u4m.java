package xsna;

import android.view.ViewGroup;
import com.vk.core.view.components.cell.VkMiniInfoCell;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: DetailsShortNameItem.kt */
/* loaded from: classes5.dex */
public final class u4m extends we6 {
    public final CharSequence g;
    public final km1 h;
    public int i = 4;
    public int j = 0;
    public final int k;

    /* compiled from: DetailsShortNameItem.kt */
    public static final class a extends vif0<u4m> {
        @Override // xsna.vif0
        public final void i6(u4m u4mVar) {
            VkMiniInfoCell vkMiniInfoCell = (VkMiniInfoCell) this.itemView;
            vkMiniInfoCell.setMode(VkMiniInfoCell.Mode.Link);
            this.itemView.getContext();
            vkMiniInfoCell.setIcon(new VkMiniInfoCell.d(new gko(R.drawable.vk_icon_mention_outline_20), null, 6));
            tlo0.a aVar = tlo0.Companion;
            CharSequence charSequence = u4mVar.g;
            vkMiniInfoCell.setMiddle(new VkMiniInfoCell.e(u11.f(aVar, charSequence), false, false, false, false, null, 62));
            vkMiniInfoCell.setContentDescription(this.itemView.getContext().getString(R.string.user_short_name_accessibility, charSequence));
        }
    }

    public u4m(String str, km1 km1Var) {
        this.g = str;
        this.h = km1Var;
        this.d = cn70.b(12);
        this.k = -1012;
    }

    @Override // xsna.we6
    public final vif0<u4m> a(ViewGroup viewGroup) {
        a aVar = new a(new VkMiniInfoCell(viewGroup.getContext(), null, 6), viewGroup);
        bwt0.i0(aVar.itemView, new o1e(aVar, 13));
        u11.h(-1, -2, aVar.itemView);
        return aVar;
    }

    @Override // xsna.we6
    public final int b() {
        return this.i;
    }

    @Override // xsna.we6
    public final int g() {
        return this.j;
    }

    @Override // xsna.we6
    public final int h() {
        return this.k;
    }

    @Override // xsna.we6
    public final void i(int i) {
        this.i = i;
    }

    @Override // xsna.we6
    public final void j(int i) {
        this.j = i;
    }
}
