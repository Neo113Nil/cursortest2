package xsna;

import android.view.ViewGroup;
import com.vk.core.view.components.cell.VkCellSkeleton;
import com.vk.core.view.components.cell.VkCellSkeleton$Left$Main;
import com.vk.core.view.components.cell.f;

/* compiled from: SectionSkeletonListItem.kt */
/* loaded from: classes5.dex */
public final class d2i0 extends we6 {
    public final int g = -1020;

    /* compiled from: SectionSkeletonListItem.kt */
    public static final class a extends vif0<d2i0> {
        @Override // xsna.vif0
        public final /* bridge */ /* synthetic */ void i6(d2i0 d2i0Var) {
        }
    }

    @Override // xsna.we6
    public final vif0 a(ViewGroup viewGroup) {
        VkCellSkeleton vkCellSkeleton = new VkCellSkeleton(viewGroup.getContext(), null, 6);
        vkCellSkeleton.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        a aVar = new a(vkCellSkeleton);
        VkCellSkeleton vkCellSkeleton2 = (VkCellSkeleton) aVar.itemView;
        vkCellSkeleton2.setLeft(new com.vk.core.view.components.cell.c(new VkCellSkeleton$Left$Main.e(VkCellSkeleton$Left$Main.Size.Medium), null));
        com.vk.core.view.components.cell.f.Companion.getClass();
        vkCellSkeleton2.setMiddle(new com.vk.core.view.components.cell.e(f.b.a(120), null, 14));
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return d2i0.class.equals(obj != null ? obj.getClass() : null) && this.g == ((d2i0) obj).g;
    }

    @Override // xsna.we6
    public final int h() {
        return this.g;
    }

    public final int hashCode() {
        return this.g;
    }
}
