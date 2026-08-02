package xsna;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.VkCell;
import com.vkontakte.android.R;
import xsna.gko;
import xsna.k1u0;
import xsna.nwb;

/* compiled from: ChatProfileLabelItemDelegate.kt */
/* loaded from: classes2.dex */
public final class gxb extends p1u0<nwb.i> {

    /* compiled from: ChatProfileLabelItemDelegate.kt */
    public static final class a extends vfz<nwb.i> {
        public final VkCell l;

        public a(VkCell vkCell) {
            super(vkCell);
            this.l = vkCell;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(nwb.i iVar) {
            nwb.i iVar2 = iVar;
            int i = iVar2.c;
            gko.b bVar = gko.Companion;
            x7g x7gVar = new x7g(R.attr.vk_ui_icon_secondary);
            VkCell.Left.b bVar2 = new VkCell.Left.b(new VkCell.Left.Main.c(new gko(i), VkCell.Left.Main.Size.Medium, new k1u0.a(x7gVar), 8), null);
            VkCell vkCell = this.l;
            vkCell.setLeft(bVar2);
            VkCell.Middle.e eVar = null;
            Object[] objArr = 0 == true ? 1 : 0;
            vkCell.setMiddle(new VkCell.Middle.b(eVar, new VkCell.Middle.d(tq.h(tlo0.Companion, iVar2.b), (gzs) null, 2, TextUtils.TruncateAt.END, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 50), (VkCell.Middle.c) objArr, (VkCell.Middle.Size) null, 13));
        }
    }

    @Override // xsna.p1u0
    public final vfz<? extends nwb.i> b(ViewGroup viewGroup) {
        return new a((VkCell) bwt0.I(R.layout.vkim_chat_profile_adapter_label_item, viewGroup, false));
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof nwb.i;
    }
}
