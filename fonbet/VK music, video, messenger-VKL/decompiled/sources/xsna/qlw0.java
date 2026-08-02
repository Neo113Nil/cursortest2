package xsna;

import android.view.ViewGroup;
import com.vk.core.view.components.cell.VkCellSkeleton;
import com.vk.core.view.components.cell.VkCellSkeleton$Left$Main;
import com.vk.core.view.components.cell.f;
import org.chromium.base.version_info.VersionConstants;

/* compiled from: VoipCellSkeletonDelegate.kt */
/* loaded from: classes7.dex */
public final class qlw0 extends p1u0<rlw0> {

    /* compiled from: VoipCellSkeletonDelegate.kt */
    public static final class a extends vfz<rlw0> {
        @Override // xsna.vfz
        public final /* bridge */ /* synthetic */ void W5(rlw0 rlw0Var) {
        }
    }

    @Override // xsna.p1u0
    public final vfz<? extends rlw0> b(ViewGroup viewGroup) {
        VkCellSkeleton vkCellSkeleton = new VkCellSkeleton(viewGroup.getContext(), null, 6);
        vkCellSkeleton.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        vkCellSkeleton.setLeft(new com.vk.core.view.components.cell.c(new VkCellSkeleton$Left$Main.a(VkCellSkeleton$Left$Main.Size.Small), null));
        f.b bVar = com.vk.core.view.components.cell.f.Companion;
        int a2 = iah0.a(VersionConstants.PRODUCT_MAJOR_VERSION);
        bVar.getClass();
        vkCellSkeleton.setMiddle(new com.vk.core.view.components.cell.e(f.b.a(a2), f.b.a(iah0.a(80)), 12));
        return new a(vkCellSkeleton);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof rlw0;
    }
}
