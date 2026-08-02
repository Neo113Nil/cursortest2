package xsna;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.VkCell;
import com.vkontakte.android.R;
import xsna.k1u0;
import xsna.tlo0;

/* compiled from: DetailsUserCategoryItem.kt */
/* loaded from: classes5.dex */
public final class y4m extends we6 {
    public final int g;
    public final String h;
    public final String i;
    public final String j;
    public Runnable k;
    public final int l;
    public final Integer m;
    public final int n;

    /* compiled from: DetailsUserCategoryItem.kt */
    public static final class a extends vif0<y4m> {
        @Override // xsna.vif0
        public final void i6(y4m y4mVar) {
            y4m y4mVar2 = y4mVar;
            VkCell vkCell = (VkCell) this.itemView;
            vkCell.setMiddle(VkCell.Middle.a.a(VkCell.Middle.Companion, new VkCell.Middle.e(oq.d(tlo0.Companion, y4mVar2.h), 1, TextUtils.TruncateAt.END, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), null, null, 14));
            VkCell.Left.a aVar = VkCell.Left.Companion;
            int i = y4mVar2.g;
            VkCell.Left.Main.Size size = VkCell.Left.Main.Size.Medium;
            int i2 = y4mVar2.l;
            k1u0 aVar2 = i2 != 0 ? new k1u0.a(new x7g(i2)) : k1u0.b.a;
            Integer num = y4mVar2.m;
            vkCell.setLeft(VkCell.Left.a.a(aVar, new VkCell.Left.Main.c(i, size, aVar2, num != null ? new tlo0.f(num.intValue()) : null)));
            String str = y4mVar2.i;
            vkCell.setRight(str != null ? VkCell.Right.c.a(VkCell.Right.Companion, new VkCell.Right.a.e(new tlo0.h(str), new tlo0.h(str)), null, null, null, 30) : null);
            this.itemView.setEnabled(y4mVar2.k != null);
            vkCell.setTag(y4mVar2.j);
        }
    }

    public y4m(int i, String str, String str2, String str3, Runnable runnable, Integer num, int i2) {
        str2 = (i2 & 4) != 0 ? null : str2;
        str3 = (i2 & 8) != 0 ? null : str3;
        int i3 = (i2 & 32) != 0 ? 0 : R.attr.vk_ui_vkontakte_color_icon_outline_secondary;
        num = (i2 & 64) != 0 ? null : num;
        this.g = i;
        this.h = str;
        this.i = str2;
        this.j = str3;
        this.k = runnable;
        this.l = i3;
        this.m = num;
        this.n = -1003;
    }

    @Override // xsna.we6
    public final vif0<y4m> a(ViewGroup viewGroup) {
        a aVar = new a(new VkCell(viewGroup.getContext(), null, 6, 0), viewGroup);
        aVar.itemView.setOnClickListener(new og(aVar, 1));
        u11.h(-1, -2, aVar.itemView);
        return aVar;
    }

    @Override // xsna.we6
    public final int h() {
        return this.n;
    }
}
