package xsna;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.VkCell;
import com.vk.voip.ui.call_options.source.list.ItemsFactory$Event;
import com.vkontakte.android.R;
import xsna.k1u0;
import xsna.tlo0;

/* compiled from: CallActionViewTypeDelegate.kt */
/* loaded from: classes7.dex */
public final class e19 extends p1u0<d19> {
    public final x37 a;

    /* compiled from: CallActionViewTypeDelegate.kt */
    public static final class a extends nfz<d19> {
        public final VkCell m;

        public a(VkCell vkCell, x37 x37Var) {
            super(vkCell);
            this.m = vkCell;
            bwt0.i0(vkCell, new td0(4, x37Var, this));
        }

        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(hfz hfzVar) {
            k1u0 aVar;
            d19 d19Var = (d19) hfzVar;
            this.l = d19Var;
            VkCell.Left.a aVar2 = VkCell.Left.Companion;
            int i = d19Var.c;
            VkCell.Left.Main.Size size = VkCell.Left.Main.Size.Small;
            ItemsFactory$Event itemsFactory$Event = d19Var.b;
            ItemsFactory$Event itemsFactory$Event2 = ItemsFactory$Event.MAX;
            VkCell vkCell = this.m;
            if (itemsFactory$Event == itemsFactory$Event2) {
                aVar = k1u0.c.a;
            } else {
                vkCell.getContext();
                aVar = new k1u0.a(new x7g(R.attr.vk_ui_icon_accent));
            }
            vkCell.setLeft(VkCell.Left.a.a(aVar2, new VkCell.Left.Main.c(i, size, aVar, (tlo0.h) null, 8)));
            vkCell.setMiddle(VkCell.Middle.a.a(VkCell.Middle.Companion, new VkCell.Middle.e(tq.h(tlo0.Companion, d19Var.d), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), null, null, 14));
        }
    }

    public e19(x37 x37Var) {
        this.a = x37Var;
    }

    @Override // xsna.p1u0
    public final vfz<? extends d19> b(ViewGroup viewGroup) {
        VkCell vkCell = new VkCell(viewGroup.getContext(), null, 6, 0);
        vkCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new a(vkCell, this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof d19;
    }
}
