package xsna;

import com.vk.catalog2.common.ui.mvp.holder.search.SearchAuthorsListVh;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.rich.VkRichCell;
import xsna.b3q0;
import xsna.tlo0;

/* compiled from: SearchAuthorsListVh.kt */
/* loaded from: classes16.dex */
public final class hnh0 implements b3q0.a {
    public final /* synthetic */ SearchAuthorsListVh a;

    public hnh0(SearchAuthorsListVh searchAuthorsListVh) {
        this.a = searchAuthorsListVh;
    }

    @Override // xsna.b3q0.a
    public final void a(int i, int i2, boolean z) {
        SearchAuthorsListVh searchAuthorsListVh = this.a;
        VkRichCell vkRichCell = searchAuthorsListVh.o;
        if (vkRichCell == null) {
            vkRichCell = null;
        }
        vkRichCell.setRight(new VkCell.Right.d(new VkCell.Right.a.b(tq.h(tlo0.Companion, i), new p1d0(searchAuthorsListVh, 8), VkButton.Appearance.Accent, VkButton.Mode.Secondary, VkButton.Size.Small, null, new tlo0.f(i), null, 1952), (VkCell.Right.e) null, (VkCell.Right.ExtraAction.a) null, (VkCell.Right.b) null, 30));
    }
}
