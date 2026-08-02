package xsna;

import android.text.TextUtils;
import android.util.Size;
import com.vk.core.view.components.cell.VkCell;
import com.vk.im.ui.components.chat_profile.ChatProfileListItem;
import com.vkontakte.android.R;
import xsna.fxb;
import xsna.gko;
import xsna.k1u0;
import xsna.nwb;
import xsna.tlo0;

/* compiled from: ItemWithDescriptionHolderV2.kt */
/* loaded from: classes2.dex */
public final class qvx extends vfz<nwb.h> {
    public final VkCell l;
    public final fxb.a.InterfaceC2898a m;

    public qvx(VkCell vkCell, fxb.a.InterfaceC2898a interfaceC2898a) {
        super(vkCell);
        this.l = vkCell;
        this.m = interfaceC2898a;
        getContext();
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(nwb.h hVar) {
        nwb.h hVar2 = hVar;
        ChatProfileListItem.c cVar = hVar2.b;
        boolean z = cVar.k;
        CharSequence charSequence = cVar.b;
        if (z) {
            charSequence = cqm0.c(e3m.f(R.attr.vk_ui_text_accent, this.itemView.getContext()), charSequence);
        }
        int i = cVar.c;
        gko.b bVar = gko.Companion;
        VkCell.Left.b bVar2 = new VkCell.Left.b(new VkCell.Left.Main.c(new gko(i), VkCell.Left.Main.Size.Medium, new k1u0.a(new x7g(R.attr.vk_ui_icon_accent)), 8), null);
        VkCell vkCell = this.l;
        vkCell.setLeft(bVar2);
        tlo0.h f = u11.f(tlo0.Companion, charSequence);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        VkCell.Middle.e eVar = new VkCell.Middle.e(f, 1, truncateAt, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50);
        String str = hVar2.c;
        vkCell.setMiddle(new VkCell.Middle.b(eVar, str != null ? new VkCell.Middle.d(new tlo0.h(str), (gzs) null, 1, truncateAt, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 50) : null, (VkCell.Middle.c) null, (VkCell.Middle.Size) null, 12));
        Integer num = cVar.d;
        vkCell.setRight(new VkCell.Right.d((VkCell.Right.a) null, num != null ? new VkCell.Right.e.b((dko) new gko(num.intValue()), (k1u0) null, (Size) null, (tlo0) null, false, (gzs) null, 62) : null, (VkCell.Right.ExtraAction.a) null, new VkCell.Right.b((izs) null, (tlo0.f) null, (k1u0.a) null, 7), 21));
        bwt0.i0(this.itemView, new nm1(15, this, hVar2));
    }
}
