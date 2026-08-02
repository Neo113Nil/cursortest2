package xsna;

import android.view.View;
import com.vk.core.view.components.group.header.VkGroupHeader;

/* compiled from: SuperAppTextWidgetHolder.kt */
/* loaded from: classes6.dex */
public final class ccn0 extends hf6<dcn0> {
    @Override // xsna.hf6
    public final void W5(dcn0 dcn0Var) {
        dcn0 dcn0Var2 = dcn0Var;
        View view = this.itemView;
        VkGroupHeader vkGroupHeader = view instanceof VkGroupHeader ? (VkGroupHeader) view : null;
        if (vkGroupHeader == null) {
            return;
        }
        vkGroupHeader.setSize(VkGroupHeader.Size.Large);
        vkGroupHeader.setTitle(new VkGroupHeader.d(dcn0Var2.e.o.b, null, null, null, 1, null, 446));
    }
}
