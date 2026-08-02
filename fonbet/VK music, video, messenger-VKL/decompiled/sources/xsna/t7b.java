package xsna;

import android.widget.LinearLayout;
import com.vk.core.view.components.cell.VkCellSkeleton;
import com.vk.core.view.components.cell.f;
import com.vk.core.view.components.skeleton.VkSkeleton;
import org.chromium.base.version_info.VersionConstants;

/* compiled from: ChannelPayoutFillLoadingView.kt */
/* loaded from: classes16.dex */
public final class t7b {
    public final LinearLayout a;

    public t7b(LinearLayout linearLayout) {
        this.a = linearLayout;
        for (int i = 0; i < 4; i++) {
            VkCellSkeleton vkCellSkeleton = new VkCellSkeleton(this.a.getContext(), null, 6);
            vkCellSkeleton.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            f.b bVar = com.vk.core.view.components.cell.f.Companion;
            int a = iah0.a(VersionConstants.PRODUCT_MAJOR_VERSION);
            bVar.getClass();
            vkCellSkeleton.setMiddle(new com.vk.core.view.components.cell.e(f.b.a(a), null, 14));
            this.a.addView(vkCellSkeleton);
        }
        VkSkeleton vkSkeleton = new VkSkeleton(this.a.getContext(), null, 0, 14, 0);
        vkSkeleton.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        f4m.k(iah0.a(44), vkSkeleton);
        float f = 16;
        float f2 = 12;
        f4m.u(vkSkeleton, iah0.a(f), iah0.a(f2), iah0.a(f), iah0.a(f2));
        this.a.addView(vkSkeleton);
    }
}
