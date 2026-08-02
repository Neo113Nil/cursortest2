package xsna;

import android.text.TextUtils;
import com.vk.core.view.components.cell.VkCell;
import com.vkontakte.android.R;
import xsna.gko;
import xsna.k1u0;
import xsna.nwb;
import xsna.oxb;
import xsna.tlo0;

/* compiled from: SimpleItemHolderV2.kt */
/* loaded from: classes2.dex */
public final class crj0 extends vfz<nwb.k> {
    public final VkCell l;
    public final oxb.a.InterfaceC3477a m;

    public crj0(VkCell vkCell, oxb.a.InterfaceC3477a interfaceC3477a) {
        super(vkCell);
        this.l = vkCell;
        this.m = interfaceC3477a;
        getContext();
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(nwb.k kVar) {
        CharSequence f;
        nwb.k kVar2 = kVar;
        qxb qxbVar = kVar2.b;
        if (qxbVar.d()) {
            f = cqm0.c(e3m.f(R.attr.vk_ui_text_accent, this.itemView.getContext()), qxbVar.f());
        } else {
            f = qxbVar.f();
        }
        int b = qxbVar.b();
        gko.b bVar = gko.Companion;
        x7g x7gVar = new x7g(R.attr.vk_ui_icon_accent);
        VkCell.Left.b bVar2 = new VkCell.Left.b(new VkCell.Left.Main.c(new gko(b), VkCell.Left.Main.Size.Medium, new k1u0.a(x7gVar), 8), null);
        VkCell vkCell = this.l;
        vkCell.setLeft(bVar2);
        vkCell.setMiddle(new VkCell.Middle.b(new VkCell.Middle.e(u11.f(tlo0.Companion, f), 1, TextUtils.TruncateAt.END, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), (VkCell.Middle.d) null, (VkCell.Middle.c) null, (VkCell.Middle.Size) null, 14));
        vkCell.setRight(new VkCell.Right.d((VkCell.Right.a) null, (VkCell.Right.e) null, (VkCell.Right.ExtraAction.a) null, new VkCell.Right.b((izs) null, (tlo0.f) null, (k1u0.a) null, 7), 23));
        bwt0.i0(this.itemView, new n9(26, this, kVar2));
        bwt0.k0(this.itemView, new js00(10, this, kVar2));
    }
}
