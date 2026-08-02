package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.group.header.VkGroupHeader;
import xsna.b7c0;

/* compiled from: HeaderAdapterItemDelegate.kt */
/* loaded from: classes16.dex */
public final class bwu extends p1u0<b7c0.c> {
    @Override // xsna.p1u0
    public final vfz<? extends b7c0.c> b(ViewGroup viewGroup) {
        VkGroupHeader vkGroupHeader = new VkGroupHeader(viewGroup.getContext(), null, 6);
        vkGroupHeader.setId(View.generateViewId());
        vkGroupHeader.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new myu(vkGroupHeader);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof b7c0.c;
    }
}
