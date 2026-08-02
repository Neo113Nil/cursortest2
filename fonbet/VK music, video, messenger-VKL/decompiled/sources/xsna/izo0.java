package xsna;

import android.view.ViewGroup;
import com.vk.core.view.components.group.header.VkGroupHeader;

/* compiled from: TitleHolder.kt */
/* loaded from: classes16.dex */
public final class izo0 extends vif0<Integer> {
    public final VkGroupHeader n;

    public izo0(ViewGroup viewGroup) {
        super(new VkGroupHeader(viewGroup.getContext(), null, 6), viewGroup);
        VkGroupHeader vkGroupHeader = (VkGroupHeader) this.itemView;
        this.n = vkGroupHeader;
        vkGroupHeader.setSize(VkGroupHeader.Size.Medium);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.vif0
    public final void i6(Integer num) {
        if (num.intValue() == 0) {
            return;
        }
        this.n.setTitle(new VkGroupHeader.d(tq.h(tlo0.Companion, ((Number) this.m).intValue()), null, null, null, 0, 510));
    }
}
