package xsna;

import android.text.TextUtils;
import com.vk.core.view.components.cell.VkCell;
import xsna.b7c0;
import xsna.k1u0;
import xsna.tlo0;

/* compiled from: CellViewHolder.kt */
/* loaded from: classes16.dex */
public final class hpa extends vfz<b7c0.b> {
    public final VkCell l;
    public b7c0.b m;

    public hpa(VkCell vkCell, com.vk.channels.impl.post_settings.f fVar) {
        super(vkCell);
        this.l = vkCell;
        bwt0.i0(vkCell, new h5(this, 21));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void h6(b7c0.b bVar) {
        this.m = bVar;
        VkCell.Middle.b a = VkCell.Middle.a.a(VkCell.Middle.Companion, new VkCell.Middle.e((tlo0) null, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), null, null, 8);
        VkCell vkCell = this.l;
        vkCell.setMiddle(a);
        VkCell.Right.c cVar = VkCell.Right.Companion;
        new VkCell.Right.b((izs) null, (tlo0.f) null, (k1u0.a) null, 7);
        vkCell.setRight(VkCell.Right.c.a(cVar, null, null, null, null, 22));
    }
}
