package xsna;

import android.view.ViewGroup;
import com.vk.core.view.components.group.header.VkGroupHeader;

/* compiled from: ProductFilterHeaderHolder.kt */
/* loaded from: classes18.dex */
public final class kod0 extends vfz<yod0> {
    public final VkGroupHeader l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kod0(ViewGroup viewGroup) {
        super(r0);
        VkGroupHeader vkGroupHeader = new VkGroupHeader(viewGroup.getContext(), null, 6);
        vkGroupHeader.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        vkGroupHeader.setSize(VkGroupHeader.Size.Medium);
        this.l = (VkGroupHeader) this.itemView;
    }

    @Override // xsna.vfz
    public final void W5(yod0 yod0Var) {
        this.l.setTitle(new VkGroupHeader.d(yod0Var.e, null, null, null, 0, 510));
    }
}
