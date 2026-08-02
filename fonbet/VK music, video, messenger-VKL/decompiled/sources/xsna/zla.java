package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.VkCell;
import xsna.b7c0;

/* compiled from: CellAdapterItemDelegate.kt */
/* loaded from: classes16.dex */
public final class zla extends p1u0<b7c0.b> {
    public final com.vk.channels.impl.post_settings.f a;

    public zla(com.vk.channels.impl.post_settings.f fVar) {
        this.a = fVar;
    }

    @Override // xsna.p1u0
    public final vfz<? extends b7c0.b> b(ViewGroup viewGroup) {
        VkCell vkCell = new VkCell(viewGroup.getContext(), null, 6, 0);
        vkCell.setId(View.generateViewId());
        vkCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new hpa(vkCell, this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof b7c0.b;
    }
}
